package com.VoidCallerZ.uc.setup.registration;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.worldgen.ores.OreBiomeModifier;
import com.VoidCallerZ.uc.worldgen.ores.Ores;
import com.VoidCallerZ.uc.worldgen.ores.OresConfig;
import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.VoidCallerZ.uc.worldgen.ores.OreBiomeModifier.ORE_BIOME_MODIFIER_NAME;

public class WorldGenRegistration
{
    private static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, UltimateCompression.MODID);
    private static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, UltimateCompression.MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BIOME_MODIFIERS.register(bus);
        PLACED_FEATURES.register(bus);
    }

    public static final RegistryObject<Codec<? extends BiomeModifier>> ORE_BIOME_MODIFIER = BIOME_MODIFIERS.register(ORE_BIOME_MODIFIER_NAME, OreBiomeModifier::makeCodec);

    //Overworld Ores
    public static final RegistryObject<PlacedFeature> COMPRESSED_IRON_ORE_GEN = PLACED_FEATURES.register("compressed_iron_ore", () -> Ores.createOverworldOregen(false, true, Registration.COMPRESSED_IRON_ORE, OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 48).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_GOLD_ORE_GEN = PLACED_FEATURES.register("compressed_gold_ore", () -> Ores.createOverworldOregen(false, true, Registration.COMPRESSED_GOLD_ORE, OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 48).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_COPPER_ORE_GEN = PLACED_FEATURES.register("compressed_copper_ore", () -> Ores.createOverworldOregen(false, true, Registration.COMPRESSED_COPPER_ORE, OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 96).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DIAMOND_ORE_GEN = PLACED_FEATURES.register("compressed_diamond_ore", () -> Ores.createOverworldOregen(false, true, Registration.COMPRESSED_DIAMOND_ORE, OresConfig.OVERWORLD_DIAMOND_VEINSIZE.get(), OresConfig.OVERWORLD_DIAMOND_AMOUNT.get(), 16).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_COAL_ORE_GEN = PLACED_FEATURES.register("compressed_coal_ore", () -> Ores.createOverworldOregen(false, false, Registration.COMPRESSED_COAL_ORE, OresConfig.OVERWORLD_COAL_VEINSIZE.get(), OresConfig.OVERWORLD_COAL_AMOUNT.get(), 255).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_EMERALD_ORE_GEN = PLACED_FEATURES.register("compressed_emerald_ore", () -> Ores.createOverworldOregen(false, false, Registration.COMPRESSED_EMERALD_ORE, OresConfig.OVERWORLD_DIAMOND_VEINSIZE.get(), OresConfig.OVERWORLD_DIAMOND_AMOUNT.get(), 255).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_LAPIS_ORE_GEN = PLACED_FEATURES.register("compressed_lapis_ore", () -> Ores.createOverworldOregen(false, true, Registration.COMPRESSED_LAPIS_ORE, OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 30).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_REDSTONE_ORE_GEN = PLACED_FEATURES.register("compressed_redstone_ore", () -> Ores.createOverworldOregen(false, true, Registration.COMPRESSED_REDSTONE_ORE, OresConfig.OVERWORLD_VEINSIZE.get(), OresConfig.OVERWORLD_AMOUNT.get(), 15).get());

    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_IRON_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_iron_ore", () -> Ores.createOverworldOregen(true, true, Registration.COMPRESSED_DEEPSLATE_IRON_ORE, OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_GOLD_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_gold_ore", () -> Ores.createOverworldOregen(true, true, Registration.COMPRESSED_DEEPSLATE_GOLD_ORE, OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_COPPER_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_copper_ore", () -> Ores.createOverworldOregen(true, true, Registration.COMPRESSED_DEEPSLATE_COPPER_ORE, OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -16).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_DIAMOND_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_diamond_ore", () -> Ores.createOverworldOregen(true, true, Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE, OresConfig.DEEPSLATE_DIAMOND_VEINSIZE.get(), OresConfig.DEEPSLATE_DIAMOND_AMOUNT.get(), -64).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_COAL_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_coal_ore", () -> Ores.createOverworldOregen(true, false, Registration.COMPRESSED_DEEPSLATE_COAL_ORE, OresConfig.DEEPSLATE_COAL_VEINSIZE.get(), OresConfig.DEEPSLATE_COAL_AMOUNT.get(), -16).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_EMERALD_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_emerald_ore", () -> Ores.createOverworldOregen(true, false, Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE, OresConfig.DEEPSLATE_DIAMOND_VEINSIZE.get(), OresConfig.DEEPSLATE_DIAMOND_AMOUNT.get(), -64).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_LAPIS_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_lapis_ore", () -> Ores.createOverworldOregen(true, true, Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE, OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_REDSTONE_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_redstone_ore", () -> Ores.createOverworldOregen(true, true, Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE, OresConfig.DEEPSLATE_VEINSIZE.get(), OresConfig.DEEPSLATE_AMOUNT.get(), -64).get());

    //Nether Ores
    public static final RegistryObject<PlacedFeature> COMPRESSED_NETHER_QUARTZ_ORE_GEN = PLACED_FEATURES.register("comrpessed_nether_quartz_ore", () -> Ores.createNetherOregen(Registration.COMPRESSED_NETHER_QUARTZ_ORE, OresConfig.NETHER_QUARTZ_ORE_VEINSIZE.get(), OresConfig.NETHER_QUARTZ_ORE_AMOUNT.get(), 10, 117).get());
    public static final RegistryObject<PlacedFeature> COMPRESSED_NETHER_GOLD_ORE_GEN = PLACED_FEATURES.register("compressed_nether_gold_ore", () -> Ores.createNetherOregen(Registration.COMPRESSED_NETHER_GOLD_ORE, OresConfig.NETHER_GOLD_ORE_VEINSIZE.get(), OresConfig.NETHER_GOLD_ORE_AMOUNT.get(), 10, 117).get());
}