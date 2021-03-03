package fr.indes33.slabtobloc.commands;

import fr.indes33.slabtobloc.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
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

        if(label.equalsIgnoreCase("home")){
            if(sender instanceof Player) {
                Player player = (Player) sender;
                if(args.length == 1){
                    if(Main.getInstance().getConfig().contains("home."+player.getUniqueId()+"."+ args[0])){
                        World world = Bukkit.getServer().getWorld(Main.getInstance().getConfig().getString("home."+ player.getUniqueId().toString() +"."+ args[0] +".world"));
                        double x = Main.getInstance().getConfig().getDouble("home."+ player.getUniqueId().toString() +"."+ args[0] +".x");
                        double y = Main.getInstance().getConfig().getDouble("home."+ player.getUniqueId().toString() +"."+ args[0] +".y");
                        double z = Main.getInstance().getConfig().getDouble("home."+ player.getUniqueId().toString() +"."+ args[0] +".z");
                        double yaw = Main.getInstance().getConfig().getDouble("home."+ player.getUniqueId().toString() +"."+ args[0] +".yaw");
                        double pitch = Main.getInstance().getConfig().getDouble("home."+ player.getUniqueId().toString() +"."+ args[0] +".pitch");
                        player.teleport(new Location(world, x, y, z, (float) yaw, (float) pitch));
                        player.sendMessage("Vous etes à votre home : "+ args[0]);
                    }else {
                        player.sendMessage("Le home "+ args[0] +" n'existe pas !");
                    }
                } else {
                    player.sendMessage("La comande est : /home <nom de votre home>");
                }
            }
        }

        if(label.equalsIgnoreCase("delhome")){
            if(sender instanceof Player){
                Player player = (Player) sender;
                if(args.length == 1){
                    if(Main.getInstance().getConfig().contains("home."+ player.getUniqueId().toString()+"."+args[0])){
                        Main.getInstance().getConfig().set("home."+ player.getUniqueId().toString()+"."+args[0], null);
                        Main.getInstance().saveConfig();
                        player.sendMessage("le home "+args[0]+ " a été supprimé !");
                    } else {
                        player.sendMessage("le home "+args[0]+ " n'existe pas !");
                    }
                } else {
                    player.sendMessage("La comande est : /delhome <nom>");
                }
            }
        }

        return false;
    }
}
