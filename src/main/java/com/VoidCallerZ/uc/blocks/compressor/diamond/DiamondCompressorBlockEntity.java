package com.VoidCallerZ.uc.blocks.compressor.diamond;

import com.VoidCallerZ.uc.blocks.compressor.CompressorBlockEntity;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import com.VoidCallerZ.uc.setup.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeConfigSpec;
import org.jetbrains.annotations.Nullable;

public class DiamondCompressorBlockEntity extends CompressorBlockEntity
{
    public DiamondCompressorBlockEntity(BlockPos pos, BlockState state)
    {
        super(BlockRegistration.DIAMOND_COMPRESSOR_BLOCK_ENTITY.get(), pos, state, 20, "Diamond Compressor - Tier III");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory inventory, Player player)
    {
        return new DiamondCompressorBlockMenu(containerId, inventory, this);
    }

    @Override
    public ForgeConfigSpec.IntValue getCompressingTimeConfig()
    {
        return Config.diamondCompressorSpeed;
    }

    private boolean isLit()
    {
        return this.litTime > 0;
    }

    public static void tick(Level level, BlockPos pos, BlockState state, DiamondCompressorBlockEntity blockEntity)
    {
        if (blockEntity.isLit())
        {
            blockEntity.litTime--;
            state = state.setValue(DiamondCompressorBlock.LIT, true);
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
                state = state.setValue(DiamondCompressorBlock.LIT, false);
                level.setBlock(pos, state, 3);
            }
            setChanged(level, pos, state);
        }
    }
}