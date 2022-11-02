package com.VoidCallerZ.uc.world.ores;

import com.VoidCallerZ.uc.registration.BlockRegistration;
import com.VoidCallerZ.uc.setup.Config;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class Ores
{
    public static Holder<PlacedFeature> DEEPSLATE_OREGEN;

    public static void registerConfiguredFeatures()
    {
        OreConfiguration deepslateConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get());
        DEEPSLATE_OREGEN = registerPlacedFeature("deepslate_iron_ore", new ConfiguredFeature<>(Feature.ORE, deepslateConfig),
                CountPlacement.of(OresConfig.DEEPSLATE_AMOUNT.get()),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));
    }


    public static Holder<PlacedFeature> createOverworldOregen(boolean isDeepslate, boolean isUniform, RegistryObject<Block> oreBlock, int veinSize, int amount, int height)
    {
        VerticalAnchor zero = VerticalAnchor.absolute(0);
        VerticalAnchor absMinY = VerticalAnchor.absolute(height);
        VerticalAnchor absMaxY = VerticalAnchor.absolute(height);

        @NotNull
        OreConfiguration overworldConfig = new OreConfiguration(isDeepslate ? OreFeatures.DEEPSLATE_ORE_REPLACEABLES : OreFeatures.STONE_ORE_REPLACEABLES, oreBlock.get().defaultBlockState(), veinSize);
            return registerPlacedFeature(oreBlock.getId().getNamespace(), new ConfiguredFeature<>(Feature.ORE, overworldConfig),
                    CountPlacement.of(amount),
                    InSquarePlacement.spread(),
                    BiomeFilter.biome(),
                    isDeepslate ?
                            (isUniform ? HeightRangePlacement.uniform(absMinY, zero) : HeightRangePlacement.triangle(absMinY, zero)):
                            (isUniform ? HeightRangePlacement.uniform(zero, absMaxY) : HeightRangePlacement.triangle(zero, absMaxY))
            );
    }

    @NotNull
    public static Holder<PlacedFeature> createNetherOregen(RegistryObject<Block> oreBlock, int veinSize, int amount, int minY, int maxY)
    {
        VerticalAnchor absMinY = VerticalAnchor.absolute(minY);
        VerticalAnchor absMaxY = VerticalAnchor.absolute(maxY);

        OreConfiguration netherConfig = new OreConfiguration(OreFeatures.NETHER_ORE_REPLACEABLES, oreBlock.get().defaultBlockState(), veinSize);
        return registerPlacedFeature(oreBlock.getId().getNamespace(), new ConfiguredFeature<>(Feature.ORE, netherConfig),
                CountPlacement.of(amount),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(absMinY, absMaxY)
        );
    }

    @NotNull
    public static Holder<PlacedFeature> createAncientDebrisOregen(RegistryObject<RotatedPillarBlock> oreBlock, int veinSize, int amount, int minY, int maxY)
    {
        VerticalAnchor absMinY = VerticalAnchor.absolute(minY);
        VerticalAnchor absMaxY = VerticalAnchor.absolute(maxY);

        OreConfiguration ancientDebrisConfig = new OreConfiguration(OreFeatures.NETHER_ORE_REPLACEABLES, oreBlock.get().defaultBlockState(), veinSize);
        return registerPlacedFeature(oreBlock.getId().getNamespace(), new ConfiguredFeature<>(Feature.ORE, ancientDebrisConfig),
                CountPlacement.of(amount),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.triangle(absMinY, absMaxY));
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeature(String registryName, ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers)
    {
        return PlacementUtils.register(registryName, Holder.direct(feature), placementModifiers);
    }
}