package com.crispytwig.hearth_and_home.registry;

import com.crispytwig.hearth_and_home.block.CrateBlock;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

import static com.crispytwig.hearth_and_home.registry.ModBlocks.registerBlock;

public class ModItems {

    // Wooden Blocks
    public static final Supplier<Block> OAK_TRIM = registerBlock("oak_trim", () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final Supplier<Block> OAK_MOSAIC = registerBlock("oak_mosaic", () -> new GlazedTerracottaBlock(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final Supplier<Block> COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks", () -> new Block(Block.Properties.copy(Blocks.COBBLESTONE)));
    public static final Supplier<Block> THATCH = registerBlock("thatch", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.HAY_BLOCK)));
    public static final Supplier<Block> CRATE = registerBlock("crate", () -> new CrateBlock(Block.Properties.copy(Blocks.BARREL)));


    public static void init() {}
}
