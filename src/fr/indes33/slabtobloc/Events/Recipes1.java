package fr.indes33.slabtobloc.Events;

import fr.indes33.slabtobloc.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class Recipes1 implements Listener {
    private final Main pl;

    public Recipes1(Main pl) {
        this.pl = pl;
        pl.getConfig();

        NamespacedKey PrismarineBricks_key = new NamespacedKey(this.pl, "stb_PrismarineBricks");
        ShapedRecipe PrismarineBricks = new ShapedRecipe(PrismarineBricks_key, new ItemStack(Material.PRISMARINE_BRICKS, 2));
        PrismarineBricks.shape(" SS"," SS","   ");
        PrismarineBricks.setIngredient('S', Material.PRISMARINE_BRICK_SLAB);
        this.pl.getServer().addRecipe(PrismarineBricks);
    }
}
