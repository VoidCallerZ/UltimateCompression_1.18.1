package com.VoidCallerZ.uc.setup.registration;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.recipe.CompressorItemRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RecipeRegistration
{
    private static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, UltimateCompression.MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        SERIALIZERS.register(bus);
    }

    public static final RegistryObject<RecipeSerializer<CompressorItemRecipe>> COMPRESSOR_ITEM_SERIALIZER = SERIALIZERS.register("compressor_item_serializer", () -> CompressorItemRecipe.Serializer.INSTANCE);
}
