package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.registration.Registration;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.*;
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
//        registerPowergen();
        registerCompressor();
        registerSculkCatalyst();

        //Ores
        singleTextureBlock(Registration.COMPRESSED_IRON_ORE.get(), "compressed_iron_ore", "block/compressed/ores/compressed_iron_ore");
        singleTextureBlock(Registration.COMPRESSED_GOLD_ORE.get(), "compressed_gold_ore", "block/compressed/ores/compressed_gold_ore");
        singleTextureBlock(Registration.COMPRESSED_DIAMOND_ORE.get(), "compressed_diamond_ore", "block/compressed/ores/compressed_diamond_ore");
        singleTextureBlock(Registration.COMPRESSED_COPPER_ORE.get(), "compressed_copper_ore", "block/compressed/ores/compressed_copper_ore");
        singleTextureBlock(Registration.COMPRESSED_COAL_ORE.get(), "compressed_coal_ore", "block/compressed/ores/compressed_coal_ore");
        singleTextureBlock(Registration.COMPRESSED_EMERALD_ORE.get(), "compressed_emerald_ore", "block/compressed/ores/compressed_emerald_ore");
        singleTextureBlock(Registration.COMPRESSED_LAPIS_ORE.get(), "compressed_lapis_ore", "block/compressed/ores/compressed_lapis_ore");
        singleTextureBlock(Registration.COMPRESSED_REDSTONE_ORE.get(), "compressed_redstone_ore", "block/compressed/ores/compressed_redstone_ore");
        singleTextureBlock(Registration.COMPRESSED_NETHER_GOLD_ORE.get(), "compressed_nether_gold_ore", "block/compressed/ores/compressed_nether_gold_ore");
        singleTextureBlock(Registration.COMPRESSED_NETHER_QUARTZ_ORE.get(), "compressed_nether_quartz_ore", "block/compressed/ores/compressed_nether_quartz_ore");

        //Deepslate Ores
        singleTextureBlock(Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get(), "compressed_deepslate_iron_ore", "block/compressed/ores/compressed_deepslate_iron_ore");
        singleTextureBlock(Registration.COMPRESSED_DEEPSLATE_GOLD_ORE.get(), "compressed_deepslate_gold_ore", "block/compressed/ores/compressed_deepslate_gold_ore");
        singleTextureBlock(Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(), "compressed_deepslate_diamond_ore", "block/compressed/ores/compressed_deepslate_diamond_ore");
        singleTextureBlock(Registration.COMPRESSED_DEEPSLATE_COPPER_ORE.get(), "compressed_deepslate_copper_ore", "block/compressed/ores/compressed_deepslate_copper_ore");
        singleTextureBlock(Registration.COMPRESSED_DEEPSLATE_COAL_ORE.get(), "compressed_deepslate_coal_ore", "block/compressed/ores/compressed_deepslate_coal_ore");
        singleTextureBlock(Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(), "compressed_deepslate_emerald_ore", "block/compressed/ores/compressed_deepslate_emerald_ore");
        singleTextureBlock(Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(), "compressed_deepslate_lapis_ore", "block/compressed/ores/compressed_deepslate_lapis_ore");
        singleTextureBlock(Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(), "compressed_deepslate_redstone_ore", "block/compressed/ores/compressed_deepslate_redstone_ore");

        //Ingot Blocks
        singleTextureBlock(Registration.COMPRESSED_IRON_BLOCK.get(), "compressed_iron_block", "block/compressed/materials/compressed_iron_block");
        singleTextureBlock(Registration.COMPRESSED_GOLD_BLOCK.get(), "compressed_gold_block", "block/compressed/materials/compressed_gold_block");
        singleTextureBlock(Registration.COMPRESSED_DIAMOND_BLOCK.get(), "compressed_diamond_block", "block/compressed/materials/compressed_diamond_block");
        singleTextureBlock(Registration.COMPRESSED_COPPER_BLOCK.get(), "compressed_copper_block", "block/compressed/materials/compressed_copper_block");
        singleTextureBlock(Registration.COMPRESSED_COAL_BLOCK.get(), "compressed_coal_block", "block/compressed/materials/compressed_coal_block");
        singleTextureBlock(Registration.COMPRESSED_EMERALD_BLOCK.get(), "compressed_emerald_block", "block/compressed/materials/compressed_emerald_block");
        singleTextureBlock(Registration.COMPRESSED_LAPIS_BLOCK.get(), "compressed_lapis_block", "block/compressed/materials/compressed_lapis_block");
        singleTextureBlock(Registration.COMPRESSED_REDSTONE_BLOCK.get(), "compressed_redstone_block", "block/compressed/materials/compressed_redstone_block");
        singleTextureBlock(Registration.COMPRESSED_NETHERITE_BLOCK.get(), "compressed_netherite_block", "block/compressed/materials/compressed_netherite_block");

        //Raw Blocks
        singleTextureBlock(Registration.COMPRESSED_RAW_IRON_BLOCK.get(), "compressed_raw_iron_block", "block/compressed/materials/compressed_raw_iron_block");
        singleTextureBlock(Registration.COMPRESSED_RAW_GOLD_BLOCK.get(), "compressed_raw_gold_block", "block/compressed/materials/compressed_raw_gold_block");
        singleTextureBlock(Registration.COMPRESSED_RAW_COPPER_BLOCK.get(), "compressed_raw_copper_block", "block/compressed/materials/compressed_raw_copper_block");

        //Basic Blocks
        singleTextureBlock(Registration.COMPRESSED_ANDESITE.get(), "compressed_andesite", "block/compressed/basic/compressed_andesite");
        singleTextureBlock(Registration.COMPRESSED_CALCITE.get(), "compressed_calcite", "block/compressed/basic/compressed_calcite");
        singleTextureBlock(Registration.COMPRESSED_COBBLED_DEEPSLATE.get(), "compressed_cobbled_deepslate", "block/compressed/basic/compressed_cobbled_deepslate");
        singleTextureBlock(Registration.COMPRESSED_COBBLESTONE.get(), "compressed_cobblestone", "block/compressed/basic/compressed_cobblestone");
        singleTextureBlock(Registration.COMPRESSED_DEEPSLATE.get(), "compressed_deepslate", "block/compressed/basic/compressed_deepslate");
        singleTextureBlock(Registration.COMPRESSED_DIORITE.get(), "compressed_diorite", "block/compressed/basic/compressed_diorite");
        singleTextureBlock(Registration.COMPRESSED_DIRT.get(), "compressed_dirt", "block/compressed/basic/compressed_dirt");
        singleTextureBlock(Registration.COMPRESSED_GRANITE.get(), "compressed_granite", "block/compressed/basic/compressed_granite");
        singleTextureBlock(Registration.COMPRESSED_GRAVEL.get(), "compressed_gravel", "block/compressed/basic/compressed_gravel");
        singleTextureBlock(Registration.COMPRESSED_NETHERRACK.get(), "compressed_netherrack", "block/compressed/basic/compressed_netherrack");
        singleTextureBlock(Registration.COMPRESSED_RED_SAND.get(), "compressed_red_sand", "block/compressed/basic/compressed_red_sand");
        singleTextureBlock(Registration.COMPRESSED_SAND.get(), "compressed_sand", "block/compressed/basic/compressed_sand");
        singleTextureBlock(Registration.COMPRESSED_STONE.get(), "compressed_stone", "block/compressed/basic/compressed_stone");
        singleTextureBlock(Registration.COMPRESSED_TUFF.get(), "compressed_tuff", "block/compressed/basic/compressed_tuff");
        singleTextureBlock(Registration.COMPRESSED_CLAY.get(), "compressed_clay", "block/compressed/basic/compressed_clay");
        singleTextureBlock(Registration.COMPRESSED_MOSSY_COBBLESTONE.get(), "compressed_mossy_cobblestone", "block/compressed/basic/compressed_mossy_cobblestone");

        //Polished Blocks
        singleTextureBlock(Registration.COMPRESSED_POLISHED_ANDESITE.get(), "compressed_polished_andesite", "block/compressed/basic/polished/compressed_polished_andesite");
        compressedPillarBlock(Registration.COMPRESSED_POLISHED_BASALT.get(), modLoc("block/compressed/basic/polished/compressed_polished_basalt"));
        singleTextureBlock(Registration.COMPRESSED_POLISHED_BLACKSTONE.get(), "compressed_polished_blackstone", "block/compressed/basic/polished/compressed_polished_blackstone");
        singleTextureBlock(Registration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get(), "compressed_polished_blackstone_bricks", "block/compressed/basic/polished/compressed_polished_blackstone_bricks");
        singleTextureBlock(Registration.COMPRESSED_POLISHED_DEEPSLATE.get(), "compressed_polished_deepslate", "block/compressed/basic/polished/compressed_polished_deepslate");
        singleTextureBlock(Registration.COMPRESSED_POLISHED_DIORITE.get(), "compressed_polished_diorite", "block/compressed/basic/polished/compressed_polished_diorite");
        singleTextureBlock(Registration.COMPRESSED_POLISHED_GRANITE.get(), "compressed_polished_granite", "block/compressed/basic/polished/compressed_polished_granite");

        //Smooth Blocks
        singleTextureBlock(Registration.COMPRESSED_SMOOTH_BASALT.get(), "compressed_smooth_basalt", "block/compressed/basic/smooth/compressed_smooth_basalt");
        singleTextureBlock(Registration.COMPRESSED_SMOOTH_STONE.get(), "compressed_smooth_stone", "block/compressed/basic/smooth/compressed_smooth_stone");

        //Stone Bricks
        singleTextureBlock(Registration.COMPRESSED_CHISELED_STONE_BRICKS.get(), "compressed_chiseled_stone_bricks", "block/compressed/basic/stone_bricks/compressed_chiseled_stone_bricks");
        singleTextureBlock(Registration.COMPRESSED_CRACKED_STONE_BRICKS.get(), "compressed_cracked_stone_bricks", "block/compressed/basic/stone_bricks/compressed_cracked_stone_bricks");
        singleTextureBlock(Registration.COMPRESSED_MOSSY_STONE_BRICKS.get(), "compressed_mossy_stone_bricks", "block/compressed/basic/stone_bricks/compressed_mossy_stone_bricks");
        singleTextureBlock(Registration.COMPRESSED_STONE_BRICKS.get(), "compressed_stone_bricks", "block/compressed/basic/stone_bricks/compressed_stone_bricks");

        //Sandstone
        singleTextureBlock(Registration.COMPRESSED_CHISELED_RED_SANDSTONE.get(), "compressed_chiseled_red_sandstone", "block/compressed/basic/sandstone/compressed_chiseled_red_sandstone");
        singleTextureBlock(Registration.COMPRESSED_CHISELED_SANDSTONE.get(), "compressed_chiseled_sandstone", "block/compressed/basic/sandstone/compressed_chiseled_sandstone");
        singleTextureBlock(Registration.COMPRESSED_CUT_RED_SANDSTONE.get(), "compressed_cut_red_sandstone", "block/compressed/basic/sandstone/compressed_cut_red_sandstone");
        singleTextureBlock(Registration.COMPRESSED_CUT_SANDSTONE.get(), "compressed_cut_sandstone", "block/compressed/basic/sandstone/compressed_cut_sandstone");
        singleTextureBlock(Registration.COMPRESSED_RED_SANDSTONE.get(), "compressed_red_sandstone", "block/compressed/basic/sandstone/compressed_red_sandstone");
        singleTextureBlock(Registration.COMPRESSED_SANDSTONE.get(), "compressed_sandstone", "block/compressed/basic/sandstone/compressed_sandstone");

        //Nether Blocks
        singleTextureBlock(Registration.COMPRESSED_NETHER_QUARTZ_BLOCK.get(), "compressed_nether_quartz_block", "block/compressed/nether/compressed_quartz_block_side");
        compressedPillarBlock(Registration.COMPRESSED_BASALT.get(), modLoc("block/compressed/nether/compressed_basalt"));
        compressedPillarBlock(Registration.COMPRESSED_BLACKSTONE.get(), modLoc("block/compressed/nether/compressed_blackstone"));
        singleTextureBlock(Registration.COMPRESSED_CHISELED_POLISHED_BLACKSTONE.get(), "compressed_chiseled_polished_blackstone", "block/compressed/nether/compressed_chiseled_polished_blackstone");
        singleTextureBlock(Registration.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.get(), "compressed_cracked_polished_blackstone_bricks", "block/compressed/nether/compressed_cracked_polished_blackstone_bricks");
        singleTextureBlock(Registration.COMPRESSED_GILDED_BLACKSTONE.get(), "compressed_gilded_blackstone", "block/compressed/nether/compressed_gilded_blackstone");
        singleTextureBlock(Registration.COMPRESSED_GLOWSTONE.get(), "compressed_glowstone", "block/compressed/nether/compressed_glowstone");
        singleTextureBlock(Registration.COMPRESSED_MAGMA.get(), "compressed_magma", "block/compressed/nether/compressed_magma");
        singleTextureBlock(Registration.COMPRESSED_SOUL_SAND.get(), "compressed_soul_sand", "block/compressed/nether/compressed_soul_sand");
        singleTextureBlock(Registration.COMPRESSED_SOUL_SOIL.get(), "compressed_soul_soil", "block/compressed/nether/compressed_soul_soil");

        //Logs
        compressedPillarBlock(Registration.COMPRESSED_ACACIA_LOG.get(), modLoc("block/compressed/logs/compressed_acacia_log"));
        compressedPillarBlock(Registration.COMPRESSED_BIRCH_LOG.get(), modLoc("block/compressed/logs/compressed_birch_log"));
        compressedPillarBlock(Registration.COMPRESSED_DARK_OAK_LOG.get(), modLoc("block/compressed/logs/compressed_dark_oak_log"));
        compressedPillarBlock(Registration.COMPRESSED_JUNGLE_LOG.get(), modLoc("block/compressed/logs/compressed_jungle_log"));
        compressedPillarBlock(Registration.COMPRESSED_OAK_LOG.get(), modLoc("block/compressed/logs/compressed_oak_log"));
        compressedPillarBlock(Registration.COMPRESSED_SPRUCE_LOG.get(), modLoc("block/compressed/logs/compressed_spruce_log"));
        compressedPillarBlock(Registration.COMPRESSED_CRIMSON_STEM.get(), modLoc("block/compressed/logs/compressed_crimson_stem"));
        compressedPillarBlock(Registration.COMPRESSED_WARPED_STEM.get(), modLoc("block/compressed/logs/compressed_warped_stem"));
        compressedPillarBlock(Registration.COMPRESSED_MANGROVE_LOG.get(), modLoc("block/compressed/logs/compressed_mangrove_log"));
        compressedPillarBlock(Registration.COMPRESSED_MANGROVE_ROOTS.get(), modLoc("block/compressed/logs/compressed_mangrove_roots"));

        //Planks
        singleTextureBlock(Registration.COMPRESSED_ACACIA_PLANKS.get(), "compressed_acacia_planks", "block/compressed/planks/compressed_acacia_planks");
        singleTextureBlock(Registration.COMPRESSED_BIRCH_PLANKS.get(), "compressed_birch_planks", "block/compressed/planks/compressed_birch_planks");
        singleTextureBlock(Registration.COMPRESSED_DARK_OAK_PLANKS.get(), "compressed_dark_oak_planks", "block/compressed/planks/compressed_dark_oak_planks");
        singleTextureBlock(Registration.COMPRESSED_JUNGLE_PLANKS.get(), "compressed_jungle_planks", "block/compressed/planks/compressed_jungle_planks");
        singleTextureBlock(Registration.COMPRESSED_OAK_PLANKS.get(), "compressed_oak_planks", "block/compressed/planks/compressed_oak_planks");
        singleTextureBlock(Registration.COMPRESSED_SPRUCE_PLANKS.get(), "compressed_spruce_planks", "block/compressed/planks/compressed_spruce_planks");
        singleTextureBlock(Registration.COMPRESSED_CRIMSON_PLANKS.get(), "compressed_crimson_planks", "block/compressed/planks/compressed_crimson_planks");
        singleTextureBlock(Registration.COMPRESSED_WARPED_PLANKS.get(), "compressed_warped_planks", "block/compressed/planks/compressed_warped_planks");
        singleTextureBlock(Registration.COMPRESSED_MANGROVE_PLANKS.get(), "compressed_mangrove_planks", "block/compressed/planks/compressed_mangrove_planks");

        //Wool
        singleTextureBlock(Registration.COMPRESSED_BLACK_WOOL.get(), "compressed_black_wool", "block/compressed/wool/compressed_black_wool");
        singleTextureBlock(Registration.COMPRESSED_BLUE_WOOL.get(), "compressed_blue_wool", "block/compressed/wool/compressed_blue_wool");
        singleTextureBlock(Registration.COMPRESSED_BROWN_WOOL.get(), "compressed_brown_wool", "block/compressed/wool/compressed_brown_wool");
        singleTextureBlock(Registration.COMPRESSED_CYAN_WOOL.get(), "compressed_cyan_wool", "block/compressed/wool/compressed_cyan_wool");
        singleTextureBlock(Registration.COMPRESSED_GRAY_WOOL.get(), "compressed_gray_wool", "block/compressed/wool/compressed_gray_wool");
        singleTextureBlock(Registration.COMPRESSED_GREEN_WOOL.get(), "compressed_green_wool", "block/compressed/wool/compressed_green_wool");
        singleTextureBlock(Registration.COMPRESSED_LIGHT_BLUE_WOOL.get(), "compressed_light_blue_wool", "block/compressed/wool/compressed_light_blue_wool");
        singleTextureBlock(Registration.COMPRESSED_LIGHT_GRAY_WOOL.get(), "compressed_light_gray_wool", "block/compressed/wool/compressed_light_gray_wool");
        singleTextureBlock(Registration.COMPRESSED_LIME_WOOL.get(), "compressed_lime_wool", "block/compressed/wool/compressed_lime_wool");
        singleTextureBlock(Registration.COMPRESSED_MAGENTA_WOOL.get(), "compressed_magenta_wool", "block/compressed/wool/compressed_magenta_wool");
        singleTextureBlock(Registration.COMPRESSED_ORANGE_WOOL.get(), "compressed_orange_wool", "block/compressed/wool/compressed_orange_wool");
        singleTextureBlock(Registration.COMPRESSED_PINK_WOOL.get(), "compressed_pink_wool", "block/compressed/wool/compressed_pink_wool");
        singleTextureBlock(Registration.COMPRESSED_PURPLE_WOOL.get(), "compressed_purple_wool", "block/compressed/wool/compressed_purple_wool");
        singleTextureBlock(Registration.COMPRESSED_RED_WOOL.get(), "compressed_red_wool", "block/compressed/wool/compressed_red_wool");
        singleTextureBlock(Registration.COMPRESSED_WHITE_WOOL.get(), "compressed_white_wool", "block/compressed/wool/compressed_white_wool");
        singleTextureBlock(Registration.COMPRESSED_YELLOW_WOOL.get(), "compressed_yellow_wool", "block/compressed/wool/compressed_yellow_wool");

        //Concrete
        singleTextureBlock(Registration.COMPRESSED_BLACK_CONCRETE.get(), "compressed_black_concrete", "block/compressed/concrete/compressed_black_concrete");
        singleTextureBlock(Registration.COMPRESSED_BLUE_CONCRETE.get(), "compressed_blue_concrete", "block/compressed/concrete/compressed_blue_concrete");
        singleTextureBlock(Registration.COMPRESSED_BROWN_CONCRETE.get(), "compressed_brown_concrete", "block/compressed/concrete/compressed_brown_concrete");
        singleTextureBlock(Registration.COMPRESSED_CYAN_CONCRETE.get(), "compressed_cyan_concrete", "block/compressed/concrete/compressed_cyan_concrete");
        singleTextureBlock(Registration.COMPRESSED_GRAY_CONCRETE.get(), "compressed_gray_concrete", "block/compressed/concrete/compressed_gray_concrete");
        singleTextureBlock(Registration.COMPRESSED_GREEN_CONCRETE.get(), "compressed_green_concrete", "block/compressed/concrete/compressed_green_concrete");
        singleTextureBlock(Registration.COMPRESSED_LIGHT_BLUE_CONCRETE.get(), "compressed_light_blue_concrete", "block/compressed/concrete/compressed_light_blue_concrete");
        singleTextureBlock(Registration.COMPRESSED_LIGHT_GRAY_CONCRETE.get(), "compressed_light_gray_concrete", "block/compressed/concrete/compressed_light_gray_concrete");
        singleTextureBlock(Registration.COMPRESSED_LIME_CONCRETE.get(), "compressed_lime_concrete", "block/compressed/concrete/compressed_lime_concrete");
        singleTextureBlock(Registration.COMPRESSED_MAGENTA_CONCRETE.get(), "compressed_magenta_concrete", "block/compressed/concrete/compressed_magenta_concrete");
        singleTextureBlock(Registration.COMPRESSED_ORANGE_CONCRETE.get(), "compressed_orange_concrete", "block/compressed/concrete/compressed_orange_concrete");
        singleTextureBlock(Registration.COMPRESSED_PINK_CONCRETE.get(), "compressed_pink_concrete", "block/compressed/concrete/compressed_pink_concrete");
        singleTextureBlock(Registration.COMPRESSED_PURPLE_CONCRETE.get(), "compressed_purple_concrete", "block/compressed/concrete/compressed_purple_concrete");
        singleTextureBlock(Registration.COMPRESSED_RED_CONCRETE.get(), "compressed_red_concrete", "block/compressed/concrete/compressed_red_concrete");
        singleTextureBlock(Registration.COMPRESSED_WHITE_CONCRETE.get(), "compressed_white_concrete", "block/compressed/concrete/compressed_white_concrete");
        singleTextureBlock(Registration.COMPRESSED_YELLOW_CONCRETE.get(), "compressed_yellow_concrete", "block/compressed/concrete/compressed_yellow_concrete");

        //Concrete Powder
        singleTextureBlock(Registration.COMPRESSED_BLACK_CONCRETE_POWDER.get(), "compressed_black_concrete_powder", "block/compressed/concrete/compressed_black_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_BLUE_CONCRETE_POWDER.get(), "compressed_blue_concrete_powder", "block/compressed/concrete/compressed_blue_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_BROWN_CONCRETE_POWDER.get(), "compressed_brown_concrete_powder", "block/compressed/concrete/compressed_brown_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_CYAN_CONCRETE_POWDER.get(), "compressed_cyan_concrete_powder", "block/compressed/concrete/compressed_cyan_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_GRAY_CONCRETE_POWDER.get(), "compressed_gray_concrete_powder", "block/compressed/concrete/compressed_gray_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_GREEN_CONCRETE_POWDER.get(), "compressed_green_concrete_powder", "block/compressed/concrete/compressed_green_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER.get(), "compressed_light_blue_concrete_powder", "block/compressed/concrete/compressed_light_blue_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER.get(), "compressed_light_gray_concrete_powder", "block/compressed/concrete/compressed_light_gray_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_LIME_CONCRETE_POWDER.get(), "compressed_lime_concrete_powder", "block/compressed/concrete/compressed_lime_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_MAGENTA_CONCRETE_POWDER.get(), "compressed_magenta_concrete_powder", "block/compressed/concrete/compressed_magenta_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_ORANGE_CONCRETE_POWDER.get(), "compressed_orange_concrete_powder", "block/compressed/concrete/compressed_orange_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_PINK_CONCRETE_POWDER.get(), "compressed_pink_concrete_powder", "block/compressed/concrete/compressed_pink_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_PURPLE_CONCRETE_POWDER.get(), "compressed_purple_concrete_powder", "block/compressed/concrete/compressed_purple_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_RED_CONCRETE_POWDER.get(), "compressed_red_concrete_powder", "block/compressed/concrete/compressed_red_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_WHITE_CONCRETE_POWDER.get(), "compressed_white_concrete_powder", "block/compressed/concrete/compressed_white_concrete_powder");
        singleTextureBlock(Registration.COMPRESSED_YELLOW_CONCRETE_POWDER.get(), "compressed_yellow_concrete_powder", "block/compressed/concrete/compressed_yellow_concrete_powder");

        //Snow Blocks
        singleTextureBlock(Registration.COMPRESSED_SNOW_BLOCK.get(), "compressed_snow_block", "block/compressed/basic/snow/compressed_snow");
        singleTextureBlock(Registration.COMPRESSED_POWDER_SNOW.get(), "compressed_powder_snow", "block/compressed/basic/snow/compressed_powder_snow");

        //Sculk Blocks
        singleTextureBlock(Registration.COMPRESSED_SCULK.get(), "compressed_sculk", "block/compressed/sculk/compressed_sculk");
    }

    private void registerCompressor()
    {
        ResourceLocation BASE = modLoc("block/compressor/compressor_back");
        ResourceLocation BACK = modLoc("block/compressor/compressor_back_on");
        ResourceLocation FRONT = modLoc("block/compressor/compressor_front");
        ResourceLocation SIDE = modLoc("block/compressor/compressor_side");

        horizontalBlock(Registration.COMPRESSOR.get(), models().cube("compressor", BASE, BASE, FRONT, BACK, SIDE, SIDE));
    }

    private void registerSculkCatalyst()
    {
        String base = "block/compressed/sculk/compressed_sculk_catalyst_";
        ResourceLocation TOP = modLoc(base + "top");
        ResourceLocation SIDE = modLoc(base + "side");
        ResourceLocation BOTTOM = modLoc(base + "bottom");

        horizontalBlock(Registration.COMPRESSED_SCULK_CATALYST.get(), models().cube("compressed_sculk_catalyst", BOTTOM, TOP, SIDE, SIDE, SIDE, SIDE));
    }

