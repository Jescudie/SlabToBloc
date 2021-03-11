package fr.indes33.slabtobloc.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Alerte implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender player, Command arg1, String arg2, String[] args) {
        if(args.length == 0) {
            player.sendMessage("Tu t'es trompé, c'est : /alerte <texte>");
        }

        if(args.length >= 1) {
            StringBuilder bc = new StringBuilder();
            for(String part : args) {
                bc.append(part + " ");
            }

            Bukkit.broadcastMessage("[" + player.getName() + "] " + bc.toString());
        }
        return false;
    }

}
