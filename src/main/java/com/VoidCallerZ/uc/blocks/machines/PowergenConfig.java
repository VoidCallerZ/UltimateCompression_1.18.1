package com.VoidCallerZ.uc.blocks.machines;

import net.minecraftforge.common.ForgeConfigSpec;

public class PowergenConfig
{
    public static ForgeConfigSpec.IntValue POWERGEN_CAPACITY;// = 50000; // Max capacity
    public static ForgeConfigSpec.IntValue POWERGEN_GENERATE;// = 60;    // Generation per tick
    public static ForgeConfigSpec.IntValue POWERGEN_SEND;// = 200;       // Power to send out per tick

    public static void registerServerConfig(ForgeConfigSpec.Builder SERVER_BUILDER)
    {
        SERVER_BUILDER.comment("Settings for the power generator").push("powergen");

        POWERGEN_CAPACITY = SERVER_BUILDER.comment("Maximum amount of energy stored").defineInRange("powergenCapacity", 50000, 1, Integer.MAX_VALUE);
        POWERGEN_GENERATE = SERVER_BUILDER.comment("Maximum amount of energy generated").defineInRange("powergenGenerate", 60, 1, Integer.MAX_VALUE);
        POWERGEN_SEND = SERVER_BUILDER.comment("Maximum amount of energy transferred").defineInRange("powergenSend", 200, 1, Integer.MAX_VALUE);

        SERVER_BUILDER.pop();
    }
}
