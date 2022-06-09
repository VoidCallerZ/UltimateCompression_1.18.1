package com.VoidCallerZ.uc.setup.registration;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.dataGen.ucWorldGen;
import com.VoidCallerZ.uc.setup.Config;
import com.VoidCallerZ.uc.worldgen.UcGenModifier;
import com.VoidCallerZ.uc.worldgen.ores.OresConfig;
import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WorldGenRegistration
{
    private static final DeferredRegister<Codec<? extends BiomeModifier>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, UltimateCompression.MODID);

    public static Holder<PlacedFeature> IRON_OREGEN;
    public static Holder<PlacedFeature> GOLD_OREGEN;
    public static Holder<PlacedFeature> COPPER_OREGEN;
    public static Holder<PlacedFeature> DIAMOND_OREGEN;
    public static Holder<PlacedFeature> LAPIS_OREGEN;
    public static Holder<PlacedFeature> REDSTONE_OREGEN;

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        SERIALIZERS.register(bus);
        SERIALIZERS.register("uc_world_generation", UcGenModifier::makeCodec);
    }

    public static void registerConfiguredFeatures()
    {
        IRON_OREGEN = registerPlacedFeatureUniform("compressed_iron_ore", false, Registration.COMPRESSED_IRON_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 48);
        GOLD_OREGEN = registerPlacedFeatureUniform("compressed_gold_ore", false, Registration.COMPRESSED_GOLD_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 48);
        COPPER_OREGEN = registerPlacedFeatureUniform("compressed_copper_ore", false, Registration.COMPRESSED_COPPER_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 96);
        DIAMOND_OREGEN = registerPlacedFeatureUniform("compressed_diamond_ore", false, Registration.COMPRESSED_DIAMOND_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 16);
        LAPIS_OREGEN = registerPlacedFeatureUniform("compressed_lapis_ore", false, Registration.COMPRESSED_LAPIS_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 30);
        REDSTONE_OREGEN = registerPlacedFeatureUniform("compressed_redstone_ore", false, Registration.COMPRESSED_REDSTONE_ORE.get().defaultBlockState(), OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 0, 15);
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeatureUniform(String registryName, boolean isDeepslateOre, BlockState oreBlock, int veinSize, int chunkAmount, int minY, int maxY)
    {
        return PlacementUtils.register(registryName, Holder.direct(new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(isDeepslateOre ? OreFeatures.DEEPSLATE_ORE_REPLACEABLES : OreFeatures.STONE_ORE_REPLACEABLES, oreBlock, veinSize))),
                CountPlacement.of(chunkAmount),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)));
    }


}
