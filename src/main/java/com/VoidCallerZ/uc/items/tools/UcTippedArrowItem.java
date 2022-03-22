package com.VoidCallerZ.uc.items.tools;

import com.VoidCallerZ.uc.setup.registration.ItemRegistration;
import com.VoidCallerZ.uc.world.entity.projectile.CompressedArrow;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.*;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class UcTippedArrowItem extends ArrowItem
{
    public final float damage;

    public UcTippedArrowItem(Item.Properties properties, float damage)
    {
        super(properties);
        this.damage = damage;
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack stack, LivingEntity shooter)
    {
        CompressedArrow arrow = new CompressedArrow(shooter, level, stack.getItem());
        arrow.setBaseDamage(this.damage);
        return arrow;
    }

    public ItemStack getDefaultInstance()
    {
        return PotionUtils.setPotion(super.getDefaultInstance(), Potions.POISON);
    }

    public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items)
    {
        if (this.allowdedIn(group))
        {
            for (Potion potion : Registry.POTION)
            {
                if (!potion.getEffects().isEmpty())
                {
                    items.add(PotionUtils.setPotion(new ItemStack(this), potion));
                }
            }
        }
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> pTooltip, TooltipFlag flag)
    {
        PotionUtils.addPotionTooltip(stack, pTooltip, 0.125F);
    }

    public String getDescriptionId(ItemStack stack)
    {
        return PotionUtils.getPotion(stack).getName(this.getDescriptionId() + ".effect.");
    }
}
