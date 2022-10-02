package com.VoidCallerZ.uc.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;

public class UcHayBlock extends RotatedPillarBlock
{
    public UcHayBlock(Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(AXIS, Direction.Axis.Y));
    }

    public void fallOn(Level level, BlockState state, BlockPos pos, Entity entity, float fallDistance)
    {
        entity.causeFallDamage(fallDistance, 0.3F, DamageSource.FALL);
    }
}
