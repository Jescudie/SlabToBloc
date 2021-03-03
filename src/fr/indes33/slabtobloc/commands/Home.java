package fr.indes33.slabtobloc.commands;

import fr.indes33.slabtobloc.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Home implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("sethome")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (args.length == 1) {
                    Main.getInstance().getConfig().set("home." + player.getUniqueId().toString() + "." + args[0] + ".world", player.getLocation().getWorld().getName());
                    Main.getInstance().getConfig().set("home." + player.getUniqueId().toString() + "." + args[0] + ".x", player.getLocation().getX());
                    Main.getInstance().getConfig().set("home." + player.getUniqueId().toString() + "." + args[0] + ".y", player.getLocation().getY());
                    Main.getInstance().getConfig().set("home." + player.getUniqueId().toString() + "." + args[0] + ".z", player.getLocation().getZ());
                    Main.getInstance().getConfig().set("home." + player.getUniqueId().toString() + "." + args[0] + ".yaw", player.getLocation().getYaw());
                    Main.getInstance().getConfig().set("home." + player.getUniqueId().toString() + "." + args[0] + ".pitch", player.getLocation().getPitch());
                    Main.getInstance().saveConfig();
                    player.sendMessage("Votre home " + args[0] + " est bien configuré");
                } else {
                    player.sendMessage("La comande est : /sethome <nom>");
                }
            }
        }
        return false;
    }
}
