package com.VoidCallerZ.uc.items;

import com.VoidCallerZ.uc.setup.registration.ItemRegistration;
import com.VoidCallerZ.uc.world.entity.projectile.CompressedArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class UcArrowItem extends ArrowItem
{
    private final float damage;

    public UcArrowItem(Properties properties, float damage)
    {
        super(properties);
        this.damage = damage;
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack stack, LivingEntity shooter)
    {
        CompressedArrow arrow = new CompressedArrow(shooter, level, ItemRegistration.COMPRESSED_ARROW.get());
        arrow.setBaseDamage(this.damage);
        return arrow;
    }

    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, Player player)
    {
        int enchant = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, bow);
        return enchant <= 0 ? false : this.getClass() == UcArrowItem.class;
    }
}
