package com.starfish_studios.hearth_and_home.registry;

import com.starfish_studios.hearth_and_home.block.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

public class HNHBlocks {

    public static class Properties {
        public static BlockBehaviour.Properties base_wood = Block.Properties.of().strength(2.0F, 3.0F).ignitedByLava().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS);
        public static BlockBehaviour.Properties nether_wood = Block.Properties.of().strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD).mapColor(MapColor.WOOD);
        public static BlockBehaviour.Properties wood = base_wood.sound(SoundType.WOOD);
        public static BlockBehaviour.Properties bamboo_wood = base_wood.sound(SoundType.BAMBOO_WOOD);
        public static BlockBehaviour.Properties cherry_wood = base_wood.sound(SoundType.CHERRY_WOOD);

        public static BlockBehaviour.Properties weak_wood = wood.strength(1.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD);

    }

    public static final Supplier<Block> COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks", () -> new Block(Block.Properties.copy(Blocks.COBBLESTONE)));
    public static final Supplier<Block> COBBLESTONE_BRICK_STAIRS = registerBlock("cobblestone_brick_stairs", () -> new StairBlock(COBBLESTONE_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.COBBLESTONE)));
    public static final Supplier<Block> COBBLESTONE_BRICK_SLAB = registerBlock("cobblestone_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.COBBLESTONE)));
    public static final Supplier<Block> COBBLESTONE_BRICK_WALL = registerBlock("cobblestone_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.COBBLESTONE)));
    public static final Supplier<Block> THATCH = registerBlock("thatch", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.HAY_BLOCK)));
    public static final Supplier<Block> THATCH_SLAB = registerBlock("thatch_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.HAY_BLOCK)));
    public static final Supplier<Block> THATCH_STAIRS = registerBlock("thatch_stairs", () -> new StairBlock(THATCH.get().defaultBlockState(), Block.Properties.copy(Blocks.HAY_BLOCK)));

    // public static final Supplier<Block> LARGE_POT = registerBlock("large_pot", () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_BROWN).strength(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final Supplier<Block> SHOJI = registerBlock("shoji", () -> new ColumnBlock(Block.Properties.of().strength(0.3F).sound(SoundType.WOOL)));
    public static final Supplier<Block> SHOJI_PANEL = registerBlock("shoji_panel", () -> new IronBarsBlock(Block.Properties.of().strength(0.3F).sound(SoundType.WOOL)));

    public static final Supplier<Block> WOVEN_BAMBOO = registerBlock("woven_bamboo", () -> new Block(BlockBehaviour.Properties.of().strength(0.5F).sound(SoundType.BAMBOO)));
    public static final Supplier<Block> BAMBOO_MAT = registerBlock("bamboo_mat", () -> new CarpetBlock(BlockBehaviour.Properties.of().randomTicks().instabreak().strength(0.5F).sound(SoundType.BAMBOO).noOcclusion()));

    // Columns
    public static final Supplier<Block> STONE_COLUMN = registerBlock("stone_column", () -> new ColumnBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final Supplier<Block> CALCITE_COLUMN = registerBlock("calcite_column", () -> new ColumnBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final Supplier<Block> QUARTZ_COLUMN = registerBlock("quartz_column", () -> new ColumnBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));

    // Calcite Blocks
    // public static final Supplier<Block> CALCITE_STAIRS = registerBlock("calcite_stairs", () -> new StairBlock(Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    // public static final Supplier<Block> CALCITE_SLAB = registerBlock("calcite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    // public static final Supplier<Block> CALCITE_WALL = registerBlock("calcite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final Supplier<Block> POLISHED_CALCITE = registerBlock("polished_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final Supplier<Block> POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs", () -> new StairBlock(Blocks.POLISHED_BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Supplier<Block> POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    // public static final Supplier<Block> POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)));
    // public static final Supplier<Block> CALCITE_BRICKS = registerBlock("calcite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    // public static final Supplier<Block> CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs", () -> new StairBlock(Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    // public static final Supplier<Block> CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    // public static final Supplier<Block> CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final Supplier<Block> CHISELED_CALCITE = registerBlock("chiseled_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    // Chimneys
    public static final Supplier<Block> COBBLESTONE_CHIMNEY = registerBlock("cobblestone_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final Supplier<Block> MOSSY_COBBLESTONE_CHIMNEY = registerBlock("mossy_cobblestone_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final Supplier<Block> STONE_BRICK_CHIMNEY = registerBlock("stone_brick_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final Supplier<Block> MOSSY_STONE_BRICK_CHIMNEY = registerBlock("mossy_stone_brick_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));
    public static final Supplier<Block> GRANITE_CHIMNEY = registerBlock("granite_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final Supplier<Block> DIORITE_CHIMNEY = registerBlock("diorite_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
    public static final Supplier<Block> ANDESITE_CHIMNEY = registerBlock("andesite_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
    public static final Supplier<Block> COBBLED_DEEPSLATE_CHIMNEY = registerBlock("cobbled_deepslate_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final Supplier<Block> POLISHED_DEEPSLATE_CHIMNEY = registerBlock("polished_deepslate_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)));
    public static final Supplier<Block> DEEPSLATE_BRICK_CHIMNEY = registerBlock("deepslate_brick_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Supplier<Block> DEEPSLATE_TILE_CHIMNEY = registerBlock("deepslate_tile_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));
    public static final Supplier<Block> BRICK_CHIMNEY = registerBlock("brick_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final Supplier<Block> MUD_BRICK_CHIMNEY = registerBlock("mud_brick_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final Supplier<Block> SANDSTONE_CHIMNEY = registerBlock("sandstone_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final Supplier<Block> RED_SANDSTONE_CHIMNEY = registerBlock("red_sandstone_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
    public static final Supplier<Block> PRISMARINE_CHIMNEY = registerBlock("prismarine_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final Supplier<Block> NETHER_BRICK_CHIMNEY = registerBlock("nether_brick_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)));
    public static final Supplier<Block> RED_NETHER_BRICK_CHIMNEY = registerBlock("red_nether_brick_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Supplier<Block> BLACKSTONE_CHIMNEY = registerBlock("blackstone_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final Supplier<Block> POLISHED_BLACKSTONE_CHIMNEY = registerBlock("polished_blackstone_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Supplier<Block> POLISHED_BLACKSTONE_BRICK_CHIMNEY = registerBlock("polished_blackstone_brick_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Supplier<Block> END_STONE_BRICK_CHIMNEY = registerBlock("end_stone_brick_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));
    public static final Supplier<Block> COBBLESTONE_BRICK_CHIMNEY = registerBlock("cobblestone_brick_chimney", () -> new ChimneyBlock(BlockBehaviour.Properties.copy(COBBLESTONE_BRICKS.get())));

    // Parquet
    public static final Supplier<Block> OAK_PARQUET = registerBlock("oak_parquet", () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final Supplier<Block> SPRUCE_PARQUET = registerBlock("spruce_parquet", () -> new Block(Block.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final Supplier<Block> BIRCH_PARQUET = registerBlock("birch_parquet", () -> new Block(Block.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final Supplier<Block> JUNGLE_PARQUET = registerBlock("jungle_parquet", () -> new Block(Block.Properties.copy(Blocks.JUNGLE_PLANKS)));
    public static final Supplier<Block> ACACIA_PARQUET = registerBlock("acacia_parquet", () -> new Block(Block.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final Supplier<Block> DARK_OAK_PARQUET = registerBlock("dark_oak_parquet", () -> new Block(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Supplier<Block> MANGROVE_PARQUET = registerBlock("mangrove_parquet", () -> new Block(Block.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final Supplier<Block> CHERRY_PARQUET = registerBlock("cherry_parquet", () -> new Block(Block.Properties.copy(Blocks.CHERRY_WOOD)));
    public static final Supplier<Block> BAMBOO_PARQUET = registerBlock("bamboo_parquet", () -> new Block(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final Supplier<Block> CRIMSON_PARQUET = registerBlock("crimson_parquet", () -> new Block(Block.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final Supplier<Block> WARPED_PARQUET = registerBlock("warped_parquet", () -> new Block(Block.Properties.copy(Blocks.WARPED_PLANKS)));

    // Trim
    public static final Supplier<Block> OAK_TRIM = registerBlock("oak_trim", () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final Supplier<Block> SPRUCE_TRIM = registerBlock("spruce_trim", () -> new Block(Block.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final Supplier<Block> BIRCH_TRIM = registerBlock("birch_trim", () -> new Block(Block.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final Supplier<Block> JUNGLE_TRIM = registerBlock("jungle_trim", () -> new Block(Block.Properties.copy(Blocks.JUNGLE_PLANKS)));
    public static final Supplier<Block> ACACIA_TRIM = registerBlock("acacia_trim", () -> new Block(Block.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final Supplier<Block> DARK_OAK_TRIM = registerBlock("dark_oak_trim", () -> new Block(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Supplier<Block> MANGROVE_TRIM = registerBlock("mangrove_trim", () -> new Block(Block.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final Supplier<Block> CHERRY_TRIM = registerBlock("cherry_trim", () -> new Block(Block.Properties.copy(Blocks.CHERRY_WOOD)));
    public static final Supplier<Block> BAMBOO_TRIM = registerBlock("bamboo_trim", () -> new Block(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final Supplier<Block> CRIMSON_TRIM = registerBlock("crimson_trim", () -> new Block(Block.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final Supplier<Block> WARPED_TRIM = registerBlock("warped_trim", () -> new Block(Block.Properties.copy(Blocks.WARPED_PLANKS)));

    // Sanded Wood
    public static final Supplier<Block> OAK_SANDED_WOOD = registerBlock("oak_sanded_wood", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)));
    public static final Supplier<Block> SPRUCE_SANDED_WOOD = registerBlock("spruce_sanded_wood", () -> new Block(Block.Properties.copy(Blocks.SPRUCE_WOOD)));
    public static final Supplier<Block> BIRCH_SANDED_WOOD = registerBlock("birch_sanded_wood", () -> new Block(Block.Properties.copy(Blocks.BIRCH_WOOD)));
    public static final Supplier<Block> JUNGLE_SANDED_WOOD = registerBlock("jungle_sanded_wood", () -> new Block(Block.Properties.copy(Blocks.JUNGLE_WOOD)));
    public static final Supplier<Block> ACACIA_SANDED_WOOD = registerBlock("acacia_sanded_wood", () -> new Block(Block.Properties.copy(Blocks.ACACIA_WOOD)));
    public static final Supplier<Block> DARK_OAK_SANDED_WOOD = registerBlock("dark_oak_sanded_wood", () -> new Block(Block.Properties.copy(Blocks.DARK_OAK_WOOD)));
    public static final Supplier<Block> MANGROVE_SANDED_WOOD = registerBlock("mangrove_sanded_wood", () -> new Block(Block.Properties.copy(Blocks.MANGROVE_WOOD)));
    public static final Supplier<Block> CHERRY_SANDED_WOOD = registerBlock("cherry_sanded_wood", () -> new Block(Block.Properties.copy(Blocks.CHERRY_WOOD)));
    public static final Supplier<Block> BAMBOO_SANDED_WOOD = registerBlock("bamboo_sanded_wood", () -> new Block(Block.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final Supplier<Block> CRIMSON_SANDED_WOOD = registerBlock("crimson_sanded_wood", () -> new Block(Block.Properties.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Supplier<Block> WARPED_SANDED_WOOD = registerBlock("warped_sanded_wood", () -> new Block(Block.Properties.copy(Blocks.WARPED_HYPHAE)));

    // Lattices
    public static final Supplier<Block> OAK_LATTICE = registerBlock("oak_lattice", () -> new LatticeBlock(Properties.weak_wood.noOcclusion()));
    public static final Supplier<Block> SPRUCE_LATTICE = registerBlock("spruce_lattice", () -> new LatticeBlock(Properties.weak_wood.noOcclusion()));
    public static final Supplier<Block> BIRCH_LATTICE = registerBlock("birch_lattice", () -> new LatticeBlock(Properties.weak_wood.noOcclusion()));
    public static final Supplier<Block> JUNGLE_LATTICE = registerBlock("jungle_lattice", () -> new LatticeBlock(Properties.weak_wood.noOcclusion()));
    public static final Supplier<Block> ACACIA_LATTICE = registerBlock("acacia_lattice", () -> new LatticeBlock(Properties.weak_wood.noOcclusion()));
    public static final Supplier<Block> DARK_OAK_LATTICE = registerBlock("dark_oak_lattice", () -> new LatticeBlock(Properties.weak_wood.noOcclusion()));
    public static final Supplier<Block> MANGROVE_LATTICE = registerBlock("mangrove_lattice", () -> new LatticeBlock(Properties.weak_wood.noOcclusion()));
    public static final Supplier<Block> CHERRY_LATTICE = registerBlock("cherry_lattice", () -> new LatticeBlock(Properties.weak_wood.noOcclusion()));
    public static final Supplier<Block> BAMBOO_LATTICE = registerBlock("bamboo_lattice", () -> new LatticeBlock(Properties.weak_wood.noOcclusion()));
    public static final Supplier<Block> CRIMSON_LATTICE = registerBlock("crimson_lattice", () -> new LatticeBlock(Properties.weak_wood.noOcclusion()));
    public static final Supplier<Block> WARPED_LATTICE = registerBlock("warped_lattice", () -> new LatticeBlock(Properties.weak_wood.noOcclusion()));

    
    // Terracotta Shingles
    public static final Supplier<Block> SHINGLES = registerBlock("shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final Supplier<Block> SHINGLE_STAIRS = registerBlock("shingle_stairs", () -> new StairBlock(SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final Supplier<Block> SHINGLE_SLAB = registerBlock("shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final Supplier<Block> WHITE_SHINGLES = registerBlock("white_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Supplier<Block> WHITE_SHINGLE_STAIRS = registerBlock("white_shingle_stairs", () -> new StairBlock(WHITE_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Supplier<Block> WHITE_SHINGLE_SLAB = registerBlock("white_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Supplier<Block> ORANGE_SHINGLES = registerBlock("orange_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Supplier<Block> ORANGE_SHINGLE_STAIRS = registerBlock("orange_shingle_stairs", () -> new StairBlock(ORANGE_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Supplier<Block> ORANGE_SHINGLE_SLAB = registerBlock("orange_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Supplier<Block> MAGENTA_SHINGLES = registerBlock("magenta_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Supplier<Block> MAGENTA_SHINGLE_STAIRS = registerBlock("magenta_shingle_stairs", () -> new StairBlock(MAGENTA_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Supplier<Block> MAGENTA_SHINGLE_SLAB = registerBlock("magenta_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_BLUE_SHINGLES = registerBlock("light_blue_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_BLUE_SHINGLE_STAIRS = registerBlock("light_blue_shingle_stairs", () -> new StairBlock(LIGHT_BLUE_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_BLUE_SHINGLE_SLAB = registerBlock("light_blue_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Supplier<Block> YELLOW_SHINGLES = registerBlock("yellow_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Supplier<Block> YELLOW_SHINGLE_STAIRS = registerBlock("yellow_shingle_stairs", () -> new StairBlock(YELLOW_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Supplier<Block> YELLOW_SHINGLE_SLAB = registerBlock("yellow_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Supplier<Block> LIME_SHINGLES = registerBlock("lime_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final Supplier<Block> LIME_SHINGLE_STAIRS = registerBlock("lime_shingle_stairs", () -> new StairBlock(LIME_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final Supplier<Block> LIME_SHINGLE_SLAB = registerBlock("lime_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final Supplier<Block> PINK_SHINGLES = registerBlock("pink_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final Supplier<Block> PINK_SHINGLE_STAIRS = registerBlock("pink_shingle_stairs", () -> new StairBlock(PINK_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final Supplier<Block> PINK_SHINGLE_SLAB = registerBlock("pink_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final Supplier<Block> GRAY_SHINGLES = registerBlock("gray_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Supplier<Block> GRAY_SHINGLE_STAIRS = registerBlock("gray_shingle_stairs", () -> new StairBlock(GRAY_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Supplier<Block> GRAY_SHINGLE_SLAB = registerBlock("gray_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_GRAY_SHINGLES = registerBlock("light_gray_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_GRAY_SHINGLE_STAIRS = registerBlock("light_gray_shingle_stairs", () -> new StairBlock(LIGHT_GRAY_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_GRAY_SHINGLE_SLAB = registerBlock("light_gray_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Supplier<Block> CYAN_SHINGLES = registerBlock("cyan_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Supplier<Block> CYAN_SHINGLE_STAIRS = registerBlock("cyan_shingle_stairs", () -> new StairBlock(CYAN_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Supplier<Block> CYAN_SHINGLE_SLAB = registerBlock("cyan_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Supplier<Block> PURPLE_SHINGLES = registerBlock("purple_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Supplier<Block> PURPLE_SHINGLE_STAIRS = registerBlock("purple_shingle_stairs", () -> new StairBlock(PURPLE_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Supplier<Block> PURPLE_SHINGLE_SLAB = registerBlock("purple_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Supplier<Block> BLUE_SHINGLES = registerBlock("blue_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Supplier<Block> BLUE_SHINGLE_STAIRS = registerBlock("blue_shingle_stairs", () -> new StairBlock(BLUE_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Supplier<Block> BLUE_SHINGLE_SLAB = registerBlock("blue_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Supplier<Block> BROWN_SHINGLES = registerBlock("brown_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Supplier<Block> BROWN_SHINGLE_STAIRS = registerBlock("brown_shingle_stairs", () -> new StairBlock(BROWN_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Supplier<Block> BROWN_SHINGLE_SLAB = registerBlock("brown_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Supplier<Block> GREEN_SHINGLES = registerBlock("green_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Supplier<Block> GREEN_SHINGLE_STAIRS = registerBlock("green_shingle_stairs", () -> new StairBlock(GREEN_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Supplier<Block> GREEN_SHINGLE_SLAB = registerBlock("green_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Supplier<Block> RED_SHINGLES = registerBlock("red_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final Supplier<Block> RED_SHINGLE_STAIRS = registerBlock("red_shingle_stairs", () -> new StairBlock(RED_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final Supplier<Block> RED_SHINGLE_SLAB = registerBlock("red_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final Supplier<Block> BLACK_SHINGLES = registerBlock("black_shingles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Supplier<Block> BLACK_SHINGLE_STAIRS = registerBlock("black_shingle_stairs", () -> new StairBlock(BLACK_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Supplier<Block> BLACK_SHINGLE_SLAB = registerBlock("black_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));


    // Terracotta Bricks
    // Keep the following lines for terracotta bricks but clone them and comment out stairs and slabs.
    public static final Supplier<Block> TERRACOTTA_BRICKS = registerBlock("terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final Supplier<Block> TERRACOTTA_BRICK_STAIRS = registerBlock("terracotta_brick_stairs", () -> new StairBlock(TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final Supplier<Block> TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final Supplier<Block> WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Supplier<Block> WHITE_TERRACOTTA_BRICK_STAIRS = registerBlock("white_terracotta_brick_stairs", () -> new StairBlock(WHITE_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Supplier<Block> WHITE_TERRACOTTA_BRICK_SLAB = registerBlock("white_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Supplier<Block> ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Supplier<Block> ORANGE_TERRACOTTA_BRICK_STAIRS = registerBlock("orange_terracotta_brick_stairs", () -> new StairBlock(ORANGE_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Supplier<Block> ORANGE_TERRACOTTA_BRICK_SLAB = registerBlock("orange_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Supplier<Block> MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Supplier<Block> MAGENTA_TERRACOTTA_BRICK_STAIRS = registerBlock("magenta_terracotta_brick_stairs", () -> new StairBlock(MAGENTA_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Supplier<Block> MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlock("magenta_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("light_blue_terracotta_brick_stairs", () -> new StairBlock(LIGHT_BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("light_blue_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Supplier<Block> YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Supplier<Block> YELLOW_TERRACOTTA_BRICK_STAIRS = registerBlock("yellow_terracotta_brick_stairs", () -> new StairBlock(YELLOW_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Supplier<Block> YELLOW_TERRACOTTA_BRICK_SLAB = registerBlock("yellow_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Supplier<Block> LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final Supplier<Block> LIME_TERRACOTTA_BRICK_STAIRS = registerBlock("lime_terracotta_brick_stairs", () -> new StairBlock(LIME_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final Supplier<Block> LIME_TERRACOTTA_BRICK_SLAB = registerBlock("lime_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final Supplier<Block> PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final Supplier<Block> PINK_TERRACOTTA_BRICK_STAIRS = registerBlock("pink_terracotta_brick_stairs", () -> new StairBlock(PINK_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final Supplier<Block> PINK_TERRACOTTA_BRICK_SLAB = registerBlock("pink_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final Supplier<Block> GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Supplier<Block> GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("gray_terracotta_brick_stairs", () -> new StairBlock(GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Supplier<Block> GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("gray_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("light_gray_terracotta_brick_stairs", () -> new StairBlock(LIGHT_GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("light_gray_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Supplier<Block> CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Supplier<Block> CYAN_TERRACOTTA_BRICK_STAIRS = registerBlock("cyan_terracotta_brick_stairs", () -> new StairBlock(CYAN_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Supplier<Block> CYAN_TERRACOTTA_BRICK_SLAB = registerBlock("cyan_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Supplier<Block> PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Supplier<Block> PURPLE_TERRACOTTA_BRICK_STAIRS = registerBlock("purple_terracotta_brick_stairs", () -> new StairBlock(PURPLE_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Supplier<Block> PURPLE_TERRACOTTA_BRICK_SLAB = registerBlock("purple_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Supplier<Block> BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Supplier<Block> BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("blue_terracotta_brick_stairs", () -> new StairBlock(BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Supplier<Block> BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("blue_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Supplier<Block> BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Supplier<Block> BROWN_TERRACOTTA_BRICK_STAIRS = registerBlock("brown_terracotta_brick_stairs", () -> new StairBlock(BROWN_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Supplier<Block> BROWN_TERRACOTTA_BRICK_SLAB = registerBlock("brown_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Supplier<Block> GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Supplier<Block> GREEN_TERRACOTTA_BRICK_STAIRS = registerBlock("green_terracotta_brick_stairs", () -> new StairBlock(GREEN_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Supplier<Block> GREEN_TERRACOTTA_BRICK_SLAB = registerBlock("green_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Supplier<Block> RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final Supplier<Block> RED_TERRACOTTA_BRICK_STAIRS = registerBlock("red_terracotta_brick_stairs", () -> new StairBlock(RED_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final Supplier<Block> RED_TERRACOTTA_BRICK_SLAB = registerBlock("red_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final Supplier<Block> BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks", () -> new Block(Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Supplier<Block> BLACK_TERRACOTTA_BRICK_STAIRS = registerBlock("black_terracotta_brick_stairs", () -> new StairBlock(BLACK_TERRACOTTA_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Supplier<Block> BLACK_TERRACOTTA_BRICK_SLAB = registerBlock("black_terracotta_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));



    // Tiles
    public static final Supplier<Block> TILES = registerBlock("tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final Supplier<Block> TILE_SLAB = registerBlock("tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final Supplier<Block> WHITE_TILES = registerBlock("white_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Supplier<Block> WHITE_TILE_SLAB = registerBlock("white_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Supplier<Block> ORANGE_TILES = registerBlock("orange_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Supplier<Block> ORANGE_TILE_SLAB = registerBlock("orange_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Supplier<Block> MAGENTA_TILES = registerBlock("magenta_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Supplier<Block> MAGENTA_TILE_SLAB = registerBlock("magenta_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_BLUE_TILES = registerBlock("light_blue_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_BLUE_TILE_SLAB = registerBlock("light_blue_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Supplier<Block> YELLOW_TILES = registerBlock("yellow_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Supplier<Block> YELLOW_TILE_SLAB = registerBlock("yellow_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Supplier<Block> LIME_TILES = registerBlock("lime_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final Supplier<Block> LIME_TILE_SLAB = registerBlock("lime_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final Supplier<Block> PINK_TILES = registerBlock("pink_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final Supplier<Block> PINK_TILE_SLAB = registerBlock("pink_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final Supplier<Block> GRAY_TILES = registerBlock("gray_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Supplier<Block> GRAY_TILE_SLAB = registerBlock("gray_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_GRAY_TILES = registerBlock("light_gray_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Supplier<Block> LIGHT_GRAY_TILE_SLAB = registerBlock("light_gray_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Supplier<Block> CYAN_TILES = registerBlock("cyan_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Supplier<Block> CYAN_TILE_SLAB = registerBlock("cyan_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Supplier<Block> PURPLE_TILES = registerBlock("purple_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Supplier<Block> PURPLE_TILE_SLAB = registerBlock("purple_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Supplier<Block> BLUE_TILES = registerBlock("blue_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Supplier<Block> BLUE_TILE_SLAB = registerBlock("blue_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Supplier<Block> BROWN_TILES = registerBlock("brown_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Supplier<Block> BROWN_TILE_SLAB = registerBlock("brown_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Supplier<Block> GREEN_TILES = registerBlock("green_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Supplier<Block> GREEN_TILE_SLAB = registerBlock("green_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Supplier<Block> RED_TILES = registerBlock("red_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final Supplier<Block> RED_TILE_SLAB = registerBlock("red_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final Supplier<Block> BLACK_TILES = registerBlock("black_tiles", () -> new HorizontalFacingBlock(Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Supplier<Block> BLACK_TILE_SLAB = registerBlock("black_tile_slab", () -> new RotatingSlabBlock(Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    // Paper Lanterns
    public static final Supplier<Block> WHITE_PAPER_LANTERN = registerBlock("white_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> ORANGE_PAPER_LANTERN = registerBlock("orange_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> MAGENTA_PAPER_LANTERN = registerBlock("magenta_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> LIGHT_BLUE_PAPER_LANTERN = registerBlock("light_blue_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> YELLOW_PAPER_LANTERN = registerBlock("yellow_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> LIME_PAPER_LANTERN = registerBlock("lime_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> PINK_PAPER_LANTERN = registerBlock("pink_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> GRAY_PAPER_LANTERN = registerBlock("gray_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> LIGHT_GRAY_PAPER_LANTERN = registerBlock("light_gray_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> CYAN_PAPER_LANTERN = registerBlock("cyan_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> PURPLE_PAPER_LANTERN = registerBlock("purple_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> BLUE_PAPER_LANTERN = registerBlock("blue_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> BROWN_PAPER_LANTERN = registerBlock("brown_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> GREEN_PAPER_LANTERN = registerBlock("green_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> RED_PAPER_LANTERN = registerBlock("red_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));
    public static final Supplier<Block> BLACK_PAPER_LANTERN = registerBlock("black_paper_lantern", () -> new Block(Block.Properties.of().strength(0.3F).lightLevel((state) -> 15).sound(SoundType.WOOL)));

    public static final Supplier<Block> BARRED_GLASS = registerBlock("barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final Supplier<Block> WHITE_STAINED_BARRED_GLASS = registerBlock("white_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Supplier<Block> ORANGE_STAINED_BARRED_GLASS = registerBlock("orange_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Supplier<Block> MAGENTA_STAINED_BARRED_GLASS = registerBlock("magenta_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Supplier<Block> LIGHT_BLUE_STAINED_BARRED_GLASS = registerBlock("light_blue_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Supplier<Block> YELLOW_STAINED_BARRED_GLASS = registerBlock("yellow_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Supplier<Block> LIME_STAINED_BARRED_GLASS = registerBlock("lime_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Supplier<Block> PINK_STAINED_BARRED_GLASS = registerBlock("pink_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS)));
    public static final Supplier<Block> GRAY_STAINED_BARRED_GLASS = registerBlock("gray_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Supplier<Block> LIGHT_GRAY_STAINED_BARRED_GLASS = registerBlock("light_gray_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Supplier<Block> CYAN_STAINED_BARRED_GLASS = registerBlock("cyan_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Supplier<Block> PURPLE_STAINED_BARRED_GLASS = registerBlock("purple_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Supplier<Block> BLUE_STAINED_BARRED_GLASS = registerBlock("blue_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Supplier<Block> BROWN_STAINED_BARRED_GLASS = registerBlock("brown_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Supplier<Block> GREEN_STAINED_BARRED_GLASS = registerBlock("green_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Supplier<Block> RED_STAINED_BARRED_GLASS = registerBlock("red_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS)));
    public static final Supplier<Block> BLACK_STAINED_BARRED_GLASS = registerBlock("black_stained_barred_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS)));

    public static final Supplier<Block> BARRED_GLASS_PANE = registerBlock("barred_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final Supplier<Block> WHITE_STAINED_BARRED_GLASS_PANE = registerBlock("white_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.WHITE, BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS_PANE)));
    public static final Supplier<Block> ORANGE_STAINED_BARRED_GLASS_PANE = registerBlock("orange_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.ORANGE, BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS_PANE)));
    public static final Supplier<Block> MAGENTA_STAINED_BARRED_GLASS_PANE = registerBlock("magenta_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS_PANE)));
    public static final Supplier<Block> LIGHT_BLUE_STAINED_BARRED_GLASS_PANE = registerBlock("light_blue_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)));
    public static final Supplier<Block> YELLOW_STAINED_BARRED_GLASS_PANE = registerBlock("yellow_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.YELLOW, BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS_PANE)));
    public static final Supplier<Block> LIME_STAINED_BARRED_GLASS_PANE = registerBlock("lime_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.LIME, BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS_PANE)));
    public static final Supplier<Block> PINK_STAINED_BARRED_GLASS_PANE = registerBlock("pink_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.PINK, BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS_PANE)));
    public static final Supplier<Block> GRAY_STAINED_BARRED_GLASS_PANE = registerBlock("gray_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.GRAY, BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS_PANE)));
    public static final Supplier<Block> LIGHT_GRAY_STAINED_BARRED_GLASS_PANE = registerBlock("light_gray_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)));
    public static final Supplier<Block> CYAN_STAINED_BARRED_GLASS_PANE = registerBlock("cyan_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS_PANE)));
    public static final Supplier<Block> PURPLE_STAINED_BARRED_GLASS_PANE = registerBlock("purple_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.PURPLE, BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS_PANE)));
    public static final Supplier<Block> BLUE_STAINED_BARRED_GLASS_PANE = registerBlock("blue_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.BLUE, BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS_PANE)));
    public static final Supplier<Block> BROWN_STAINED_BARRED_GLASS_PANE = registerBlock("brown_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.BROWN, BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS_PANE)));
    public static final Supplier<Block> GREEN_STAINED_BARRED_GLASS_PANE = registerBlock("green_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.GREEN, BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS_PANE)));
    public static final Supplier<Block> RED_STAINED_BARRED_GLASS_PANE = registerBlock("red_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS_PANE)));
    public static final Supplier<Block> BLACK_STAINED_BARRED_GLASS_PANE = registerBlock("black_stained_barred_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS_PANE)));

    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> supplier = HNHRegistry.registerBlock(name, block);
        HNHRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Properties()), "tab");
        return supplier;
    }

    public static <T extends Block> Supplier<T> registerBlockHidden(String name, Supplier<T> block) {
        Supplier<T> supplier = HNHRegistry.registerBlock(name, block);
        HNHRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Properties()), null);
        return supplier;
    }

    public static <T extends Block> Supplier<T> registerBlockOnly(String name, Supplier<T> block) {
        return HNHRegistry.registerBlock(name, block);
    }

    public static void registerFlammables() {
        HNHRegistry.setFlammable(OAK_PARQUET, 5, 20);
    }

    public static void init() {}
}
