package com.tacaly.applegod;

import io.sentry.Sentry;
import org.bukkit.plugin.java.JavaPlugin;

public final class AppleGOD extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Sentry.init(options -> {
            options.setDsn("https://6003ad3d131a420da26873fdfba15d1a@o61262.ingest.sentry.io/5505032");
        });
        //saving to log
        getLogger().info("Has been enabled!");
        try {
            throw new Exception("Plugin enabled.");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
        new UpdateChecker(this, 68729).getVersion(version -> {
                    if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
                        getLogger().info("There is not a new update available.");
                    } else {
                        getLogger().info("There is a new update available.");
                    }
                });

        //command name set
        getCommand("applegodv").setExecutor(new command());
        getCommand( "givemeapple").setExecutor(new command());

        // call java class recipes
        recipes.recipe();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Has been disabled!");

    }
}
