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

        NamespacedKey Spruce_key = new NamespacedKey(this.pl, "stb_Spruce");
        ShapedRecipe Spruce = new ShapedRecipe(Spruce_key, new ItemStack(Material.SPRUCE_PLANKS, 2));
        Spruce.shape(" SS"," SS","   ");
        Spruce.setIngredient('S', Material.SPRUCE_SLAB);
        this.pl.getServer().addRecipe(Spruce);

        NamespacedKey Birch_key = new NamespacedKey(this.pl, "stb_Birch");
        ShapedRecipe Birch = new ShapedRecipe(Birch_key, new ItemStack(Material.BIRCH_PLANKS, 2));
        Birch.shape(" SS"," SS","   ");
        Birch.setIngredient('S', Material.BIRCH_SLAB);
        this.pl.getServer().addRecipe(Birch);

        NamespacedKey Jungle_key = new NamespacedKey(this.pl, "stb_Jungle");
        ShapedRecipe Jungle = new ShapedRecipe(Jungle_key, new ItemStack(Material.JUNGLE_PLANKS, 2));
        Jungle.shape(" SS"," SS","   ");
        Jungle.setIngredient('S', Material.JUNGLE_SLAB);
        this.pl.getServer().addRecipe(Jungle);

        NamespacedKey Acacia_key = new NamespacedKey(this.pl, "stb_Acacia");
        ShapedRecipe Acacia = new ShapedRecipe(Acacia_key, new ItemStack(Material.ACACIA_PLANKS, 2));
        Acacia.shape(" SS"," SS","   ");
        Acacia.setIngredient('S', Material.ACACIA_SLAB);
        this.pl.getServer().addRecipe(Acacia);

        NamespacedKey DarkOak_key = new NamespacedKey(this.pl, "stb_DarkOak");
        ShapedRecipe DarkOak = new ShapedRecipe(DarkOak_key, new ItemStack(Material.DARK_OAK_PLANKS, 2));
        DarkOak.shape(" SS"," SS","   ");
        DarkOak.setIngredient('S', Material.DARK_OAK_SLAB);
        this.pl.getServer().addRecipe(DarkOak);

        NamespacedKey Crimsom_key = new NamespacedKey(this.pl, "stb_Crimsom");
        ShapedRecipe Crimsom = new ShapedRecipe(Crimsom_key, new ItemStack(Material.CRIMSON_PLANKS, 2));
        Crimsom.shape(" SS"," SS","   ");
        Crimsom.setIngredient('S', Material.CRIMSON_SLAB);
        this.pl.getServer().addRecipe(Crimsom);

        NamespacedKey Warped_key = new NamespacedKey(this.pl, "stb_Warped");
        ShapedRecipe Warped = new ShapedRecipe(Warped_key, new ItemStack(Material.WARPED_PLANKS, 2));
        Warped.shape(" SS"," SS","   ");
        Warped.setIngredient('S', Material.WARPED_SLAB);
        this.pl.getServer().addRecipe(Warped);

        NamespacedKey Stone_key = new NamespacedKey(this.pl, "stb_Stone");
        ShapedRecipe Stone = new ShapedRecipe(Stone_key, new ItemStack(Material.STONE, 2));
        Stone.shape(" SS"," SS","   ");
        Stone.setIngredient('S', Material.STONE_SLAB);
        this.pl.getServer().addRecipe(Stone);

        NamespacedKey SmoothStone_key = new NamespacedKey(this.pl, "stb_SmoothStone");
        ShapedRecipe SmoothStone = new ShapedRecipe(SmoothStone_key, new ItemStack(Material.SMOOTH_STONE, 2));
        SmoothStone.shape(" SS"," SS","   ");
        SmoothStone.setIngredient('S', Material.SMOOTH_STONE_SLAB);
        this.pl.getServer().addRecipe(SmoothStone);

        NamespacedKey Standstone_key = new NamespacedKey(this.pl, "stb_Standstone");
        ShapedRecipe Standstone = new ShapedRecipe(Standstone_key, new ItemStack(Material.SANDSTONE, 2));
        Standstone.shape(" SS"," SS","   ");
        Standstone.setIngredient('S', Material.SANDSTONE_SLAB);
        this.pl.getServer().addRecipe(Standstone);

        NamespacedKey CutSandstone_key = new NamespacedKey(this.pl, "stb_CutSandstone");
        ShapedRecipe CutSandstone = new ShapedRecipe(CutSandstone_key, new ItemStack(Material.CUT_SANDSTONE, 2));
        CutSandstone.shape(" SS"," SS","   ");
        CutSandstone.setIngredient('S', Material.CUT_SANDSTONE_SLAB);
        this.pl.getServer().addRecipe(CutSandstone);

        NamespacedKey PetrifiedOak_key = new NamespacedKey(this.pl, "stb_PetrifiedOak");
        ShapedRecipe PetrifiedOak = new ShapedRecipe(PetrifiedOak_key, new ItemStack(Material.OAK_PLANKS, 2));
        PetrifiedOak.shape(" SS"," SS","   ");
        PetrifiedOak.setIngredient('S', Material.PETRIFIED_OAK_SLAB);
        this.pl.getServer().addRecipe(PetrifiedOak);

        NamespacedKey Cobblestone_key = new NamespacedKey(this.pl, "stb_Cobblestone");
        ShapedRecipe Cobblestone = new ShapedRecipe(Cobblestone_key, new ItemStack(Material.COBBLESTONE, 2));
        Cobblestone.shape(" SS"," SS","   ");
        Cobblestone.setIngredient('S', Material.COBBLESTONE_SLAB);
        this.pl.getServer().addRecipe(Cobblestone);

        NamespacedKey Brick_key = new NamespacedKey(this.pl, "stb_Brick");
        ShapedRecipe Brick = new ShapedRecipe(Brick_key, new ItemStack(Material.BRICK, 2));
        Brick.shape(" SS"," SS","   ");
        Brick.setIngredient('S', Material.BRICK_SLAB);
        this.pl.getServer().addRecipe(Brick);

        NamespacedKey StoneBricks_key = new NamespacedKey(this.pl, "stb_StoneBricks");
        ShapedRecipe StoneBricks = new ShapedRecipe(StoneBricks_key, new ItemStack(Material.STONE_BRICKS, 2));
        StoneBricks.shape(" SS"," SS","   ");
        StoneBricks.setIngredient('S', Material.STONE_BRICK_SLAB);
        this.pl.getServer().addRecipe(StoneBricks);

        NamespacedKey NetherBrick_key = new NamespacedKey(this.pl, "stb_NetherBrick");
        ShapedRecipe NetherBrick = new ShapedRecipe(NetherBrick_key, new ItemStack(Material.NETHER_BRICK, 2));
        NetherBrick.shape(" SS"," SS","   ");
        NetherBrick.setIngredient('S', Material.NETHER_BRICK_SLAB);
        this.pl.getServer().addRecipe(NetherBrick);

        NamespacedKey Quartz_key = new NamespacedKey(this.pl, "stb_Quartz");
        ShapedRecipe Quartz = new ShapedRecipe(Quartz_key, new ItemStack(Material.QUARTZ_BLOCK, 2));
        Quartz.shape(" SS"," SS","   ");
        Quartz.setIngredient('S', Material.QUARTZ_SLAB);
        this.pl.getServer().addRecipe(Quartz);

        NamespacedKey RedSandstone_key = new NamespacedKey(this.pl, "stb_RedSandstone");
        ShapedRecipe RedSandstone = new ShapedRecipe(RedSandstone_key, new ItemStack(Material.RED_SANDSTONE, 2));
        RedSandstone.shape(" SS"," SS","   ");
        RedSandstone.setIngredient('S', Material.RED_SANDSTONE_SLAB);
        this.pl.getServer().addRecipe(RedSandstone);

        NamespacedKey CutRedSandstone_key = new NamespacedKey(this.pl, "stb_CutRedSandstone");
        ShapedRecipe CutRedSandstone = new ShapedRecipe(CutRedSandstone_key, new ItemStack(Material.CUT_RED_SANDSTONE, 2));
        CutRedSandstone.shape(" SS"," SS","   ");
        CutRedSandstone.setIngredient('S', Material.CUT_RED_SANDSTONE_SLAB);
        this.pl.getServer().addRecipe(CutRedSandstone);

        NamespacedKey Purpur_key = new NamespacedKey(this.pl, "stb_Purpur");
        ShapedRecipe Purpur = new ShapedRecipe(Purpur_key, new ItemStack(Material.PURPUR_BLOCK, 2));
        Purpur.shape(" SS"," SS","   ");
        Purpur.setIngredient('S', Material.PURPUR_SLAB);
        this.pl.getServer().addRecipe(Purpur);
    }
}
