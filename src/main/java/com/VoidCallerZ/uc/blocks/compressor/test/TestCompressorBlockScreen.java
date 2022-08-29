package com.VoidCallerZ.uc.blocks.compressor.test;

import com.VoidCallerZ.uc.blocks.compressor.CompressorBlockMenu;
import com.VoidCallerZ.uc.blocks.compressor.CompressorScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class TestCompressorBlockScreen extends CompressorScreen<CompressorBlockMenu>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(MODID,"textures/gui/iron_compressor_gui.png");

    public TestCompressorBlockScreen(CompressorBlockMenu menu, Inventory inventory, Component title)
    {
        super(menu, inventory, title, TEXTURE);
    }
}
