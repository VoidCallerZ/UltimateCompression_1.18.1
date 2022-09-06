package com.VoidCallerZ.uc.items;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.DyeableArmorItem;
import net.minecraft.world.item.DyeableLeatherItem;

public class UcDyeableArmorItem extends DyeableArmorItem implements DyeableLeatherItem
{
    public UcDyeableArmorItem(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Properties properties)
    {
        super(armorMaterial, equipmentSlot, properties);
    }
}