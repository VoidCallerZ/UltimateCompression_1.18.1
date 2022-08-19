package com.VoidCallerZ.uc.blocks;

import com.VoidCallerZ.uc.registration.ItemRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.EntityCollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Optional;

public class UcPowderSnowBlock extends Block implements BucketPickup
{
    private static final float HORIZONTAL_PARTICLE_MOMENTUM_FACTOR = 0.083333336F;
    private static final float IN_BLOCK_HORIZONTAL_SPEED_MULTIPLIER = 0.1F;
    private static final float IN_BLOCK_VERTICAL_SPEED_MULTIPLIER = 1.2F;
    private static final float NUM_BLOCKS_TO_FALL_INTO_BLOCK = 2.5F;
    private static final VoxelShape FALLING_COLLISION_SHAPE = Shapes.box(0.0D, 0.0D, 0.0D, 1.0D, (double)0.9F, 1.0D);
    private static final double MINIMUM_FALL_DISTANCE_FOR_SOUND = 4.0D;
    private static final double MINIMUM_FALL_DISTANCE_FOR_BIG_SOUND = 7.0D;

    public UcPowderSnowBlock(BlockBehaviour.Properties properties)
    {
        super(properties);
    }

    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction direction)
    {
        return adjacentBlockState.is(this) ? true : super.skipRendering(state, adjacentBlockState, direction);
    }

    public VoxelShape getOcclusionShape(BlockState state, BlockGetter level, BlockPos pos)
    {
        return Shapes.empty();
    }

    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity)
    {
        if (!(entity instanceof LivingEntity) || entity.getFeetBlockState().is(this))
        {
            entity.makeStuckInBlock(state, new Vec3(IN_BLOCK_HORIZONTAL_SPEED_MULTIPLIER, IN_BLOCK_VERTICAL_SPEED_MULTIPLIER, IN_BLOCK_HORIZONTAL_SPEED_MULTIPLIER));
            if (level.isClientSide)
            {
                RandomSource randomSource = level.getRandom();
                boolean flag = entity.xOld != entity.getX() || entity.zOld != entity.getZ();
                if (flag && randomSource.nextBoolean())
                {
                    level.addParticle(ParticleTypes.SNOWFLAKE, entity.getX(), pos.getY() + 1, entity.getZ(), Mth.randomBetween(randomSource, -1.0F, 1.0F) * HORIZONTAL_PARTICLE_MOMENTUM_FACTOR, 0.05F, Mth.randomBetween(randomSource, -1.0F, 1.0F) * HORIZONTAL_PARTICLE_MOMENTUM_FACTOR);
                }
            }
        }

        entity.setIsInPowderSnow(true);
        if (!level.isClientSide)
        {
            if (entity.isOnFire() && (level.getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING) || entity instanceof Player) && entity.mayInteract(level, pos))
            {
                level.destroyBlock(pos, false);
            }

            entity.setSharedFlagOnFire(false);
        }
    }

    public void fallOn(Level pLevel, BlockState pState, BlockPos pPos, Entity pEntity, float pFallDistance) {
        if (!((double)pFallDistance < MINIMUM_FALL_DISTANCE_FOR_SOUND) && pEntity instanceof LivingEntity livingentity)
        {
            LivingEntity.Fallsounds $$7 = livingentity.getFallSounds();
            SoundEvent soundevent = (double)pFallDistance < MINIMUM_FALL_DISTANCE_FOR_BIG_SOUND ? $$7.small() : $$7.big();
            pEntity.playSound(soundevent, 1.0F, 1.0F);
        }
    }

    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context)
    {
        if (context instanceof EntityCollisionContext entityCollisionContext)
        {
            Entity entity = entityCollisionContext.getEntity();
            if (entity != null)
            {
                if (entity.fallDistance > NUM_BLOCKS_TO_FALL_INTO_BLOCK)
                {
                    return FALLING_COLLISION_SHAPE;
                }

                boolean flag = entity instanceof FallingBlockEntity;
                if (flag || canEntityWalkOnPowderSnow(entity) && context.isAbove(Shapes.block(), pos, false) && !context.isDescending())
                {
                    return super.getCollisionShape(state, level, pos, context);
                }
            }
        }
        return Shapes.empty();
    }

    public VoxelShape getVisualShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context)
    {
        return Shapes.empty();
    }

    public static boolean canEntityWalkOnPowderSnow(Entity entity)
    {
        if (entity.getType().is(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS))
        {
            return true;
        }
        else
        {
            return entity instanceof LivingEntity ? ((LivingEntity)entity).getItemBySlot(EquipmentSlot.FEET).canWalkOnPowderedSnow((LivingEntity)entity) : false;
        }
    }

    public ItemStack pickupBlock(LevelAccessor pLevel, BlockPos pPos, BlockState pState) {
        pLevel.setBlock(pPos, Blocks.AIR.defaultBlockState(), 11);
        if (!pLevel.isClientSide()) {
            pLevel.levelEvent(2001, pPos, Block.getId(pState));
        }

        return new ItemStack(ItemRegistration.COMPRESSED_POWDER_SNOW_BUCKET.get());
    }

    public Optional<SoundEvent> getPickupSound()
    {
        return Optional.of(SoundEvents.BUCKET_FILL_POWDER_SNOW);
    }

    public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, PathComputationType type)
    {
        return true;
    }
}
