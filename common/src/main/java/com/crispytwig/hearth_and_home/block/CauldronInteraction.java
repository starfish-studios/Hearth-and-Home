package com.crispytwig.hearth_and_home.block;

import com.crispytwig.hearth_and_home.registry.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CauldronInteraction implements net.minecraft.core.cauldron.CauldronInteraction {
    @Override
    public InteractionResult interact(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, ItemStack itemStack) {
        return null;
    }

    // Wash colored planks into normal Oak Planks.
    net.minecraft.core.cauldron.CauldronInteraction PLANKS = (blockState, level, blockPos, player, interactionHand, itemStack) -> {
        Block block = Block.byItem(itemStack.getItem());
        if (block != Blocks.OAK_PLANKS) {
            return InteractionResult.PASS;
        } else if (block == ModBlocks.RED_SHINGLES.get()) {
            if (!level.isClientSide) {
                ItemStack itemStack2 = new ItemStack(Items.OAK_PLANKS);

                player.setItemInHand(interactionHand, itemStack2);
                LayeredCauldronBlock.lowerFillLevel(blockState, level, blockPos);
            }
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    };
}
