package com.VoidCallerZ.uc.items;

import com.VoidCallerZ.uc.registration.ItemRegistration;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Snowball;;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class UcSnowball extends Snowball
{
    public UcSnowball(EntityType<? extends UcSnowball> entityType, Level level)
    {
        super(entityType, level);
    }

    public UcSnowball(Level pLevel, LivingEntity pShooter)
    {
        super(pLevel, pShooter);
    }

    public UcSnowball(Level pLevel, double pX, double pY, double pZ)
    {
        super(pLevel, pX, pY, pZ);
    }

    protected Item getDefaultItem()
    {
        return ItemRegistration.COMPRESSED_SNOWBALL.get();
    }

    protected void onHit(HitResult result)
    {
        super.onHit(result);
        if (result.getType() == HitResult.Type.ENTITY)
        {
            this.onHitEntity((EntityHitResult) result);
            this.level.gameEvent(GameEvent.PROJECTILE_LAND, result.getLocation(), GameEvent.Context.of(this, (BlockState) null));
        }
    }

    protected void onHitEntity(EntityHitResult result)
    {
        super.onHitEntity(result);
        Entity entity = result.getEntity();
        entity.hurt(DamageSource.thrown(this, this.getOwner()), 2);
        Vec3 vec3 = this.getDeltaMovement().multiply(1, 0, 1).normalize().scale(2);
        if (vec3.lengthSqr() > 0.0D)
        {
            entity.push(vec3.x, 0.1D, vec3.z);
        }
    }
}
