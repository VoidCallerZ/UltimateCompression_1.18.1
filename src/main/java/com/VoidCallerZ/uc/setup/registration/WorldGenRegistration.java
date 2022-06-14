package com.VoidCallerZ.uc.setup.registration;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.worldgen.ores.OreBiomeModifier;
import com.VoidCallerZ.uc.worldgen.ores.Ores;
import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.VoidCallerZ.uc.worldgen.ores.OreBiomeModifier.ORE_BIOME_MODIFIER_NAME;

public class WorldGenRegistration
{
    private static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, UltimateCompression.MODID);
    private static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, UltimateCompression.MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BIOME_MODIFIERS.register(bus);
        PLACED_FEATURES.register(bus);
    }

    public static final RegistryObject<Codec<? extends BiomeModifier>> ORE_BIOME_MODIFIER = BIOME_MODIFIERS.register(ORE_BIOME_MODIFIER_NAME, OreBiomeModifier::makeCodec);
    public static final RegistryObject<PlacedFeature> COMPRESSED_IRON_ORE_GEN = PLACED_FEATURES.register("compressed_iron_ore", () -> Ores.createOverworldOregen().get());
}
