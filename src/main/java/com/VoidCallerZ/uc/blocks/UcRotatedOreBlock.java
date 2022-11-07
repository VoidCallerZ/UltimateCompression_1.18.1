package com.VoidCallerZ.uc.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class UcRotatedOreBlock extends RotatedPillarBlock
{
    private final int xpMinRange;
    private final int xpRange;

    public UcRotatedOreBlock(Properties properties)
    {
        super(properties);
        this.xpMinRange = 0;
        this.xpRange = 0;
    }

    public UcRotatedOreBlock(Properties properties, int xpRange)
    {
        super(properties);
        this.xpMinRange = 0;
        this.xpRange = xpRange;
    }

    public UcRotatedOreBlock(Properties properties, int xpMinRange, int xpRange)
    {
        super(properties);
        this.xpMinRange = xpMinRange;
        this.xpRange = xpRange;
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader world, BlockPos pos, int fortuneLevel, int silkTouchLevel)
    {
        Random randomSource = new Random();
        if (xpMinRange > 0)
            return silkTouchLevel == 0 ? randomSource.nextInt(xpMinRange, xpRange) : 0;
        else
            return 0;
    }
}
