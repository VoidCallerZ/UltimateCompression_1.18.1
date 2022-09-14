package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.dataGen.providers.BaseItemModelProvider;
import com.VoidCallerZ.uc.registration.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
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
        singleTexture(ForgeRegistries.ITEMS.getKey(BlockRegistration.UC_ICON.get()).getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("gui/ucimage"));

        //Materials
        //Ores
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_IRON_ORE.get()).getPath(), modLoc("block/compressed_iron_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GOLD_ORE.get()).getPath(), modLoc("block/compressed_gold_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DIAMOND_ORE.get()).getPath(), modLoc("block/compressed_diamond_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_COPPER_ORE.get()).getPath(), modLoc("block/compressed_copper_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_COAL_ORE.get()).getPath(), modLoc("block/compressed_coal_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_EMERALD_ORE.get()).getPath(), modLoc("block/compressed_emerald_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LAPIS_ORE.get()).getPath(), modLoc("block/compressed_lapis_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_REDSTONE_ORE.get()).getPath(), modLoc("block/compressed_redstone_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_NETHER_GOLD_ORE.get()).getPath(), modLoc("block/compressed_nether_gold_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_NETHER_QUARTZ_ORE.get()).getPath(), modLoc("block/compressed_nether_quartz_ore"));

        //Deepslate Ores
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get()).getPath(), modLoc("block/compressed_deepslate_iron_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get()).getPath(), modLoc("block/compressed_deepslate_gold_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get()).getPath(), modLoc("block/compressed_deepslate_diamond_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get()).getPath(), modLoc("block/compressed_deepslate_copper_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get()).getPath(), modLoc("block/compressed_deepslate_coal_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get()).getPath(), modLoc("block/compressed_deepslate_emerald_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get()).getPath(), modLoc("block/compressed_deepslate_lapis_ore"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get()).getPath(), modLoc("block/compressed_deepslate_redstone_ore"));

        //Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GOLD_BLOCK.get()).getPath(), modLoc("block/compressed_gold_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_IRON_BLOCK.get()).getPath(), modLoc("block/compressed_iron_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DIAMOND_BLOCK.get()).getPath(), modLoc("block/compressed_diamond_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_COPPER_BLOCK.get()).getPath(), modLoc("block/compressed_copper_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_COAL_BLOCK.get()).getPath(), modLoc("block/compressed_coal_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_EMERALD_BLOCK.get()).getPath(), modLoc("block/compressed_emerald_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LAPIS_BLOCK.get()).getPath(), modLoc("block/compressed_lapis_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_REDSTONE_BLOCK.get()).getPath(), modLoc("block/compressed_redstone_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_NETHERITE_BLOCK.get()).getPath(), modLoc("block/compressed_netherite_block"));

        //Raw Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_RAW_IRON_BLOCK.get()).getPath(), modLoc("block/compressed_raw_iron_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_RAW_GOLD_BLOCK.get()).getPath(), modLoc("block/compressed_raw_gold_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_RAW_COPPER_BLOCK.get()).getPath(), modLoc("block/compressed_raw_copper_block"));

        //Other
        singleTextureGenerated(ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), "item/compressed/materials/compressed_gold_nugget");
        singleTextureGenerated(ItemRegistration.COMPRESSED_IRON_NUGGET.get(), "item/compressed/materials/compressed_iron_nugget");
        singleTextureGenerated(ItemRegistration.COMPRESSED_QUARTZ.get(), "item/compressed/materials/compressed_quartz");

        //Basic Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_ANDESITE.get()).getPath(), modLoc("block/compressed_andesite"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CALCITE.get()).getPath(), modLoc("block/compressed_calcite"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_COBBLED_DEEPSLATE.get()).getPath(), modLoc("block/compressed_cobbled_deepslate"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_COBBLESTONE.get()).getPath(), modLoc("block/compressed_cobblestone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DEEPSLATE.get()).getPath(), modLoc("block/compressed_deepslate"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DIORITE.get()).getPath(), modLoc("block/compressed_diorite"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DIRT.get()).getPath(), modLoc("block/compressed_dirt"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GRANITE.get()).getPath(), modLoc("block/compressed_granite"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GRAVEL.get()).getPath(), modLoc("block/compressed_gravel"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_NETHERRACK.get()).getPath(), modLoc("block/compressed_netherrack"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_RED_SAND.get()).getPath(), modLoc("block/compressed_red_sand"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SAND.get()).getPath(), modLoc("block/compressed_sand"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_STONE.get()).getPath(), modLoc("block/compressed_stone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_TUFF.get()).getPath(), modLoc("block/compressed_tuff"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CLAY.get()).getPath(), modLoc("block/compressed_clay"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_MOSSY_COBBLESTONE.get()).getPath(), modLoc("block/compressed_mossy_cobblestone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BONE_BLOCK.get()).getPath(), modLoc("block/compressed_bone_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_HAY_BLOCK.get()).getPath(), modLoc("block/compressed_hay_block"));

        //Polished Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_POLISHED_ANDESITE.get()).getPath(), modLoc("block/compressed_polished_andesite"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_POLISHED_BASALT.get()).getPath(), modLoc("block/compressed_polished_basalt"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_POLISHED_DEEPSLATE.get()).getPath(), modLoc("block/compressed_polished_deepslate"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_POLISHED_BLACKSTONE.get()).getPath(), modLoc("block/compressed_polished_blackstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get()).getPath(), modLoc("block/compressed_polished_blackstone_bricks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_POLISHED_DIORITE.get()).getPath(), modLoc("block/compressed_polished_diorite"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_POLISHED_GRANITE.get()).getPath(), modLoc("block/compressed_polished_granite"));

        //Smooth Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SMOOTH_BASALT.get()).getPath(), modLoc("block/compressed_smooth_basalt"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SMOOTH_STONE.get()).getPath(), modLoc("block/compressed_smooth_stone"));

        //Stone Bricks
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CHISELED_STONE_BRICKS.get()).getPath(), modLoc("block/compressed_chiseled_stone_bricks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CRACKED_STONE_BRICKS.get()).getPath(), modLoc("block/compressed_cracked_stone_bricks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_MOSSY_STONE_BRICKS.get()).getPath(), modLoc("block/compressed_mossy_stone_bricks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_STONE_BRICKS.get()).getPath(), modLoc("block/compressed_stone_bricks"));

        //Sandstone
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CHISELED_SANDSTONE.get()).getPath(), modLoc("block/compressed_chiseled_sandstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CHISELED_RED_SANDSTONE.get()).getPath(), modLoc("block/compressed_chiseled_red_sandstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CUT_SANDSTONE.get()).getPath(), modLoc("block/compressed_chiseled_sandstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CUT_RED_SANDSTONE.get()).getPath(), modLoc("block/compressed_chiseled_red_sandstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SANDSTONE.get()).getPath(), modLoc("block/compressed_chiseled_sandstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_RED_SANDSTONE.get()).getPath(), modLoc("block/compressed_chiseled_red_sandstone"));

        //Nether Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_NETHER_QUARTZ_BLOCK.get()).getPath(), modLoc("block/compressed_nether_quartz_block"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BASALT.get()).getPath(), modLoc("block/compressed_basalt"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BLACKSTONE.get()).getPath(), modLoc("block/compressed_blackstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CHISELED_POLISHED_BLACKSTONE.get()).getPath(), modLoc("block/compressed_chiseled_polished_blackstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.get()).getPath(), modLoc("block/compressed_cracked_polished_blackstone_bricks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GILDED_BLACKSTONE.get()).getPath(), modLoc("block/compressed_gilded_blackstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GLOWSTONE.get()).getPath(), modLoc("block/compressed_glowstone"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_MAGMA.get()).getPath(), modLoc("block/compressed_magma"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SOUL_SAND.get()).getPath(), modLoc("block/compressed_soul_sand"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SOUL_SOIL.get()).getPath(), modLoc("block/compressed_soul_soil"));

        //Logs & Planks
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_ACACIA_LOG.get()).getPath(), modLoc("block/compressed_acacia_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_ACACIA_PLANKS.get()).getPath(), modLoc("block/compressed_acacia_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BIRCH_LOG.get()).getPath(), modLoc("block/compressed_birch_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BIRCH_PLANKS.get()).getPath(), modLoc("block/compressed_birch_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DARK_OAK_LOG.get()).getPath(), modLoc("block/compressed_dark_oak_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DARK_OAK_PLANKS.get()).getPath(), modLoc("block/compressed_dark_oak_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_JUNGLE_LOG.get()).getPath(), modLoc("block/compressed_jungle_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_JUNGLE_PLANKS.get()).getPath(), modLoc("block/compressed_jungle_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_OAK_LOG.get()).getPath(), modLoc("block/compressed_oak_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_OAK_PLANKS.get()).getPath(), modLoc("block/compressed_oak_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SPRUCE_LOG.get()).getPath(), modLoc("block/compressed_spruce_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SPRUCE_PLANKS.get()).getPath(), modLoc("block/compressed_spruce_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SPRUCE_CRIMSON_STEM.get()).getPath(), modLoc("block/compressed_crimson_stem"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CRIMSON_PLANKS.get()).getPath(), modLoc("block/compressed_crimson_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_WARPED_STEM.get()).getPath(), modLoc("block/compressed_warped_stem"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_WARPED_PLANKS.get()).getPath(), modLoc("block/compressed_warped_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_MANGROVE_LOG.get()).getPath(), modLoc("block/compressed_mangrove_log"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_MANGROVE_PLANKS.get()).getPath(), modLoc("block/compressed_mangrove_planks"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_MANGROVE_ROOTS.get()).getPath(), modLoc("block/compressed_mangrove_roots"));

        //Leaves
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_ACACIA_LEAVES.get()).getPath(), modLoc("block/compressed_acacia_leaves"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BIRCH_LEAVES.get()).getPath(), modLoc("block/compressed_birch_leaves"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_DARK_OAK_LEAVES.get()).getPath(), modLoc("block/compressed_dark_oak_leaves"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_JUNGLE_LEAVES.get()).getPath(), modLoc("block/compressed_jungle_leaves"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_MANGROVE_LEAVES.get()).getPath(), modLoc("block/compressed_mangrove_leaves"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_OAK_LEAVES.get()).getPath(), modLoc("block/compressed_oak_leaves"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SPRUCE_LEAVES.get()).getPath(), modLoc("block/compressed_spruce_leaves"));

        //Wool
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BLACK_WOOL.get()).getPath(), modLoc("block/compressed_black_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BLUE_WOOL.get()).getPath(), modLoc("block/compressed_blue_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BROWN_WOOL.get()).getPath(), modLoc("block/compressed_brown_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CYAN_WOOL.get()).getPath(), modLoc("block/compressed_cyan_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GRAY_WOOL.get()).getPath(), modLoc("block/compressed_gray_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GREEN_WOOL.get()).getPath(), modLoc("block/compressed_green_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LIGHT_BLUE_WOOL.get()).getPath(), modLoc("block/compressed_light_blue_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LIGHT_GRAY_WOOL.get()).getPath(), modLoc("block/compressed_light_gray_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LIME_WOOL.get()).getPath(), modLoc("block/compressed_lime_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_MAGENTA_WOOL.get()).getPath(), modLoc("block/compressed_magenta_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_ORANGE_WOOL.get()).getPath(), modLoc("block/compressed_orange_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_PINK_WOOL.get()).getPath(), modLoc("block/compressed_pink_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_PURPLE_WOOL.get()).getPath(), modLoc("block/compressed_purple_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_RED_WOOL.get()).getPath(), modLoc("block/compressed_red_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_WHITE_WOOL.get()).getPath(), modLoc("block/compressed_white_wool"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_YELLOW_WOOL.get()).getPath(), modLoc("block/compressed_yellow_wool"));

        //Concrete
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BLACK_CONCRETE.get()).getPath(), modLoc("block/compressed_black_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BLUE_CONCRETE.get()).getPath(), modLoc("block/compressed_blue_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BROWN_CONCRETE.get()).getPath(), modLoc("block/compressed_brown_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CYAN_CONCRETE.get()).getPath(), modLoc("block/compressed_cyan_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GRAY_CONCRETE.get()).getPath(), modLoc("block/compressed_gray_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GREEN_CONCRETE.get()).getPath(), modLoc("block/compressed_green_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE.get()).getPath(), modLoc("block/compressed_light_blue_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE.get()).getPath(), modLoc("block/compressed_light_gray_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LIME_CONCRETE.get()).getPath(), modLoc("block/compressed_lime_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_MAGENTA_CONCRETE.get()).getPath(), modLoc("block/compressed_magenta_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_ORANGE_CONCRETE.get()).getPath(), modLoc("block/compressed_orange_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_PINK_CONCRETE.get()).getPath(), modLoc("block/compressed_pink_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_PURPLE_CONCRETE.get()).getPath(), modLoc("block/compressed_purple_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_RED_CONCRETE.get()).getPath(), modLoc("block/compressed_red_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_WHITE_CONCRETE.get()).getPath(), modLoc("block/compressed_white_concrete"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_YELLOW_CONCRETE.get()).getPath(), modLoc("block/compressed_yellow_concrete"));

        //Concrete Powder
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BLACK_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_black_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BLUE_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_blue_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BROWN_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_brown_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CYAN_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_cyan_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GRAY_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_gray_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GREEN_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_green_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_light_blue_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_light_gray_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LIME_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_lime_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_MAGENTA_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_magenta_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_ORANGE_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_orange_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_PINK_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_pink_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_PURPLE_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_purple_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_RED_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_red_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_WHITE_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_white_concrete_powder"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_YELLOW_CONCRETE_POWDER.get()).getPath(), modLoc("block/compressed_yellow_concrete_powder"));

        //Snow
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SNOW_BLOCK.get()).getPath(), modLoc("block/compressed_snow_block"));

        //Sculk
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SCULK.get()).getPath(), modLoc("block/compressed_sculk"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_SCULK_CATALYST.get()).getPath(), modLoc("block/compressed_sculk_catalyst"));

        //Glass Blocks
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GLASS.get()).getPath(), modLoc("block/compressed_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BLACK_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_black_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BLUE_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_blue_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_BROWN_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_brown_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_CYAN_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_cyan_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GRAY_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_gray_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_GREEN_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_green_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_light_blue_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_light_gray_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_LIME_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_lime_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_MAGENTA_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_magenta_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_ORANGE_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_orange_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_PINK_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_pink_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_PURPLE_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_purple_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_RED_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_red_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_WHITE_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_white_stained_glass"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_YELLOW_STAINED_GLASS.get()).getPath(), modLoc("block/compressed_yellow_stained_glass"));

        //Glass Panes
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_GLASS_PANE.get(), "block/compressed/glass/compressed_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_BLACK_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_black_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_BLUE_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_blue_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_BROWN_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_brown_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_CYAN_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_cyan_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_GRAY_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_gray_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_GREEN_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_green_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_light_blue_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_light_gray_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_LIME_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_lime_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_MAGENTA_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_magenta_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_ORANGE_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_orange_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_PINK_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_pink_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_PURPLE_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_purple_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_RED_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_red_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_WHITE_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_white_stained_glass", "translucent");
        singleTextureGeneratedWithRenderType(ItemRegistration.COMPRESSED_YELLOW_STAINED_GLASS_PANE.get(), "block/compressed/glass/compressed_yellow_stained_glass", "translucent");

        //Obsidian
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_OBSIDIAN.get()).getPath(), modLoc("block/compressed_obsidian"));

        //Compressors
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.IRON_COMPRESSOR.get()).getPath(), modLoc("block/iron_compressor"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.GOLDEN_COMPRESSOR.get()).getPath(), modLoc("block/golden_compressor"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.DIAMOND_COMPRESSOR.get()).getPath(), modLoc("block/diamond_compressor"));
        withExistingParent(ForgeRegistries.ITEMS.getKey(ItemRegistration.NETHERITE_COMPRESSOR.get()).getPath(), modLoc("block/netherite_compressor"));

        singleTextureGenerated(ItemRegistration.COMPRESSED_RAW_IRON.get(), "item/compressed/materials/compressed_raw_iron");
        singleTextureGenerated(ItemRegistration.COMPRESSED_IRON_INGOT.get(), "item/compressed/materials/compressed_iron_ingot");
        singleTextureGenerated(ItemRegistration.COMPRESSED_RAW_GOLD.get(), "item/compressed/materials/compressed_raw_gold");
        singleTextureGenerated(ItemRegistration.COMPRESSED_GOLD_INGOT.get(), "item/compressed/materials/compressed_gold_ingot");
        singleTextureGenerated(ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), "item/compressed/materials/compressed_diamond");
        singleTextureGenerated(ItemRegistration.COMPRESSED_RAW_COPPER.get(), "item/compressed/materials/compressed_raw_copper");
        singleTextureGenerated(ItemRegistration.COMPRESSED_COPPER_INGOT.get(), "item/compressed/materials/compressed_copper_ingot");

        singleTextureGenerated(ItemRegistration.COMPRESSED_COAL.get(), "item/compressed/materials/compressed_coal");
        singleTextureGenerated(ItemRegistration.COMPRESSED_EMERALD_GEM.get(), "item/compressed/materials/compressed_emerald");
        singleTextureGenerated(ItemRegistration.COMPRESSED_LAPIS.get(), "item/compressed/materials/compressed_lapis_lazuli");
        singleTextureGenerated(ItemRegistration.COMPRESSED_REDSTONE.get(), "item/compressed/materials/compressed_redstone");
        singleTextureGenerated(ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), "item/compressed/materials/compressed_netherite_ingot");

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
        leatherArmorItem(ArmorRegistration.COMPRESSED_LEATHER_HELMET.get(), "item/compressed/armor/compressed_leather_helmet", "item/compressed/armor/compressed_leather_helmet_overlay");
        leatherArmorItem(ArmorRegistration.COMPRESSED_LEATHER_CHESTPLATE.get(), "item/compressed/armor/compressed_leather_chestplate", "item/compressed/armor/compressed_leather_chestplate_overlay");
        leatherArmorItem(ArmorRegistration.COMPRESSED_LEATHER_LEGGINGS.get(), "item/compressed/armor/compressed_leather_leggings", "item/compressed/armor/compressed_leather_leggings_overlay");
        leatherArmorItem(ArmorRegistration.COMPRESSED_LEATHER_BOOTS.get(), "item/compressed/armor/compressed_leather_boots", "item/compressed/armor/compressed_leather_boots_overlay");
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
        singleTextureGenerated(ItemRegistration.COMPRESSED_STICK.get(), "item/compressed/single/compressed_stick");
        singleTextureGenerated(ItemRegistration.COMPRESSED_LEATHER.get(), "item/compressed/single/compressed_leather");
        singleTextureGenerated(ItemRegistration.COMPRESSED_POWDER_SNOW_BUCKET.get(), "item/compressed/single/compressed_powder_snow_bucket");

        //Projectiles
        singleTextureGenerated(ItemRegistration.COMPRESSED_ARROW.get(), "item/compressed/projectiles/compressed_arrow");
        singleTextureGenerated(ItemRegistration.COMPRESSED_SPECTRAL_ARROW.get(), "item/compressed/projectiles/compressed_spectral_arrow");
        getBuilder(ItemRegistration.COMPRESSED_TIPPED_ARROW.get().toString())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", modLoc("item/compressed/projectiles/compressed_tipped_arrow_head"))
                .texture("layer1", modLoc("item/compressed/projectiles/compressed_tipped_arrow_base"));

        singleTextureGenerated(ItemRegistration.COMPRESSED_SNOWBALL.get(), "item/compressed/projectiles/compressed_snowball");
        //singleTextureGenerated(ItemRegistration.COMPRESSED_TIPPED_ARROW.get(), "item/compressed/arrows/compressed_arrow");


        //Double Compressed
        withExistingParent(ItemRegistration.DOUBLE_COMPRESSED_COBBLED_DEEPSLATE.get());
        withExistingParent(ItemRegistration.DOUBLE_COMPRESSED_COBBLESTONE.get());
        withExistingParent(ItemRegistration.DOUBLE_COMPRESSED_DEEPSLATE.get());
        withExistingParent(ItemRegistration.DOUBLE_COMPRESSED_DIRT.get());
        withExistingParent(ItemRegistration.DOUBLE_COMPRESSED_GRAVEL.get());
        withExistingParent(ItemRegistration.DOUBLE_COMPRESSED_NETHERRACK.get());
        withExistingParent(ItemRegistration.DOUBLE_COMPRESSED_RED_SAND.get());
        withExistingParent(ItemRegistration.DOUBLE_COMPRESSED_SAND.get());
        withExistingParent(ItemRegistration.DOUBLE_COMPRESSED_STONE.get());
    }
}
