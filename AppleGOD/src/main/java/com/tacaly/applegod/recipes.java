package com.tacaly.applegod;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;


public class recipes {
    public static void recipe() {
        //@SuppressWarnings("deprecation")

        //Normal Apple recipe
        ItemStack applegnormal = new ItemStack(Material.APPLE, 1);

        ShapedRecipe APPLEYOUNG;
        APPLEYOUNG = new ShapedRecipe(applegnormal);

        //crafting grid
        APPLEYOUNG.shape("*%*","%B%","*%*");

        APPLEYOUNG.setIngredient('*', Material.STICK);
        APPLEYOUNG.setIngredient('%', Material.COBBLESTONE);
        APPLEYOUNG.setIngredient('B', Material.WHEAT_SEEDS);

        // Add recipe to server of golden apple
        getServer().addRecipe(APPLEYOUNG);

        ///////////////////////////////////////////////
        //golden apple recipe
        ItemStack applegGoldem = new ItemStack(Material.GOLDEN_APPLE, 1);

        ShapedRecipe APPLEGOLDEN;
        APPLEGOLDEN = new ShapedRecipe(applegGoldem);

        //crafting shape
        APPLEGOLDEN.shape("*%*","%B%","*%*");
        //crafting grid
        APPLEGOLDEN.setIngredient('*', Material.STICK);
        APPLEGOLDEN.setIngredient('%', Material.GOLD_INGOT);
        APPLEGOLDEN.setIngredient('B', Material.APPLE);

        // Add recipe to server of golden apple
        getServer().addRecipe(APPLEGOLDEN);

        ///////////////////////////////////////////////
        //enchanted apple
        ItemStack appleEnchanted = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);


        ShapedRecipe APPLEENCHANTED;
        APPLEENCHANTED = new ShapedRecipe(appleEnchanted);

        //crafting shape
        APPLEENCHANTED.shape("*%*","%B%","*%*");
        //crafting grid
        APPLEENCHANTED.setIngredient('*', Material.NETHERITE_INGOT);
        APPLEENCHANTED.setIngredient('%', Material.EXPERIENCE_BOTTLE);
        APPLEENCHANTED.setIngredient('B', Material.GOLDEN_APPLE);

        // Add recipe to server of golden apple
        getServer().addRecipe(APPLEENCHANTED);

    }

}
