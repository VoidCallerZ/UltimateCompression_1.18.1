package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.registration.Registration;
import com.VoidCallerZ.uc.worldgen.ModConfiguredFeatures;
import com.VoidCallerZ.uc.worldgen.ModPlacedFeatures;
import com.VoidCallerZ.uc.worldgen.biomemodifiers.ModOreBiomeModifier;
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
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Path;

public class BiomeModifierProvider
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

        final String featurePathString = String.join("/", directory, UltimateCompression.MODID, Registry.PLACED_FEATURE_REGISTRY.location().getPath(), "test.json");
        final Path featurePath = outputFolder.resolve(featurePathString);
        final PlacedFeature feature = placedFeatures.get(ModPlacedFeatures.PLACED_FEATURES.getRegistryName());

        final ResourceLocation biomeModifiersRegistryID = ForgeRegistries.Keys.BIOME_MODIFIERS.location();
        final String biomeModifierPathString = String.join("/", directory, UltimateCompression.MODID, biomeModifiersRegistryID.getNamespace(), biomeModifiersRegistryID.getPath(), "modify_overworld.json");
        final Path biomeModifierPath = outputFolder.resolve(biomeModifierPathString);
        final BiomeModifier biomeModifier = new ModOreBiomeModifier(new HolderSet.Named<>(ops.registry(Registry.BIOME_REGISTRY).get(), BiomeTags.IS_OVERWORLD),
                Holder.direct(ModPlacedFeatures.IRON_OREGEN.get()));

        generator.addProvider(event.includeServer(), new DataProvider()
        {
            @Override
            public void run(CachedOutput cache) throws IOException
            {
                PlacedFeature.DIRECT_CODEC.encodeStart(ops, feature)
                        .resultOrPartial(msg -> LOGGER.error("Failed to encode {}: {}", featurePathString, msg)) // Log error on encode failure.
                        .ifPresent(json -> // Output to file on encode success.
                        {
                            try
                            {
                                DataProvider.saveStable(cache, json, featurePath);
                            }
                            catch (IOException e) // The throws can't deal with this exception, because we're inside the ifPresent.
                            {
                                LOGGER.error("Failed to save " + featurePathString, e);
                            }
                        });

                BiomeModifier.DIRECT_CODEC.encodeStart(ops, biomeModifier)
                        .resultOrPartial(msg -> LOGGER.error("Failed to encode {}: {}", biomeModifierPathString, msg)) // Log error on encode failure.
                        .ifPresent(json -> // Output to file on encode success.
                        {
                            try
                            {
                                DataProvider.saveStable(cache, json, biomeModifierPath);
                            }
                            catch (IOException e) // The throws can't deal with this exception, because we're inside the ifPresent.
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
