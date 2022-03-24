package com.VoidCallerZ.uc.client;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.client.renderer.entity.CompressedArrowRenderer;
import com.VoidCallerZ.uc.client.renderer.entity.CompressedSpectralArrowRenderer;
import com.VoidCallerZ.uc.client.renderer.entity.CompressedTippableArrowRenderer;
import com.VoidCallerZ.uc.setup.registration.ItemRegistration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UltimateCompression.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber
{
    @SubscribeEvent
    public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(ItemRegistration.COMPRESSED_ARROW_ENTITY.get(), CompressedArrowRenderer::new);
        event.registerEntityRenderer(ItemRegistration.COMPRESSED_SPECTRAL_ARROW_ENTITY.get(), CompressedSpectralArrowRenderer::new);
        event.registerEntityRenderer(ItemRegistration.COMPRESSED_TIPPED_ARROW_ENTITY.get(), CompressedTippableArrowRenderer::new);
    }
}
