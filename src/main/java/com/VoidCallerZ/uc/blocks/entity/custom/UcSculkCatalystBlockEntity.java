package com.VoidCallerZ.uc.blocks.entity.custom;

import com.VoidCallerZ.uc.blocks.UcSculkCatalystBlock;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SculkCatalystBlock;
import net.minecraft.world.level.block.SculkSpreader;
import net.minecraft.world.level.block.entity.SculkCatalystBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.BlockPositionSource;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.gameevent.PositionSource;
import org.jetbrains.annotations.VisibleForTesting;

public class UcSculkCatalystBlockEntity extends SculkCatalystBlockEntity
{
    private final BlockPositionSource blockPosSource = new BlockPositionSource(this.worldPosition);
    private final SculkSpreader sculkSpreader = SculkSpreader.createLevelSpreader();

    public UcSculkCatalystBlockEntity(BlockPos pos, BlockState state)
    {
        super(pos, state);
    }
    @Override
    public PositionSource getListenerSource()
    {
        return this.blockPosSource;
    }

    @Override
    public int getListenerRadius()
    {
        return 12;
    }

    public boolean handleGameEvent(ServerLevel level, GameEvent.Message message)
    {
        if (this.isRemoved())
        {
            return false;
        }
        else
        {
            GameEvent.Context gameevent$context = message.context();
            if (message.gameEvent() == GameEvent.ENTITY_DIE)
            {
                Entity $$4 = gameevent$context.sourceEntity();
                if ($$4 instanceof LivingEntity)
                {
                    LivingEntity livingEntity = (LivingEntity) $$4;
                    if (!livingEntity.wasExperienceConsumed())
                    {
                        int i = livingEntity.getExperienceReward();
                        if (livingEntity.shouldDropExperience() && i > 0)
                        {
                            this.sculkSpreader.addCursors(new BlockPos(message.source().relative(Direction.UP, 0.5D)), i);
                            LivingEntity livingEntity1 = livingEntity.getLastHurtByMob();
                            if (livingEntity1 instanceof ServerPlayer)
                            {
                                ServerPlayer serverPlayer = (ServerPlayer) livingEntity1;
                                DamageSource damageSource = livingEntity.getLastDamageSource() == null ? DamageSource.playerAttack(serverPlayer) : livingEntity.getLastDamageSource();
                                CriteriaTriggers.KILL_MOB_NEAR_SCULK_CATALYST.trigger(serverPlayer, gameevent$context.sourceEntity(), damageSource);
                            }
                        }
                        livingEntity.skipDropExperience();
                        UcSculkCatalystBlock.bloom(level, this.worldPosition, this.getBlockState(), level.getRandom());
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static void serverTick(Level level, BlockPos pos, BlockState state, UcSculkCatalystBlockEntity entity)
    {
        entity.sculkSpreader.updateCursors(level, pos, level.getRandom(), true);
    }

    public void load(CompoundTag tag)
    {
        super.load(tag);
        this.sculkSpreader.load(tag);
    }

    protected void saveAdditional(CompoundTag tag)
    {
        this.sculkSpreader.save(tag);
        super.saveAdditional(tag);
    }

    @VisibleForTesting
    public SculkSpreader getSculkSpreader()
    {
        return this.sculkSpreader;
    }
}
