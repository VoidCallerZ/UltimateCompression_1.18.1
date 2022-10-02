package com.VoidCallerZ.uc.world.ores;

import com.VoidCallerZ.uc.registration.BlockRegistration;
import com.VoidCallerZ.uc.registration.WorldGenRegistration;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

@Mod.EventBusSubscriber(modid = MODID)
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
        IRON_OREGEN = registerPlacedFeatureUniform("compressed_iron_ore", false, BlockRegistration.COMPRESSED_IRON_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 48);
        GOLD_OREGEN = registerPlacedFeatureUniform("compressed_gold_ore", false, BlockRegistration.COMPRESSED_GOLD_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 48);
        COPPER_OREGEN = registerPlacedFeatureUniform("compressed_copper_ore", false, BlockRegistration.COMPRESSED_COPPER_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 96);
        DIAMOND_OREGEN = registerPlacedFeatureUniform("compressed_diamond_ore", false, BlockRegistration.COMPRESSED_DIAMOND_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 16);
        COAL_OREGEN = registerPlacedFeatureTriangle("compressed_coal_ore", false, BlockRegistration.COMPRESSED_COAL_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_COAL_VEINSIZE.get(), OresConfig.OVERWORLD_COAL_AMOUNT.get(), 0, 255);
        EMERALD_OREGEN = registerPlacedFeatureTriangle("compressed_emerald_ore", false, BlockRegistration.COMPRESSED_EMERALD_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 255);
        LAPIS_OREGEN = registerPlacedFeatureUniform("compressed_lapis_ore", false, BlockRegistration.COMPRESSED_LAPIS_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 30);
        REDSTONE_OREGEN = registerPlacedFeatureUniform("compressed_redstone_ore", false, BlockRegistration.COMPRESSED_REDSTONE_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 15);

        //Deepslate Ores
        IRON_OREGEN = registerPlacedFeatureUniform("compressed_iron_ore", true, BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
        GOLD_OREGEN = registerPlacedFeatureUniform("compressed_gold_ore", true, BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
        COPPER_OREGEN = registerPlacedFeatureUniform("compressed_copper_ore", true, BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -16, 0);
        DIAMOND_OREGEN = registerPlacedFeatureUniform("compressed_diamond_ore", true, BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_DIAMOND_VEINSIZE.get(), OresConfig.DEEPSLATE_DIAMOND_AMOUNT.get(), -64, 0);
        COAL_OREGEN = registerPlacedFeatureUniform("compressed_coal_ore", true, BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_COAL_VEINSIZE.get(), OresConfig.OVERWORLD_COAL_AMOUNT.get(), -16, 0);
        EMERALD_OREGEN = registerPlacedFeatureTriangle("compressed_emerald_ore", true, BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_DIAMOND_VEINSIZE.get(), OresConfig.DEEPSLATE_DIAMOND_AMOUNT.get(), -64, 0);
        LAPIS_OREGEN = registerPlacedFeatureUniform("compressed_lapis_ore", true, BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);
        REDSTONE_OREGEN = registerPlacedFeatureUniform("compressed_redstone_ore", true, BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get().defaultBlockState(), OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64, 0);

        //Nether Ores
        NETHER_GOLD_OREGEN = registerPlacedFeatureNether("compressed_nether_gold_ore", BlockRegistration.COMPRESSED_NETHER_GOLD_ORE.get().defaultBlockState(), OresConfig.NETHER_GOLD_ORE_VEINSIZE.get(), OresConfig.NETHER_GOLD_ORE_AMOUNT.get(), 10, 117);
        NETHER_QUARTZ_OREGEN = registerPlacedFeatureNether("compressed_nether_quartz_ore", BlockRegistration.COMPRESSED_NETHER_QUARTZ_ORE.get().defaultBlockState(), OresConfig.NETHER_QUARTZ_ORE_VEINSIZE.get(), OresConfig.NETHER_QUARTZ_ORE_AMOUNT.get(), 10, 117);

        //Nether
        //NetherOreGen("compressed_nether_gold_ore", Registration.COMPRESSED_NETHER_GOLD_ORE.get().defaultBlockState(), OresConfig.NETHER_GOLD_ORE_VEINSIZE.get(), OresConfig.NETHER_GOLD_ORE_AMOUNT.get(), 10, 117);
        //NetherOreGen("compressed_nether_gold_ore", Registration.COMPRESSED_NETHER_GOLD_ORE.get().defaultBlockState(), 100, 500, 0, 117);
        //NetherOreGen("compressed_nether_quartz_ore", Registration.COMPRESSED_NETHER_QUARTZ_ORE.get().defaultBlockState(), OresConfig.NETHER_QUARTZ_ORE_VEINSIZE.get(), OresConfig.NETHER_QUARTZ_ORE_AMOUNT.get(), 10, 117);
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

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event)
    {
        if (event.getCategory() == Biome.BiomeCategory.NETHER)
        {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_NETHER_GOLD_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_NETHER_QUARTZ_ORE_GEN.getHolder().get());
        }
        else
        {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_IRON_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_GOLD_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_COPPER_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_DIAMOND_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_COAL_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_LAPIS_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_REDSTONE_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_DEEPSLATE_IRON_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_DEEPSLATE_COAL_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE_GEN.getHolder().get());
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE_GEN.getHolder().get());
            if (event.getCategory() == Biome.BiomeCategory.MOUNTAIN)
            {
                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_EMERALD_ORE_GEN.getHolder().get());
                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE_GEN.getHolder().get());
            }
        }
    }

    @NotNull
    public static Holder<PlacedFeature> createOverworldOregen(boolean isDeepslate, boolean isUniform, RegistryObject<Block> oreBlock, int veinSize, int amount, int height)
    {
        VerticalAnchor zero = VerticalAnchor.absolute(0);
        VerticalAnchor absMinY = VerticalAnchor.absolute(height);
        VerticalAnchor absMaxY = VerticalAnchor.absolute(height);

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

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeature(String registryName, ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers)
    {
        return PlacementUtils.register(registryName, Holder.direct(feature), placementModifiers);
    }
}