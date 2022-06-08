package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.setup.registration.ItemRegistration;
import com.VoidCallerZ.uc.setup.registration.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Items;

public class ucLootTables extends BaseLootTableProvider
{
    public ucLootTables(DataGenerator dataGeneratorIn) {super(dataGeneratorIn);}

    @Override
    protected void addTables()
    {
        //Ores
        lootTables.put(Registration.ULTIMATE_POWERGEN.get(), createSimpleTable("ultimate_powergen", Registration.ULTIMATE_POWERGEN.get()));
        lootTables.put(Registration.COMPRESSOR.get(), createSimpleTable("ultimate_compressor", Registration.COMPRESSOR.get()));
        lootTables.put(Registration.COMPRESSED_IRON_ORE.get(), createSilkTouchTable("compressed_iron_ore", Registration.COMPRESSED_IRON_ORE.get(), Registration.COMPRESSED_RAW_IRON.get(), 1, 1));
        lootTables.put(Registration.COMPRESSED_GOLD_ORE.get(), createSilkTouchTable("compressed_gold_ore", Registration.COMPRESSED_GOLD_ORE.get(), Registration.COMPRESSED_RAW_GOLD.get(), 1, 1));
        lootTables.put(Registration.COMPRESSED_DIAMOND_ORE.get(), createSilkTouchTable("compressed_diamond_ore", Registration.COMPRESSED_DIAMOND_ORE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), 1, 1));
        lootTables.put(Registration.COMPRESSED_COPPER_ORE.get(), createSilkTouchTable("compressed_copper_ore", Registration.COMPRESSED_COPPER_ORE.get(), Registration.COMPRESSED_RAW_COPPER.get(), 1, 3));
        lootTables.put(Registration.COMPRESSED_COAL_ORE.get(), createSilkTouchTable("compressed_coal_ore", Registration.COMPRESSED_COAL_ORE.get(), Registration.COMPRESSED_COAL.get(), 1, 1));
        lootTables.put(Registration.COMPRESSED_EMERALD_ORE.get(), createSilkTouchTable("compressed_emerald_ore", Registration.COMPRESSED_EMERALD_ORE.get(), Registration.COMPRESSED_EMERALD_GEM.get(), 1, 1));
        lootTables.put(Registration.COMPRESSED_LAPIS_ORE.get(), createSilkTouchTable("compressed_lapis_ore", Registration.COMPRESSED_LAPIS_ORE.get(), Registration.COMPRESSED_LAPIS.get(), 1, 1));
        lootTables.put(Registration.COMPRESSED_REDSTONE_ORE.get(), createSilkTouchTable("compressed_redstone_ore", Registration.COMPRESSED_REDSTONE_ORE.get(), Registration.COMPRESSED_REDSTONE.get(), 1, 1));
        lootTables.put(Registration.COMPRESSED_NETHER_GOLD_ORE.get(), createSilkTouchTable("compressed_nether_gold_ore", Registration.COMPRESSED_NETHER_GOLD_ORE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), 1, 1));
        lootTables.put(Registration.COMPRESSED_NETHER_QUARTZ_ORE.get(), createSilkTouchTable("compressed_nether_quartz_ore", Registration.COMPRESSED_NETHER_QUARTZ_ORE.get(), ItemRegistration.COMPRESSED_QUARTZ.get(), 2, 4));

        //Deepslate Ores
        lootTables.put(Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get(), createSilkTouchTable("compressed_deepslate_iron_ore", Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get(), Registration.COMPRESSED_RAW_IRON.get(), 1, 2));
        lootTables.put(Registration.COMPRESSED_DEEPSLATE_GOLD_ORE.get(), createSilkTouchTable("compressed_deepslate_gold_ore", Registration.COMPRESSED_DEEPSLATE_GOLD_ORE.get(), Registration.COMPRESSED_RAW_GOLD.get(), 1, 2));
        lootTables.put(Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(), createSilkTouchTable("compressed_deepslate_diamond_ore", Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), 1, 1));
        lootTables.put(Registration.COMPRESSED_DEEPSLATE_COPPER_ORE.get(), createSilkTouchTable("compressed_deepslate_copper_ore", Registration.COMPRESSED_DEEPSLATE_COPPER_ORE.get(), Registration.COMPRESSED_RAW_COPPER.get(), 2, 5));
        lootTables.put(Registration.COMPRESSED_DEEPSLATE_COAL_ORE.get(), createSilkTouchTable("compressed_deepslate_coal_ore", Registration.COMPRESSED_DEEPSLATE_COAL_ORE.get(), Registration.COMPRESSED_COAL.get(), 1, 2));
        lootTables.put(Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(), createSilkTouchTable("compressed_deepslate_emerald_ore", Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(), Registration.COMPRESSED_EMERALD_GEM.get(), 1, 2));
        lootTables.put(Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(), createSilkTouchTable("compressed_deepslate_lapis_ore", Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(), Registration.COMPRESSED_LAPIS.get(), 1, 2));
        lootTables.put(Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(), createSilkTouchTable("compressed_deepslate_redstone_ore", Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(), Registration.COMPRESSED_REDSTONE.get(), 1, 2));

        //Blocks
        lootTables.put(Registration.COMPRESSED_IRON_BLOCK.get(), createSimpleTable("compessed_iron_block", Registration.COMPRESSED_IRON_BLOCK.get()));
        lootTables.put(Registration.COMPRESSED_GOLD_BLOCK.get(), createSimpleTable("compessed_gold_block", Registration.COMPRESSED_GOLD_BLOCK.get()));
        lootTables.put(Registration.COMPRESSED_DIAMOND_BLOCK.get(), createSimpleTable("compessed_diamond_block", Registration.COMPRESSED_DIAMOND_BLOCK.get()));
        lootTables.put(Registration.COMPRESSED_COPPER_BLOCK.get(), createSimpleTable("compessed_copper_block", Registration.COMPRESSED_COPPER_BLOCK.get()));

        //Raw Blocks
        lootTables.put(Registration.COMPRESSED_RAW_IRON_BLOCK.get(), createSimpleTable("compressed_raw_iron_block", Registration.COMPRESSED_RAW_IRON_BLOCK.get()));
        lootTables.put(Registration.COMPRESSED_RAW_GOLD_BLOCK.get(), createSimpleTable("compressed_raw_gold_block", Registration.COMPRESSED_RAW_GOLD_BLOCK.get()));
        lootTables.put(Registration.COMPRESSED_RAW_COPPER_BLOCK.get(), createSimpleTable("compressed_raw_copper_block", Registration.COMPRESSED_RAW_COPPER_BLOCK.get()));

        //Basic Blocks
        lootTables.put(Registration.COMPRESSED_ANDESITE.get(), createSimpleTable("compressed_andesite", Registration.COMPRESSED_ANDESITE.get()));
        lootTables.put(Registration.COMPRESSED_CALCITE.get(), createSimpleTable("compressed_calcite", Registration.COMPRESSED_CALCITE.get()));
        lootTables.put(Registration.COMPRESSED_COBBLED_DEEPSLATE.get(), createSimpleTable("compressed_cobbled_deepslate", Registration.COMPRESSED_COBBLED_DEEPSLATE.get()));
        lootTables.put(Registration.COMPRESSED_COBBLESTONE.get(), createSimpleTable("compressed_cobblestone", Registration.COMPRESSED_COBBLESTONE.get()));
        lootTables.put(Registration.COMPRESSED_DEEPSLATE.get(), createSimpleTable("compressed_deepslate", Registration.COMPRESSED_DEEPSLATE.get()));
        lootTables.put(Registration.COMPRESSED_DIORITE.get(), createSimpleTable("compressed_diorite", Registration.COMPRESSED_DIORITE.get()));
        lootTables.put(Registration.COMPRESSED_DIRT.get(), createSimpleTable("compressed_dirt", Registration.COMPRESSED_DIRT.get()));
        lootTables.put(Registration.COMPRESSED_GRANITE.get(), createSimpleTable("compressed_granite", Registration.COMPRESSED_GRANITE.get()));
        lootTables.put(Registration.COMPRESSED_GRAVEL.get(), createChanceDropTable("compressed_gravel", Registration.COMPRESSED_GRAVEL.get(), Items.FLINT));
        lootTables.put(Registration.COMPRESSED_NETHERRACK.get(), createSimpleTable("compressed_netherrack", Registration.COMPRESSED_NETHERRACK.get()));
        lootTables.put(Registration.COMPRESSED_RED_SAND.get(), createSimpleTable("compressed_red_sand", Registration.COMPRESSED_RED_SAND.get()));
        lootTables.put(Registration.COMPRESSED_SAND.get(), createSimpleTable("compressed_sand", Registration.COMPRESSED_SAND.get()));
        lootTables.put(Registration.COMPRESSED_STONE.get(), createSimpleTable("compressed_stone", Registration.COMPRESSED_STONE.get()));
        lootTables.put(Registration.COMPRESSED_TUFF.get(), createSimpleTable("compressed_tuff", Registration.COMPRESSED_TUFF.get()));
        lootTables.put(Registration.COMPRESSED_CLAY.get(), createSilkTouchTable("compressed_clay", Registration.COMPRESSED_CLAY.get(), Items.CLAY_BALL, 3, 8));

        //Polished Blocks
        lootTables.put(Registration.COMPRESSED_POLISHED_ANDESITE.get(), createSimpleTable("compressed_polished_andesite", Registration.COMPRESSED_POLISHED_ANDESITE.get()));
        lootTables.put(Registration.COMPRESSED_POLISHED_BASALT.get(), createSimpleTable("compressed_polished_basalt", Registration.COMPRESSED_POLISHED_BASALT.get()));
        lootTables.put(Registration.COMPRESSED_POLISHED_DEEPSLATE.get(), createSimpleTable("compressed_polished_deepslate", Registration.COMPRESSED_POLISHED_DEEPSLATE.get()));
        lootTables.put(Registration.COMPRESSED_POLISHED_BLACKSTONE.get(), createSimpleTable("compressed_polished_blackstone", Registration.COMPRESSED_POLISHED_BLACKSTONE.get()));
        lootTables.put(Registration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get(), createSimpleTable("compressed_polished_blackstone_bricks", Registration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get()));
        lootTables.put(Registration.COMPRESSED_POLISHED_DIORITE.get(), createSimpleTable("compressed_polished_diorite", Registration.COMPRESSED_POLISHED_DIORITE.get()));
        lootTables.put(Registration.COMPRESSED_POLISHED_GRANITE.get(), createSimpleTable("compressed_polished_granite", Registration.COMPRESSED_POLISHED_GRANITE.get()));

        //Nether Blocks
        lootTables.put(Registration.COMPRESSED_NETHER_QUARTZ_BLOCK.get(), createSimpleTable("compressed_nether_quartz_block", Registration.COMPRESSED_NETHER_QUARTZ_BLOCK.get()));
        lootTables.put(Registration.COMPRESSED_BASALT.get(), createSimpleTable("compressed_basalt", Registration.COMPRESSED_BASALT.get()));
        lootTables.put(Registration.COMPRESSED_BLACKSTONE.get(), createSimpleTable("compressed_blackstone", Registration.COMPRESSED_BLACKSTONE.get()));
        lootTables.put(Registration.COMPRESSED_GLOWSTONE.get(), createSimpleTable("compressed_glowstone", Registration.COMPRESSED_GLOWSTONE.get()));
        lootTables.put(Registration.COMPRESSED_MAGMA.get(), createSimpleTable("compressed_magma", Registration.COMPRESSED_MAGMA.get()));
        lootTables.put(Registration.COMPRESSED_SOUL_SAND.get(), createSimpleTable("compressed_soul_sand", Registration.COMPRESSED_SOUL_SAND.get()));
        lootTables.put(Registration.COMPRESSED_SOUL_SOIL.get(), createSimpleTable("compressed_soul_soil", Registration.COMPRESSED_SOUL_SOIL.get()));

        //Logs & Planks
        lootTables.put(Registration.COMPRESSED_ACACIA_LOG.get(), createSimpleTable("compressed_acacia_log", Registration.COMPRESSED_ACACIA_LOG.get()));
        lootTables.put(Registration.COMPRESSED_ACACIA_PLANKS.get(), createSimpleTable("compressed_acacia_planks", Registration.COMPRESSED_ACACIA_PLANKS.get()));
        lootTables.put(Registration.COMPRESSED_BIRCH_LOG.get(), createSimpleTable("compressed_birch_log", Registration.COMPRESSED_BIRCH_LOG.get()));
        lootTables.put(Registration.COMPRESSED_BIRCH_PLANKS.get(), createSimpleTable("compressed_birch_planks", Registration.COMPRESSED_BIRCH_PLANKS.get()));
        lootTables.put(Registration.COMPRESSED_DARK_OAK_LOG.get(), createSimpleTable("compressed_dark_oak_log", Registration.COMPRESSED_DARK_OAK_LOG.get()));
        lootTables.put(Registration.COMPRESSED_DARK_OAK_PLANKS.get(), createSimpleTable("compressed_dark_oak_planks", Registration.COMPRESSED_DARK_OAK_PLANKS.get()));
        lootTables.put(Registration.COMPRESSED_JUNGLE_LOG.get(), createSimpleTable("compressed_jungle_log", Registration.COMPRESSED_JUNGLE_LOG.get()));
        lootTables.put(Registration.COMPRESSED_JUNGLE_PLANKS.get(), createSimpleTable("compressed_jungle_planks", Registration.COMPRESSED_JUNGLE_PLANKS.get()));
        lootTables.put(Registration.COMPRESSED_OAK_LOG.get(), createSimpleTable("compressed_oak_log", Registration.COMPRESSED_OAK_LOG.get()));
        lootTables.put(Registration.COMPRESSED_OAK_PLANKS.get(), createSimpleTable("compressed_oak_planks", Registration.COMPRESSED_OAK_PLANKS.get()));
        lootTables.put(Registration.COMPRESSED_SPRUCE_LOG.get(), createSimpleTable("compressed_spruce_log", Registration.COMPRESSED_SPRUCE_LOG.get()));
        lootTables.put(Registration.COMPRESSED_SPRUCE_PLANKS.get(), createSimpleTable("compressed_spruce_planks", Registration.COMPRESSED_SPRUCE_PLANKS.get()));
        lootTables.put(Registration.COMPRESSED_CRIMSON_STEM.get(), createSimpleTable("compressed_crimson_stem", Registration.COMPRESSED_CRIMSON_STEM.get()));
        lootTables.put(Registration.COMPRESSED_CRIMSON_PLANKS.get(), createSimpleTable("compressed_crimson_planks", Registration.COMPRESSED_CRIMSON_PLANKS.get()));
        lootTables.put(Registration.COMPRESSED_WARPED_STEM.get(), createSimpleTable("compressed_warped_stem", Registration.COMPRESSED_WARPED_STEM.get()));
        lootTables.put(Registration.COMPRESSED_WARPED_PLANKS.get(), createSimpleTable("compressed_warped_planks", Registration.COMPRESSED_WARPED_PLANKS.get()));

        //Wool
        lootTables.put(Registration.COMPRESSED_BLACK_WOOL.get(), createSimpleTable("compressed_black_wool", Registration.COMPRESSED_BLACK_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_BLUE_WOOL.get(), createSimpleTable("compressed_blue_wool", Registration.COMPRESSED_BLUE_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_BROWN_WOOL.get(), createSimpleTable("compressed_brown_wool", Registration.COMPRESSED_BROWN_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_CYAN_WOOL.get(), createSimpleTable("compressed_cyan_wool", Registration.COMPRESSED_CYAN_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_GRAY_WOOL.get(), createSimpleTable("compressed_gray_wool", Registration.COMPRESSED_GRAY_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_GREEN_WOOL.get(), createSimpleTable("compressed_green_wool", Registration.COMPRESSED_GREEN_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_LIGHT_BLUE_WOOL.get(), createSimpleTable("compressed_light_blue_wool", Registration.COMPRESSED_LIGHT_BLUE_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_LIGHT_GRAY_WOOL.get(), createSimpleTable("compressed_light_gray_wool", Registration.COMPRESSED_LIGHT_GRAY_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_LIME_WOOL.get(), createSimpleTable("compressed_lime_wool", Registration.COMPRESSED_LIME_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_MAGENTA_WOOL.get(), createSimpleTable("compressed_magenta_wool", Registration.COMPRESSED_MAGENTA_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_ORANGE_WOOL.get(), createSimpleTable("compressed_orange_wool", Registration.COMPRESSED_ORANGE_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_PINK_WOOL.get(), createSimpleTable("compressed_pink_wool", Registration.COMPRESSED_PINK_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_PURPLE_WOOL.get(), createSimpleTable("compressed_purple_wool", Registration.COMPRESSED_PURPLE_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_RED_WOOL.get(), createSimpleTable("compressed_red_wool", Registration.COMPRESSED_RED_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_WHITE_WOOL.get(), createSimpleTable("compressed_white_wool", Registration.COMPRESSED_WHITE_WOOL.get()));
        lootTables.put(Registration.COMPRESSED_YELLOW_WOOL.get(), createSimpleTable("compressed_yellow_wool", Registration.COMPRESSED_YELLOW_WOOL.get()));

        //Concrete
        lootTables.put(Registration.COMPRESSED_BLACK_CONCRETE.get(), createSimpleTable("compressed_black_concrete", Registration.COMPRESSED_BLACK_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_BLUE_CONCRETE.get(), createSimpleTable("compressed_blue_concrete", Registration.COMPRESSED_BLUE_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_BROWN_CONCRETE.get(), createSimpleTable("compressed_brown_concrete", Registration.COMPRESSED_BROWN_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_CYAN_CONCRETE.get(), createSimpleTable("compressed_cyan_concrete", Registration.COMPRESSED_CYAN_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_GRAY_CONCRETE.get(), createSimpleTable("compressed_gray_concrete", Registration.COMPRESSED_GRAY_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_GREEN_CONCRETE.get(), createSimpleTable("compressed_green_concrete", Registration.COMPRESSED_GREEN_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_LIGHT_BLUE_CONCRETE.get(), createSimpleTable("compressed_light_blue_concrete", Registration.COMPRESSED_LIGHT_BLUE_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_LIGHT_GRAY_CONCRETE.get(), createSimpleTable("compressed_light_gray_concrete", Registration.COMPRESSED_LIGHT_GRAY_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_LIME_CONCRETE.get(), createSimpleTable("compressed_lime_concrete", Registration.COMPRESSED_LIME_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_MAGENTA_CONCRETE.get(), createSimpleTable("compressed_magenta_concrete", Registration.COMPRESSED_MAGENTA_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_ORANGE_CONCRETE.get(), createSimpleTable("compressed_orange_concrete", Registration.COMPRESSED_ORANGE_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_PINK_CONCRETE.get(), createSimpleTable("compressed_pink_concrete", Registration.COMPRESSED_PINK_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_PURPLE_CONCRETE.get(), createSimpleTable("compressed_purple_concrete", Registration.COMPRESSED_PURPLE_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_RED_CONCRETE.get(), createSimpleTable("compressed_red_concrete", Registration.COMPRESSED_RED_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_WHITE_CONCRETE.get(), createSimpleTable("compressed_white_concrete", Registration.COMPRESSED_WHITE_CONCRETE.get()));
        lootTables.put(Registration.COMPRESSED_YELLOW_CONCRETE.get(), createSimpleTable("compressed_yellow_concrete", Registration.COMPRESSED_YELLOW_CONCRETE.get()));

        //Concrete Powder
        lootTables.put(Registration.COMPRESSED_BLACK_CONCRETE_POWDER.get(), createSimpleTable("compressed_black_concrete_powder", Registration.COMPRESSED_BLACK_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_BLUE_CONCRETE_POWDER.get(), createSimpleTable("compressed_blue_concrete_powder", Registration.COMPRESSED_BLUE_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_BROWN_CONCRETE_POWDER.get(), createSimpleTable("compressed_brown_concrete_powder", Registration.COMPRESSED_BROWN_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_CYAN_CONCRETE_POWDER.get(), createSimpleTable("compressed_cyan_concrete_powder", Registration.COMPRESSED_CYAN_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_GRAY_CONCRETE_POWDER.get(), createSimpleTable("compressed_gray_concrete_powder", Registration.COMPRESSED_GRAY_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_GREEN_CONCRETE_POWDER.get(), createSimpleTable("compressed_green_concrete_powder", Registration.COMPRESSED_GREEN_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER.get(), createSimpleTable("compressed_light_blue_concrete_powder", Registration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER.get(), createSimpleTable("compressed_light_gray_concrete_powder", Registration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_LIME_CONCRETE_POWDER.get(), createSimpleTable("compressed_lime_concrete_powder", Registration.COMPRESSED_LIME_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_MAGENTA_CONCRETE_POWDER.get(), createSimpleTable("compressed_magenta_concrete_powder", Registration.COMPRESSED_MAGENTA_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_ORANGE_CONCRETE_POWDER.get(), createSimpleTable("compressed_orange_concrete_powder", Registration.COMPRESSED_ORANGE_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_PINK_CONCRETE_POWDER.get(), createSimpleTable("compressed_pink_concrete_powder", Registration.COMPRESSED_PINK_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_PURPLE_CONCRETE_POWDER.get(), createSimpleTable("compressed_purple_concrete_powder", Registration.COMPRESSED_PURPLE_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_RED_CONCRETE_POWDER.get(), createSimpleTable("compressed_red_concrete_powder", Registration.COMPRESSED_RED_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_WHITE_CONCRETE_POWDER.get(), createSimpleTable("compressed_white_concrete_powder", Registration.COMPRESSED_WHITE_CONCRETE_POWDER.get()));
        lootTables.put(Registration.COMPRESSED_YELLOW_CONCRETE_POWDER.get(), createSimpleTable("compressed_yellow_concrete_powder", Registration.COMPRESSED_YELLOW_CONCRETE_POWDER.get()));

    }
}
