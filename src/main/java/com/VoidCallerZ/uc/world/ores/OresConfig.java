package com.VoidCallerZ.uc.world.ores;

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
    public static ForgeConfigSpec.IntValue OVERWORLD_COAL_VEINSIZE;
    public static ForgeConfigSpec.IntValue OVERWORLD_COAL_AMOUNT;
    public static ForgeConfigSpec.IntValue DEEPSLATE_COAL_VEINSIZE;
    public static ForgeConfigSpec.IntValue DEEPSLATE_COAL_AMOUNT;

    public static ForgeConfigSpec.IntValue NETHER_GOLD_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue NETHER_GOLD_ORE_AMOUNT;
    public static ForgeConfigSpec.IntValue NETHER_QUARTZ_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue NETHER_QUARTZ_ORE_AMOUNT;

    public static void registerCommonConfig(ForgeConfigSpec.Builder COMMON_BUILDER)
    {
        COMMON_BUILDER.comment("Settings for ore generation").push("ores");

        OVERWORLD_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of iron, gold, copper, lapis & redstone").defineInRange("overworldVeinsize", 5, 0, 50);
        OVERWORLD_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk").defineInRange("overworldChunkAmount", 5, 0, 50);
        DEEPSLATE_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of iron, gold, copper, lapis & redstone").defineInRange("deepslateVeinsize", 5, 0, 50);
        DEEPSLATE_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk in deepslate").defineInRange("deepslateChunkAmount", 5, 0, 50);

        OVERWORLD_DIAMOND_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of diamond ore").defineInRange("overworldDiamondVeinsize", 1, 0, 50);
        OVERWORLD_DIAMOND_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk of diamond ore").defineInRange("overworldDiamondChunkAmount", 6, 0, 50);
        DEEPSLATE_DIAMOND_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of diamond ore in deepslate").defineInRange("deepslateDiamondVeinsize", 3, 0, 50);
        DEEPSLATE_DIAMOND_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk of diamond ore in deepslate").defineInRange("deepslateDiamondChunkAmount", 6, 0, 50);

        OVERWORLD_COAL_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of all coal ores").defineInRange("overworldCoalVeinsize", 14, 0, 50);
        OVERWORLD_COAL_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk").defineInRange("overworldCoalChunkAmount", 18, 0, 50);
        DEEPSLATE_COAL_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of all coal ores in deepslate").defineInRange("deepslateCoalVeinsize", 14, 0, 50);
        DEEPSLATE_COAL_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk in deepslate").defineInRange("deepslateCoalChunkAmount", 10, 0, 50);

        NETHER_GOLD_ORE_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of nether gold ore").defineInRange("netherGoldVeinsize", 5, 0, 50);
        NETHER_GOLD_ORE_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk").defineInRange("netherGoldChunkAmount", 10, 0, 50);
        NETHER_QUARTZ_ORE_VEINSIZE = COMMON_BUILDER.comment("Default veinsize of nether quartz ore").defineInRange("netherQuartzVeinsize", 10, 0, 50);
        NETHER_QUARTZ_ORE_AMOUNT = COMMON_BUILDER.comment("Default maximum amount of generations per chunk").defineInRange("netherQuartzChunkAmount", 16, 0, 50);
    }
}
