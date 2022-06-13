package com.VoidCallerZ.uc.worldgen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.registration.Registration;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures
{
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, UltimateCompression.MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        PLACED_FEATURES.register(bus);
    }

    public static final RegistryObject<PlacedFeature> IRON_OREGEN = PLACED_FEATURES.register("iron_oregen",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>) ModConfiguredFeatures.OVERWORLD_COMRPESSED_IRON_ORES,
                    List.of(CountPlacement.of(5), InSquarePlacement.spread(), BiomeFilter.biome(),
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(-48), VerticalAnchor.absolute(48)))));
}