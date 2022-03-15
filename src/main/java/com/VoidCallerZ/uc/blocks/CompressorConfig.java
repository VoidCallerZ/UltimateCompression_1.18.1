package com.VoidCallerZ.uc.blocks;

import net.minecraftforge.common.ForgeConfigSpec;

public class CompressorConfig
{
    public static ForgeConfigSpec.IntValue ENERGY_CAPACITY;// = 10000;
    public static ForgeConfigSpec.IntValue ENERGY_RECEIVE;// = 200;
    public static ForgeConfigSpec.IntValue ENERGY_COMPRESS_TICK;// = 500;

    public static void registerServerConfig(ForgeConfigSpec.Builder SERVER_BUILDER)
    {
        SERVER_BUILDER.comment("Settings for the compressor").push("compressor");

        ENERGY_CAPACITY = SERVER_BUILDER.comment("Maximum amount of energy stored").defineInRange("energyCapacity", 10000, 1, Integer.MAX_VALUE);
        ENERGY_RECEIVE = SERVER_BUILDER.comment("Maximum amount of energy recieved per tick").defineInRange("energyReceive", 200, 1, Integer.MAX_VALUE);
        ENERGY_COMPRESS_TICK = SERVER_BUILDER.comment("Amount of energy used for 1 compression job").defineInRange("energyCompressTick", 500, 1, Integer.MAX_VALUE);

        SERVER_BUILDER.pop();
    }
}
