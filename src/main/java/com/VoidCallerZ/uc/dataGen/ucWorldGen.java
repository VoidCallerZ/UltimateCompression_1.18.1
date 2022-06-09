package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.worldgen.UcGenModifier;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.Holder;
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
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Path;

public class ucWorldGen
{
    public static final Logger LOGGER = LogManager.getLogger();

    public static void onGatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        final Path outputFolder = generator.getOutputFolder();
        final RegistryOps<JsonElement> ops = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.BUILTIN.get());
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        final String directory = PackType.SERVER_DATA.getDirectory();
        Registry<PlacedFeature> placedFeatures = ops.registry(Registry.PLACED_FEATURE_REGISTRY).get();


        final String featurePathString = String.join("/", directory, UltimateCompression.MODID, Registry.PLACED_FEATURE_REGISTRY.location().getPath(), "iron_oregen" + ".json");
        final Path featurePath = outputFolder.resolve(featurePathString);
        final PlacedFeature feature = placedFeatures.get(new ResourceLocation(UltimateCompression.MODID, "test"));

        final ResourceLocation biomeModifiersRegistryID = ForgeRegistries.Keys.BIOME_MODIFIERS.location();
        final String biomeModifierPathString = String.join("/", directory, UltimateCompression.MODID, biomeModifiersRegistryID.getNamespace(), biomeModifiersRegistryID.getNamespace(), "iron_oregen_biome_modifier" + ".json");
        final Path biomeModifierPath = outputFolder.resolve(biomeModifierPathString);
        final BiomeModifier biomeModifier = new UcGenModifier(
                new HolderSet.Named<>(ops.registry(Registry.BIOME_REGISTRY).get(), BiomeTags.IS_OVERWORLD),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                HolderSet.direct(placedFeatures.getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(UltimateCompression.MODID, "iron_oregen"))))
        );

        generator.addProvider(event.includeServer(), new DataProvider()
        {
            @Override
            public void run(final CachedOutput cache) throws IOException
            {
                PlacedFeature.DIRECT_CODEC.encodeStart(ops, feature)
                        .resultOrPartial(msg -> LOGGER.error("Failed to encode {}: {}", featurePathString, msg))
                        .ifPresent(json ->
                        {
                            try
                            {
                                DataProvider.saveStable(cache, json, featurePath);
                            }
                            catch (IOException e)
                            {
                                LOGGER.error("Failed to save " + featurePathString, e);
                            }
                        });

                BiomeModifier.DIRECT_CODEC.encodeStart(ops, biomeModifier)
                        .resultOrPartial(msg -> LOGGER.error("Failed to encode {}: {}", biomeModifierPathString, msg))
                        .ifPresent(json ->
                        {
                            try
                            {
                                DataProvider.saveStable(cache, json, biomeModifierPath);
                            }
                            catch (IOException e)
                            {
                                LOGGER.error("Failed to save " + biomeModifierPathString, e);
                            }
                        });
            }

            @Override
            public String getName()
            {
                return UltimateCompression.MODID + " data provider";
            }
        });
    }


}
