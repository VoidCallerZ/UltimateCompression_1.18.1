package com.VoidCallerZ.uc.world.entity.projectile;

import com.VoidCallerZ.uc.setup.registration.ItemRegistration;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CompressedSpectralArrow extends AbstractArrow
{
    private int duration = 400;

    public CompressedSpectralArrow(EntityType<? extends CompressedSpectralArrow> entity, Level level)
    {
        super(entity, level);
    }

    public CompressedSpectralArrow(LivingEntity entity, Level level)
    {
        super(ItemRegistration.COMPRESSED_SPECTRAL_ARROW_ENTITY.get(), entity, level);
    }

    public void tick()
    {
        super.tick();
        if (this.level.isClientSide && !this.inGround)
        {
            this.level.addParticle(ParticleTypes.INSTANT_EFFECT, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
        }
    }

    protected ItemStack getPickupItem()
    {
        return new ItemStack(ItemRegistration.COMPRESSED_SPECTRAL_ARROW.get());
    }

    protected void doPostHurtEffects(LivingEntity livingEntity)
    {
        super.doPostHurtEffects(livingEntity);
        MobEffectInstance mobEffectInstance = new MobEffectInstance(MobEffects.GLOWING, this.duration, 0);
        livingEntity.addEffect(mobEffectInstance, this.getEffectSource());
    }

    public void readAdditionalSaveData(CompoundTag compoundTag)
    {
        super.readAdditionalSaveData(compoundTag);
        if (compoundTag.contains("Duration"))
        {
            this.duration = compoundTag.getInt("Duration");
        }
    }

    public void addAdditionalSaveData(CompoundTag compoundTag)
    {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putInt("Duration", this.duration);
    }
}
