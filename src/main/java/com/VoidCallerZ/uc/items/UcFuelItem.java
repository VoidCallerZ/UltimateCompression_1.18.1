package com.VoidCallerZ.uc.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class UcFuelItem extends Item
{
    private static int burnTime = 1600;

    public UcFuelItem(Properties properties, int burnTime)
    {
        super(properties);
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType)
    {
        return this.burnTime;
    }
}
