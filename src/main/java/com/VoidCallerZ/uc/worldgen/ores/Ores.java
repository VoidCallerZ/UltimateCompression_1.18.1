package com.VoidCallerZ.uc.worldgen.ores;

import com.VoidCallerZ.uc.setup.registration.Registration;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Panda;
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
    public static Holder<PlacedFeature> UC_WORLDGEN;
    public static Holder<PlacedFeature> UC_DEEPSLATEGEN;
    public static Holder<PlacedFeature> UC_NETHERGEN;

    public static void registerConfiguredFeatures()
    {
        //Overworld
        //Iron
        OverworldOreGen("compressed_iron_ore", Registration.COMPRESSED_IRON_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 48);
        DeepslateOreGen("compressed_deepslate_iron_ore", Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
        //Gold
        OverworldOreGen("compressed_gold_ore", Registration.COMPRESSED_GOLD_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 48);
        DeepslateOreGen("compressed_deepslate_gold_ore", Registration.COMPRESSED_DEEPSLATE_GOLD_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
        //Copper
        OverworldOreGen("compressed_copper_ore", Registration.COMPRESSED_COPPER_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 96);
        DeepslateOreGen("compressed_deepslate_copper_ore", Registration.COMPRESSED_DEEPSLATE_COPPER_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(),-16, 0);
        //Diamond
        OverworldOreGen("compressed_diamond_ore", Registration.COMPRESSED_DIAMOND_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_DIAMOND_VEINSIZE.get(), OresConfig.OVERWORLD_DIAMOND_AMOUNT.get(), 0, 16);
        DeepslateOreGen("compressed_deepslate_diamond_ore", Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_DIAMOND_VEINSIZE.get(), OresConfig.DEEPSLATE_DIAMOND_AMOUNT.get(), -64, 0);
        //Coal
        OverworldOreGen("compressed_coal_ore", Registration.COMPRESSED_COAL_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 256);
        DeepslateOreGen("compressed_deepslate_coal_ore", Registration.COMPRESSED_DEEPSLATE_COAL_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -16, 0);
        //Emerald
        OverworldOreGen("compressed_emerald_ore", Registration.COMPRESSED_EMERALD_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 16);
        DeepslateOreGen("compressed_deepslate_emerald_ore", Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
        //Lapis
        OverworldOreGen("compressed_lapis_ore", Registration.COMPRESSED_LAPIS_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 64);
        DeepslateOreGen("compressed_deepslate_lapis_ore", Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
        //Redstone
        OverworldOreGen("compressed_redstone_ore", Registration.COMPRESSED_REDSTONE_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 16);
        DeepslateOreGen("compressed_deepslate_redstone_ore", Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);

        //Nether
        //NetherOreGen("compressed_nether_gold_ore", Registration.COMPRESSED_NETHER_GOLD_ORE.get().defaultBlockState(), OresConfig.NETHER_GOLD_ORE_VEINSIZE.get(), OresConfig.NETHER_GOLD_ORE_AMOUNT.get(), 10, 117);
        //NetherOreGen("compressed_nether_gold_ore", Registration.COMPRESSED_NETHER_GOLD_ORE.get().defaultBlockState(), 100, 500, 0, 117);
        //NetherOreGen("compressed_nether_quartz_ore", Registration.COMPRESSED_NETHER_QUARTZ_ORE.get().defaultBlockState(), OresConfig.NETHER_QUARTZ_ORE_VEINSIZE.get(), OresConfig.NETHER_QUARTZ_ORE_AMOUNT.get(), 10, 117);
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeature(String registryName, ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers)
    {
        return PlacementUtils.register(registryName, Holder.direct(feature), placementModifiers);
    }

    public static void onBiomeLoadingEvent(BiomeLoadingEvent event)
    {
        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, UC_WORLDGEN);
        //event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, UC_DEEPSLATEGEN);
    }

    private static void OverworldOreGen(String registryName, BlockState oreBlock, int veinSize, int chunkAmount, int minY, int maxY)
    {
        UC_WORLDGEN = registerPlacedFeature(registryName, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, oreBlock, veinSize)),
                CountPlacement.of(chunkAmount),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)));
    }

    private static void DeepslateOreGen(String registryName, BlockState oreBlock, int veinSize, int chunkAmount, int minY, int maxY)
    {
        UC_WORLDGEN = registerPlacedFeature(registryName, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, oreBlock, veinSize)),
                CountPlacement.of(chunkAmount),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)));
    }

    private static void NetherOreGen(String registryName, BlockState oreBlock, int veinSize, int chunkAmount, int minY, int maxY)
    {
        UC_NETHERGEN = registerPlacedFeature(registryName, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.NETHER_ORE_REPLACEABLES, oreBlock, veinSize)),
                CountPlacement.of(chunkAmount),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)));
    }
}