package com.tacaly.applegod;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class command implements CommandExecutor {
        @Override

        // /applegodv
        // <-- Shows the version number of AppleGod
        public boolean onCommand (CommandSender sender, Command cmd, String label, String[] args) {
            //Gives the AppleGOD plugin version
            if (label.equalsIgnoreCase("applegodv")) {
                //Sends the message to the player
                sender.sendMessage("[AppleGOD] Version 0.0.6");
                return true;
            }


            return false;
        }

    }

