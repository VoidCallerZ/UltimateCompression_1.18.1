package com.VoidCallerZ.uc.blocks.compressor.test;

import com.VoidCallerZ.uc.blocks.compressor.CompressorBlock;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

public class TestCompressorBlock extends CompressorBlock
{
    public TestCompressorBlock(BlockBehaviour.Properties properties)
    {
        super(properties);
    }

    public BlockEntity newBlockEntity(BlockPos pos, BlockState state)
    {
        return new TestCompressorBlockEntity(pos, state);
    }

    @Nullable
    public <T extends BlockEntity>BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType)
    {
        return createTickerHelper(blockEntityType, BlockRegistration.TEST_COMPRESSOR_BLOCK_ENTITY.get(), TestCompressorBlockEntity::tick);
    }

    @Override
    protected void openContainer(Level level, BlockPos pos, Player player)
    {
        BlockEntity entity = level.getBlockEntity(pos);
        if (entity instanceof TestCompressorBlockEntity)
        {
            NetworkHooks.openScreen(((ServerPlayer) player), (TestCompressorBlockEntity) entity, pos);
        }
        else
        {
            throw new IllegalStateException("Our container provider is missing");
        }
    }

    public void effectTick(BlockState state, Level level, BlockPos pos, RandomSource random)
    {
        //For sound and particle effects
    }
}
