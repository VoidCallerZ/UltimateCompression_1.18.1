package com.VoidCallerZ.uc.worldgen;

import com.VoidCallerZ.uc.setup.registration.Registration;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures
{
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_COMRPESSED_IRON_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, Registration.COMPRESSED_IRON_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get().defaultBlockState()));
}
