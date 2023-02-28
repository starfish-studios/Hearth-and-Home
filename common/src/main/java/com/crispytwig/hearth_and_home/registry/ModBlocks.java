package com.crispytwig.hearth_and_home.registry;

import com.crispytwig.hearth_and_home.Mod;
import com.crispytwig.hearth_and_home.block.StairBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;

import java.util.function.Supplier;

public class ModBlocks {

    // Wooden Blocks
    public static final Supplier<Block> OAK_TRIM = registerBlock("oak_trim", () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final Supplier<Block> OAK_MOSAIC = registerBlock("oak_mosaic", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final Supplier<Block> COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks", () -> new Block(Block.Properties.copy(Blocks.COBBLESTONE)));
    public static final Supplier<Block> COBBLESTONE_BRICK_SLAB = registerBlock("cobblestone_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.COBBLESTONE)));
    public static final Supplier<Block> COBBLESTONE_BRICK_STAIRS = registerBlock("cobblestone_brick_stairs", () -> new StairBlock(COBBLESTONE_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.COBBLESTONE)));
    public static final Supplier<Block> COBBLESTONE_BRICK_WALL = registerBlock("cobblestone_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.COBBLESTONE)));
    public static final Supplier<Block> THATCH = registerBlock("thatch", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.HAY_BLOCK)));
    public static final Supplier<Block> THATCH_SLAB = registerBlock("thatch_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.HAY_BLOCK)));
    public static final Supplier<Block> THATCH_STAIRS = registerBlock("thatch_stairs", () -> new StairBlock(THATCH.get().defaultBlockState(), Block.Properties.copy(Blocks.HAY_BLOCK)));

    // Sanded Wood
    public static final Supplier<Block> SANDED_OAK_WOOD = registerBlock("sanded_oak_wood", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)));
    public static final Supplier<Block> SANDED_SPRUCE_WOOD = registerBlock("sanded_spruce_wood", () -> new Block(Block.Properties.copy(Blocks.SPRUCE_WOOD)));
    public static final Supplier<Block> SANDED_BIRCH_WOOD = registerBlock("sanded_birch_wood", () -> new Block(Block.Properties.copy(Blocks.BIRCH_WOOD)));
    public static final Supplier<Block> SANDED_JUNGLE_WOOD = registerBlock("sanded_jungle_wood", () -> new Block(Block.Properties.copy(Blocks.JUNGLE_WOOD)));
    public static final Supplier<Block> SANDED_ACACIA_WOOD = registerBlock("sanded_acacia_wood", () -> new Block(Block.Properties.copy(Blocks.ACACIA_WOOD)));
    public static final Supplier<Block> SANDED_DARK_OAK_WOOD = registerBlock("sanded_dark_oak_wood", () -> new Block(Block.Properties.copy(Blocks.DARK_OAK_WOOD)));
    public static final Supplier<Block> SANDED_CRIMSON_WOOD = registerBlock("sanded_crimson_wood", () -> new Block(Block.Properties.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Supplier<Block> SANDED_WARPED_WOOD = registerBlock("sanded_warped_wood", () -> new Block(Block.Properties.copy(Blocks.WARPED_HYPHAE)));


    // Terracotta Shingles
    public static final Supplier<Block> SHINGLES = registerBlock("shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final Supplier<Block> SHINGLE_STAIRS = registerBlock("shingle_stairs", () -> new StairBlock(SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final Supplier<Block> SHINGLE_SLAB = registerBlock("shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final Supplier<Block> WHITE_SHINGLES = registerBlock("white_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Supplier<Block> WHITE_SHINGLE_STAIRS = registerBlock("white_shingle_stairs", () -> new StairBlock(WHITE_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Supplier<Block> WHITE_SHINGLE_SLAB = registerBlock("white_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Supplier<Block> ORANGE_SHINGLES = registerBlock("orange_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Supplier<Block> ORANGE_SHINGLE_STAIRS = registerBlock("orange_shingle_stairs", () -> new StairBlock(ORANGE_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Supplier<Block> ORANGE_SHINGLE_SLAB = registerBlock("orange_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Supplier<Block> MAGENTA_SHINGLES = registerBlock("magenta_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Supplier<Block> MAGENTA_SHINGLE_STAIRS = registerBlock("magenta_shingle_stairs", () -> new StairBlock(MAGENTA_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Supplier<Block> MAGENTA_SHINGLE_SLAB = registerBlock("magenta_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_BLUE_SHINGLES = registerBlock("light_blue_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_BLUE_SHINGLE_STAIRS = registerBlock("light_blue_shingle_stairs", () -> new StairBlock(LIGHT_BLUE_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_BLUE_SHINGLE_SLAB = registerBlock("light_blue_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Supplier<Block> YELLOW_SHINGLES = registerBlock("yellow_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Supplier<Block> YELLOW_SHINGLE_STAIRS = registerBlock("yellow_shingle_stairs", () -> new StairBlock(YELLOW_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Supplier<Block> YELLOW_SHINGLE_SLAB = registerBlock("yellow_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Supplier<Block> LIME_SHINGLES = registerBlock("lime_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final Supplier<Block> LIME_SHINGLE_STAIRS = registerBlock("lime_shingle_stairs", () -> new StairBlock(LIME_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final Supplier<Block> LIME_SHINGLE_SLAB = registerBlock("lime_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final Supplier<Block> PINK_SHINGLES = registerBlock("pink_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final Supplier<Block> PINK_SHINGLE_STAIRS = registerBlock("pink_shingle_stairs", () -> new StairBlock(PINK_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final Supplier<Block> PINK_SHINGLE_SLAB = registerBlock("pink_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final Supplier<Block> GRAY_SHINGLES = registerBlock("gray_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Supplier<Block> GRAY_SHINGLE_STAIRS = registerBlock("gray_shingle_stairs", () -> new StairBlock(GRAY_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Supplier<Block> GRAY_SHINGLE_SLAB = registerBlock("gray_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_GRAY_SHINGLES = registerBlock("light_gray_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_GRAY_SHINGLE_STAIRS = registerBlock("light_gray_shingle_stairs", () -> new StairBlock(LIGHT_GRAY_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_GRAY_SHINGLE_SLAB = registerBlock("light_gray_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Supplier<Block> CYAN_SHINGLES = registerBlock("cyan_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Supplier<Block> CYAN_SHINGLE_STAIRS = registerBlock("cyan_shingle_stairs", () -> new StairBlock(CYAN_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Supplier<Block> CYAN_SHINGLE_SLAB = registerBlock("cyan_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Supplier<Block> PURPLE_SHINGLES = registerBlock("purple_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Supplier<Block> PURPLE_SHINGLE_STAIRS = registerBlock("purple_shingle_stairs", () -> new StairBlock(PURPLE_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Supplier<Block> PURPLE_SHINGLE_SLAB = registerBlock("purple_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Supplier<Block> BLUE_SHINGLES = registerBlock("blue_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Supplier<Block> BLUE_SHINGLE_STAIRS = registerBlock("blue_shingle_stairs", () -> new StairBlock(BLUE_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Supplier<Block> BLUE_SHINGLE_SLAB = registerBlock("blue_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Supplier<Block> BROWN_SHINGLES = registerBlock("brown_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Supplier<Block> BROWN_SHINGLE_STAIRS = registerBlock("brown_shingle_stairs", () -> new StairBlock(BROWN_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Supplier<Block> BROWN_SHINGLE_SLAB = registerBlock("brown_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Supplier<Block> GREEN_SHINGLES = registerBlock("green_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Supplier<Block> GREEN_SHINGLE_STAIRS = registerBlock("green_shingle_stairs", () -> new StairBlock(GREEN_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Supplier<Block> GREEN_SHINGLE_SLAB = registerBlock("green_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Supplier<Block> RED_SHINGLES = registerBlock("red_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final Supplier<Block> RED_SHINGLE_STAIRS = registerBlock("red_shingle_stairs", () -> new StairBlock(RED_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final Supplier<Block> RED_SHINGLE_SLAB = registerBlock("red_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final Supplier<Block> BLACK_SHINGLES = registerBlock("black_shingles", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Supplier<Block> BLACK_SHINGLE_STAIRS = registerBlock("black_shingle_stairs", () -> new StairBlock(BLACK_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Supplier<Block> BLACK_SHINGLE_SLAB = registerBlock("black_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));




    // Registry

    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> supplier = ModRegistry.registerBlock(name, block);
        ModRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Properties().tab(Mod.TAB)));
        return supplier;
    }

    public static <T extends Block> Supplier<T> registerBlockHiModen(String name, Supplier<T> block) {
        Supplier<T> supplier = ModRegistry.registerBlock(name, block);
        ModRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Properties()));
        return supplier;
    }

    public static <T extends Block> Supplier<T> registerBlockOnly(String name, Supplier<T> block) {
        return ModRegistry.registerBlock(name, block);
    }

    public static void init() {}
}
