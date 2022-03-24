package com.VoidCallerZ.uc.items.arrows;

import com.VoidCallerZ.uc.world.entity.projectile.CompressedArrow;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.*;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;

public class UcTippedArrowItem extends ArrowItem
{
    private final float damage;

    public UcTippedArrowItem(Properties properties, float damage)
    {
        super(properties);
        this.damage = damage;
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack stack, LivingEntity shooter)
    {
        CompressedArrow arrow = new CompressedArrow(level, shooter);
        arrow.setBaseDamage(this.damage);
        return arrow;
    }

    public ItemStack getDefaultInstance() {return PotionUtils.setPotion(super.getDefaultInstance(), Potions.POISON);}

    public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items)
    {
        if (this.allowdedIn(group))
        {
            for (Potion potion : ForgeRegistries.POTIONS)
            {
                if (!potion.getEffects().isEmpty())
                {
                    items.add(PotionUtils.setPotion(new ItemStack(this), potion));
                }
            }
        }
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> toolTip, TooltipFlag flag)
    {
        PotionUtils.addPotionTooltip(stack, toolTip, 0.125F);
    }

    public String getDescriptionId(ItemStack stack)
    {
        return PotionUtils.getPotion(stack).getName(this.getDescriptionId() + ".effect.");
    }
}
