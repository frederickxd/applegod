package com.tacaly.applegod;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

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

                    ItemStack Item = new ItemStack(Material.APPLE);
                // Player p = p.getPlayer();

                // if (!getPlayer.hasPlayedBefore() ){
                        //  p.getInventory().addItem(Item);
                        sender.sendMessage("[AppleGOD] You got 1 apple");
                //  }else{
                        sender.sendMessage("[AppleGOD] You already got 1 apple");
                //  }
                    return true;
                }


                // Sends false due to no commands
                return false;
            }

        }

