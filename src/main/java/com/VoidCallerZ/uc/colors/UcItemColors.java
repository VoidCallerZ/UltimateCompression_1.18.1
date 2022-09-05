package com.VoidCallerZ.uc.colors;

import com.VoidCallerZ.uc.registration.ItemRegistration;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;

public class UcItemColors
{
    public static void setItemColors(RegisterColorHandlersEvent.Item event)
    {
        ItemColors colors = event.getItemColors();
        colors.register((state, tint) -> tint == 0 ? 5877296 : -1, ItemRegistration.COMPRESSED_ACACIA_LEAVES.get(), ItemRegistration.COMPRESSED_DARK_OAK_LEAVES.get(), ItemRegistration.COMPRESSED_JUNGLE_LEAVES.get(),
                ItemRegistration.COMPRESSED_MANGROVE_LEAVES.get(), ItemRegistration.COMPRESSED_OAK_LEAVES.get());

        colors.register((state, tint) ->
                tint == 0 ? FoliageColor.getEvergreenColor() : -1, ItemRegistration.COMPRESSED_SPRUCE_LEAVES.get());

        colors.register((state, tint) ->
                tint == 0 ? FoliageColor.getBirchColor() : -1, ItemRegistration.COMPRESSED_BIRCH_LEAVES.get());
    }
}
