package com.VoidCallerZ.uc.worldgen.ores;

import com.VoidCallerZ.uc.setup.registration.Registration;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.state.BlockState;
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
    public static Holder<PlacedFeature> IRON_OREGEN;
    public static Holder<PlacedFeature> GOLD_OREGEN;
    public static Holder<PlacedFeature> COPPER_OREGEN;
    public static Holder<PlacedFeature> DIAMOND_OREGEN;
    public static Holder<PlacedFeature> COAL_OREGEN;
    public static Holder<PlacedFeature> EMERALD_OREGEN;
    public static Holder<PlacedFeature> LAPIS_OREGEN;
    public static Holder<PlacedFeature> REDSTONE_OREGEN;
    public static Holder<PlacedFeature> UC_DEEPSLATEGEN;
    public static Holder<PlacedFeature> UC_NETHERGEN;

    public static void registerConfiguredFeatures()
    {
        //Overworld Ores
        IRON_OREGEN = registerPlacedFeatureUniform("compressed_iron_ore", Registration.COMPRESSED_IRON_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 48);
        GOLD_OREGEN = registerPlacedFeatureUniform("compressed_gold_ore", Registration.COMPRESSED_GOLD_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 48);
        COPPER_OREGEN = registerPlacedFeatureUniform("compressed_copper_ore", Registration.COMPRESSED_COPPER_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 96);
        DIAMOND_OREGEN = registerPlacedFeatureUniform("compressed_diamond_ore", Registration.COMPRESSED_DIAMOND_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_DIAMOND_VEINSIZE.get(), OresConfig.OVERWORLD_DIAMOND_AMOUNT.get(), 0, 16);
        COAL_OREGEN = registerPlacedFeatureUniform("compressed_coal_ore", Registration.COMPRESSED_COAL_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_COAL_VEINSIZE.get(), OresConfig.OVERWORLD_COAL_AMOUNT.get(), 136, 255);
        EMERALD_OREGEN = registerPlacedFeatureTriangle("compressed_emerald_ore", Registration.COMPRESSED_EMERALD_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_DIAMOND_VEINSIZE.get(), OresConfig.OVERWORLD_DIAMOND_AMOUNT.get(), 0, 255);
        LAPIS_OREGEN = registerPlacedFeatureUniform("compressed_lapis_ore", Registration.COMPRESSED_LAPIS_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 30);
        REDSTONE_OREGEN = registerPlacedFeatureUniform("compressed_redstone_ore", Registration.COMPRESSED_REDSTONE_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 15);
//        UC_WORLDGEN = registerPlacedFeature("compressed_coal_ore", Registration.COMPRESSED_COAL_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 256);
//        UC_WORLDGEN = registerPlacedFeature("compressed_emerald_ore", Registration.COMPRESSED_EMERALD_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 16);
//        UC_WORLDGEN = registerPlacedFeature("compressed_lapis_ore", Registration.COMPRESSED_LAPIS_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 64);
//        UC_WORLDGEN = registerPlacedFeature("compressed_redstone_ore", Registration.COMPRESSED_REDSTONE_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 16);

        //Deepslate Ores
//        //Overworld
//        //Iron
//        OverworldOreGen("compressed_iron_ore", Registration.COMPRESSED_IRON_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 48);
//        DeepslateOreGen("compressed_deepslate_iron_ore", Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
//        //Gold
//        OverworldOreGen("compressed_gold_ore", Registration.COMPRESSED_GOLD_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 48);
//        DeepslateOreGen("compressed_deepslate_gold_ore", Registration.COMPRESSED_DEEPSLATE_GOLD_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
//        //Copper
//        OverworldOreGen("compressed_copper_ore", Registration.COMPRESSED_COPPER_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 96);
//        DeepslateOreGen("compressed_deepslate_copper_ore", Registration.COMPRESSED_DEEPSLATE_COPPER_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(),-16, 0);
//        //Diamond
//        OverworldOreGen("compressed_diamond_ore", Registration.COMPRESSED_DIAMOND_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_DIAMOND_VEINSIZE.get(), OresConfig.OVERWORLD_DIAMOND_AMOUNT.get(), 0, 16);
//        DeepslateOreGen("compressed_deepslate_diamond_ore", Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_DIAMOND_VEINSIZE.get(), OresConfig.DEEPSLATE_DIAMOND_AMOUNT.get(), -64, 0);
//        //Coal
//        OverworldOreGen("compressed_coal_ore", Registration.COMPRESSED_COAL_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 256);
//        DeepslateOreGen("compressed_deepslate_coal_ore", Registration.COMPRESSED_DEEPSLATE_COAL_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -16, 0);
//        //Emerald
//        OverworldOreGen("compressed_emerald_ore", Registration.COMPRESSED_EMERALD_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 16);
//        DeepslateOreGen("compressed_deepslate_emerald_ore", Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
//        //Lapis
//        OverworldOreGen("compressed_lapis_ore", Registration.COMPRESSED_LAPIS_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 64);
//        DeepslateOreGen("compressed_deepslate_lapis_ore", Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
//        //Redstone
//        OverworldOreGen("compressed_redstone_ore", Registration.COMPRESSED_REDSTONE_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 16);
//        DeepslateOreGen("compressed_deepslate_redstone_ore", Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);

        //Nether
        //NetherOreGen("compressed_nether_gold_ore", Registration.COMPRESSED_NETHER_GOLD_ORE.get().defaultBlockState(), OresConfig.NETHER_GOLD_ORE_VEINSIZE.get(), OresConfig.NETHER_GOLD_ORE_AMOUNT.get(), 10, 117);
        //NetherOreGen("compressed_nether_gold_ore", Registration.COMPRESSED_NETHER_GOLD_ORE.get().defaultBlockState(), 100, 500, 0, 117);
        //NetherOreGen("compressed_nether_quartz_ore", Registration.COMPRESSED_NETHER_QUARTZ_ORE.get().defaultBlockState(), OresConfig.NETHER_QUARTZ_ORE_VEINSIZE.get(), OresConfig.NETHER_QUARTZ_ORE_AMOUNT.get(), 10, 117);
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeatureUniform(String registryName, BlockState oreBlock, int veinSize, int chunkAmount, int minY, int maxY)
    {
        return PlacementUtils.register(registryName, Holder.direct(new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, oreBlock, veinSize))),
                CountPlacement.of(chunkAmount),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)));
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeatureTriangle(String registryName, BlockState oreBlock, int veinSize, int chunkAmount, int minY, int maxY)
    {
        return PlacementUtils.register(registryName, Holder.direct(new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, oreBlock, veinSize))),
                CountPlacement.of(chunkAmount),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.triangle(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)));
    }

    public static void onBiomeLoadingEvent(BiomeLoadingEvent event)
    {
        if (event.getCategory() == Biome.BiomeCategory.MOUNTAIN)
        {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, EMERALD_OREGEN);
        }
        else
        {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, IRON_OREGEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, GOLD_OREGEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, COPPER_OREGEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DIAMOND_OREGEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, COAL_OREGEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, LAPIS_OREGEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, REDSTONE_OREGEN);
        }
    }
}