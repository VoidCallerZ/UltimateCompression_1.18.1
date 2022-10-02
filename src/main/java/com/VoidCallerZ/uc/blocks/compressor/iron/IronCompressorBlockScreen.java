package com.VoidCallerZ.uc.blocks.compressor.iron;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.blocks.compressor.CompressorBlockMenu;
import com.VoidCallerZ.uc.blocks.compressor.CompressorScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class IronCompressorBlockScreen extends CompressorScreen<CompressorBlockMenu>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(UltimateCompression.MODID, "textures/gui/iron_compressor_gui.png");

    public IronCompressorBlockScreen(CompressorBlockMenu menu, Inventory inventory, Component title)
    {
        super(menu, inventory, title, TEXTURE);
    }
}
