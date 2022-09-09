package com.VoidCallerZ.uc.items;

import com.VoidCallerZ.uc.registration.ItemRegistration;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

public class UcDyeableArmorItem extends DyeableArmorItem implements DyeableLeatherItem
{
    public UcDyeableArmorItem(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Properties properties)
    {
        super(armorMaterial, equipmentSlot, properties);
    }

    public String getDescriptionId(ItemStack stack)
    {
        return (stack.getItem() + ".color." + getColor(stack));
    }
}