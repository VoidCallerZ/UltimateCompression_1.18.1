package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.client.PowergenScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup
{
    public static void init(FMLClientSetupEvent event)
    {
        event.enqueueWork(() -> MenuScreens.register(Registration.ULTIMATE_POWERGEN_CONTAINER.get(), PowergenScreen::new));
    }
}
