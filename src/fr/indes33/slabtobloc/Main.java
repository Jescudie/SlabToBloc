package fr.indes33.slabtobloc;

import fr.indes33.slabtobloc.commands.Test;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Le plugin est allumer");
        getCommand("test1").setExecutor(new Test());
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "Le plugin viens de s'arreter");
    }
}
