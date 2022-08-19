package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.blocks.screen.CompressorBlockScreen;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup
{
    public static void init(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
        {
            MenuScreens.register(BlockRegistration.COMPRESSOR_BLOCK_MENU.get(), CompressorBlockScreen::new);
        });
    }
}