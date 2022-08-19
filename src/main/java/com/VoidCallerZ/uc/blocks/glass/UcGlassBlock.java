package com.VoidCallerZ.uc.blocks.glass;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockState;

public class UcGlassBlock extends GlassBlock
{
    public UcGlassBlock(Properties properties)
    {
        super(properties);
    }

    public int getLightBlock(BlockState state, BlockGetter level, BlockPos pos)
    {
        return 2;
    }
}
