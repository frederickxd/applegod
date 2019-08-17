package com.tacaly.AppleGOD;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class main extends JavaPlugin {

	@Override
	public void onEnable() {
		///////////////////////////////////////////////////////////
		
		//saving to log
		getLogger().info("Has been enabled!");
		
		//command name set
		getCommand("applegodv").setExecutor(new command());
		
		
		/////////////////////////////////////////////////
		////////// Normal Apple recipe
		
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
		
		// Add recipe to server
		getServer().addRecipe(APPLEGOLDEN);
	}
	
	public void onDisable() {
		//saving to log
		getLogger().info("Has been disabled!");
	}
	
	
}
