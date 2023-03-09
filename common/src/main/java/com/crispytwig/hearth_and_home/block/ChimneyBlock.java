package com.crispytwig.hearth_and_home.block;

import com.crispytwig.hearth_and_home.registry.ModSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class ChimneyBlock extends Block implements SimpleWaterloggedBlock {
    protected static final VoxelShape NECK = Block.box(2.0, 0.0, 2.0, 14.0, 8.0, 14.0);
    protected static final VoxelShape LIP = Block.box(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);
    public static final BooleanProperty LIT;
    public static final BooleanProperty WATERLOGGED;
    private static final VoxelShape VIRTUAL_FENCE_POST;
    private static final int SMOKE_DISTANCE = 5;
    private final boolean spawnParticles;

    public ChimneyBlock(boolean bl, int i, Properties properties) {
        super(properties);
        this.spawnParticles = bl;
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, false));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        LevelAccessor levelAccessor = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        boolean bl = levelAccessor.getFluidState(blockPos).getType() == Fluids.WATER;
        return this.defaultBlockState().setValue(WATERLOGGED, bl);
    }

    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.or(NECK, LIP);
    }

    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (state.getValue(LIT)) {
            if (random.nextInt(10) == 0) {
                level.playLocalSound(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, ModSoundEvents.CHIMNEY_CRACKLE.get(), SoundSource.BLOCKS, 0.5F + random.nextFloat(), random.nextFloat() * 0.7F + 0.6F, false);
            }

            if (this.spawnParticles && random.nextInt(5) == 0) {
                for(int i = 0; i < random.nextInt(1) + 1; ++i) {
                    level.addParticle(ParticleTypes.LAVA, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, (random.nextFloat() / 2.0F), 5.0E-5, (random.nextFloat() / 2.0F));
                }
            }
            RandomSource randomSource = level.getRandom();
            SimpleParticleType simpleParticleType = ParticleTypes.CAMPFIRE_COSY_SMOKE;
            level.addAlwaysVisibleParticle(simpleParticleType, true, pos.getX() + 0.5 + randomSource.nextDouble() / 3.0 * (randomSource.nextBoolean() ? 1 : -1), pos.getY() + randomSource.nextDouble() + randomSource.nextDouble(), pos.getZ() + 0.5 + randomSource.nextDouble() / 3.0 * (randomSource.nextBoolean() ? 1 : -1), 0.0, 0.07, 0.0);
            level.addParticle(ParticleTypes.SMOKE, pos.getX() + 0.5 + randomSource.nextDouble() / 4.0 * (randomSource.nextBoolean() ? 1 : -1), pos.getY() + 0.4, pos.getZ() + 0.5 + randomSource.nextDouble() / 4.0 * (randomSource.nextBoolean() ? 1 : -1), 0.0, 0.005, 0.0);
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT, WATERLOGGED);
    }

    public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, PathComputationType type) {
        return true;
    }

    static {
        LIT = BlockStateProperties.LIT;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        VIRTUAL_FENCE_POST = Block.box(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
    }
}