package com.VoidCallerZ.uc.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;

public class UcFuelBlockItem extends BlockItem
{
    private static int burnTime = 1600;

    public UcFuelBlockItem(Block pBlock, Properties pProperties, int burnTime)
    {
        super(pBlock, pProperties);
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType)
    {
        return this.burnTime;
    }
}
