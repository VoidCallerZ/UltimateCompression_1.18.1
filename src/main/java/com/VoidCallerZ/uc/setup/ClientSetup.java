package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.blocks.compressor.diamond.DiamondCompressorBlockScreen;
import com.VoidCallerZ.uc.blocks.compressor.gold.GoldenCompressorBlockScreen;
import com.VoidCallerZ.uc.blocks.compressor.iron.IronCompressorBlockScreen;
import com.VoidCallerZ.uc.blocks.compressor.netherite.NetheriteCompressorBlockScreen;
import com.VoidCallerZ.uc.registration.BlockRegistration;
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
            MenuScreens.register(BlockRegistration.IRON_COMPRESSOR_BLOCK_MENU.get(), IronCompressorBlockScreen::new);
            MenuScreens.register(BlockRegistration.GOLDEN_COMPRESSOR_BLOCK_MENU.get(), GoldenCompressorBlockScreen::new);
            MenuScreens.register(BlockRegistration.DIAMOND_COMPRESSOR_BLOCK_MENU.get(), DiamondCompressorBlockScreen::new);
            MenuScreens.register(BlockRegistration.NETHERITE_COMPRESSOR_BLOCK_MENU.get(), NetheriteCompressorBlockScreen::new);

            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_ACACIA_LEAVES.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_BIRCH_LEAVES.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_DARK_OAK_LEAVES.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_JUNGLE_LEAVES.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_OAK_LEAVES.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_SPRUCE_LEAVES.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_RED_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_RED_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS_PANE.get(), RenderType.translucent());
        });
    }
}