//    private void registerPowergen()
//    {
//        BlockModelBuilder frame = models().getBuilder("block/powergen/main");
//        frame.parent(models().getExistingFile(mcLoc("cube")));
//
//        floatingCube(frame, 0f, 0f, 0f, 1f, 16f, 1f);
//        floatingCube(frame, 15f, 0f, 0f, 16f, 16f, 1f);
//        floatingCube(frame, 0f, 0f, 15f, 1f, 16f, 16f);
//        floatingCube(frame, 15f, 0f, 15f, 16f, 16f, 16f);
//
//        floatingCube(frame, 1f, 0f, 0f, 15f, 1f, 1f);
//        floatingCube(frame, 1f, 15f, 0f, 15f, 16f, 1f);
//        floatingCube(frame, 1f, 0f, 15f, 15f, 1f, 16f);
//        floatingCube(frame, 1f, 15f, 15f, 15f, 16f, 16f);
//
//        floatingCube(frame, 0f, 0f, 1f, 1f, 1f, 15f);
//        floatingCube(frame, 15f, 0f, 1f, 16f, 1f, 15f);
//        floatingCube(frame, 0f, 15f, 1f, 1f, 16f, 15f);
//        floatingCube(frame, 15f, 15f, 1f, 16f, 16f, 15f);
//
//        floatingCube(frame, 1f, 1f, 1f, 15f, 15f, 15f);
//
//        frame.texture("window", modLoc("block/powergen_window"));
//        frame.texture("particle", modLoc("block/powergen_off"));
//
//        createPowergenModel(Registration.ULTIMATE_POWERGEN.get(), frame);
//    }

    private void floatingCube(BlockModelBuilder builder, float fx, float fy, float fz, float tx, float ty, float tz)
    {
        builder.element().from(fx, fy, fz).to(tx, ty, tz).allFaces((direction, faceBuilder) -> faceBuilder.texture("#window")).end();
    }

    private void createPowergenModel(Block block, BlockModelBuilder frame)
    {
        BlockModelBuilder singleOff = models().getBuilder("block/powergen/singleoff")
                .element().from(3, 3, 3).to(13, 13, 13).face(Direction.DOWN).texture("#single").end().end()
                .texture("single", modLoc("block/powergen_empty"));
        BlockModelBuilder singleOn = models().getBuilder("block/powergen/singleon")
                .element().from(2, 2, 2).to(14, 14, 14).face(Direction.DOWN).texture("#single").end().end()
                .texture("single", modLoc("block/powergen_on"));

        MultiPartBlockStateBuilder bld = getMultipartBuilder(block);

        bld.part().modelFile(frame).addModel();

        BlockModelBuilder[] models = new BlockModelBuilder[]{singleOff, singleOn};
        for (int i = 0; i < 2; i++)
        {
            boolean powered = i == 1;
            bld.part().modelFile(models[i]).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationX(180).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationX(90).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationX(270).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationY(90).rotationX(90).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationY(270).rotationX(90).addModel().condition(BlockStateProperties.POWERED, powered);
        }
    }
}
