package com.VoidCallerZ.uc.colors;

import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;

public class UcBlockColors
{
    public static void setBlockColors(RegisterColorHandlersEvent.Block event)
    {
        BlockColors colors = event.getBlockColors();
        colors.register((state, level, pos, tint) ->
                tint == 0 ? (level != null && pos != null ? BiomeColors.getAverageFoliageColor(level, pos) : -1) : -1,
                BlockRegistration.COMPRESSED_ACACIA_LEAVES.get(), BlockRegistration.COMPRESSED_DARK_OAK_LEAVES.get(), BlockRegistration.COMPRESSED_JUNGLE_LEAVES.get(),
                BlockRegistration.COMPRESSED_MANGROVE_LEAVES.get(), BlockRegistration.COMPRESSED_OAK_LEAVES.get());

        colors.register((state, level, pos, tint) ->
                tint == 0 ? FoliageColor.getEvergreenColor() : -1, BlockRegistration.COMPRESSED_SPRUCE_LEAVES.get());

        colors.register((state, level, pos, tint) ->
                tint == 0 ? FoliageColor.getBirchColor() : -1, BlockRegistration.COMPRESSED_BIRCH_LEAVES.get());
    }
}
