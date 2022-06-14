package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.registration.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ucItemModels extends BaseItemModelProvider
{
    public ucItemModels(DataGenerator generator, ExistingFileHelper helper)
    {
        super(generator, UltimateCompression.MODID, helper);
    }

    @Override
    protected void registerModels()
    {
        singleTexture(ForgeRegistries.ITEMS.getKey(Registration.UC_ICON.get()).getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("gui/ucimage"));

        //Ores
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_IRON_ORE_ITEM.get()).getPath(), modLoc("block/compressed_iron_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_GOLD_ORE_ITEM.get()).getPath(), modLoc("block/compressed_gold_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DIAMOND_ORE_ITEM.get()).getPath(), modLoc("block/compressed_diamond_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_COPPER_ORE_ITEM.get()).getPath(), modLoc("block/compressed_copper_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_COAL_ORE_ITEM.get()).getPath(), modLoc("block/compressed_coal_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_EMERALD_ORE_ITEM.get()).getPath(), modLoc("block/compressed_emerald_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_LAPIS_ORE_ITEM.get()).getPath(), modLoc("block/compressed_lapis_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_REDSTONE_ORE_ITEM.get()).getPath(), modLoc("block/compressed_redstone_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_NETHER_GOLD_ORE_ITEM.get()).getPath(), modLoc("block/compressed_nether_gold_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_NETHER_QUARTZ_ORE_ITEM.get()).getPath(), modLoc("block/compressed_nether_quartz_ore"));

        //Deepslate Ores
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DEEPSLATE_IRON_ORE_ITEM.get()).getPath(), modLoc("block/compressed_deepslate_iron_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DEEPSLATE_GOLD_ORE_ITEM.get()).getPath(), modLoc("block/compressed_deepslate_gold_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE_ITEM.get()).getPath(), modLoc("block/compressed_deepslate_diamond_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DEEPSLATE_COPPER_ORE_ITEM.get()).getPath(), modLoc("block/compressed_deepslate_copper_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DEEPSLATE_COAL_ORE_ITEM.get()).getPath(), modLoc("block/compressed_deepslate_coal_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE_ITEM.get()).getPath(), modLoc("block/compressed_deepslate_emerald_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE_ITEM.get()).getPath(), modLoc("block/compressed_deepslate_lapis_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE_ITEM.get()).getPath(), modLoc("block/compressed_deepslate_redstone_ore"));

        //Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_GOLD_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_gold_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_IRON_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_iron_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DIAMOND_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_diamond_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_COPPER_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_copper_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_COAL_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_coal_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_EMERALD_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_emerald_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_LAPIS_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_lapis_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_REDSTONE_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_redstone_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_NETHERITE_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_netherite_block"));

        //Raw Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_RAW_IRON_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_raw_iron_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_RAW_GOLD_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_raw_gold_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_RAW_COPPER_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_raw_copper_block"));

        //Basic Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_ANDESITE_ITEM.get()).getPath(), modLoc("block/compressed_andesite"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_CALCITE_ITEM.get()).getPath(), modLoc("block/compressed_calcite"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_COBBLED_DEEPSLATE_ITEM.get()).getPath(), modLoc("block/compressed_cobbled_deepslate"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_COBBLESTONE_ITEM.get()).getPath(), modLoc("block/compressed_cobblestone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DEEPSLATE_ITEM.get()).getPath(), modLoc("block/compressed_deepslate"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DIORITE_ITEM.get()).getPath(), modLoc("block/compressed_diorite"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DIRT_ITEM.get()).getPath(), modLoc("block/compressed_dirt"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_GRANITE_ITEM.get()).getPath(), modLoc("block/compressed_granite"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_GRAVEL_ITEM.get()).getPath(), modLoc("block/compressed_gravel"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_NETHERRACK_ITEM.get()).getPath(), modLoc("block/compressed_netherrack"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_RED_SAND_ITEM.get()).getPath(), modLoc("block/compressed_red_sand"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_SAND_ITEM.get()).getPath(), modLoc("block/compressed_sand"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_STONE_ITEM.get()).getPath(), modLoc("block/compressed_stone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_TUFF_ITEM.get()).getPath(), modLoc("block/compressed_tuff"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_CLAY_ITEM.get()).getPath(), modLoc("block/compressed_clay"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_MOSSY_COBBLESTONE_ITEM.get()).getPath(), modLoc("block/compressed_mossy_cobblestone"));

        //Polished Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_POLISHED_ANDESITE_ITEM.get()).getPath(), modLoc("block/compressed_polished_andesite"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_POLISHED_BASALT_ITEM.get()).getPath(), modLoc("block/compressed_polished_basalt"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_POLISHED_DEEPSLATE_ITEM.get()).getPath(), modLoc("block/compressed_polished_deepslate"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_POLISHED_BLACKSTONE_ITEM.get()).getPath(), modLoc("block/compressed_polished_blackstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS_ITEM.get()).getPath(), modLoc("block/compressed_polished_blackstone_bricks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_POLISHED_DIORITE_ITEM.get()).getPath(), modLoc("block/compressed_polished_diorite"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_POLISHED_GRANITE_ITEM.get()).getPath(), modLoc("block/compressed_polished_granite"));

        //Smooth Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_SMOOTH_BASALT_ITEM.get()).getPath(), modLoc("block/compressed_smooth_basalt"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_SMOOTH_STONE_ITEM.get()).getPath(), modLoc("block/compressed_smooth_stone"));

        //Stone Bricks
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_CHISELED_STONE_BRICKS_ITEM.get()).getPath(), modLoc("block/compressed_chiseled_stone_bricks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_CRACKED_STONE_BRICKS_ITEM.get()).getPath(), modLoc("block/compressed_cracked_stone_bricks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_MOSSY_STONE_BRICKS_ITEM.get()).getPath(), modLoc("block/compressed_mossy_stone_bricks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_STONE_BRICKS_ITEM.get()).getPath(), modLoc("block/compressed_stone_bricks"));

        //Sandstone
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_CHISELED_SANDSTONE_ITEM.get()).getPath(), modLoc("block/compressed_chiseled_sandstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_CHISELED_RED_SANDSTONE_ITEM.get()).getPath(), modLoc("block/compressed_chiseled_red_sandstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_CUT_SANDSTONE_ITEM.get()).getPath(), modLoc("block/compressed_chiseled_sandstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_CUT_RED_SANDSTONE_ITEM.get()).getPath(), modLoc("block/compressed_chiseled_red_sandstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_SANDSTONE_ITEM.get()).getPath(), modLoc("block/compressed_chiseled_sandstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_RED_SANDSTONE_ITEM.get()).getPath(), modLoc("block/compressed_chiseled_red_sandstone"));

        //Nether Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_NETHER_QUARTZ_BLOCK_ITEM.get()).getPath(), modLoc("block/compressed_nether_quartz_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BASALT_ITEM.get()).getPath(), modLoc("block/compressed_basalt"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BLACKSTONE_ITEM.get()).getPath(), modLoc("block/compressed_blackstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_GLOWSTONE_ITEM.get()).getPath(), modLoc("block/compressed_glowstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_MAGMA_ITEM.get()).getPath(), modLoc("block/compressed_magma"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_SOUL_SAND_ITEM.get()).getPath(), modLoc("block/compressed_soul_sand"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_SOUL_SOIL_ITEM.get()).getPath(), modLoc("block/compressed_soul_soil"));

        //Logs & Planks
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_ACACIA_LOG_ITEM.get()).getPath(), modLoc("block/compressed_acacia_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_ACACIA_PLANKS_ITEM.get()).getPath(), modLoc("block/compressed_acacia_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BIRCH_LOG_ITEM.get()).getPath(), modLoc("block/compressed_birch_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BIRCH_PLANKS_ITEM.get()).getPath(), modLoc("block/compressed_birch_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DARK_OAK_LOG_ITEM.get()).getPath(), modLoc("block/compressed_dark_oak_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_DARK_OAK_PLANKS_ITEM.get()).getPath(), modLoc("block/compressed_dark_oak_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_JUNGLE_LOG_ITEM.get()).getPath(), modLoc("block/compressed_jungle_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_JUNGLE_PLANKS_ITEM.get()).getPath(), modLoc("block/compressed_jungle_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_OAK_LOG_ITEM.get()).getPath(), modLoc("block/compressed_oak_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_OAK_PLANKS_ITEM.get()).getPath(), modLoc("block/compressed_oak_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_SPRUCE_LOG_ITEM.get()).getPath(), modLoc("block/compressed_spruce_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_SPRUCE_PLANKS_ITEM.get()).getPath(), modLoc("block/compressed_spruce_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_SPRUCE_CRIMSON_STEM_ITEM.get()).getPath(), modLoc("block/compressed_crimson_stem"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_CRIMSON_PLANKS_ITEM.get()).getPath(), modLoc("block/compressed_crimson_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_WARPED_STEM_ITEM.get()).getPath(), modLoc("block/compressed_warped_stem"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_WARPED_PLANKS_ITEM.get()).getPath(), modLoc("block/compressed_warped_planks"));

        //Wool
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BLACK_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_black_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BLUE_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_blue_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BROWN_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_brown_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_CYAN_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_cyan_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_GRAY_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_gray_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_GREEN_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_green_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_LIGHT_BLUE_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_light_blue_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_LIGHT_GRAY_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_light_gray_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_LIME_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_lime_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_MAGENTA_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_magenta_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_ORANGE_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_orange_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_PINK_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_pink_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_PURPLE_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_purple_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_RED_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_red_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_WHITE_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_white_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_YELLOW_WOOL_ITEM.get()).getPath(), modLoc("block/compressed_yellow_wool"));

        //Concrete
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BLACK_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_black_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BLUE_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_blue_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BROWN_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_brown_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_CYAN_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_cyan_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_GRAY_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_gray_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_GREEN_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_green_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_LIGHT_BLUE_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_light_blue_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_LIGHT_GRAY_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_light_gray_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_LIME_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_lime_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_MAGENTA_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_magenta_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_ORANGE_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_orange_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_PINK_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_pink_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_PURPLE_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_purple_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_RED_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_red_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_WHITE_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_white_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_YELLOW_CONCRETE_ITEM.get()).getPath(), modLoc("block/compressed_yellow_concrete"));

        //Concrete Powder
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BLACK_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_black_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BLUE_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_blue_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_BROWN_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_brown_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_CYAN_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_cyan_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_GRAY_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_gray_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_GREEN_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_green_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_light_blue_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_light_gray_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_LIME_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_lime_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_MAGENTA_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_magenta_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_ORANGE_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_orange_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_PINK_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_pink_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_PURPLE_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_purple_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_RED_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_red_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_WHITE_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_white_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSED_YELLOW_CONCRETE_POWDER_ITEM.get()).getPath(), modLoc("block/compressed_yellow_concrete_powder"));

        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.ULTIMATE_POWERGEN_ITEM.get()).getPath(), modLoc("block/powergen/main"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(Registration.COMPRESSOR_ITEM.get()).getPath(), modLoc("block/compressor"));

        singleTextureGenerated(Registration.COMPRESSED_RAW_IRON.get(), "item/compressed/materials/compressed_raw_iron");
        singleTextureGenerated(Registration.COMPRESSED_IRON_INGOT.get(), "item/compressed/materials/compressed_iron_ingot");
        singleTextureGenerated(Registration.COMPRESSED_RAW_GOLD.get(), "item/compressed/materials/compressed_raw_gold");
        singleTextureGenerated(Registration.COMPRESSED_GOLD_INGOT.get(), "item/compressed/materials/compressed_gold_ingot");
        singleTextureGenerated(Registration.COMPRESSED_DIAMOND_GEM.get(), "item/compressed/materials/compressed_diamond");
        singleTextureGenerated(Registration.COMPRESSED_RAW_COPPER.get(), "item/compressed/materials/compressed_raw_copper");
        singleTextureGenerated(Registration.COMPRESSED_COPPER_INGOT.get(), "item/compressed/materials/compressed_copper_ingot");

        singleTextureGenerated(Registration.COMPRESSED_COAL.get(), "item/compressed/materials/compressed_coal");
        singleTextureGenerated(Registration.COMPRESSED_EMERALD_GEM.get(), "item/compressed/materials/compressed_emerald");
        singleTextureGenerated(Registration.COMPRESSED_LAPIS.get(), "item/compressed/materials/compressed_lapis_lazuli");
        singleTextureGenerated(Registration.COMPRESSED_REDSTONE.get(), "item/compressed/materials/compressed_redstone");
        singleTextureGenerated(Registration.COMPRESSED_NETHERITE_INGOT.get(), "item/compressed/materials/compressed_netherite_ingot");

        //TOOLS
        //Pickaxes
        singleTextureHandheld(ToolRegistration.COMPRESSED_WOODEN_PICKAXE.get(), "item/compressed/tools/compressed_wooden_pickaxe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_STONE_PICKAXE.get(), "item/compressed/tools/compressed_stone_pickaxe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_IRON_PICKAXE.get(), "item/compressed/tools/compressed_iron_pickaxe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_GOLD_PICKAXE.get(), "item/compressed/tools/compressed_golden_pickaxe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_DIAMOND_PICKAXE.get(), "item/compressed/tools/compressed_diamond_pickaxe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_NETHERITE_PICKAXE.get(), "item/compressed/tools/compressed_netherite_pickaxe");
        //Axes
        singleTextureHandheld(ToolRegistration.COMPRESSED_WOODEN_AXE.get(), "item/compressed/tools/compressed_wooden_axe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_STONE_AXE.get(), "item/compressed/tools/compressed_stone_axe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_IRON_AXE.get(), "item/compressed/tools/compressed_iron_axe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_GOLD_AXE.get(), "item/compressed/tools/compressed_golden_axe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_DIAMOND_AXE.get(), "item/compressed/tools/compressed_diamond_axe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_NETHERITE_AXE.get(), "item/compressed/tools/compressed_netherite_axe");
        //Shovels
        singleTextureHandheld(ToolRegistration.COMPRESSED_WOODEN_SHOVEL.get(), "item/compressed/tools/compressed_wooden_shovel");
        singleTextureHandheld(ToolRegistration.COMPRESSED_STONE_SHOVEL.get(), "item/compressed/tools/compressed_stone_shovel");
        singleTextureHandheld(ToolRegistration.COMPRESSED_IRON_SHOVEL.get(), "item/compressed/tools/compressed_iron_shovel");
        singleTextureHandheld(ToolRegistration.COMPRESSED_GOLD_SHOVEL.get(), "item/compressed/tools/compressed_golden_shovel");
        singleTextureHandheld(ToolRegistration.COMPRESSED_DIAMOND_SHOVEL.get(), "item/compressed/tools/compressed_diamond_shovel");
        singleTextureHandheld(ToolRegistration.COMPRESSED_NETHERITE_SHOVEL.get(), "item/compressed/tools/compressed_netherite_shovel");
        //Swords
        singleTextureHandheld(ToolRegistration.COMPRESSED_WOODEN_SWORD.get(), "item/compressed/tools/compressed_wooden_sword");
        singleTextureHandheld(ToolRegistration.COMPRESSED_STONE_SWORD.get(), "item/compressed/tools/compressed_stone_sword");
        singleTextureHandheld(ToolRegistration.COMPRESSED_IRON_SWORD.get(), "item/compressed/tools/compressed_iron_sword");
        singleTextureHandheld(ToolRegistration.COMPRESSED_GOLD_SWORD.get(), "item/compressed/tools/compressed_golden_sword");
        singleTextureHandheld(ToolRegistration.COMPRESSED_DIAMOND_SWORD.get(), "item/compressed/tools/compressed_diamond_sword");
        singleTextureHandheld(ToolRegistration.COMPRESSED_NETHERITE_SWORD.get(), "item/compressed/tools/compressed_netherite_sword");
        //Hoes
        singleTextureHandheld(ToolRegistration.COMPRESSED_WOODEN_HOE.get(), "item/compressed/tools/compressed_wooden_hoe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_STONE_HOE.get(), "item/compressed/tools/compressed_stone_hoe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_IRON_HOE.get(), "item/compressed/tools/compressed_iron_hoe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_GOLD_HOE.get(), "item/compressed/tools/compressed_golden_hoe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_DIAMOND_HOE.get(), "item/compressed/tools/compressed_diamond_hoe");
        singleTextureHandheld(ToolRegistration.COMPRESSED_NETHERITE_HOE.get(), "item/compressed/tools/compressed_netherite_hoe");

        //ARMOR
        //Leather Armor
        singleTextureGenerated(ArmorRegistration.COMPRESSED_LEATHER_HELMET.get(), "item/compressed/armor/compressed_leather_helmet");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_LEATHER_CHESTPLATE.get(), "item/compressed/armor/compressed_leather_chestplate");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_LEATHER_LEGGINGS.get(), "item/compressed/armor/compressed_leather_leggings");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_LEATHER_BOOTS.get(), "item/compressed/armor/compressed_leather_boots");
        //Iron Armor
        singleTextureGenerated(ArmorRegistration.COMPRESSED_IRON_HELMET.get(), "item/compressed/armor/compressed_iron_helmet");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_IRON_CHESTPLATE.get(), "item/compressed/armor/compressed_iron_chestplate");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_IRON_LEGGINGS.get(), "item/compressed/armor/compressed_iron_leggings");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_IRON_BOOTS.get(), "item/compressed/armor/compressed_iron_boots");
        //Gold Armor
        singleTextureGenerated(ArmorRegistration.COMPRESSED_GOLD_HELMET.get(), "item/compressed/armor/compressed_golden_helmet");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_GOLD_CHESTPLATE.get(), "item/compressed/armor/compressed_golden_chestplate");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_GOLD_LEGGINGS.get(), "item/compressed/armor/compressed_golden_leggings");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_GOLD_BOOTS.get(), "item/compressed/armor/compressed_golden_boots");
        //Diamond Armor
        singleTextureGenerated(ArmorRegistration.COMPRESSED_DIAMOND_HELMET.get(), "item/compressed/armor/compressed_diamond_helmet");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_DIAMOND_CHESTPLATE.get(), "item/compressed/armor/compressed_diamond_chestplate");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_DIAMOND_LEGGINGS.get(), "item/compressed/armor/compressed_diamond_leggings");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_DIAMOND_BOOTS.get(), "item/compressed/armor/compressed_diamond_boots");
        //Netherite Armor
        singleTextureGenerated(ArmorRegistration.COMPRESSED_NETHERITE_HELMET.get(), "item/compressed/armor/compressed_netherite_helmet");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_NETHERITE_CHESTPLATE.get(), "item/compressed/armor/compressed_netherite_chestplate");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_NETHERITE_LEGGINGS.get(), "item/compressed/armor/compressed_netherite_leggings");
        singleTextureGenerated(ArmorRegistration.COMPRESSED_NETHERITE_BOOTS.get(), "item/compressed/armor/compressed_netherite_boots");

        //FOOD
        singleTextureGenerated(FoodRegistration.COMPRESSED_APPLE.get(), "item/compressed/food/compressed_apple");
        singleTextureGenerated(FoodRegistration.COMPRESSED_BAKED_POTATO.get(), "item/compressed/food/compressed_baked_potato");
        singleTextureGenerated(FoodRegistration.COMPRESSED_BEEF.get(), "item/compressed/food/compressed_beef");
        singleTextureGenerated(FoodRegistration.COMPRESSED_BEETROOT.get(), "item/compressed/food/compressed_beetroot");
        singleTextureGenerated(FoodRegistration.COMPRESSED_BEETROOT_SOUP.get(), "item/compressed/food/compressed_beetroot_soup");
        singleTextureGenerated(FoodRegistration.COMPRESSED_BREAD.get(), "item/compressed/food/compressed_bread");
        singleTextureGenerated(FoodRegistration.COMPRESSED_CARROT.get(), "item/compressed/food/compressed_carrot");
        singleTextureGenerated(FoodRegistration.COMPRESSED_CHICKEN.get(), "item/compressed/food/compressed_chicken");
        singleTextureGenerated(FoodRegistration.COMPRESSED_COD.get(), "item/compressed/food/compressed_cod");
        singleTextureGenerated(FoodRegistration.COMPRESSED_COOKED_BEEF.get(), "item/compressed/food/compressed_cooked_beef");
        singleTextureGenerated(FoodRegistration.COMPRESSED_COOKED_CHICKEN.get(), "item/compressed/food/compressed_cooked_chicken");
        singleTextureGenerated(FoodRegistration.COMPRESSED_COOKED_COD.get(), "item/compressed/food/compressed_cooked_cod");
        singleTextureGenerated(FoodRegistration.COMPRESSED_COOKED_MUTTON.get(), "item/compressed/food/compressed_cooked_mutton");
        singleTextureGenerated(FoodRegistration.COMPRESSED_COOKED_PORKCHOP.get(), "item/compressed/food/compressed_cooked_porkchop");
        singleTextureGenerated(FoodRegistration.COMPRESSED_COOKED_RABBIT.get(), "item/compressed/food/compressed_cooked_rabbit");
        singleTextureGenerated(FoodRegistration.COMPRESSED_COOKED_SALMON.get(), "item/compressed/food/compressed_cooked_salmon");
        singleTextureGenerated(FoodRegistration.COMPRESSED_COOKIE.get(), "item/compressed/food/compressed_cookie");
        singleTextureGenerated(FoodRegistration.COMPRESSED_DRIED_KELP.get(), "item/compressed/food/compressed_dried_kelp");
        singleTextureGenerated(FoodRegistration.COMPRESSED_GLOW_BERRIES.get(), "item/compressed/food/compressed_glow_berries");
        singleTextureGenerated(FoodRegistration.COMPRESSED_GOLDEN_APPLE.get(), "item/compressed/food/compressed_golden_apple");
        singleTextureGenerated(FoodRegistration.COMPRESSED_ENCHANTED_GOLDEN_APPLE.get(), "item/compressed/food/compressed_golden_apple");
        singleTextureGenerated(FoodRegistration.COMPRESSED_MELON_SLICE.get(), "item/compressed/food/compressed_melon_slice");
        singleTextureGenerated(FoodRegistration.COMPRESSED_MUSHROOM_STEW.get(), "item/compressed/food/compressed_mushroom_stew");
        singleTextureGenerated(FoodRegistration.COMPRESSED_MUTTON.get(), "item/compressed/food/compressed_mutton");
        singleTextureGenerated(FoodRegistration.COMPRESSED_POISONOUS_POTATO.get(), "item/compressed/food/compressed_poisonous_potato");
        singleTextureGenerated(FoodRegistration.COMPRESSED_PORKCHOP.get(), "item/compressed/food/compressed_porkchop");
        singleTextureGenerated(FoodRegistration.COMPRESSED_POTATO.get(), "item/compressed/food/compressed_potato");
        singleTextureGenerated(FoodRegistration.COMPRESSED_PUFFERFISH.get(), "item/compressed/food/compressed_pufferfish");
        singleTextureGenerated(FoodRegistration.COMPRESSED_PUMPKIN_PIE.get(), "item/compressed/food/compressed_pumpkin_pie");
        singleTextureGenerated(FoodRegistration.COMPRESSED_RABBIT.get(), "item/compressed/food/compressed_rabbit");
        singleTextureGenerated(FoodRegistration.COMPRESSED_RABBIT_STEW.get(), "item/compressed/food/compressed_rabbit_stew");
        singleTextureGenerated(FoodRegistration.COMPRESSED_ROTTEN_FLESH.get(), "item/compressed/food/compressed_rotten_flesh");
        singleTextureGenerated(FoodRegistration.COMPRESSED_SALMON.get(), "item/compressed/food/compressed_salmon");
        singleTextureGenerated(FoodRegistration.COMPRESSED_SPIDER_EYE.get(), "item/compressed/food/compressed_spider_eye");
        singleTextureGenerated(FoodRegistration.COMPRESSED_SWEET_BERRIES.get(), "item/compressed/food/compressed_sweet_berries");
        singleTextureGenerated(FoodRegistration.COMPRESSED_TROPICAL_FISH.get(), "item/compressed/food/compressed_tropical_fish");

        //Single Items
        singleTextureGenerated(ItemRegistration.COMPRESSED_FLINT.get(), "item/compressed/single/compressed_flint");
        singleTextureGenerated(ItemRegistration.COMPRESSED_QUARTZ.get(), "item/compressed/single/compressed_quartz");
        singleTextureGenerated(ItemRegistration.COMPRESSED_STICK.get(), "item/compressed/single/compressed_stick");
        singleTextureGenerated(ItemRegistration.COMPRESSED_LEATHER.get(), "item/compressed/single/compressed_leather");

        //Arrows
        singleTextureGenerated(ItemRegistration.COMPRESSED_ARROW.get(), "item/compressed/arrows/compressed_arrow");
        singleTextureGenerated(ItemRegistration.COMPRESSED_SPECTRAL_ARROW.get(), "item/compressed/arrows/compressed_spectral_arrow");
        //singleTextureGenerated(ItemRegistration.COMPRESSED_TIPPED_ARROW.get(), "item/compressed/arrows/compressed_arrow");
    }
}
