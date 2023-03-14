package com.crispytwig.hearth_and_home;

import com.crispytwig.hearth_and_home.registry.*;
import com.crispytwig.hearth_and_home.util.block.BlocksColorAPI;
import com.crispytwig.hearth_and_home.util.block.BlocksColorInternal;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod {
    public static final String MOD_ID = "hnh";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final CreativeModeTab TAB = ModRegistry.registerCreativeModeTab(new ResourceLocation(MOD_ID, "tab"), () -> new ItemStack(Blocks.OAK_PLANKS));

    public static void init() {
        ModBlocks.init();
        ModItems.init();
        ModSoundEvents.init();
        ModEntityTypes.init();
        ModBlockEntityTypes.init();
    }
}