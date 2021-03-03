package fr.indes33.slabtobloc;

import fr.indes33.slabtobloc.Events.Recipes;
import fr.indes33.slabtobloc.Events.Recipes1;
import fr.indes33.slabtobloc.commands.Alerte;
import fr.indes33.slabtobloc.commands.PlayerSpawn;
import fr.indes33.slabtobloc.commands.Test;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    public PluginManager pm = getServer().getPluginManager();

    @Override
    public void onEnable() {
        super.onEnable();
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Le plugin est allumer");
        getCommand("test10").setExecutor(new Test());
        getCommand("alerte").setExecutor(new Alerte());
        getServer().getPluginManager().registerEvents(new PlayerSpawn(), this);
        pm.registerEvents(new Recipes(this), this);
        pm.registerEvents(new Recipes1(this), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "Le plugin viens de s'arreter");
    }
}
