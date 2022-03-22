package com.VoidCallerZ.uc.world.entity.projectile;

import com.VoidCallerZ.uc.setup.registration.ItemRegistration;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CompressedArrow extends AbstractArrow
{
    private final Item referenceItem;

    public CompressedArrow(EntityType<? extends AbstractArrow> entityType, Level level)
    {
        super(entityType, level);
        this.referenceItem = ItemRegistration.COMPRESSED_ARROW.get();
    }

    public CompressedArrow(LivingEntity shooter, Level level, Item referenceItem)
    {
        super(ItemRegistration.COMPRESSED_ARROW_ENTITY.get(), shooter, level);
        this.referenceItem = referenceItem;
    }

    @Override
    public ItemStack getPickupItem()
    {
        return new ItemStack(this.referenceItem);
    }

    @Override
    protected void doPostHurtEffects(LivingEntity pLiving)
    {
        pLiving.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1));
    }
}
