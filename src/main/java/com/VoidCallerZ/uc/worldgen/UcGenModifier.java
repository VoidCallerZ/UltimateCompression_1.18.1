package com.VoidCallerZ.uc.worldgen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public record UcGenModifier(HolderSet<Biome> biomes, GenerationStep.Decoration generationStage, HolderSet<PlacedFeature> features) implements BiomeModifier
{
    private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(new ResourceLocation(UltimateCompression.MODID, "test"), ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, UltimateCompression.MODID);

    @Override
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder)
    {
        if (phase == Phase.ADD && this.biomes.contains(biome))
        {
            BiomeGenerationSettingsBuilder generation = builder.getGenerationSettings();
            this.features.forEach(holder -> generation.addFeature(this.generationStage, holder));
        }
    }

    @Override
    public Codec<? extends BiomeModifier> codec()
    {
        return SERIALIZER.get();
    }

    public static Codec<UcGenModifier> makeCodec()
    {
        return RecordCodecBuilder.create(builder -> builder.group(
                Biome.LIST_CODEC.fieldOf("biomes").forGetter(UcGenModifier::biomes),
                Codec.STRING.comapFlatMap(UcGenModifier::generationStageFromString, GenerationStep.Decoration::toString).fieldOf("generation_stage").forGetter(UcGenModifier::generationStage),
                PlacedFeature.LIST_CODEC.fieldOf("features").forGetter(UcGenModifier::features)
        ).apply(builder, UcGenModifier::new));
    }

    private static DataResult<GenerationStep.Decoration> generationStageFromString(String name)
    {
        try
        {
            return DataResult.success(GenerationStep.Decoration.valueOf(name));
        }
        catch (Exception e)
        {
            return DataResult.error("Not a decoration stage: " + name);
        }
    }
}
