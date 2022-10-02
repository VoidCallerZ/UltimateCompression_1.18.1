package com.VoidCallerZ.uc.colors;

import com.VoidCallerZ.uc.registration.ArmorRegistration;
import com.VoidCallerZ.uc.registration.ItemRegistration;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.client.event.ColorHandlerEvent;

public class UcItemColors
{
    public static void setItemColors(ColorHandlerEvent.Item event)
    {
        ItemColors colors = event.getItemColors();
        colors.register((state, tint) -> tint > 0 ? -1 : ((DyeableLeatherItem)state.getItem()).getColor(state));
        colors.register((state, tint) -> tint == 0 ? ((DyeableLeatherItem)state.getItem()).getColor(state) : -1, ArmorRegistration.COMPRESSED_LEATHER_HELMET.get(),
                ArmorRegistration.COMPRESSED_LEATHER_CHESTPLATE.get(), ArmorRegistration.COMPRESSED_LEATHER_LEGGINGS.get(), ArmorRegistration.COMPRESSED_LEATHER_BOOTS.get());

        colors.register((state, tint) -> tint == 0 ? PotionUtils.getColor(state) : -1, ItemRegistration.COMPRESSED_TIPPED_ARROW.get());

        colors.register((state, tint) -> tint == 0 ? 5877296 : -1, ItemRegistration.COMPRESSED_ACACIA_LEAVES.get(), ItemRegistration.COMPRESSED_DARK_OAK_LEAVES.get(), ItemRegistration.COMPRESSED_JUNGLE_LEAVES.get(), ItemRegistration.COMPRESSED_OAK_LEAVES.get());
        colors.register((state, tint) ->
                tint == 0 ? FoliageColor.getEvergreenColor() : -1, ItemRegistration.COMPRESSED_SPRUCE_LEAVES.get());
        colors.register((state, tint) ->
                tint == 0 ? FoliageColor.getBirchColor() : -1, ItemRegistration.COMPRESSED_BIRCH_LEAVES.get());
    }
}