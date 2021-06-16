package com.tacaly.applegod;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class command implements CommandExecutor {
        @Override

        // /applegodv
        // <-- Shows the version number of AppleGod
        public boolean onCommand (CommandSender sender, Command cmd, String label, String[] args) {
            //Gives the AppleGOD plugin version
            if (label.equalsIgnoreCase("applegodv")) {
                //Sends the message to the player
                sender.sendMessage("[AppleGOD] Version 0.0.8");
                return true;

            }

            //give the player who wrote the coomand an apple.


            if (label.equalsIgnoreCase("givemeapple)")) {
                if (sender instanceof Player) {
                    Player player = (Player) sender;

                    // Create a new ItemStack (type: diamond)
                    ItemStack givenormalapple = new ItemStack(Material.APPLE);

                    // Set the amount of the ItemStack
                    givenormalapple.setAmount(1);

                    // Give the player our items (comma-seperated list of all ItemStack)
                    player.getInventory().addItem(givenormalapple);
                }
            }


                // Sends false due to no commands
                return false;
            }

        }

