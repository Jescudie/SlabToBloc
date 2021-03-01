package fr.indes33.slabtobloc.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Test implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player){
            Player player = (Player)sender;

            if(cmd.getName().equalsIgnoreCase("test1")){
                player.sendMessage(" §eBravo tu as réussi le §ctest1 !");
                return true;
            }

        }
        return false;
    }
}