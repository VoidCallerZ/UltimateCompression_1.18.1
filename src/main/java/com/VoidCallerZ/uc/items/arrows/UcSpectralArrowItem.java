package com.VoidCallerZ.uc.items.arrows;

import com.VoidCallerZ.uc.entities.projectiles.CompressedSpectralArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class UcSpectralArrowItem extends UcArrowItem
{
    private static float damage;

    public UcSpectralArrowItem(Properties properties, float damage)
    {
        super(properties, damage);
        this.damage = damage;
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack stack, LivingEntity shooter)
    {
        CompressedSpectralArrow arrow = new CompressedSpectralArrow(shooter, level);
        arrow.setBaseDamage(damage);
        return arrow;
    }
}
