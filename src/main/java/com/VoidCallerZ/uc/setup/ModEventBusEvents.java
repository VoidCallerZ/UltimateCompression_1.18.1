package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.recipe.CompressorItemRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UltimateCompression.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents
{
    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event)
    {
        Registry.register(Registry.RECIPE_TYPE, CompressorItemRecipe.Type.ID, CompressorItemRecipe.Type.INSTANCE);
    }
}
