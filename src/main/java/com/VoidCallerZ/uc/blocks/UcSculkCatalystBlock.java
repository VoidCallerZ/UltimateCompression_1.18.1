package com.VoidCallerZ.uc.blocks;

import com.VoidCallerZ.uc.blocks.entity.custom.UcSculkCatalystBlockEntity;
import com.VoidCallerZ.uc.setup.registration.Registration;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.gameevent.GameEventListener;

import javax.annotation.Nullable;

public class UcSculkCatalystBlock extends BaseEntityBlock
{
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final int PULSE_TICKS = 8;
    public static final BooleanProperty PULSE = BlockStateProperties.BLOOM;
    private final IntProvider xpRange = ConstantInt.of(45);

    public UcSculkCatalystBlock(BlockBehaviour.Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(PULSE, Boolean.valueOf(false)));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation)
    {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror)
    {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder)
    {
        stateBuilder.add(PULSE);
        stateBuilder.add(FACING);
    }

    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource randomSource)
    {
        if (state.getValue(PULSE))
        {
            level.setBlock(pos, state.setValue(PULSE, Boolean.valueOf(false)), 3);
        }
    }

    public static void bloom(ServerLevel level, BlockPos pos, BlockState state, RandomSource randomSource)
    {
        level.setBlock(pos, state.setValue(PULSE, Boolean.valueOf(true)), 3);
        level.scheduleTick(pos, state.getBlock(), 8);
        level.sendParticles(ParticleTypes.SCULK_SOUL, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.15D, (double)pos.getZ() + 0.5D, 2, 0.2D, 0.0D, 0.2D, 0.0D);
        level.playSound(null, pos, SoundEvents.SCULK_CATALYST_BLOOM, SoundSource.BLOCKS, 2.0F, 0.6F + randomSource.nextFloat() * 0.4F);
    }

    @Nullable
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state)
    {
        return new UcSculkCatalystBlockEntity(pos, state);
    }

    @Nullable
    public <T extends BlockEntity>GameEventListener getListener(ServerLevel level, T key)
    {
        return key instanceof UcSculkCatalystBlockEntity ? (UcSculkCatalystBlockEntity)key : null;
    }

    @Nullable
    public <T extends BlockEntity>BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type)
    {
        return level.isClientSide ? null : createTickerHelper(type, Registration.COMPRESSED_SCULK_CATALYST_ENTITY.get(), UcSculkCatalystBlockEntity::serverTick);
    }

    public RenderShape getRenderShape(BlockState state)
    {
        return RenderShape.MODEL;
    }

    public void spawnAfterBreak(BlockState state, ServerLevel level, BlockPos pos, ItemStack item, boolean bool)
    {
        super.spawnAfterBreak(state, level, pos, item, bool);
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader level, RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel)
    {
        return silkTouchLevel == 0 ? this.xpRange.sample(randomSource) : 0;
    }
}
