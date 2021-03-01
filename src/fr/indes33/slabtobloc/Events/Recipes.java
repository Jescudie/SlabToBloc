package fr.indes33.slabtobloc.Events;

import fr.indes33.slabtobloc.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class Recipes implements Listener {
    private final Main pl;

    public Recipes(Main pl) {
        this.pl = pl;
        pl.getConfig();

        NamespacedKey Oak_key = new NamespacedKey(this.pl, "stb_Oak");
        ShapedRecipe Oak = new ShapedRecipe(Oak_key, new ItemStack(Material.OAK_PLANKS, 2));
        Oak.shape(" SS"," SS","   ");
        Oak.setIngredient('S', Material.OAK_SLAB);
        this.pl.getServer().addRecipe(Oak);
    }
}
