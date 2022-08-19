package com.VoidCallerZ.uc.blocks.glass;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraft.world.level.block.state.BlockState;

public class UcStainedGlassBlock extends StainedGlassBlock
{
    public UcStainedGlassBlock(DyeColor dyeColor, Properties properties)
    {
        super(dyeColor, properties);
    }

    public int getLightBlock(BlockState state, BlockGetter level, BlockPos pos)
    {
        return 2;
    }
}
