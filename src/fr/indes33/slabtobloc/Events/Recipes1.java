package fr.indes33.slabtobloc.Events;

import fr.indes33.slabtobloc.Main;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import sun.security.provider.PolicyParser;

import java.awt.dnd.DragSourceMotionListener;

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
        DarkPrismarine.setIngredient('S', Material.MOSSY_STONE_BRICK_SLAB);
        this.pl.getServer().addRecipe(MossyStoneBrick);

        NamespacedKey PolishedDiorite_key = new NamespacedKey(this.pl, "stb_PolishedDiorite");
        ShapedRecipe PolishedDiorite = new ShapedRecipe(PolishedDiorite_key, new ItemStack(Material.POLISHED_DIORITE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.POLISHED_DIORITE_SLAB);
        this.pl.getServer().addRecipe(PolishedDiorite);

        NamespacedKey MossyCobblestone_key = new NamespacedKey(this.pl, "stb_MossyCobblestone");
        ShapedRecipe MossyCobblestone = new ShapedRecipe(MossyCobblestone_key, new ItemStack(Material.MOSSY_COBBLESTONE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.MOSSY_COBBLESTONE_SLAB);
        this.pl.getServer().addRecipe(MossyCobblestone);

        NamespacedKey EndStoneBrick_key = new NamespacedKey(this.pl, "stb_EndStoneBrick");
        ShapedRecipe EndStoneBrick = new ShapedRecipe(EndStoneBrick_key, new ItemStack(Material.END_STONE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.END_STONE_BRICK_SLAB);
        this.pl.getServer().addRecipe(EndStoneBrick);

        NamespacedKey SmoothSandstone_key = new NamespacedKey(this.pl, "stb_SmoothSandstone");
        ShapedRecipe SmoothSandstone = new ShapedRecipe(SmoothSandstone_key, new ItemStack(Material.SMOOTH_SANDSTONE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.SMOOTH_SANDSTONE_SLAB);
        this.pl.getServer().addRecipe(SmoothSandstone);

        NamespacedKey SmoothQuartz_key = new NamespacedKey(this.pl, "stb_SmoothQuartz");
        ShapedRecipe SmoothQuartz = new ShapedRecipe(SmoothQuartz_key, new ItemStack(Material.SMOOTH_QUARTZ, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.SMOOTH_QUARTZ_SLAB);
        this.pl.getServer().addRecipe(SmoothQuartz);

        NamespacedKey Granite_key = new NamespacedKey(this.pl, "stb_Granite");
        ShapedRecipe Granite = new ShapedRecipe(Granite_key, new ItemStack(Material.GRANITE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.GRANITE_SLAB);
        this.pl.getServer().addRecipe(Granite);

        NamespacedKey Andesite_key = new NamespacedKey(this.pl, "stb_Andesite");
        ShapedRecipe Andesite = new ShapedRecipe(Andesite_key, new ItemStack(Material.ANDESITE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.ANDESITE_SLAB);
        this.pl.getServer().addRecipe(Andesite);

        NamespacedKey RedNetherBrick_key = new NamespacedKey(this.pl, "stb_RedNetherBrick");
        ShapedRecipe RedNetherBrick = new ShapedRecipe(RedNetherBrick_key, new ItemStack(Material.RED_NETHER_BRICKS, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.RED_NETHER_BRICK_SLAB);
        this.pl.getServer().addRecipe(RedNetherBrick);

        NamespacedKey PolishedAndesite_key = new NamespacedKey(this.pl, "stb_PolishedAndesite");
        ShapedRecipe PolishedAndesite = new ShapedRecipe(PolishedAndesite_key, new ItemStack(Material.POLISHED_ANDESITE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.POLISHED_ANDESITE_SLAB);
        this.pl.getServer().addRecipe(PolishedAndesite);

        NamespacedKey Diorite_key = new NamespacedKey(this.pl, "stb_Diorite");
        ShapedRecipe Diorite = new ShapedRecipe(Diorite_key, new ItemStack(Material.DIORITE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.DIORITE_SLAB);
        this.pl.getServer().addRecipe(Diorite);

        NamespacedKey BlackStone_key = new NamespacedKey(this.pl, "stb_BlackStone");
        ShapedRecipe BlackStone = new ShapedRecipe(BlackStone_key, new ItemStack(Material.BLACKSTONE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.BLACKSTONE_SLAB);
        this.pl.getServer().addRecipe(BlackStone);

        NamespacedKey PolishedBlackStone_key = new NamespacedKey(this.pl, "stb_PolishedBlackStone");
        ShapedRecipe PolishedBlackStone = new ShapedRecipe(PolishedBlackStone_key, new ItemStack(Material.POLISHED_BLACKSTONE, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.POLISHED_BLACKSTONE_SLAB);
        this.pl.getServer().addRecipe(PolishedBlackStone);

        NamespacedKey PolishedBlackStoneBrick_key = new NamespacedKey(this.pl, "stb_PolishedBlackStoneBrick");
        ShapedRecipe PolishedBlackStoneBrick = new ShapedRecipe(PolishedBlackStoneBrick_key, new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS, 2));
        DarkPrismarine.shape(" SS"," SS","   ");
        DarkPrismarine.setIngredient('S', Material.POLISHED_BLACKSTONE_BRICK_SLAB);
        this.pl.getServer().addRecipe(PolishedBlackStoneBrick);
    }
}
