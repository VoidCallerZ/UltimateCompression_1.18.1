package com.VoidCallerZ.uc.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MaterialColor;

public class UcLeavesBlock extends Block
{
    private final MaterialColor color;

    public UcLeavesBlock(Properties properties, MaterialColor color)
    {
        super(properties);
        this.color = color;
    }

//    @Override
//    public MaterialColor getMapColor(BlockGetter level, BlockPos pos)
//    {
//        return this.color;
//    }
}
