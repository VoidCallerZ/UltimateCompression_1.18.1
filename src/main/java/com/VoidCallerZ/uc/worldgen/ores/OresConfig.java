package com.VoidCallerZ.uc.worldgen.ores;

import net.minecraftforge.common.ForgeConfigSpec;

public class OresConfig
{
    public static ForgeConfigSpec.IntValue OVERWORLD_VEINSIZE;// = 5;
    public static ForgeConfigSpec.IntValue OVERWORLD_AMOUNT;// = 3;
    public static ForgeConfigSpec.IntValue DEEPSLATE_VEINSIZE;// = 5;
    public static ForgeConfigSpec.IntValue DEEPSLATE_AMOUNT;// = 3;
    public static ForgeConfigSpec.IntValue OVERWORLD_DIAMOND_VEINSIZE;// = 1;
    public static ForgeConfigSpec.IntValue OVERWORLD_DIAMOND_AMOUNT;// = 3;
    public static ForgeConfigSpec.IntValue DEEPSLATE_DIAMOND_VEINSIZE;// = 3;
    public static ForgeConfigSpec.IntValue DEEPSLATE_DIAMOND_AMOUNT;// = 4;

    public static ForgeConfigSpec.IntValue NETHER_GOLD_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue NETHER_GOLD_ORE_AMOUNT;
    public static ForgeConfigSpec.IntValue NETHER_QUARTZ_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue NETHER_QUARTZ_ORE_AMOUNT;

    public static void registerCommonConfig(ForgeConfigSpec.Builder COMMON_BUILDER)
    {
        COMMON_BUILDER.comment("Settings for ore generation").push("ores");

        OVERWORLD_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of all ores but diamond").defineInRange("overworldVeinsize", 5, 0, 50);
        OVERWORLD_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk").defineInRange("overworldVeinsize", 3, 0, 50);
        DEEPSLATE_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of all ores but diamond in deepslate").defineInRange("overworldVeinsize", 5, 0, 50);
        DEEPSLATE_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk in deepslate").defineInRange("overworldVeinsize", 3, 0, 50);

        OVERWORLD_DIAMOND_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of diamond ore").defineInRange("overworldDiamondVeinsize", 1, 0, 50);
        OVERWORLD_DIAMOND_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk of diamond ore").defineInRange("overworldDiamondAmount", 3, 0, 50);
        OVERWORLD_DIAMOND_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of diamond ore in deepslate").defineInRange("deepslateDiamondVeinsize", 3, 0, 50);
        OVERWORLD_DIAMOND_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk of diamond ore in deepslate").defineInRange("deepslateDiamondAmount", 4, 0, 50);

        NETHER_GOLD_ORE_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of nether gold ore").defineInRange("netherGoldVeinsize", 5, 0, 50);
        NETHER_GOLD_ORE_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk").defineInRange("netherGoldVeinsize", 10, 0, 50);
        NETHER_QUARTZ_ORE_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of nether quartz ore").defineInRange("netherGoldVeinsize", 10, 0, 50);
        NETHER_QUARTZ_ORE_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk").defineInRange("netherGoldVeinsize", 16, 0, 50);
    }
}
