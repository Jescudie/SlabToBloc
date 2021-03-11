package fr.indes33.slabtobloc.Events;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ListenerOnSpawn implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        player.getInventory().clear();

        ItemStack epee = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta modifEpee = epee.getItemMeta();
        modifEpee.setDisplayName("§cJe suis votre épée maitre");
        modifEpee.setLore(Arrays.asList("§dJe vous amenerai jusqu'à la victoire finale"));
        modifEpee.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
        modifEpee.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        epee.setItemMeta(modifEpee);

        ItemStack shield = new ItemStack(Material.SHIELD, 1);
        ItemMeta modifShield = shield.getItemMeta();
        modifShield.setDisplayName("§cJe suis le gros bouclier !");
        modifShield.setLore(Arrays.asList("§dJe suis là pour vous protéger"));
        shield.setItemMeta(modifShield);

        player.getInventory().setItemInMainHand(epee);
        player.getInventory().setItemInOffHand(shield);
        player.updateInventory();
    }
}
