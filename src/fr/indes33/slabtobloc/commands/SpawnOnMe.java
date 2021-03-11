package fr.indes33.slabtobloc.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;

public class SpawnOnMe implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player){
            Player player = (Player)sender;

            if(cmd.getName().equalsIgnoreCase("spawnonme")){
                Location spawn = player.getLocation().add(2, 0, 0);
                World world = player.getWorld();
                Skeleton squeleton = (Skeleton) world.spawnEntity(spawn, EntityType.SKELETON);
                player.setPassenger(squeleton);
                return true;
            }
        }

        return false;   }
}