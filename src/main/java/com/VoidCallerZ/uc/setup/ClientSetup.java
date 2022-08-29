package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.blocks.compressor.diamond.DiamondCompressorBlockScreen;
import com.VoidCallerZ.uc.blocks.compressor.gold.GoldenCompressorBlockScreen;
import com.VoidCallerZ.uc.blocks.compressor.iron.IronCompressorBlockScreen;
import com.VoidCallerZ.uc.blocks.compressor.netherite.NetheriteCompressorBlockScreen;
import com.VoidCallerZ.uc.blocks.compressor.test.TestCompressorBlockScreen;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup
{
    public static void init(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
        {
            MenuScreens.register(BlockRegistration.IRON_COMPRESSOR_BLOCK_MENU.get(), IronCompressorBlockScreen::new);
            MenuScreens.register(BlockRegistration.GOLDEN_COMPRESSOR_BLOCK_MENU.get(), GoldenCompressorBlockScreen::new);
            MenuScreens.register(BlockRegistration.DIAMOND_COMPRESSOR_BLOCK_MENU.get(), DiamondCompressorBlockScreen::new);
            MenuScreens.register(BlockRegistration.NETHERITE_COMPRESSOR_BLOCK_MENU.get(), NetheriteCompressorBlockScreen::new);
            MenuScreens.register(BlockRegistration.TEST_COMPRESSOR_BLOCK_MENU.get(), TestCompressorBlockScreen::new);
        });
    }
}