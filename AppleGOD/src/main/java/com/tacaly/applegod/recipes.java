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

        ShapedRecipe AppleYoung;
        AppleYoung = new ShapedRecipe(applegnormal);

        //crafting grid
        AppleYoung.shape("*%*","%B%","*%*");

        AppleYoung.setIngredient('*', Material.STICK);
        AppleYoung.setIngredient('%', Material.COBBLESTONE);
        AppleYoung.setIngredient('B', Material.WHEAT_SEEDS);

        // Add recipe to server of golden apple
        getServer().addRecipe(AppleYoung);

        ///////////////////////////////////////////////
        //golden apple recipe
        ItemStack applegGoldem = new ItemStack(Material.GOLDEN_APPLE, 1);

        ShapedRecipe AppleGolden;
        AppleGolden = new ShapedRecipe(applegGoldem);

        //crafting shape
        AppleGolden.shape("*%*","%B%","*%*");
        //crafting grid
        AppleGolden.setIngredient('*', Material.STICK);
        AppleGolden.setIngredient('%', Material.GOLD_INGOT);
        AppleGolden.setIngredient('B', Material.APPLE);

        // Add recipe to server of golden apple
        getServer().addRecipe(AppleGolden);

        ///////////////////////////////////////////////
        //enchanted apple
        ItemStack appleEnchanted = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);


        ShapedRecipe AppleEnchanted;
        AppleEnchanted = new ShapedRecipe(appleEnchanted);

        //crafting shape
        AppleEnchanted.shape("*%*","%B%","*%*");
        //crafting grid
        AppleEnchanted.setIngredient('*', Material.NETHERITE_INGOT);
        AppleEnchanted.setIngredient('%', Material.EXPERIENCE_BOTTLE);
        AppleEnchanted.setIngredient('B', Material.GOLDEN_APPLE);

        // Add recipe to server of golden apple
        getServer().addRecipe(AppleEnchanted);

    }

}
