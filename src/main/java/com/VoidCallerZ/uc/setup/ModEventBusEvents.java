package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.colors.UcBlockColors;
import com.VoidCallerZ.uc.colors.UcItemColors;
import com.VoidCallerZ.uc.entities.renderer.CompressedArrowRenderer;
import com.VoidCallerZ.uc.entities.renderer.CompressedSpectralArrowRenderer;
import com.VoidCallerZ.uc.entities.renderer.CompressedTippableArrowRenderer;
import com.VoidCallerZ.uc.registration.ItemRegistration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegisterEvent;

@Mod.EventBusSubscriber(modid = UltimateCompression.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusEvents
{
    @SubscribeEvent
    public static void registerRecipeTypes(RegisterEvent event)
    {
        //Registry.register(Registry.RECIPE_TYPE, CompressorItemRecipe.Type.ID, CompressorItemRecipe.Type.INSTANCE);
    }

    @SubscribeEvent
    public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(ItemRegistration.COMPRESSED_ARROW_ENTITY.get(), CompressedTippableArrowRenderer::new);
        event.registerEntityRenderer(ItemRegistration.COMPRESSED_SPECTRAL_ARROW_ENTITY.get(), CompressedSpectralArrowRenderer::new);
        //event.registerEntityRenderer(ItemRegistration.COMPRESSED_TIPPED_ARROW_ENTITY.get(), CompressedTippableArrowRenderer::new);
    }

    @SubscribeEvent
    public static void setupBlockColors(RegisterColorHandlersEvent.Block event)
    {
        UcBlockColors.setBlockColors(event);
    }

    @SubscribeEvent
    public static void setupItemColors(RegisterColorHandlersEvent.Item event)
    {
        UcItemColors.setItemColors(event);
    }
}
