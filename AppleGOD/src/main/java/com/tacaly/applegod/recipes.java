package com.tacaly.applegod;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;


public class recipes {
    public void recipesvoid() {

        //Normal Apple recipe
        ItemStack applegnormal = new ItemStack(Material.APPLE, 1);

        @SuppressWarnings("deprecation")
        ShapedRecipe APPLEYOUNG = new ShapedRecipe(applegnormal);

        //crafting grid
        APPLEYOUNG.shape("*%*","%B%","*%*");

        APPLEYOUNG.setIngredient('*', Material.STICK);
        APPLEYOUNG.setIngredient('%', Material.COBBLESTONE);
        APPLEYOUNG.setIngredient('B', Material.WHEAT_SEEDS);

        //golden apple recipe
        ItemStack applegGoldem = new ItemStack(Material.GOLDEN_APPLE, 1);

        @SuppressWarnings("deprecation")
        ShapedRecipe APPLEGOLDEN = new ShapedRecipe(applegGoldem);

        //crafting grid
        APPLEGOLDEN.shape("*%*","%B%","*%*");

        APPLEGOLDEN.setIngredient('*', Material.STICK);
        APPLEGOLDEN.setIngredient('%', Material.GOLD_INGOT);
        APPLEGOLDEN.setIngredient('B', Material.APPLE);

    }
}
