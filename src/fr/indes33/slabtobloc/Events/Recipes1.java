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

        NamespacedKey DarkPrismarine_key = new NamespacedKey(this.pl, "stb_DarkPrismarine");
        ShapedRecipe DarkPrismarine = new ShapedRecipe(DarkPrismarine_key, new ItemStack(Material.DARK_PRISMARINE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.DARK_PRISMARINE_SLAB);
        this.pl.getServer().addRecipe(DarkPrismarine);

        NamespacedKey PolishedGranite_key = new NamespacedKey(this.pl, "stb_PolishedGranite");
        ShapedRecipe PolishedGranite = new ShapedRecipe(PolishedGranite_key, new ItemStack(Material.POLISHED_GRANITE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.POLISHED_GRANITE_SLAB);
        this.pl.getServer().addRecipe(PolishedGranite);

        NamespacedKey SmoothRedSandstone_key = new NamespacedKey(this.pl, "stb_SmoothRedSandstone");
        ShapedRecipe SmoothRedSandstone = new ShapedRecipe(SmoothRedSandstone_key, new ItemStack(Material.SMOOTH_RED_SANDSTONE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.SMOOTH_RED_SANDSTONE);
        this.pl.getServer().addRecipe(SmoothRedSandstone);

        NamespacedKey MossyStoneBrick_key = new NamespacedKey(this.pl, "stb_MossyStoneBrick");
        ShapedRecipe MossyStoneBrick = new ShapedRecipe(MossyStoneBrick_key, new ItemStack(Material.MOSSY_STONE_BRICKS, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.MOSSY_STONE_BRICKS);
        this.pl.getServer().addRecipe(MossyStoneBrick);
    }
}
