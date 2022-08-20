package com.VoidCallerZ.uc.blocks.glass;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BeaconBeamBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;

public class UcStainedGlassPaneBlock extends IronBarsBlock implements BeaconBeamBlock
{
    private final DyeColor color;

    public UcStainedGlassPaneBlock(DyeColor color, Properties properties)
    {
        super(properties);
        this.color = color;
    }

    public DyeColor getColor()
    {
        return this.color;
    }

    public int getLightBlock(BlockState state, BlockGetter level, BlockPos pos)
    {
        return 2;
    }
}
