package fr.indes33.slabtobloc;

import fr.indes33.slabtobloc.Events.ListenerOnSpawn;
import fr.indes33.slabtobloc.Events.ListenerRecipes;
import fr.indes33.slabtobloc.commands.Alerte;
import fr.indes33.slabtobloc.commands.Home;
import fr.indes33.slabtobloc.commands.SpawnOnMe;
import fr.indes33.slabtobloc.commands.Test;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    public static Main instance;
    public static Main getInstance(){
        return instance;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        instance = this;
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Le plugin vient de s'allumer");
        getCommand("sethome").setExecutor(new Home());
        getCommand("home").setExecutor(new Home());
        getCommand("delhome").setExecutor(new Home());
        getCommand("test").setExecutor(new Test());
        getCommand("alerte").setExecutor(new Alerte());
        getCommand("spawnonme").setExecutor(new SpawnOnMe());
        getServer().getPluginManager().registerEvents(new ListenerOnSpawn(), this);
        getServer().getPluginManager().registerEvents(new ListenerRecipes(this), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "Le plugin vient de s'arreter");
    }
}
