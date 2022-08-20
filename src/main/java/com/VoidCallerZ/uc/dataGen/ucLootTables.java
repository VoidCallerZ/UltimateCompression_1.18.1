package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.dataGen.providers.BaseLootTableProvider;
import com.VoidCallerZ.uc.registration.ItemRegistration;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Items;

public class ucLootTables extends BaseLootTableProvider
{
    public ucLootTables(DataGenerator dataGeneratorIn) {super(dataGeneratorIn);}

    @Override
    protected void addTables()
    {
        //Ores
        lootTables.put(BlockRegistration.COMPRESSOR.get(), createSimpleTable("ultimate_compressor", BlockRegistration.COMPRESSOR.get()));
        lootTables.put(BlockRegistration.COMPRESSED_IRON_ORE.get(), createSilkTouchTable("compressed_iron_ore", BlockRegistration.COMPRESSED_IRON_ORE.get(), ItemRegistration.COMPRESSED_RAW_IRON.get(), 1, 1));
        lootTables.put(BlockRegistration.COMPRESSED_GOLD_ORE.get(), createSilkTouchTable("compressed_gold_ore", BlockRegistration.COMPRESSED_GOLD_ORE.get(), ItemRegistration.COMPRESSED_RAW_GOLD.get(), 1, 1));
        lootTables.put(BlockRegistration.COMPRESSED_DIAMOND_ORE.get(), createSilkTouchTable("compressed_diamond_ore", BlockRegistration.COMPRESSED_DIAMOND_ORE.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), 1, 1));
        lootTables.put(BlockRegistration.COMPRESSED_COPPER_ORE.get(), createSilkTouchTable("compressed_copper_ore", BlockRegistration.COMPRESSED_COPPER_ORE.get(), ItemRegistration.COMPRESSED_RAW_COPPER.get(), 1, 3));
        lootTables.put(BlockRegistration.COMPRESSED_COAL_ORE.get(), createSilkTouchTable("compressed_coal_ore", BlockRegistration.COMPRESSED_COAL_ORE.get(), ItemRegistration.COMPRESSED_COAL.get(), 1, 1));
        lootTables.put(BlockRegistration.COMPRESSED_EMERALD_ORE.get(), createSilkTouchTable("compressed_emerald_ore", BlockRegistration.COMPRESSED_EMERALD_ORE.get(), ItemRegistration.COMPRESSED_EMERALD_GEM.get(), 1, 1));
        lootTables.put(BlockRegistration.COMPRESSED_LAPIS_ORE.get(), createSilkTouchTable("compressed_lapis_ore", BlockRegistration.COMPRESSED_LAPIS_ORE.get(), ItemRegistration.COMPRESSED_LAPIS.get(), 1, 1));
        lootTables.put(BlockRegistration.COMPRESSED_REDSTONE_ORE.get(), createSilkTouchTable("compressed_redstone_ore", BlockRegistration.COMPRESSED_REDSTONE_ORE.get(), ItemRegistration.COMPRESSED_REDSTONE.get(), 1, 1));
        lootTables.put(BlockRegistration.COMPRESSED_NETHER_GOLD_ORE.get(), createSilkTouchTable("compressed_nether_gold_ore", BlockRegistration.COMPRESSED_NETHER_GOLD_ORE.get(), ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), 1, 1));
        lootTables.put(BlockRegistration.COMPRESSED_NETHER_QUARTZ_ORE.get(), createSilkTouchTable("compressed_nether_quartz_ore", BlockRegistration.COMPRESSED_NETHER_QUARTZ_ORE.get(), ItemRegistration.COMPRESSED_QUARTZ.get(), 2, 4));

        //Deepslate Ores
        lootTables.put(BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get(), createSilkTouchTable("compressed_deepslate_iron_ore", BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get(), ItemRegistration.COMPRESSED_RAW_IRON.get(), 1, 2));
        lootTables.put(BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get(), createSilkTouchTable("compressed_deepslate_gold_ore", BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get(), ItemRegistration.COMPRESSED_RAW_GOLD.get(), 1, 2));
        lootTables.put(BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(), createSilkTouchTable("compressed_deepslate_diamond_ore", BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), 1, 1));
        lootTables.put(BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get(), createSilkTouchTable("compressed_deepslate_copper_ore", BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get(), ItemRegistration.COMPRESSED_RAW_COPPER.get(), 2, 5));
        lootTables.put(BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get(), createSilkTouchTable("compressed_deepslate_coal_ore", BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get(), ItemRegistration.COMPRESSED_COAL.get(), 1, 2));
        lootTables.put(BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(), createSilkTouchTable("compressed_deepslate_emerald_ore", BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(), ItemRegistration.COMPRESSED_EMERALD_GEM.get(), 1, 2));
        lootTables.put(BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(), createSilkTouchTable("compressed_deepslate_lapis_ore", BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(), ItemRegistration.COMPRESSED_LAPIS.get(), 1, 2));
        lootTables.put(BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(), createSilkTouchTable("compressed_deepslate_redstone_ore", BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(), ItemRegistration.COMPRESSED_REDSTONE.get(), 1, 2));

        //Blocks
        lootTables.put(BlockRegistration.COMPRESSED_IRON_BLOCK.get(), createSimpleTable("compessed_iron_block", BlockRegistration.COMPRESSED_IRON_BLOCK.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GOLD_BLOCK.get(), createSimpleTable("compessed_gold_block", BlockRegistration.COMPRESSED_GOLD_BLOCK.get()));
        lootTables.put(BlockRegistration.COMPRESSED_DIAMOND_BLOCK.get(), createSimpleTable("compessed_diamond_block", BlockRegistration.COMPRESSED_DIAMOND_BLOCK.get()));
        lootTables.put(BlockRegistration.COMPRESSED_COPPER_BLOCK.get(), createSimpleTable("compessed_copper_block", BlockRegistration.COMPRESSED_COPPER_BLOCK.get()));

        //Raw Blocks
        lootTables.put(BlockRegistration.COMPRESSED_RAW_IRON_BLOCK.get(), createSimpleTable("compressed_raw_iron_block", BlockRegistration.COMPRESSED_RAW_IRON_BLOCK.get()));
        lootTables.put(BlockRegistration.COMPRESSED_RAW_GOLD_BLOCK.get(), createSimpleTable("compressed_raw_gold_block", BlockRegistration.COMPRESSED_RAW_GOLD_BLOCK.get()));
        lootTables.put(BlockRegistration.COMPRESSED_RAW_COPPER_BLOCK.get(), createSimpleTable("compressed_raw_copper_block", BlockRegistration.COMPRESSED_RAW_COPPER_BLOCK.get()));

        //Basic Blocks
        lootTables.put(BlockRegistration.COMPRESSED_ANDESITE.get(), createSimpleTable("compressed_andesite", BlockRegistration.COMPRESSED_ANDESITE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CALCITE.get(), createSimpleTable("compressed_calcite", BlockRegistration.COMPRESSED_CALCITE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_COBBLED_DEEPSLATE.get(), createSimpleTable("compressed_cobbled_deepslate", BlockRegistration.COMPRESSED_COBBLED_DEEPSLATE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_COBBLESTONE.get(), createSimpleTable("compressed_cobblestone", BlockRegistration.COMPRESSED_COBBLESTONE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_DEEPSLATE.get(), createSimpleTable("compressed_deepslate", BlockRegistration.COMPRESSED_DEEPSLATE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_DIORITE.get(), createSimpleTable("compressed_diorite", BlockRegistration.COMPRESSED_DIORITE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_DIRT.get(), createSimpleTable("compressed_dirt", BlockRegistration.COMPRESSED_DIRT.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GRANITE.get(), createSimpleTable("compressed_granite", BlockRegistration.COMPRESSED_GRANITE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GRAVEL.get(), createChanceDropTable("compressed_gravel", BlockRegistration.COMPRESSED_GRAVEL.get(), Items.FLINT));
        lootTables.put(BlockRegistration.COMPRESSED_NETHERRACK.get(), createSimpleTable("compressed_netherrack", BlockRegistration.COMPRESSED_NETHERRACK.get()));
        lootTables.put(BlockRegistration.COMPRESSED_RED_SAND.get(), createSimpleTable("compressed_red_sand", BlockRegistration.COMPRESSED_RED_SAND.get()));
        lootTables.put(BlockRegistration.COMPRESSED_SAND.get(), createSimpleTable("compressed_sand", BlockRegistration.COMPRESSED_SAND.get()));
        lootTables.put(BlockRegistration.COMPRESSED_STONE.get(), createSimpleTable("compressed_stone", BlockRegistration.COMPRESSED_STONE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_TUFF.get(), createSimpleTable("compressed_tuff", BlockRegistration.COMPRESSED_TUFF.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CLAY.get(), createSilkTouchTable("compressed_clay", BlockRegistration.COMPRESSED_CLAY.get(), Items.CLAY_BALL, 3, 8));
        lootTables.put(BlockRegistration.COMPRESSED_MOSSY_COBBLESTONE.get(), createSimpleTable("compressed_mossy_cobblestone", BlockRegistration.COMPRESSED_MOSSY_COBBLESTONE.get()));

        //Polished Blocks
        lootTables.put(BlockRegistration.COMPRESSED_POLISHED_ANDESITE.get(), createSimpleTable("compressed_polished_andesite", BlockRegistration.COMPRESSED_POLISHED_ANDESITE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_POLISHED_BASALT.get(), createSimpleTable("compressed_polished_basalt", BlockRegistration.COMPRESSED_POLISHED_BASALT.get()));
        lootTables.put(BlockRegistration.COMPRESSED_POLISHED_DEEPSLATE.get(), createSimpleTable("compressed_polished_deepslate", BlockRegistration.COMPRESSED_POLISHED_DEEPSLATE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE.get(), createSimpleTable("compressed_polished_blackstone", BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get(), createSimpleTable("compressed_polished_blackstone_bricks", BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_POLISHED_DIORITE.get(), createSimpleTable("compressed_polished_diorite", BlockRegistration.COMPRESSED_POLISHED_DIORITE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_POLISHED_GRANITE.get(), createSimpleTable("compressed_polished_granite", BlockRegistration.COMPRESSED_POLISHED_GRANITE.get()));

        //Smooth Blocks
        lootTables.put(BlockRegistration.COMPRESSED_SMOOTH_BASALT.get(), createSimpleTable("compressed_smooth_basalt", BlockRegistration.COMPRESSED_SMOOTH_BASALT.get()));
        lootTables.put(BlockRegistration.COMPRESSED_SMOOTH_STONE.get(), createSimpleTable("compressed_smooth_stone", BlockRegistration.COMPRESSED_SMOOTH_STONE.get()));

        //Stone Bricks
        lootTables.put(BlockRegistration.COMPRESSED_CHISELED_STONE_BRICKS.get(), createSimpleTable("compressed_chiseled_stone_bricks", BlockRegistration.COMPRESSED_CHISELED_STONE_BRICKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CRACKED_STONE_BRICKS.get(), createSimpleTable("compressed_cracked_stone_bricks", BlockRegistration.COMPRESSED_CRACKED_STONE_BRICKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_MOSSY_STONE_BRICKS.get(), createSimpleTable("compressed_mossy_stone_bricks", BlockRegistration.COMPRESSED_MOSSY_STONE_BRICKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_STONE_BRICKS.get(), createSimpleTable("compressed_stone_bricks", BlockRegistration.COMPRESSED_STONE_BRICKS.get()));

        //Sandstone
        lootTables.put(BlockRegistration.COMPRESSED_CHISELED_RED_SANDSTONE.get(), createSimpleTable("compressed_chiseled_red_sandstone", BlockRegistration.COMPRESSED_CHISELED_RED_SANDSTONE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CHISELED_SANDSTONE.get(), createSimpleTable("compressed_chiseled_sandstone", BlockRegistration.COMPRESSED_CHISELED_SANDSTONE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CUT_RED_SANDSTONE.get(), createSimpleTable("compressed_cut_red_sandstone", BlockRegistration.COMPRESSED_CUT_RED_SANDSTONE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CUT_SANDSTONE.get(), createSimpleTable("compressed_cut_sandstone", BlockRegistration.COMPRESSED_CUT_SANDSTONE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_RED_SANDSTONE.get(), createSimpleTable("compressed_red_sandstone", BlockRegistration.COMPRESSED_RED_SANDSTONE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_SANDSTONE.get(), createSimpleTable("compressed_sandstone", BlockRegistration.COMPRESSED_SANDSTONE.get()));

        //Nether Blocks
        lootTables.put(BlockRegistration.COMPRESSED_NETHER_QUARTZ_BLOCK.get(), createSimpleTable("compressed_nether_quartz_block", BlockRegistration.COMPRESSED_NETHER_QUARTZ_BLOCK.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BASALT.get(), createSimpleTable("compressed_basalt", BlockRegistration.COMPRESSED_BASALT.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BLACKSTONE.get(), createSimpleTable("compressed_blackstone", BlockRegistration.COMPRESSED_BLACKSTONE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CHISELED_POLISHED_BLACKSTONE.get(), createSimpleTable("compressed_chiseled_polished_blackstone", BlockRegistration.COMPRESSED_CHISELED_POLISHED_BLACKSTONE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.get(), createSimpleTable("compressed_cracked_polished_blackstone_bricks", BlockRegistration.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GILDED_BLACKSTONE.get(), createSimpleTable("compressed_gilded_blackstone", BlockRegistration.COMPRESSED_GILDED_BLACKSTONE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GLOWSTONE.get(), createSimpleTable("compressed_glowstone", BlockRegistration.COMPRESSED_GLOWSTONE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_MAGMA.get(), createSimpleTable("compressed_magma", BlockRegistration.COMPRESSED_MAGMA.get()));
        lootTables.put(BlockRegistration.COMPRESSED_SOUL_SAND.get(), createSimpleTable("compressed_soul_sand", BlockRegistration.COMPRESSED_SOUL_SAND.get()));
        lootTables.put(BlockRegistration.COMPRESSED_SOUL_SOIL.get(), createSimpleTable("compressed_soul_soil", BlockRegistration.COMPRESSED_SOUL_SOIL.get()));

        //Logs & Planks
        lootTables.put(BlockRegistration.COMPRESSED_ACACIA_LOG.get(), createSimpleTable("compressed_acacia_log", BlockRegistration.COMPRESSED_ACACIA_LOG.get()));
        lootTables.put(BlockRegistration.COMPRESSED_ACACIA_PLANKS.get(), createSimpleTable("compressed_acacia_planks", BlockRegistration.COMPRESSED_ACACIA_PLANKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BIRCH_LOG.get(), createSimpleTable("compressed_birch_log", BlockRegistration.COMPRESSED_BIRCH_LOG.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BIRCH_PLANKS.get(), createSimpleTable("compressed_birch_planks", BlockRegistration.COMPRESSED_BIRCH_PLANKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_DARK_OAK_LOG.get(), createSimpleTable("compressed_dark_oak_log", BlockRegistration.COMPRESSED_DARK_OAK_LOG.get()));
        lootTables.put(BlockRegistration.COMPRESSED_DARK_OAK_PLANKS.get(), createSimpleTable("compressed_dark_oak_planks", BlockRegistration.COMPRESSED_DARK_OAK_PLANKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_JUNGLE_LOG.get(), createSimpleTable("compressed_jungle_log", BlockRegistration.COMPRESSED_JUNGLE_LOG.get()));
        lootTables.put(BlockRegistration.COMPRESSED_JUNGLE_PLANKS.get(), createSimpleTable("compressed_jungle_planks", BlockRegistration.COMPRESSED_JUNGLE_PLANKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_OAK_LOG.get(), createSimpleTable("compressed_oak_log", BlockRegistration.COMPRESSED_OAK_LOG.get()));
        lootTables.put(BlockRegistration.COMPRESSED_OAK_PLANKS.get(), createSimpleTable("compressed_oak_planks", BlockRegistration.COMPRESSED_OAK_PLANKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_SPRUCE_LOG.get(), createSimpleTable("compressed_spruce_log", BlockRegistration.COMPRESSED_SPRUCE_LOG.get()));
        lootTables.put(BlockRegistration.COMPRESSED_SPRUCE_PLANKS.get(), createSimpleTable("compressed_spruce_planks", BlockRegistration.COMPRESSED_SPRUCE_PLANKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CRIMSON_STEM.get(), createSimpleTable("compressed_crimson_stem", BlockRegistration.COMPRESSED_CRIMSON_STEM.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CRIMSON_PLANKS.get(), createSimpleTable("compressed_crimson_planks", BlockRegistration.COMPRESSED_CRIMSON_PLANKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_WARPED_STEM.get(), createSimpleTable("compressed_warped_stem", BlockRegistration.COMPRESSED_WARPED_STEM.get()));
        lootTables.put(BlockRegistration.COMPRESSED_WARPED_PLANKS.get(), createSimpleTable("compressed_warped_planks", BlockRegistration.COMPRESSED_WARPED_PLANKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_MANGROVE_LOG.get(), createSimpleTable("compressed_mangrove_log", BlockRegistration.COMPRESSED_MANGROVE_LOG.get()));
        lootTables.put(BlockRegistration.COMPRESSED_MANGROVE_PLANKS.get(), createSimpleTable("compressed_mangrove_planks", BlockRegistration.COMPRESSED_MANGROVE_PLANKS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_MANGROVE_ROOTS.get(), createSimpleTable("compressed_mangrove_roots", BlockRegistration.COMPRESSED_MANGROVE_ROOTS.get()));

        //Wool
        lootTables.put(BlockRegistration.COMPRESSED_BLACK_WOOL.get(), createSimpleTable("compressed_black_wool", BlockRegistration.COMPRESSED_BLACK_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BLUE_WOOL.get(), createSimpleTable("compressed_blue_wool", BlockRegistration.COMPRESSED_BLUE_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BROWN_WOOL.get(), createSimpleTable("compressed_brown_wool", BlockRegistration.COMPRESSED_BROWN_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CYAN_WOOL.get(), createSimpleTable("compressed_cyan_wool", BlockRegistration.COMPRESSED_CYAN_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GRAY_WOOL.get(), createSimpleTable("compressed_gray_wool", BlockRegistration.COMPRESSED_GRAY_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GREEN_WOOL.get(), createSimpleTable("compressed_green_wool", BlockRegistration.COMPRESSED_GREEN_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIGHT_BLUE_WOOL.get(), createSimpleTable("compressed_light_blue_wool", BlockRegistration.COMPRESSED_LIGHT_BLUE_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIGHT_GRAY_WOOL.get(), createSimpleTable("compressed_light_gray_wool", BlockRegistration.COMPRESSED_LIGHT_GRAY_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIME_WOOL.get(), createSimpleTable("compressed_lime_wool", BlockRegistration.COMPRESSED_LIME_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_MAGENTA_WOOL.get(), createSimpleTable("compressed_magenta_wool", BlockRegistration.COMPRESSED_MAGENTA_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_ORANGE_WOOL.get(), createSimpleTable("compressed_orange_wool", BlockRegistration.COMPRESSED_ORANGE_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_PINK_WOOL.get(), createSimpleTable("compressed_pink_wool", BlockRegistration.COMPRESSED_PINK_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_PURPLE_WOOL.get(), createSimpleTable("compressed_purple_wool", BlockRegistration.COMPRESSED_PURPLE_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_RED_WOOL.get(), createSimpleTable("compressed_red_wool", BlockRegistration.COMPRESSED_RED_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_WHITE_WOOL.get(), createSimpleTable("compressed_white_wool", BlockRegistration.COMPRESSED_WHITE_WOOL.get()));
        lootTables.put(BlockRegistration.COMPRESSED_YELLOW_WOOL.get(), createSimpleTable("compressed_yellow_wool", BlockRegistration.COMPRESSED_YELLOW_WOOL.get()));

        //Concrete
        lootTables.put(BlockRegistration.COMPRESSED_BLACK_CONCRETE.get(), createSimpleTable("compressed_black_concrete", BlockRegistration.COMPRESSED_BLACK_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BLUE_CONCRETE.get(), createSimpleTable("compressed_blue_concrete", BlockRegistration.COMPRESSED_BLUE_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BROWN_CONCRETE.get(), createSimpleTable("compressed_brown_concrete", BlockRegistration.COMPRESSED_BROWN_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CYAN_CONCRETE.get(), createSimpleTable("compressed_cyan_concrete", BlockRegistration.COMPRESSED_CYAN_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GRAY_CONCRETE.get(), createSimpleTable("compressed_gray_concrete", BlockRegistration.COMPRESSED_GRAY_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GREEN_CONCRETE.get(), createSimpleTable("compressed_green_concrete", BlockRegistration.COMPRESSED_GREEN_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE.get(), createSimpleTable("compressed_light_blue_concrete", BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE.get(), createSimpleTable("compressed_light_gray_concrete", BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIME_CONCRETE.get(), createSimpleTable("compressed_lime_concrete", BlockRegistration.COMPRESSED_LIME_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_MAGENTA_CONCRETE.get(), createSimpleTable("compressed_magenta_concrete", BlockRegistration.COMPRESSED_MAGENTA_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_ORANGE_CONCRETE.get(), createSimpleTable("compressed_orange_concrete", BlockRegistration.COMPRESSED_ORANGE_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_PINK_CONCRETE.get(), createSimpleTable("compressed_pink_concrete", BlockRegistration.COMPRESSED_PINK_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_PURPLE_CONCRETE.get(), createSimpleTable("compressed_purple_concrete", BlockRegistration.COMPRESSED_PURPLE_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_RED_CONCRETE.get(), createSimpleTable("compressed_red_concrete", BlockRegistration.COMPRESSED_RED_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_WHITE_CONCRETE.get(), createSimpleTable("compressed_white_concrete", BlockRegistration.COMPRESSED_WHITE_CONCRETE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_YELLOW_CONCRETE.get(), createSimpleTable("compressed_yellow_concrete", BlockRegistration.COMPRESSED_YELLOW_CONCRETE.get()));

        //Concrete Powder
        lootTables.put(BlockRegistration.COMPRESSED_BLACK_CONCRETE_POWDER.get(), createSimpleTable("compressed_black_concrete_powder", BlockRegistration.COMPRESSED_BLACK_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BLUE_CONCRETE_POWDER.get(), createSimpleTable("compressed_blue_concrete_powder", BlockRegistration.COMPRESSED_BLUE_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BROWN_CONCRETE_POWDER.get(), createSimpleTable("compressed_brown_concrete_powder", BlockRegistration.COMPRESSED_BROWN_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CYAN_CONCRETE_POWDER.get(), createSimpleTable("compressed_cyan_concrete_powder", BlockRegistration.COMPRESSED_CYAN_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GRAY_CONCRETE_POWDER.get(), createSimpleTable("compressed_gray_concrete_powder", BlockRegistration.COMPRESSED_GRAY_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GREEN_CONCRETE_POWDER.get(), createSimpleTable("compressed_green_concrete_powder", BlockRegistration.COMPRESSED_GREEN_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER.get(), createSimpleTable("compressed_light_blue_concrete_powder", BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER.get(), createSimpleTable("compressed_light_gray_concrete_powder", BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIME_CONCRETE_POWDER.get(), createSimpleTable("compressed_lime_concrete_powder", BlockRegistration.COMPRESSED_LIME_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_MAGENTA_CONCRETE_POWDER.get(), createSimpleTable("compressed_magenta_concrete_powder", BlockRegistration.COMPRESSED_MAGENTA_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_ORANGE_CONCRETE_POWDER.get(), createSimpleTable("compressed_orange_concrete_powder", BlockRegistration.COMPRESSED_ORANGE_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_PINK_CONCRETE_POWDER.get(), createSimpleTable("compressed_pink_concrete_powder", BlockRegistration.COMPRESSED_PINK_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_PURPLE_CONCRETE_POWDER.get(), createSimpleTable("compressed_purple_concrete_powder", BlockRegistration.COMPRESSED_PURPLE_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_RED_CONCRETE_POWDER.get(), createSimpleTable("compressed_red_concrete_powder", BlockRegistration.COMPRESSED_RED_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_WHITE_CONCRETE_POWDER.get(), createSimpleTable("compressed_white_concrete_powder", BlockRegistration.COMPRESSED_WHITE_CONCRETE_POWDER.get()));
        lootTables.put(BlockRegistration.COMPRESSED_YELLOW_CONCRETE_POWDER.get(), createSimpleTable("compressed_yellow_concrete_powder", BlockRegistration.COMPRESSED_YELLOW_CONCRETE_POWDER.get()));

        //Snow Blocks
        lootTables.put(BlockRegistration.COMPRESSED_SNOW_BLOCK.get(), createSimpleTable("compressed_snow_block", BlockRegistration.COMPRESSED_SNOW_BLOCK.get()));

        //Glass Blocks
        lootTables.put(BlockRegistration.COMPRESSED_GLASS.get(), createGlassBlockTable("compressed_glass_block", BlockRegistration.COMPRESSED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS.get(), createGlassBlockTable("compressed_black_stained_glass", BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS.get(), createGlassBlockTable("compressed_blue_stained_glass", BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS.get(), createGlassBlockTable("compressed_brown_stained_glass", BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS.get(), createGlassBlockTable("compressed_cyan_stained_glass", BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS.get(), createGlassBlockTable("compressed_gray_stained_glass", BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS.get(), createGlassBlockTable("compressed_green_stained_glass", BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS.get(), createGlassBlockTable("compressed_light_blue_stained_glass", BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS.get(), createGlassBlockTable("compressed_light_gray_stained_glass", BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS.get(), createGlassBlockTable("compressed_lime_stained_glass", BlockRegistration.COMPRESSED_LIME_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS.get(), createGlassBlockTable("compressed_magenta_stained_glass", BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS.get(), createGlassBlockTable("compressed_orange_stained_glass", BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS.get(), createGlassBlockTable("compressed_pink_stained_glass", BlockRegistration.COMPRESSED_PINK_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS.get(), createGlassBlockTable("compressed_purple_stained_glass", BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_RED_STAINED_GLASS.get(), createGlassBlockTable("compressed_red_stained_glass", BlockRegistration.COMPRESSED_RED_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS.get(), createGlassBlockTable("compressed_white_stained_glass", BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS.get()));
        lootTables.put(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS.get(), createGlassBlockTable("compressed_yellow_stained_glass", BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS.get()));

        lootTables.put(BlockRegistration.COMPRESSED_GLASS_PANE.get(), createGlassBlockTable("compressed_glass_block_pane", BlockRegistration.COMPRESSED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_black_stained_glass_pane", BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_blue_stained_glass_pane", BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_brown_stained_glass_pane", BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_cyan_stained_glass_pane", BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_gray_stained_glass_pane", BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_green_stained_glass_pane", BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_light_blue_stained_glass_pane", BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_light_gray_stained_glass_pane", BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_lime_stained_glass_pane", BlockRegistration.COMPRESSED_LIME_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_magenta_stained_glass_pane", BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_orange_stained_glass_pane", BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_pink_stained_glass_pane", BlockRegistration.COMPRESSED_PINK_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_purple_stained_glass_pane", BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_RED_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_red_stained_glass_pane", BlockRegistration.COMPRESSED_RED_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_white_stained_glass_pane", BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS_PANE.get()));
        lootTables.put(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS_PANE.get(), createGlassBlockTable("compressed_yellow_stained_glass_pane", BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS_PANE.get()));
    }
}
