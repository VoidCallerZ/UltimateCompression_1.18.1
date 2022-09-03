package com.VoidCallerZ.uc.world;

import com.VoidCallerZ.uc.registration.BlockRegistration;
import com.VoidCallerZ.uc.setup.Config;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class UcOreConfiguredFeatures
{
    public static OreConfiguration IRON_ORE_CONFIGURED_FEATURE = new OreConfiguration(
            OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistration.COMPRESSED_IRON_ORE.get().defaultBlockState(),
            Config.ironOreVeinsize.get());
}
