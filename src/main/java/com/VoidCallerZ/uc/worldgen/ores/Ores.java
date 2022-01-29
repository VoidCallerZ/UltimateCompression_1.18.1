package com.VoidCallerZ.uc.worldgen.ores;

import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class Ores
{
    public static int OVERWORLD_VEINSIZE = 5;
    public static int OVERWORLD_AMOUNT = 3;
    public static int DEEPSLATE_VEINSIZE = 5;
    public static int DEEPSLATE_AMOUNT = 3;
    public static int OVERWORLD_DIAMOND_VEINSIZE = 1;
    public static int OVERWORLD_DIAMOND_AMOUNT = 3;
    public static int DEEPSLATE_DIAMOND_VEINSIZE = 3;
    public static int DEEPSLATE_DIAMOND_AMOUNT = 4;

    public static PlacedFeature OVERWORLD_OREGEN;
    public static PlacedFeature DEEPSLATE_OREGEN;

    public static void registerConfiguredFeatures()
    {
        OreConfiguration compressedIronOreConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, Registration.COMPRESSED_IRON_ORE.get().defaultBlockState(), OVERWORLD_VEINSIZE);
        OVERWORLD_OREGEN = registerPlacedFeature("compressed_iron_ore", Feature.ORE.configured(compressedIronOreConfig),
                CountPlacement.of(OVERWORLD_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90)));

        OreConfiguration compressedDeepslateIronOreConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get().defaultBlockState(), DEEPSLATE_VEINSIZE);
        OVERWORLD_OREGEN = registerPlacedFeature("compressed_deepslate_iron_ore", Feature.ORE.configured(compressedDeepslateIronOreConfig),
                CountPlacement.of(DEEPSLATE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));

        OreConfiguration compressedGoldOreConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, Registration.COMPRESSED_GOLD_ORE.get().defaultBlockState(), OVERWORLD_VEINSIZE);
        OVERWORLD_OREGEN = registerPlacedFeature("compressed_gold_ore", Feature.ORE.configured(compressedGoldOreConfig),
                CountPlacement.of(OVERWORLD_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(32)));

        OreConfiguration compressedDeepslateGoldOreConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Registration.COMPRESSED_DEEPSLATE_GOLD_ORE.get().defaultBlockState(), DEEPSLATE_VEINSIZE);
        OVERWORLD_OREGEN = registerPlacedFeature("compressed_deepslate_gold_ore", Feature.ORE.configured(compressedDeepslateGoldOreConfig),
                CountPlacement.of(DEEPSLATE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));

        OreConfiguration compressedCopperOreConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, Registration.COMPRESSED_COPPER_ORE.get().defaultBlockState(), OVERWORLD_VEINSIZE);
        OVERWORLD_OREGEN = registerPlacedFeature("compressed_copper_ore", Feature.ORE.configured(compressedCopperOreConfig),
                CountPlacement.of(OVERWORLD_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(112)));

        OreConfiguration compressedDeepslateCopperOreConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Registration.COMPRESSED_DEEPSLATE_COPPER_ORE.get().defaultBlockState(), DEEPSLATE_VEINSIZE);
        OVERWORLD_OREGEN = registerPlacedFeature("compressed_deepslate_copper_ore", Feature.ORE.configured(compressedDeepslateCopperOreConfig),
                CountPlacement.of(DEEPSLATE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));

        OreConfiguration compressedDiamondOreConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, Registration.COMPRESSED_DIAMOND_ORE.get().defaultBlockState(), OVERWORLD_DIAMOND_VEINSIZE);
        OVERWORLD_OREGEN = registerPlacedFeature("compressed_diamond_ore", Feature.ORE.configured(compressedDiamondOreConfig),
                CountPlacement.of(OVERWORLD_DIAMOND_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(16)));

        OreConfiguration compressedDeepslateDiamondOreConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get().defaultBlockState(), DEEPSLATE_DIAMOND_VEINSIZE);
        OVERWORLD_OREGEN = registerPlacedFeature("compressed_deepslate_diamond_ore", Feature.ORE.configured(compressedDeepslateDiamondOreConfig),
                CountPlacement.of(DEEPSLATE_DIAMOND_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> PlacedFeature registerPlacedFeature(String registryName, ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers)
    {
        PlacedFeature placed = BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(registryName), feature).placed(placementModifiers);
        return PlacementUtils.register(registryName, placed);
    }

    public static void onBiomeLoadingEvent(BiomeLoadingEvent event)
    {
        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVERWORLD_OREGEN);
    }
}
