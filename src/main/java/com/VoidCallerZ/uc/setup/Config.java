package com.VoidCallerZ.uc.setup;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

@Mod.EventBusSubscriber
public class Config
{
    private static boolean run = true;

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_WORLD = "world";
    public static final String CATEGORY_COMPRESSOR = "compressors";
    public static final String CATEGORY_JEI = "jei";

    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.BooleanValue enableWorldGeneration;
    public static ForgeConfigSpec.BooleanValue enableOverworldGeneration;
    public static ForgeConfigSpec.BooleanValue enableNetherGeneration;

    public static ForgeConfigSpec.IntValue ironCompressorSpeed;
    public static ForgeConfigSpec.IntValue goldCompressorSpeed;
    public static ForgeConfigSpec.IntValue diamondCompressorSpeed;
    public static ForgeConfigSpec.IntValue netheriteCompressorSpeed;

    static
    {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        CLIENT_BUILDER.comment("Settings").push(CATEGORY_GENERAL);
        CLIENT_BUILDER.pop();

        CLIENT_BUILDER.comment("World Settings - Currently not in use as Forge has made it impossible to use").push(CATEGORY_WORLD);

        setupWorldGenerationConfig(COMMON_BUILDER, CLIENT_BUILDER);

        CLIENT_BUILDER.pop();

        CLIENT_BUILDER.comment("Compressor Settings").push(CATEGORY_COMPRESSOR);

        setupCompressorConfig(COMMON_BUILDER, CLIENT_BUILDER);

        CLIENT_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }

    private static void setupWorldGenerationConfig(ForgeConfigSpec.Builder COMMON_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER)
    {
        enableWorldGeneration = COMMON_BUILDER.comment("Option to disable or enable compressed ore generation anywhere.\n Default: true")
                .define("compressed_ore.generation", false);
        enableOverworldGeneration = COMMON_BUILDER.comment("Option to disable or enable compressed ore generation in the overworld.\n Default: true")
                .define("compressed_ore.overworldgeneration", true);
        enableNetherGeneration = COMMON_BUILDER.comment("Option to disable or enable compressed ore generation in the nether.\n Default: true")
                .define("compressed_ore.nethergeneration", true);
    }

    private static void setupCompressorConfig(ForgeConfigSpec.Builder COMMON_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER)
    {
        ironCompressorSpeed = CLIENT_BUILDER.comment("Number of ticks to complete one compression operation.\n 20 ticks is equal to 1 second.\n Default: 100")
                .defineInRange("iron_compressor.speed", 100, 1, 72000);
        goldCompressorSpeed = CLIENT_BUILDER.comment("Number of ticks to complete one compression operation.\n 20 ticks is equal to 1 second.\n Default: 70")
                .defineInRange("gold_compressor.speed", 70, 1, 72000);
        diamondCompressorSpeed = CLIENT_BUILDER.comment("Number of ticks to complete one compression operation.\n 20 ticks is equal to 1 second.\n Default: 20")
                .defineInRange("diamond_compressor.speed", 20, 1, 72000);
        netheriteCompressorSpeed = CLIENT_BUILDER.comment("Number of ticks to complete one compression operation.\n 20 ticks is equal to 1 second.\n Default: 10")
                .defineInRange("netherite_compressor.speed", 10, 1, 72000);
    }

    public static void loadConfig(ForgeConfigSpec spec, Path path)
    {
        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .sync()
                .autosave()
                .autoreload()
                .writingMode(WritingMode.REPLACE)
                .build();

        configData.load();
        spec.setConfig(configData);
    }

//    @SubscribeEvent
//    public static void onWorldLoad(final LevelEvent event)
//    {
//        Config.loadConfig(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("ultimatecompression-client.toml"));
//        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("ultimatecompression.toml"));
//        run = true;
//    }
}
