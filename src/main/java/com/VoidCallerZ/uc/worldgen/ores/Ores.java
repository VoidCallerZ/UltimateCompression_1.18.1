package com.VoidCallerZ.uc.worldgen.ores;

import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
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
    public static int OVERWORLD_VEINSIZE = 5;
    public static int OVERWORLD_AMOUNT = 3;
    public static int DEEPSLATE_VEINSIZE = 5;
    public static int DEEPSLATE_AMOUNT = 3;
    public static int OVERWORLD_DIAMOND_VEINSIZE = 1;
    public static int OVERWORLD_DIAMOND_AMOUNT = 3;
    public static int DEEPSLATE_DIAMOND_VEINSIZE = 3;
    public static int DEEPSLATE_DIAMOND_AMOUNT = 4;

    public static PlacedFeature UC_WORLDGEN;

    public static void registerConfiguredFeatures()
    {
        //Iron
        OreGeneration("compressed_iron_ore", true, Registration.COMPRESSED_IRON_ORE.get().defaultBlockState(), OVERWORLD_VEINSIZE, OVERWORLD_AMOUNT, 0, 48);
        OreGeneration("compressed_deepslate_iron_ore", true, Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get().defaultBlockState(), DEEPSLATE_VEINSIZE, DEEPSLATE_AMOUNT, -64, 0);
        //Gold
        OreGeneration("compressed_gold_ore", true, Registration.COMPRESSED_GOLD_ORE.get().defaultBlockState(), OVERWORLD_VEINSIZE, OVERWORLD_AMOUNT, 0, 48);
        OreGeneration("compressed_deepslate_gold_ore", true, Registration.COMPRESSED_DEEPSLATE_GOLD_ORE.get().defaultBlockState(), DEEPSLATE_VEINSIZE, DEEPSLATE_AMOUNT, -64, 0);
        //Copper
        OreGeneration("compressed_copper_ore", true, Registration.COMPRESSED_COPPER_ORE.get().defaultBlockState(), OVERWORLD_VEINSIZE, OVERWORLD_AMOUNT, 0, 96);
        OreGeneration("compressed_deepslate_copper_ore", true, Registration.COMPRESSED_DEEPSLATE_COPPER_ORE.get().defaultBlockState(), DEEPSLATE_VEINSIZE, DEEPSLATE_AMOUNT,-16, 0);
        //Diamond
        OreGeneration("compressed_diamond_ore", true, Registration.COMPRESSED_DIAMOND_ORE.get().defaultBlockState(), OVERWORLD_DIAMOND_VEINSIZE, OVERWORLD_DIAMOND_AMOUNT, 0, 16);
        OreGeneration("compressed_deepslate_diamond_ore", true, Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get().defaultBlockState(), DEEPSLATE_DIAMOND_VEINSIZE, DEEPSLATE_DIAMOND_AMOUNT, -64, 0);
        //Coal
        OreGeneration("compressed_coal_ore", true, Registration.COMPRESSED_COAL_ORE.get().defaultBlockState(), OVERWORLD_VEINSIZE, OVERWORLD_AMOUNT, 0, 256);
        OreGeneration("compressed_deepslate_coal_ore", true, Registration.COMPRESSED_DEEPSLATE_COAL_ORE.get().defaultBlockState(), DEEPSLATE_VEINSIZE, DEEPSLATE_AMOUNT, -16, 0);
        //Emerald
        OreGeneration("compressed_emerald_ore", true, Registration.COMPRESSED_EMERALD_ORE.get().defaultBlockState(), OVERWORLD_VEINSIZE, OVERWORLD_AMOUNT, 0, 16);
        OreGeneration("compressed_deepslate_emerald_ore", true, Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get().defaultBlockState(), DEEPSLATE_VEINSIZE, DEEPSLATE_AMOUNT, -64, 0);
        //Lapis
        OreGeneration("compressed_lapis_ore", true, Registration.COMPRESSED_LAPIS_ORE.get().defaultBlockState(), OVERWORLD_VEINSIZE, OVERWORLD_AMOUNT, 0, 64);
        OreGeneration("compressed_deepslate_lapis_ore", true, Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get().defaultBlockState(), DEEPSLATE_VEINSIZE, DEEPSLATE_AMOUNT, -64, 0);
        //Redstone
        OreGeneration("compressed_redstone_ore", true, Registration.COMPRESSED_REDSTONE_ORE.get().defaultBlockState(), OVERWORLD_VEINSIZE, OVERWORLD_AMOUNT, 0, 16);
        OreGeneration("compressed_deepslate_redstone_ore", true, Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get().defaultBlockState(), DEEPSLATE_VEINSIZE, DEEPSLATE_AMOUNT, -64, 0);
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> PlacedFeature registerPlacedFeature(String registryName, ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers)
    {
        PlacedFeature placed = BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(registryName), feature).placed(placementModifiers);
        return PlacementUtils.register(registryName, placed);
    }

    public static void onBiomeLoadingEvent(BiomeLoadingEvent event)
    {
        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, UC_WORLDGEN);
    }

    private static void OreGeneration(String registryName, boolean isDeepslateOre, BlockState oreBlock, int veinSize, int chunkAmount, int minY, int maxY)
    {
        UC_WORLDGEN = registerPlacedFeature(registryName, Feature.ORE.configured(new OreConfiguration(isDeepslateOre == true ? OreFeatures.DEEPSLATE_ORE_REPLACEABLES : OreFeatures.STONE_ORE_REPLACEABLES, oreBlock, veinSize)),
                CountPlacement.of(chunkAmount),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)));
    }
}
