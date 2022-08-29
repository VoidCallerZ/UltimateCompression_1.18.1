package com.VoidCallerZ.uc.blocks.compressor.netherite;

import com.VoidCallerZ.uc.blocks.compressor.CompressorBlockEntity;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class NetheriteCompressorBlockEntity extends CompressorBlockEntity
{
    public NetheriteCompressorBlockEntity(BlockPos pos, BlockState state)
    {
        super(BlockRegistration.NETHERITE_COMPRESSOR_BLOCK_ENTITY.get(), pos, state, 10, "Netherite Compressor - Tier IV");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory inventory, Player player)
    {
        return new NetheriteCompressorBlockMenu(containerId, inventory, this);
    }

    private boolean isLit()
    {
        return this.litTime > 0;
    }

    public static void tick(Level level, BlockPos pos, BlockState state, NetheriteCompressorBlockEntity blockEntity)
    {
        if (blockEntity.isLit())
        {
            blockEntity.litTime--;
            state = state.setValue(NetheriteCompressorBlock.LIT, true);
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
                state = state.setValue(NetheriteCompressorBlock.LIT, false);
                level.setBlock(pos, state, 3);
            }
            setChanged(level, pos, state);
        }
    }
}