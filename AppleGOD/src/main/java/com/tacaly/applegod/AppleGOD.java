package com.tacaly.applegod;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class AppleGOD extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        //saving to log
        getLogger().info("Has been enabled!");

        //command name set
        getCommand("applegodv").setExecutor(new command());


        //Normal Apple recipe

        ItemStack applegnormal = new ItemStack(Material.APPLE, 1);

        @SuppressWarnings("deprecation")
        ShapedRecipe APPLEYOUNG = new ShapedRecipe(applegnormal);

        //crafting grid
        APPLEYOUNG.shape("*%*","%B%","*%*");

        APPLEYOUNG.setIngredient('*', Material.STICK);
        APPLEYOUNG.setIngredient('%', Material.COBBLESTONE);
        APPLEYOUNG.setIngredient('B', Material.WHEAT_SEEDS);

        // Add recipe to server
        getServer().addRecipe(APPLEYOUNG);

        //golden apple recipe
        ItemStack applegGoldem = new ItemStack(Material.GOLDEN_APPLE, 1);

        @SuppressWarnings("deprecation")
        ShapedRecipe APPLEGOLDEN = new ShapedRecipe(applegGoldem);

        //crafting grid
        APPLEGOLDEN.shape("*%*","%B%","*%*");

        APPLEGOLDEN.setIngredient('*', Material.STICK);
        APPLEGOLDEN.setIngredient('%', Material.GOLD_INGOT);
        APPLEGOLDEN.setIngredient('B', Material.APPLE);

        // Add recipe to server of golden apple
        getServer().addRecipe(APPLEGOLDEN);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Has been disabled!");
    }
}
