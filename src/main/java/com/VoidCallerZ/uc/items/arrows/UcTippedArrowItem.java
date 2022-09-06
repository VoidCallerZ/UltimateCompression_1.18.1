package com.VoidCallerZ.uc.items.arrows;

import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class UcTippedArrowItem extends UcArrowItem
{
    private final float damage;

    public UcTippedArrowItem(Properties properties, float damage)
    {
        super(properties, damage);
        this.damage = damage;
    }

    public ItemStack getDefaultInstance()
    {
        return PotionUtils.setPotion(super.getDefaultInstance(), Potions.POISON);
    }

    public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items)
    {
        for (Potion potion : Registry.POTION)
        {
            if (potion.allowedInCreativeTab(this, group, this.allowedIn(group)))
            {
                if (!potion.getEffects().isEmpty())
                {
                    items.add(PotionUtils.setPotion(new ItemStack(this), potion));
                }
            }
        }
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag)
    {
        PotionUtils.addPotionTooltip(stack, tooltip, 0.125F);
    }

    public String getDescriptionId(ItemStack stack)
    {
        return PotionUtils.getPotion(stack).getName(this.getDescriptionId() + ".effect.");
    }
}
