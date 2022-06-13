package com.VoidCallerZ.uc.worldgen.ores;

import com.VoidCallerZ.uc.setup.registration.Registration;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import org.jetbrains.annotations.NotNull;

public class Ores
{
    public static Holder<PlacedFeature> IRON_OREGEN;
    public static Holder<PlacedFeature> GOLD_OREGEN;
    public static Holder<PlacedFeature> COPPER_OREGEN;
    public static Holder<PlacedFeature> DIAMOND_OREGEN;
    public static Holder<PlacedFeature> COAL_OREGEN;
    public static Holder<PlacedFeature> EMERALD_OREGEN;
    public static Holder<PlacedFeature> LAPIS_OREGEN;
    public static Holder<PlacedFeature> REDSTONE_OREGEN;
    public static Holder<PlacedFeature> NETHER_GOLD_OREGEN;
    public static Holder<PlacedFeature> NETHER_QUARTZ_OREGEN;

    public static void registerConfiguredFeatures()
    {
        //Overworld Ores
        IRON_OREGEN = registerPlacedFeatureUniform("compressed_iron_ore", false, Registration.COMPRESSED_IRON_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 48);
        GOLD_OREGEN = registerPlacedFeatureUniform("compressed_gold_ore", false, Registration.COMPRESSED_GOLD_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 48);
        COPPER_OREGEN = registerPlacedFeatureUniform("compressed_copper_ore", false, Registration.COMPRESSED_COPPER_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 96);
        DIAMOND_OREGEN = registerPlacedFeatureUniform("compressed_diamond_ore", false, Registration.COMPRESSED_DIAMOND_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 16);
        COAL_OREGEN = registerPlacedFeatureTriangle("compressed_coal_ore", false, Registration.COMPRESSED_COAL_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_COAL_VEINSIZE.get(), OresConfig.OVERWORLD_COAL_AMOUNT.get(), 0, 255);
        EMERALD_OREGEN = registerPlacedFeatureTriangle("compressed_emerald_ore", false, Registration.COMPRESSED_EMERALD_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 255);
        LAPIS_OREGEN = registerPlacedFeatureUniform("compressed_lapis_ore", false, Registration.COMPRESSED_LAPIS_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 30);
        REDSTONE_OREGEN = registerPlacedFeatureUniform("compressed_redstone_ore", false, Registration.COMPRESSED_REDSTONE_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 15);

        //Deepslate Ores
        IRON_OREGEN = registerPlacedFeatureUniform("compressed_iron_ore", true, Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
        GOLD_OREGEN = registerPlacedFeatureUniform("compressed_gold_ore", true, Registration.COMPRESSED_DEEPSLATE_GOLD_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
        COPPER_OREGEN = registerPlacedFeatureUniform("compressed_copper_ore", true, Registration.COMPRESSED_DEEPSLATE_COPPER_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -16, 0);
        DIAMOND_OREGEN = registerPlacedFeatureUniform("compressed_diamond_ore", true, Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_DIAMOND_VEINSIZE.get(), OresConfig.DEEPSLATE_DIAMOND_AMOUNT.get(), -64, 0);
        COAL_OREGEN = registerPlacedFeatureUniform("compressed_coal_ore", true, Registration.COMPRESSED_DEEPSLATE_COAL_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_COAL_VEINSIZE.get(), OresConfig.OVERWORLD_COAL_AMOUNT.get(), -16, 0);
        EMERALD_OREGEN = registerPlacedFeatureTriangle("compressed_emerald_ore", true, Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_DIAMOND_VEINSIZE.get(), OresConfig.DEEPSLATE_DIAMOND_AMOUNT.get(), -64, 0);
        LAPIS_OREGEN = registerPlacedFeatureUniform("compressed_lapis_ore", true, Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
        REDSTONE_OREGEN = registerPlacedFeatureUniform("compressed_redstone_ore", true, Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);

        //Nether Ores
        NETHER_GOLD_OREGEN = registerPlacedFeatureNether("compressed_nether_gold_ore", Registration.COMPRESSED_NETHER_GOLD_ORE.get().defaultBlockState(), OresConfig.NETHER_GOLD_ORE_VEINSIZE.get(), OresConfig.NETHER_GOLD_ORE_AMOUNT.get(), 10, 117);
        NETHER_QUARTZ_OREGEN = registerPlacedFeatureNether("compressed_nether_quartz_ore", Registration.COMPRESSED_NETHER_QUARTZ_ORE.get().defaultBlockState(), OresConfig.NETHER_QUARTZ_ORE_VEINSIZE.get(), OresConfig.NETHER_QUARTZ_ORE_AMOUNT.get(), 10, 117);

        //Nether
        //NetherOreGen("compressed_nether_gold_ore", Registration.COMPRESSED_NETHER_GOLD_ORE.get().defaultBlockState(), OresConfig.NETHER_GOLD_ORE_VEINSIZE.get(), OresConfig.NETHER_GOLD_ORE_AMOUNT.get(), 10, 117);
        //NetherOreGen("compressed_nether_gold_ore", Registration.COMPRESSED_NETHER_GOLD_ORE.get().defaultBlockState(), 100, 500, 0, 117);
        //NetherOreGen("compressed_nether_quartz_ore", Registration.COMPRESSED_NETHER_QUARTZ_ORE.get().defaultBlockState(), OresConfig.NETHER_QUARTZ_ORE_VEINSIZE.get(), OresConfig.NETHER_QUARTZ_ORE_AMOUNT.get(), 10, 117);
    }

    @NotNull
    public static Holder<PlacedFeature> createOverworldOregen()
    {
        OreConfiguration overworldConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, Registration.COMPRESSED_IRON_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get());
        return registerPlacedFeature("compressed_iron_ore", new ConfiguredFeature<>(Feature.ORE, overworldConfig),
                CountPlacement.of(OresConfig.OVERWORLD_AMOUNT.get()),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90)));
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeature(String registryName, ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers)
    {
        return PlacementUtils.register(registryName, Holder.direct(feature), placementModifiers);
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeatureUniform(String registryName, boolean isDeepslateOre, BlockState oreBlock, int veinSize, int chunkAmount, int minY, int maxY)
    {
        return PlacementUtils.register(registryName, Holder.direct(new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(isDeepslateOre ? OreFeatures.DEEPSLATE_ORE_REPLACEABLES : OreFeatures.STONE_ORE_REPLACEABLES, oreBlock, veinSize))),
                CountPlacement.of(chunkAmount),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)));
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeatureTriangle(String registryName, boolean isDeepslateOre, BlockState oreBlock, int veinSize, int chunkAmount, int minY, int maxY)
    {
        return PlacementUtils.register(registryName, Holder.direct(new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(isDeepslateOre ? OreFeatures.DEEPSLATE_ORE_REPLACEABLES : OreFeatures.STONE_ORE_REPLACEABLES, oreBlock, veinSize))),
                CountPlacement.of(chunkAmount),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.triangle(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)));
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeatureNether(String registryName, BlockState oreBlock, int veinSize, int chunkAmount, int minY, int maxY)
    {
        return PlacementUtils.register(registryName, Holder.direct(new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.NETHER_ORE_REPLACEABLES, oreBlock, veinSize))),
                CountPlacement.of(chunkAmount),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)));
    }

//    public static void onBiomeLoadingEvent(BiomeLoadingEvent event)
//    {
//        if (event.getCategory() == Biome.BiomeCategory.NETHER)
//        {
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_GOLD_OREGEN);
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_QUARTZ_OREGEN);
//        }
//        else
//        {
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, IRON_OREGEN);
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, GOLD_OREGEN);
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, COPPER_OREGEN);
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DIAMOND_OREGEN);
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, COAL_OREGEN);
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, LAPIS_OREGEN);
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, REDSTONE_OREGEN);
//            if (event.getCategory() == Biome.BiomeCategory.MOUNTAIN)
//            {
//                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, EMERALD_OREGEN);
//            }
//        }
//    }
}