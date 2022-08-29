package com.VoidCallerZ.uc.blocks.compressor.test;

import com.VoidCallerZ.uc.blocks.compressor.CompressorBlockEntity;
import com.VoidCallerZ.uc.blocks.compressor.iron.IronCompressorBlock;
import com.VoidCallerZ.uc.blocks.compressor.iron.IronCompressorBlockMenu;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class TestCompressorBlockEntity extends CompressorBlockEntity
{
    public TestCompressorBlockEntity(BlockPos worldPosition, BlockState blockState)
    {
        super(BlockRegistration.TEST_COMPRESSOR_BLOCK_ENTITY.get(), worldPosition, blockState, "Test Compressor - Tier LXIX");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory inventory, Player player)
    {
        return new TestCompressorBlockMenu(containerId, inventory, this);
    }

    private boolean isLit()
    {
        return this.litTime > 0;
    }

    public static void tick(Level level, BlockPos pos, BlockState state, TestCompressorBlockEntity blockEntity)
    {
        if (blockEntity.isLit())
        {
            blockEntity.litTime--;
            state = state.setValue(TestCompressorBlock.LIT, true);
            level.setBlock(pos, state, 3);
            setChanged(level, pos, state);
        }

        if (hasRecipe(blockEntity) && hasCorrectAmountOfInputItems(blockEntity))
        {
            blockEntity.litTime = blockEntity.progress;
            blockEntity.progress++;
            setChanged(level, pos, state);
            if (blockEntity.progress > blockEntity.maxProgress)
            {
                craftItem(blockEntity);
            }
        }
        else
        {
            blockEntity.resetProgress();
            if (!hasEnoughItemsToCompress(blockEntity.inputItemHandler))
            {
                state = state.setValue(TestCompressorBlock.LIT, false);
                level.setBlock(pos, state, 3);
            }
            setChanged(level, pos, state);
        }
    }
}
