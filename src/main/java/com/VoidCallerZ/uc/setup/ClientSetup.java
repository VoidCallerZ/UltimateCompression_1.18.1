package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.client.CompressorScreen;
import com.VoidCallerZ.uc.client.PowergenScreen;
import com.VoidCallerZ.uc.setup.registration.Registration;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup
{
    public static void init(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
        {
            MenuScreens.register(Registration.ULTIMATE_POWERGEN_CONTAINER.get(), PowergenScreen::new);
            ItemBlockRenderTypes.setRenderLayer(Registration.ULTIMATE_POWERGEN.get(), RenderType.translucent());
            MenuScreens.register(Registration.COMPRESSOR_CONTAINER.get(), CompressorScreen::new);
        });
    }
}