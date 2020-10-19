package com.tacaly.applegod;

import org.bukkit.plugin.java.JavaPlugin;

public final class AppleGOD extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        //saving to log
        getLogger().info("Has been enabled!");

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
