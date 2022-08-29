package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.dataGen.providers.BaseBlockStateProvider;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ucBlockStates extends BaseBlockStateProvider
{
    public ucBlockStates(DataGenerator gen, ExistingFileHelper helper)
    {
        super(gen, UltimateCompression.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        registerIronCompressor();
        registerCompressor(BlockRegistration.GOLDEN_COMPRESSOR.get(), "golden_compressor", "gold");
        registerCompressor(BlockRegistration.DIAMOND_COMPRESSOR.get(), "diamond_compressor", "diamond");
        registerCompressor(BlockRegistration.NETHERITE_COMPRESSOR.get(), "netherite_compressor", "netherite");

        registerSculkCatalyst();

        //Ores
        singleTextureBlock(BlockRegistration.COMPRESSED_IRON_ORE.get(), "compressed_iron_ore", "block/compressed/ores/compressed_iron_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_GOLD_ORE.get(), "compressed_gold_ore", "block/compressed/ores/compressed_gold_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_DIAMOND_ORE.get(), "compressed_diamond_ore", "block/compressed/ores/compressed_diamond_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_COPPER_ORE.get(), "compressed_copper_ore", "block/compressed/ores/compressed_copper_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_COAL_ORE.get(), "compressed_coal_ore", "block/compressed/ores/compressed_coal_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_EMERALD_ORE.get(), "compressed_emerald_ore", "block/compressed/ores/compressed_emerald_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_LAPIS_ORE.get(), "compressed_lapis_ore", "block/compressed/ores/compressed_lapis_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_REDSTONE_ORE.get(), "compressed_redstone_ore", "block/compressed/ores/compressed_redstone_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_NETHER_GOLD_ORE.get(), "compressed_nether_gold_ore", "block/compressed/ores/compressed_nether_gold_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_NETHER_QUARTZ_ORE.get(), "compressed_nether_quartz_ore", "block/compressed/ores/compressed_nether_quartz_ore");

        //Deepslate Ores
        singleTextureBlock(BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get(), "compressed_deepslate_iron_ore", "block/compressed/ores/compressed_deepslate_iron_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get(), "compressed_deepslate_gold_ore", "block/compressed/ores/compressed_deepslate_gold_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(), "compressed_deepslate_diamond_ore", "block/compressed/ores/compressed_deepslate_diamond_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get(), "compressed_deepslate_copper_ore", "block/compressed/ores/compressed_deepslate_copper_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get(), "compressed_deepslate_coal_ore", "block/compressed/ores/compressed_deepslate_coal_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(), "compressed_deepslate_emerald_ore", "block/compressed/ores/compressed_deepslate_emerald_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(), "compressed_deepslate_lapis_ore", "block/compressed/ores/compressed_deepslate_lapis_ore");
        singleTextureBlock(BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(), "compressed_deepslate_redstone_ore", "block/compressed/ores/compressed_deepslate_redstone_ore");

        //Ingot Blocks
        singleTextureBlock(BlockRegistration.COMPRESSED_IRON_BLOCK.get(), "compressed_iron_block", "block/compressed/materials/compressed_iron_block");
        singleTextureBlock(BlockRegistration.COMPRESSED_GOLD_BLOCK.get(), "compressed_gold_block", "block/compressed/materials/compressed_gold_block");
        singleTextureBlock(BlockRegistration.COMPRESSED_DIAMOND_BLOCK.get(), "compressed_diamond_block", "block/compressed/materials/compressed_diamond_block");
        singleTextureBlock(BlockRegistration.COMPRESSED_COPPER_BLOCK.get(), "compressed_copper_block", "block/compressed/materials/compressed_copper_block");
        singleTextureBlock(BlockRegistration.COMPRESSED_COAL_BLOCK.get(), "compressed_coal_block", "block/compressed/materials/compressed_coal_block");
        singleTextureBlock(BlockRegistration.COMPRESSED_EMERALD_BLOCK.get(), "compressed_emerald_block", "block/compressed/materials/compressed_emerald_block");
        singleTextureBlock(BlockRegistration.COMPRESSED_LAPIS_BLOCK.get(), "compressed_lapis_block", "block/compressed/materials/compressed_lapis_block");
        singleTextureBlock(BlockRegistration.COMPRESSED_REDSTONE_BLOCK.get(), "compressed_redstone_block", "block/compressed/materials/compressed_redstone_block");
        singleTextureBlock(BlockRegistration.COMPRESSED_NETHERITE_BLOCK.get(), "compressed_netherite_block", "block/compressed/materials/compressed_netherite_block");

        //Raw Blocks
        singleTextureBlock(BlockRegistration.COMPRESSED_RAW_IRON_BLOCK.get(), "compressed_raw_iron_block", "block/compressed/materials/compressed_raw_iron_block");
        singleTextureBlock(BlockRegistration.COMPRESSED_RAW_GOLD_BLOCK.get(), "compressed_raw_gold_block", "block/compressed/materials/compressed_raw_gold_block");
        singleTextureBlock(BlockRegistration.COMPRESSED_RAW_COPPER_BLOCK.get(), "compressed_raw_copper_block", "block/compressed/materials/compressed_raw_copper_block");

        //Basic Blocks
        singleTextureBlock(BlockRegistration.COMPRESSED_ANDESITE.get(), "compressed_andesite", "block/compressed/basic/compressed_andesite");
        singleTextureBlock(BlockRegistration.COMPRESSED_CALCITE.get(), "compressed_calcite", "block/compressed/basic/compressed_calcite");
        singleTextureBlock(BlockRegistration.COMPRESSED_COBBLED_DEEPSLATE.get(), "compressed_cobbled_deepslate", "block/compressed/basic/compressed_cobbled_deepslate");
        singleTextureBlock(BlockRegistration.COMPRESSED_COBBLESTONE.get(), "compressed_cobblestone", "block/compressed/basic/compressed_cobblestone");
        singleTextureBlock(BlockRegistration.COMPRESSED_DEEPSLATE.get(), "compressed_deepslate", "block/compressed/basic/compressed_deepslate");
        singleTextureBlock(BlockRegistration.COMPRESSED_DIORITE.get(), "compressed_diorite", "block/compressed/basic/compressed_diorite");
        singleTextureBlock(BlockRegistration.COMPRESSED_DIRT.get(), "compressed_dirt", "block/compressed/basic/compressed_dirt");
        singleTextureBlock(BlockRegistration.COMPRESSED_GRANITE.get(), "compressed_granite", "block/compressed/basic/compressed_granite");
        singleTextureBlock(BlockRegistration.COMPRESSED_GRAVEL.get(), "compressed_gravel", "block/compressed/basic/compressed_gravel");
        singleTextureBlock(BlockRegistration.COMPRESSED_NETHERRACK.get(), "compressed_netherrack", "block/compressed/basic/compressed_netherrack");
        singleTextureBlock(BlockRegistration.COMPRESSED_RED_SAND.get(), "compressed_red_sand", "block/compressed/basic/compressed_red_sand");
        singleTextureBlock(BlockRegistration.COMPRESSED_SAND.get(), "compressed_sand", "block/compressed/basic/compressed_sand");
        singleTextureBlock(BlockRegistration.COMPRESSED_STONE.get(), "compressed_stone", "block/compressed/basic/compressed_stone");
        singleTextureBlock(BlockRegistration.COMPRESSED_TUFF.get(), "compressed_tuff", "block/compressed/basic/compressed_tuff");
        singleTextureBlock(BlockRegistration.COMPRESSED_CLAY.get(), "compressed_clay", "block/compressed/basic/compressed_clay");
        singleTextureBlock(BlockRegistration.COMPRESSED_MOSSY_COBBLESTONE.get(), "compressed_mossy_cobblestone", "block/compressed/basic/compressed_mossy_cobblestone");

        //Polished Blocks
        singleTextureBlock(BlockRegistration.COMPRESSED_POLISHED_ANDESITE.get(), "compressed_polished_andesite", "block/compressed/basic/polished/compressed_polished_andesite");
        compressedPillarBlock(BlockRegistration.COMPRESSED_POLISHED_BASALT.get(), modLoc("block/compressed/basic/polished/compressed_polished_basalt"));
        singleTextureBlock(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE.get(), "compressed_polished_blackstone", "block/compressed/basic/polished/compressed_polished_blackstone");
        singleTextureBlock(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get(), "compressed_polished_blackstone_bricks", "block/compressed/basic/polished/compressed_polished_blackstone_bricks");
        singleTextureBlock(BlockRegistration.COMPRESSED_POLISHED_DEEPSLATE.get(), "compressed_polished_deepslate", "block/compressed/basic/polished/compressed_polished_deepslate");
        singleTextureBlock(BlockRegistration.COMPRESSED_POLISHED_DIORITE.get(), "compressed_polished_diorite", "block/compressed/basic/polished/compressed_polished_diorite");
        singleTextureBlock(BlockRegistration.COMPRESSED_POLISHED_GRANITE.get(), "compressed_polished_granite", "block/compressed/basic/polished/compressed_polished_granite");

        //Smooth Blocks
        singleTextureBlock(BlockRegistration.COMPRESSED_SMOOTH_BASALT.get(), "compressed_smooth_basalt", "block/compressed/basic/smooth/compressed_smooth_basalt");
        singleTextureBlock(BlockRegistration.COMPRESSED_SMOOTH_STONE.get(), "compressed_smooth_stone", "block/compressed/basic/smooth/compressed_smooth_stone");

        //Stone Bricks
        singleTextureBlock(BlockRegistration.COMPRESSED_CHISELED_STONE_BRICKS.get(), "compressed_chiseled_stone_bricks", "block/compressed/basic/stone_bricks/compressed_chiseled_stone_bricks");
        singleTextureBlock(BlockRegistration.COMPRESSED_CRACKED_STONE_BRICKS.get(), "compressed_cracked_stone_bricks", "block/compressed/basic/stone_bricks/compressed_cracked_stone_bricks");
        singleTextureBlock(BlockRegistration.COMPRESSED_MOSSY_STONE_BRICKS.get(), "compressed_mossy_stone_bricks", "block/compressed/basic/stone_bricks/compressed_mossy_stone_bricks");
        singleTextureBlock(BlockRegistration.COMPRESSED_STONE_BRICKS.get(), "compressed_stone_bricks", "block/compressed/basic/stone_bricks/compressed_stone_bricks");

        //Sandstone
        singleTextureBlock(BlockRegistration.COMPRESSED_CHISELED_RED_SANDSTONE.get(), "compressed_chiseled_red_sandstone", "block/compressed/basic/sandstone/compressed_chiseled_red_sandstone");
        singleTextureBlock(BlockRegistration.COMPRESSED_CHISELED_SANDSTONE.get(), "compressed_chiseled_sandstone", "block/compressed/basic/sandstone/compressed_chiseled_sandstone");
        singleTextureBlock(BlockRegistration.COMPRESSED_CUT_RED_SANDSTONE.get(), "compressed_cut_red_sandstone", "block/compressed/basic/sandstone/compressed_cut_red_sandstone");
        singleTextureBlock(BlockRegistration.COMPRESSED_CUT_SANDSTONE.get(), "compressed_cut_sandstone", "block/compressed/basic/sandstone/compressed_cut_sandstone");
        singleTextureBlock(BlockRegistration.COMPRESSED_RED_SANDSTONE.get(), "compressed_red_sandstone", "block/compressed/basic/sandstone/compressed_red_sandstone");
        singleTextureBlock(BlockRegistration.COMPRESSED_SANDSTONE.get(), "compressed_sandstone", "block/compressed/basic/sandstone/compressed_sandstone");

        //Nether Blocks
        singleTextureBlock(BlockRegistration.COMPRESSED_NETHER_QUARTZ_BLOCK.get(), "compressed_nether_quartz_block", "block/compressed/nether/compressed_quartz_block_side");
        compressedPillarBlock(BlockRegistration.COMPRESSED_BASALT.get(), modLoc("block/compressed/nether/compressed_basalt"));
        compressedPillarBlock(BlockRegistration.COMPRESSED_BLACKSTONE.get(), modLoc("block/compressed/nether/compressed_blackstone"));
        singleTextureBlock(BlockRegistration.COMPRESSED_CHISELED_POLISHED_BLACKSTONE.get(), "compressed_chiseled_polished_blackstone", "block/compressed/nether/compressed_chiseled_polished_blackstone");
        singleTextureBlock(BlockRegistration.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.get(), "compressed_cracked_polished_blackstone_bricks", "block/compressed/nether/compressed_cracked_polished_blackstone_bricks");
        singleTextureBlock(BlockRegistration.COMPRESSED_GILDED_BLACKSTONE.get(), "compressed_gilded_blackstone", "block/compressed/nether/compressed_gilded_blackstone");
        singleTextureBlock(BlockRegistration.COMPRESSED_GLOWSTONE.get(), "compressed_glowstone", "block/compressed/nether/compressed_glowstone");
        singleTextureBlock(BlockRegistration.COMPRESSED_MAGMA.get(), "compressed_magma", "block/compressed/nether/compressed_magma");
        singleTextureBlock(BlockRegistration.COMPRESSED_SOUL_SAND.get(), "compressed_soul_sand", "block/compressed/nether/compressed_soul_sand");
        singleTextureBlock(BlockRegistration.COMPRESSED_SOUL_SOIL.get(), "compressed_soul_soil", "block/compressed/nether/compressed_soul_soil");

        //Logs
        compressedPillarBlock(BlockRegistration.COMPRESSED_ACACIA_LOG.get(), modLoc("block/compressed/logs/compressed_acacia_log"));
        compressedPillarBlock(BlockRegistration.COMPRESSED_BIRCH_LOG.get(), modLoc("block/compressed/logs/compressed_birch_log"));
        compressedPillarBlock(BlockRegistration.COMPRESSED_DARK_OAK_LOG.get(), modLoc("block/compressed/logs/compressed_dark_oak_log"));
        compressedPillarBlock(BlockRegistration.COMPRESSED_JUNGLE_LOG.get(), modLoc("block/compressed/logs/compressed_jungle_log"));
        compressedPillarBlock(BlockRegistration.COMPRESSED_OAK_LOG.get(), modLoc("block/compressed/logs/compressed_oak_log"));
        compressedPillarBlock(BlockRegistration.COMPRESSED_SPRUCE_LOG.get(), modLoc("block/compressed/logs/compressed_spruce_log"));
        compressedPillarBlock(BlockRegistration.COMPRESSED_CRIMSON_STEM.get(), modLoc("block/compressed/logs/compressed_crimson_stem"));
        compressedPillarBlock(BlockRegistration.COMPRESSED_WARPED_STEM.get(), modLoc("block/compressed/logs/compressed_warped_stem"));
        compressedPillarBlock(BlockRegistration.COMPRESSED_MANGROVE_LOG.get(), modLoc("block/compressed/logs/compressed_mangrove_log"));
        compressedPillarBlock(BlockRegistration.COMPRESSED_MANGROVE_ROOTS.get(), modLoc("block/compressed/logs/compressed_mangrove_roots"));

        //Planks
        singleTextureBlock(BlockRegistration.COMPRESSED_ACACIA_PLANKS.get(), "compressed_acacia_planks", "block/compressed/planks/compressed_acacia_planks");
        singleTextureBlock(BlockRegistration.COMPRESSED_BIRCH_PLANKS.get(), "compressed_birch_planks", "block/compressed/planks/compressed_birch_planks");
        singleTextureBlock(BlockRegistration.COMPRESSED_DARK_OAK_PLANKS.get(), "compressed_dark_oak_planks", "block/compressed/planks/compressed_dark_oak_planks");
        singleTextureBlock(BlockRegistration.COMPRESSED_JUNGLE_PLANKS.get(), "compressed_jungle_planks", "block/compressed/planks/compressed_jungle_planks");
        singleTextureBlock(BlockRegistration.COMPRESSED_OAK_PLANKS.get(), "compressed_oak_planks", "block/compressed/planks/compressed_oak_planks");
        singleTextureBlock(BlockRegistration.COMPRESSED_SPRUCE_PLANKS.get(), "compressed_spruce_planks", "block/compressed/planks/compressed_spruce_planks");
        singleTextureBlock(BlockRegistration.COMPRESSED_CRIMSON_PLANKS.get(), "compressed_crimson_planks", "block/compressed/planks/compressed_crimson_planks");
        singleTextureBlock(BlockRegistration.COMPRESSED_WARPED_PLANKS.get(), "compressed_warped_planks", "block/compressed/planks/compressed_warped_planks");
        singleTextureBlock(BlockRegistration.COMPRESSED_MANGROVE_PLANKS.get(), "compressed_mangrove_planks", "block/compressed/planks/compressed_mangrove_planks");

        //Wool
        singleTextureBlock(BlockRegistration.COMPRESSED_BLACK_WOOL.get(), "compressed_black_wool", "block/compressed/wool/compressed_black_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_BLUE_WOOL.get(), "compressed_blue_wool", "block/compressed/wool/compressed_blue_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_BROWN_WOOL.get(), "compressed_brown_wool", "block/compressed/wool/compressed_brown_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_CYAN_WOOL.get(), "compressed_cyan_wool", "block/compressed/wool/compressed_cyan_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_GRAY_WOOL.get(), "compressed_gray_wool", "block/compressed/wool/compressed_gray_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_GREEN_WOOL.get(), "compressed_green_wool", "block/compressed/wool/compressed_green_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_LIGHT_BLUE_WOOL.get(), "compressed_light_blue_wool", "block/compressed/wool/compressed_light_blue_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_LIGHT_GRAY_WOOL.get(), "compressed_light_gray_wool", "block/compressed/wool/compressed_light_gray_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_LIME_WOOL.get(), "compressed_lime_wool", "block/compressed/wool/compressed_lime_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_MAGENTA_WOOL.get(), "compressed_magenta_wool", "block/compressed/wool/compressed_magenta_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_ORANGE_WOOL.get(), "compressed_orange_wool", "block/compressed/wool/compressed_orange_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_PINK_WOOL.get(), "compressed_pink_wool", "block/compressed/wool/compressed_pink_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_PURPLE_WOOL.get(), "compressed_purple_wool", "block/compressed/wool/compressed_purple_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_RED_WOOL.get(), "compressed_red_wool", "block/compressed/wool/compressed_red_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_WHITE_WOOL.get(), "compressed_white_wool", "block/compressed/wool/compressed_white_wool");
        singleTextureBlock(BlockRegistration.COMPRESSED_YELLOW_WOOL.get(), "compressed_yellow_wool", "block/compressed/wool/compressed_yellow_wool");

        //Concrete
        singleTextureBlock(BlockRegistration.COMPRESSED_BLACK_CONCRETE.get(), "compressed_black_concrete", "block/compressed/concrete/compressed_black_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_BLUE_CONCRETE.get(), "compressed_blue_concrete", "block/compressed/concrete/compressed_blue_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_BROWN_CONCRETE.get(), "compressed_brown_concrete", "block/compressed/concrete/compressed_brown_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_CYAN_CONCRETE.get(), "compressed_cyan_concrete", "block/compressed/concrete/compressed_cyan_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_GRAY_CONCRETE.get(), "compressed_gray_concrete", "block/compressed/concrete/compressed_gray_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_GREEN_CONCRETE.get(), "compressed_green_concrete", "block/compressed/concrete/compressed_green_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE.get(), "compressed_light_blue_concrete", "block/compressed/concrete/compressed_light_blue_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE.get(), "compressed_light_gray_concrete", "block/compressed/concrete/compressed_light_gray_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_LIME_CONCRETE.get(), "compressed_lime_concrete", "block/compressed/concrete/compressed_lime_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_MAGENTA_CONCRETE.get(), "compressed_magenta_concrete", "block/compressed/concrete/compressed_magenta_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_ORANGE_CONCRETE.get(), "compressed_orange_concrete", "block/compressed/concrete/compressed_orange_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_PINK_CONCRETE.get(), "compressed_pink_concrete", "block/compressed/concrete/compressed_pink_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_PURPLE_CONCRETE.get(), "compressed_purple_concrete", "block/compressed/concrete/compressed_purple_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_RED_CONCRETE.get(), "compressed_red_concrete", "block/compressed/concrete/compressed_red_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_WHITE_CONCRETE.get(), "compressed_white_concrete", "block/compressed/concrete/compressed_white_concrete");
        singleTextureBlock(BlockRegistration.COMPRESSED_YELLOW_CONCRETE.get(), "compressed_yellow_concrete", "block/compressed/concrete/compressed_yellow_concrete");

        //Concrete Powder
        singleTextureBlock(BlockRegistration.COMPRESSED_BLACK_CONCRETE_POWDER.get(), "compressed_black_concrete_powder", "block/compressed/concrete/compressed_black_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_BLUE_CONCRETE_POWDER.get(), "compressed_blue_concrete_powder", "block/compressed/concrete/compressed_blue_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_BROWN_CONCRETE_POWDER.get(), "compressed_brown_concrete_powder", "block/compressed/concrete/compressed_brown_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_CYAN_CONCRETE_POWDER.get(), "compressed_cyan_concrete_powder", "block/compressed/concrete/compressed_cyan_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_GRAY_CONCRETE_POWDER.get(), "compressed_gray_concrete_powder", "block/compressed/concrete/compressed_gray_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_GREEN_CONCRETE_POWDER.get(), "compressed_green_concrete_powder", "block/compressed/concrete/compressed_green_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER.get(), "compressed_light_blue_concrete_powder", "block/compressed/concrete/compressed_light_blue_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER.get(), "compressed_light_gray_concrete_powder", "block/compressed/concrete/compressed_light_gray_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_LIME_CONCRETE_POWDER.get(), "compressed_lime_concrete_powder", "block/compressed/concrete/compressed_lime_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_MAGENTA_CONCRETE_POWDER.get(), "compressed_magenta_concrete_powder", "block/compressed/concrete/compressed_magenta_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_ORANGE_CONCRETE_POWDER.get(), "compressed_orange_concrete_powder", "block/compressed/concrete/compressed_orange_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_PINK_CONCRETE_POWDER.get(), "compressed_pink_concrete_powder", "block/compressed/concrete/compressed_pink_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_PURPLE_CONCRETE_POWDER.get(), "compressed_purple_concrete_powder", "block/compressed/concrete/compressed_purple_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_RED_CONCRETE_POWDER.get(), "compressed_red_concrete_powder", "block/compressed/concrete/compressed_red_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_WHITE_CONCRETE_POWDER.get(), "compressed_white_concrete_powder", "block/compressed/concrete/compressed_white_concrete_powder");
        singleTextureBlock(BlockRegistration.COMPRESSED_YELLOW_CONCRETE_POWDER.get(), "compressed_yellow_concrete_powder", "block/compressed/concrete/compressed_yellow_concrete_powder");

        //Snow Blocks
        singleTextureBlock(BlockRegistration.COMPRESSED_SNOW_BLOCK.get(), "compressed_snow_block", "block/compressed/basic/snow/compressed_snow");
        singleTextureBlock(BlockRegistration.COMPRESSED_POWDER_SNOW.get(), "compressed_powder_snow", "block/compressed/basic/snow/compressed_powder_snow");

        //Sculk Blocks
        singleTextureBlock(BlockRegistration.COMPRESSED_SCULK.get(), "compressed_sculk", "block/compressed/sculk/compressed_sculk");

        //Glass Blocks
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_GLASS.get(), "compressed_glass", "block/compressed/glass/compressed_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS.get(), "compressed_black_stained_glass", "block/compressed/glass/compressed_black_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS.get(), "compressed_blue_stained_glass", "block/compressed/glass/compressed_blue_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS.get(), "compressed_brown_stained_glass", "block/compressed/glass/compressed_brown_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS.get(), "compressed_cyan_stained_glass", "block/compressed/glass/compressed_cyan_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS.get(), "compressed_gray_stained_glass", "block/compressed/glass/compressed_gray_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS.get(), "compressed_green_stained_glass", "block/compressed/glass/compressed_green_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS.get(), "compressed_light_blue_stained_glass", "block/compressed/glass/compressed_light_blue_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS.get(), "compressed_light_gray_stained_glass", "block/compressed/glass/compressed_light_gray_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS.get(), "compressed_lime_stained_glass", "block/compressed/glass/compressed_lime_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS.get(), "compressed_magenta_stained_glass", "block/compressed/glass/compressed_magenta_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS.get(), "compressed_orange_stained_glass", "block/compressed/glass/compressed_orange_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS.get(), "compressed_pink_stained_glass", "block/compressed/glass/compressed_pink_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS.get(), "compressed_purple_stained_glass", "block/compressed/glass/compressed_purple_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_RED_STAINED_GLASS.get(), "compressed_red_stained_glass", "block/compressed/glass/compressed_red_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS.get(), "compressed_white_stained_glass", "block/compressed/glass/compressed_white_stained_glass", "translucent");
        singleTextureBlockWithRenderType(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS.get(), "compressed_yellow_stained_glass", "block/compressed/glass/compressed_yellow_stained_glass", "translucent");

        //Glass Panes
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_GLASS_PANE.get(), "compressed_glass_pane", "block/compressed/glass/compressed_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS_PANE.get(), "compressed_black_stained_glass_pane", "block/compressed/glass/compressed_black_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS_PANE.get(), "compressed_blue_stained_glass_pane", "block/compressed/glass/compressed_blue_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS_PANE.get(), "compressed_brown_stained_glass_pane", "block/compressed/glass/compressed_brown_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS_PANE.get(), "compressed_cyan_stained_glass_pane", "block/compressed/glass/compressed_cyan_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS_PANE.get(), "compressed_gray_stained_glass_pane", "block/compressed/glass/compressed_gray_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS_PANE.get(), "compressed_green_stained_glass_pane", "block/compressed/glass/compressed_green_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS_PANE.get(), "compressed_light_blue_stained_glass_pane", "block/compressed/glass/compressed_light_blue_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS_PANE.get(), "compressed_light_gray_stained_glass_pane", "block/compressed/glass/compressed_light_gray_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS_PANE.get(), "compressed_lime_stained_glass_pane", "block/compressed/glass/compressed_lime_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS_PANE.get(), "compressed_magenta_stained_glass_pane", "block/compressed/glass/compressed_magenta_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS_PANE.get(), "compressed_orange_stained_glass_pane", "block/compressed/glass/compressed_orange_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS_PANE.get(), "compressed_pink_stained_glass_pane", "block/compressed/glass/compressed_pink_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS_PANE.get(), "compressed_purple_stained_glass_pane", "block/compressed/glass/compressed_purple_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_RED_STAINED_GLASS_PANE.get(), "compressed_red_stained_glass_pane", "block/compressed/glass/compressed_red_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS_PANE.get(), "compressed_white_stained_glass_pane", "block/compressed/glass/compressed_white_stained_glass", "translucent");
        paneBlockWithRenderType(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS_PANE.get(), "compressed_yellow_stained_glass_pane", "block/compressed/glass/compressed_yellow_stained_glass", "translucent");

        //Obsidian
        singleTextureBlock(BlockRegistration.COMPRESSED_OBSIDIAN.get(), "compressed_obsidian", "block/compressed/basic/compressed_obsidian");
    }

    private void registerIronCompressor()
    {
        ResourceLocation FRONT_BACK = modLoc("block/compressor/iron/front_back");
        ResourceLocation FRONT_BACK_LIT = modLoc("block/compressor/iron/front_back_lit");
        ResourceLocation SIDE = modLoc("block/compressor/iron/side");
        ResourceLocation TOP_BOTTOM = modLoc("block/compressor/iron/top_bottom");

        ModelFile blockOff = models().cube("iron_compressor", TOP_BOTTOM, TOP_BOTTOM, FRONT_BACK, FRONT_BACK, SIDE, SIDE);
        ModelFile blockOn = models().cube("iron_compressor_lit", TOP_BOTTOM, TOP_BOTTOM, FRONT_BACK, FRONT_BACK_LIT, SIDE, SIDE);

        compressorBlockWithLitState(BlockRegistration.IRON_COMPRESSOR.get(), blockOff, blockOn);
    }

    private void registerCompressor(Block block, String name, String materialName)
    {
        ResourceLocation BACK = modLoc("block/compressor/" + materialName + "/back");
        ResourceLocation FRONT = modLoc("block/compressor/" + materialName + "/front");
        ResourceLocation FRONT_LIT = modLoc("block/compressor/" + materialName + "/front_lit");
        ResourceLocation SIDE = modLoc("block/compressor/" + materialName + "/side");

        ModelFile blockOff = models().cube(name, SIDE, SIDE, BACK, FRONT, SIDE, SIDE);
        ModelFile blockOn = models().cube(name + "_lit", SIDE, SIDE, BACK, FRONT_LIT, SIDE, SIDE);

        compressorBlockWithLitState(block, blockOff, blockOn);
    }

    private void registerSculkCatalyst()
    {
        String base = "block/compressed/sculk/compressed_sculk_catalyst_";
        ResourceLocation TOP = modLoc(base + "top");
        ResourceLocation SIDE = modLoc(base + "side");
        ResourceLocation BOTTOM = modLoc(base + "bottom");

        horizontalBlock(BlockRegistration.COMPRESSED_SCULK_CATALYST.get(), models().cube("compressed_sculk_catalyst", BOTTOM, TOP, SIDE, SIDE, SIDE, SIDE));
    }
}
