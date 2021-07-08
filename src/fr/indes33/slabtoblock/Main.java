package fr.indes33.slabtoblock;

import fr.indes33.slabtoblock.Commands.Test;
import fr.indes33.slabtoblock.Events.ListenerRecipes;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Le plugin \"SlabToBloc\" vient de s'allumer");
        getServer().getPluginManager().registerEvents(new ListenerRecipes(this), this);
        getCommand("tasty").setExecutor(new Test());
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "Le plugin \"SlabToBloc\" vient de s'arreter");
    }
}
