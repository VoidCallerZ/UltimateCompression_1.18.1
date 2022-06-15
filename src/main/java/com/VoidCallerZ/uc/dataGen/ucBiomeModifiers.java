package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.registration.WorldGenRegistration;
import com.VoidCallerZ.uc.worldgen.ores.OreBiomeModifier;
import com.google.common.cache.Cache;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.registries.RegistryObject;

import java.io.IOException;
import java.nio.file.Path;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class ucBiomeModifiers implements DataProvider
{
    public final DataGenerator generator;

    public ucBiomeModifiers(DataGenerator generator)
    {
        this.generator = generator;
    }

    @Override
    public void run(CachedOutput cache)
    {
        final RegistryOps<JsonElement> ops = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.BUILTIN.get());

        //Overworld Ores
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_IRON_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_GOLD_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_COPPER_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_DIAMOND_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_COAL_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_EMERALD_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_LAPIS_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_REDSTONE_ORE_GEN);

        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_DEEPSLATE_IRON_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_DEEPSLATE_COAL_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE_GEN);
        setOverworldModifier(cache, ops, WorldGenRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE_GEN);

        //Nether Ores
        setNetherModifier(cache, ops, WorldGenRegistration.COMPRESSED_NETHER_QUARTZ_ORE_GEN);
        setNetherModifier(cache, ops, WorldGenRegistration.COMPRESSED_NETHER_GOLD_ORE_GEN);

    }

    @Override
    public String getName()
    {
        return "UC Biome Modifiers";
    }

    private void setOverworldModifier(CachedOutput cache, RegistryOps<JsonElement> ops, RegistryObject<PlacedFeature> oreFeature)
    {
        BiomeModifier biomeModifier_ = new OreBiomeModifier(
                new HolderSet.Named<>(ops.registry(Registry.BIOME_REGISTRY).get(), BiomeTags.IS_OVERWORLD),
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(MODID, oreFeature.getId().getPath())))));
        customEncoder(cache, ops, oreFeature, biomeModifier_);
    }

    private void setNetherModifier(CachedOutput cache, RegistryOps<JsonElement> ops, RegistryObject<PlacedFeature> oreFeature)
    {
        BiomeModifier biomeModifierNether_ = new OreBiomeModifier(
                new HolderSet.Named<>(ops.registry(Registry.BIOME_REGISTRY).get(), BiomeTags.IS_NETHER),
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(MODID, oreFeature.getId().getPath())))));
        customEncoder(cache, ops, oreFeature, biomeModifierNether_);
    }

    private void customEncoder(CachedOutput cache, RegistryOps<JsonElement> ops, RegistryObject<PlacedFeature> oreFeature, BiomeModifier biomeModifier)
    {
        String featurePathString_ = String.join("/", PackType.SERVER_DATA.getDirectory(), MODID, Registry.PLACED_FEATURE_REGISTRY.location().getPath(), oreFeature.getId().getPath() + "_pf.json");
        Path featurePath_ = generator.getOutputFolder().resolve(featurePathString_);

        String biomeModifierPathString_ = String.join("/", PackType.SERVER_DATA.getDirectory(), MODID, "forge/biome_modifier", oreFeature.getId().getPath() + "_bm.json");
        Path biomeModifierPath_ = generator.getOutputFolder().resolve(biomeModifierPathString_);

        PlacedFeature.DIRECT_CODEC.encodeStart(ops, oreFeature.get())
                .resultOrPartial(msg -> UltimateCompression.LOGGER.error("Failed to encode {}:{}", featurePathString_, msg))
                .ifPresent(json -> {
                    try
                    {
                        DataProvider.saveStable(cache, json, featurePath_);
                    }
                    catch (IOException e)
                    {
                        UltimateCompression.LOGGER.error("Failed to save " + featurePathString_, e);
                    }
                });

        BiomeModifier.DIRECT_CODEC.encodeStart(ops, biomeModifier)
                .resultOrPartial(msg -> UltimateCompression.LOGGER.error("Failed to encode {}:{}", biomeModifierPathString_, msg))
                .ifPresent(json -> {
                    try
                    {
                        DataProvider.saveStable(cache, json, biomeModifierPath_);
                    }
                    catch (IOException e)
                    {
                        UltimateCompression.LOGGER.error("Failed to save " + biomeModifierPathString_, e);
                    }
                });
    }
}
