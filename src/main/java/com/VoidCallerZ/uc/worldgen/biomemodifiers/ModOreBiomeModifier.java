package com.VoidCallerZ.uc.worldgen.biomemodifiers;

import com.VoidCallerZ.uc.setup.registration.Registration;
import com.VoidCallerZ.uc.worldgen.ModBiomeModifiers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.minecraftforge.registries.RegistryObject;

public record ModOreBiomeModifier(HolderSet<Biome> biomes, HolderSet<PlacedFeature> features) implements BiomeModifier
{
    @Override
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder)
    {
        if (phase == Phase.ADD && biomes.contains(biome))
        {
            BiomeGenerationSettingsBuilder generation = builder.getGenerationSettings();
            this.features.forEach(holder -> generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, holder));
        }
    }

    @Override
    public Codec<? extends BiomeModifier> codec()
    {
        return Registration.ORE_BIOME_MODIFIER.get();
    }

    public static Codec<ModOreBiomeModifier> makeCodec()
    {
        return RecordCodecBuilder.create(builder -> builder.group(
                Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModOreBiomeModifier::biomes),
                PlacedFeature.LIST_CODEC.fieldOf("feature").forGetter(ModOreBiomeModifier::features)
        ).apply(builder, ModOreBiomeModifier::new));
    }
}
