//package com.starfish_studios.hearth_and_home.events;
//
//import com.starfish_studios.hearth_and_home.integration.IntegrationHandler;
//import com.starfish_studios.hearth_and_home.registry.ModItemTags;
//import net.minecraft.nbt.CompoundTag;
//import net.minecraft.sounds.SoundEvents;
//import net.minecraft.sounds.SoundSource;
//import net.minecraft.util.RandomSource;
//import net.minecraft.world.InteractionHand;
//import net.minecraft.world.InteractionResult;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.block.LayeredCauldronBlock;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.phys.BlockHitResult;
//
//public class BlockInteractionEvent {
//    public static InteractionResult use(Player player, Level level, InteractionHand hand, BlockHitResult pos) {
//        BlockState state = level.getBlockState(pos.getBlockPos());
//
//        //if (!IntegrationHandler.supplementaries_soap_cauldron && state.is(Blocks.WATER_CAULDRON)) return cauldronWashing(player, level, state, hand, pos, -1);
//        //if (IntegrationHandler.supplementaries_soap_cauldron && state.is(ModBlocks.SOAPY_CAULDRON.get())) return cauldronWashing(player, level, state, hand, pos, 5);
//        if (state.is(Blocks.WATER_CAULDRON)) return cauldronWashing(player, level, state, hand, pos, -1);
//
//
//        return InteractionResult.PASS;
//    }
//
//    public static InteractionResult cauldronWashing(Player player, Level level, BlockState state, InteractionHand hand, BlockHitResult pos, int useLiquidChance) {
//        ItemStack itemStack = player.getItemInHand(hand);
//        if (itemStack.is(Items.AIR)) return InteractionResult.PASS;
//        if (itemStack.is(ModItemTags.NOT_WASHABLE)) return InteractionResult.PASS;
//
//        Item result = IntegrationHandler.changeColor(itemStack.getItem(), null);
//
//        if (result == null || result == itemStack.getItem()) return InteractionResult.PASS;
//
//        CompoundTag nbt = itemStack.getTag();
//        ItemStack resultStack = new ItemStack(result);
//        itemStack.shrink(1);
//        if (nbt != null) resultStack.getOrCreateTag().merge(nbt);
//        player.getInventory().add(resultStack);
//
//
//        if (useLiquidChance != -1 && RandomSource.create().nextInt(useLiquidChance) == 0) LayeredCauldronBlock.lowerFillLevel(state, level, pos.getBlockPos());
//
//        level.playSound(null, pos.getBlockPos(), SoundEvents.GENERIC_SPLASH, SoundSource.BLOCKS, 1.0F, 1.0F);
//        player.swing(hand);
//        return InteractionResult.SUCCESS;
//    }
//}
