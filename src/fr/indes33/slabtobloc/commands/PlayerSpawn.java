package fr.indes33.slabtobloc.commands;

import org.bukkit.event.Listener;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class PlayerSpawn implements Listener {

    @EventHandler
    public void swordWhenPlayerSpawn(PlayerJoinEvent e) {

        Player player = e.getPlayer();
        player.getInventory().clear();

        ItemStack epee = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta modifEpee = epee.getItemMeta();

        assert modifEpee != null;

        modifEpee.setDisplayName("§cJe suis votre épée maitre");
        modifEpee.setLore(Arrays.asList("§dJe vous amenerai jusqu'à la victoire finale"));
        modifEpee.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
        modifEpee.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        epee.setItemMeta(modifEpee);

        player.getInventory().setItemInMainHand(epee);


        ItemStack shield = new ItemStack(Material.SHIELD, 1);
        ItemMeta modifShield = shield.getItemMeta();

        modifShield.setDisplayName("§cJe suis le gros bouclier !");
        modifShield.setLore(Arrays.asList("§dJe suis là pour vous protéger"));
        shield.setItemMeta(modifShield);

        player.getInventory().setItemInOffHand(shield);

        player.updateInventory();
    }

}