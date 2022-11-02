package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.dataGen.providers.BaseRecipeProvider;
import com.VoidCallerZ.uc.registration.*;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class ucRecipes extends BaseRecipeProvider
{
    public ucRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        CompressorRecipe(Items.IRON_INGOT, ItemRegistration.COMPRESSED_COAL.get(), Items.GOLD_BLOCK, BlockRegistration.IRON_COMPRESSOR.get(), consumer);
        CompressorRecipe(ItemRegistration.COMPRESSED_IRON_INGOT.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), Items.DIAMOND_BLOCK, BlockRegistration.GOLDEN_COMPRESSOR.get(), consumer);
        CompressorRecipe(ItemRegistration.COMPRESSED_GOLD_INGOT.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), Items.NETHERITE_BLOCK, BlockRegistration.DIAMOND_COMPRESSOR.get(), consumer);
        CompressorRecipe(ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), ItemRegistration.COMPRESSED_DIAMOND_BLOCK.get(), BlockRegistration.NETHERITE_COMPRESSOR.get(), consumer);

        //Compression & decompression of most blocks
        //Material Blocks
        //Compressed Ingots -> Compressed Blocks
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_IRON_BLOCK.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_GOLD_BLOCK.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_DIAMOND_BLOCK.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_COPPER_BLOCK.get(), ItemRegistration.COMPRESSED_COPPER_INGOT.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_COAL_BLOCK.get(), ItemRegistration.COMPRESSED_COAL.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_EMERALD_BLOCK.get(), ItemRegistration.COMPRESSED_EMERALD_GEM.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_LAPIS_BLOCK.get(), ItemRegistration.COMPRESSED_LAPIS.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_REDSTONE_BLOCK.get(), ItemRegistration.COMPRESSED_REDSTONE.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_NETHERITE_BLOCK.get(), ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), 9, consumer);

        //Material Blocks -> Compressed Blocks
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_IRON_BLOCK.get(), Blocks.IRON_BLOCK, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_GOLD_BLOCK.get(), Blocks.GOLD_BLOCK, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_DIAMOND_BLOCK.get(), Blocks.DIAMOND_BLOCK, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_COPPER_BLOCK.get(), Blocks.COPPER_BLOCK, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_COAL_BLOCK.get(), Blocks.COAL_BLOCK, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_EMERALD_BLOCK.get(), Blocks.EMERALD_BLOCK, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_LAPIS_BLOCK.get(), Blocks.LAPIS_BLOCK, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_REDSTONE_BLOCK.get(), Blocks.REDSTONE_BLOCK, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_NETHERITE_BLOCK.get(), Blocks.NETHERITE_BLOCK, consumer);

        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_IRON_INGOT.get(), Items.IRON_INGOT, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_GOLD_INGOT.get(), Items.GOLD_INGOT, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), Items.DIAMOND, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_COPPER_INGOT.get(), Items.COPPER_INGOT, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_COAL.get(), Items.COAL, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_EMERALD_GEM.get(), Items.EMERALD, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_LAPIS.get(), Items.LAPIS_LAZULI, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_REDSTONE.get(), Items.REDSTONE, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), Items.NETHERITE_INGOT, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), Items.GOLD_NUGGET, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_IRON_NUGGET.get(), Items.IRON_NUGGET, 9, consumer);

        FourItemMaterialCompressionRecipeBuilder(BlockRegistration.COMPRESSED_NETHER_QUARTZ_BLOCK.get(), ItemRegistration.COMPRESSED_QUARTZ.get(), 4, consumer);

        //Raw Blocks
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_RAW_IRON_BLOCK.get(), ItemRegistration.COMPRESSED_RAW_IRON.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_RAW_GOLD_BLOCK.get(), ItemRegistration.COMPRESSED_RAW_GOLD.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_RAW_COPPER_BLOCK.get(), ItemRegistration.COMPRESSED_RAW_COPPER.get(), 9, consumer);

        //Basic Blocks
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_ANDESITE.get(), Items.ANDESITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CALCITE.get(), Items.CALCITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_COBBLED_DEEPSLATE.get(), Items.COBBLED_DEEPSLATE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_COBBLESTONE.get(), Items.COBBLESTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE.get(), Items.DEEPSLATE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_DIORITE.get(), Items.DIORITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_DIRT.get(), Items.DIRT, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_GRANITE.get(), Items.GRANITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_GRAVEL.get(), Items.GRAVEL, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_NETHERRACK.get(), Items.NETHERRACK, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_RED_SAND.get(), Items.RED_SAND, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_SAND.get(), Items.SAND, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_STONE.get(), Items.STONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_TUFF.get(), Items.TUFF, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CLAY.get(), Items.CLAY, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_MOSSY_COBBLESTONE.get(), Items.MOSSY_COBBLESTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_BONE_BLOCK.get(), Items.BONE_BLOCK, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_HAY_BLOCK.get(), Items.HAY_BLOCK, 9, consumer);

        //Polished Blocks
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_POLISHED_ANDESITE.get(), Items.POLISHED_ANDESITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_POLISHED_BASALT.get(), Items.POLISHED_BASALT, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_POLISHED_DEEPSLATE.get(), Items.POLISHED_DEEPSLATE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE.get(), Items.POLISHED_BLACKSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get(), Items.POLISHED_BLACKSTONE_BRICKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_POLISHED_DIORITE.get(), Items.POLISHED_DIORITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_POLISHED_GRANITE.get(), Items.POLISHED_GRANITE, 9, consumer);

        //Smooth Blocks
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_SMOOTH_BASALT.get(), Items.SMOOTH_BASALT, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_SMOOTH_STONE.get(), Items.SMOOTH_STONE, 9, consumer);

        //Stone Bricks
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CHISELED_STONE_BRICKS.get(), Items.CHISELED_STONE_BRICKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CRACKED_STONE_BRICKS.get(), Items.CRACKED_STONE_BRICKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_MOSSY_STONE_BRICKS.get(), Items.MOSSY_STONE_BRICKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_STONE_BRICKS.get(), Items.STONE_BRICKS, 9, consumer);

        //Sandstone
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CHISELED_RED_SANDSTONE.get(), Items.CHISELED_RED_SANDSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CHISELED_SANDSTONE.get(), Items.CHISELED_SANDSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CUT_RED_SANDSTONE.get(), Items.CUT_RED_SANDSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CUT_SANDSTONE.get(), Items.CUT_SANDSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_RED_SANDSTONE.get(), Items.RED_SANDSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_SANDSTONE.get(), Items.SANDSTONE, 9, consumer);

        //Nether Blocks
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_NETHER_QUARTZ_BLOCK.get(), Items.QUARTZ_BLOCK, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_BASALT.get(), Items.BASALT, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_BLACKSTONE.get(), Items.BLACKSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CHISELED_POLISHED_BLACKSTONE.get(), Items.CHISELED_POLISHED_BLACKSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.get(), Items.CRACKED_POLISHED_BLACKSTONE_BRICKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_GILDED_BLACKSTONE.get(), Items.GILDED_BLACKSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_GLOWSTONE.get(), Items.GLOWSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_MAGMA.get(), Items.MAGMA_BLOCK, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_SOUL_SAND.get(), Items.SOUL_SAND, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_SOUL_SOIL.get(), Items.SOUL_SOIL, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CRIMSON_NYLIUM.get(), Items.CRIMSON_NYLIUM, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CRYING_OBSIDIAN.get(), Items.CRYING_OBSIDIAN, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_LODESTONE.get(), Items.LODESTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_NETHER_WART_BLOCK.get(), Items.NETHER_WART_BLOCK, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_RED_NETHER_BRICKS.get(), Items.RED_NETHER_BRICKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_SHROOMLIGHT.get(), Items.SHROOMLIGHT, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_WARPED_NYLIUM.get(), Items.WARPED_NYLIUM, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_WARPED_WART_BLOCK.get(), Items.WARPED_WART_BLOCK, 9, consumer);

        //Logs & Planks
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_ACACIA_LOG.get(), Items.ACACIA_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_ACACIA_PLANKS.get(), Items.ACACIA_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_BIRCH_LOG.get(), Items.BIRCH_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_BIRCH_PLANKS.get(), Items.BIRCH_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_DARK_OAK_LOG.get(), Items.DARK_OAK_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_DARK_OAK_PLANKS.get(), Items.DARK_OAK_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_JUNGLE_LOG.get(), Items.JUNGLE_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_JUNGLE_PLANKS.get(), Items.JUNGLE_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_OAK_LOG.get(), Items.OAK_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_OAK_PLANKS.get(), Items.OAK_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_SPRUCE_LOG.get(), Items.SPRUCE_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_SPRUCE_PLANKS.get(), Items.SPRUCE_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CRIMSON_STEM.get(), Items.CRIMSON_STEM, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_CRIMSON_PLANKS.get(), Items.CRIMSON_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_WARPED_STEM.get(), Items.WARPED_STEM, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_WARPED_PLANKS.get(), Items.WARPED_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_MANGROVE_LOG.get(), Items.MANGROVE_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_MANGROVE_PLANKS.get(), Items.MANGROVE_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_MANGROVE_ROOTS.get(), Items.MANGROVE_ROOTS, 9, consumer);

        //Leaves
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_ACACIA_LEAVES.get(), Items.ACACIA_LEAVES, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_BIRCH_LEAVES.get(), Items.BIRCH_LEAVES, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_DARK_OAK_LEAVES.get(), Items.DARK_OAK_LEAVES, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_JUNGLE_LEAVES.get(), Items.JUNGLE_LEAVES, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_MANGROVE_LEAVES.get(), Items.MANGROVE_LEAVES, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_OAK_LEAVES.get(), Items.OAK_LEAVES, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_SPRUCE_LEAVES.get(), Items.SPRUCE_LEAVES, 9, consumer);

        //Wool
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_BLACK_WOOL.get(), Items.BLACK_WOOL, ColorBlockType.WOOL, Items.BLACK_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_BLUE_WOOL.get(), Items.BLUE_WOOL, ColorBlockType.WOOL, Items.BLUE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_BROWN_WOOL.get(), Items.BROWN_WOOL, ColorBlockType.WOOL, Items.BROWN_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_CYAN_WOOL.get(), Items.CYAN_WOOL, ColorBlockType.WOOL, Items.CYAN_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_GRAY_WOOL.get(), Items.GRAY_WOOL, ColorBlockType.WOOL, Items.GRAY_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_GREEN_WOOL.get(), Items.GREEN_WOOL, ColorBlockType.WOOL, Items.GREEN_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_LIGHT_BLUE_WOOL.get(), Items.LIGHT_BLUE_WOOL, ColorBlockType.WOOL, Items.LIGHT_BLUE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_LIGHT_GRAY_WOOL.get(), Items.LIGHT_GRAY_WOOL, ColorBlockType.WOOL, Items.LIGHT_GRAY_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_LIME_WOOL.get(), Items.LIME_WOOL, ColorBlockType.WOOL, Items.LIME_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_MAGENTA_WOOL.get(), Items.MAGENTA_WOOL, ColorBlockType.WOOL, Items.MAGENTA_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_ORANGE_WOOL.get(), Items.ORANGE_WOOL, ColorBlockType.WOOL, Items.ORANGE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_PINK_WOOL.get(), Items.PINK_WOOL, ColorBlockType.WOOL, Items.PINK_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_PURPLE_WOOL.get(), Items.PURPLE_WOOL, ColorBlockType.WOOL, Items.PURPLE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_RED_WOOL.get(), Items.RED_WOOL, ColorBlockType.WOOL, Items.RED_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_WHITE_WOOL.get(), Items.WHITE_WOOL, ColorBlockType.WOOL, Items.WHITE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_YELLOW_WOOL.get(), Items.YELLOW_WOOL, ColorBlockType.WOOL, Items.YELLOW_DYE, consumer);

        //Concrete
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_BLACK_CONCRETE.get(), Items.BLACK_CONCRETE, ColorBlockType.CONCRETE, Items.BLACK_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_BLUE_CONCRETE.get(), Items.BLUE_CONCRETE, ColorBlockType.CONCRETE, Items.BLUE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_BROWN_CONCRETE.get(), Items.BROWN_CONCRETE, ColorBlockType.CONCRETE, Items.BROWN_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_CYAN_CONCRETE.get(), Items.CYAN_CONCRETE, ColorBlockType.CONCRETE, Items.CYAN_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_GRAY_CONCRETE.get(), Items.GRAY_CONCRETE, ColorBlockType.CONCRETE, Items.GRAY_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_GREEN_CONCRETE.get(), Items.GREEN_CONCRETE, ColorBlockType.CONCRETE, Items.GREEN_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE.get(), Items.LIGHT_BLUE_CONCRETE, ColorBlockType.CONCRETE, Items.LIGHT_BLUE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE.get(), Items.LIGHT_GRAY_CONCRETE, ColorBlockType.CONCRETE, Items.LIGHT_GRAY_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_LIME_CONCRETE.get(), Items.LIME_CONCRETE, ColorBlockType.CONCRETE, Items.LIME_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_MAGENTA_CONCRETE.get(), Items.MAGENTA_CONCRETE, ColorBlockType.CONCRETE, Items.MAGENTA_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_ORANGE_CONCRETE.get(), Items.ORANGE_CONCRETE, ColorBlockType.CONCRETE, Items.ORANGE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_PINK_CONCRETE.get(), Items.PINK_CONCRETE, ColorBlockType.CONCRETE, Items.PINK_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_PURPLE_CONCRETE.get(), Items.PURPLE_CONCRETE, ColorBlockType.CONCRETE, Items.PURPLE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_RED_CONCRETE.get(), Items.RED_CONCRETE, ColorBlockType.CONCRETE, Items.RED_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_WHITE_CONCRETE.get(), Items.WHITE_CONCRETE, ColorBlockType.CONCRETE, Items.WHITE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_YELLOW_CONCRETE.get(), Items.YELLOW_CONCRETE, ColorBlockType.CONCRETE, Items.YELLOW_DYE, consumer);

        //Concrete Powder
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_BLACK_CONCRETE_POWDER.get(), Items.BLACK_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.BLACK_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_BLUE_CONCRETE_POWDER.get(), Items.BLUE_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.BLUE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_BROWN_CONCRETE_POWDER.get(), Items.BROWN_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.BROWN_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_CYAN_CONCRETE_POWDER.get(), Items.CYAN_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.CYAN_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_GRAY_CONCRETE_POWDER.get(), Items.GRAY_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.GRAY_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_GREEN_CONCRETE_POWDER.get(), Items.GREEN_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.GREEN_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER.get(), Items.LIGHT_BLUE_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.LIGHT_BLUE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER.get(), Items.LIGHT_GRAY_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.LIGHT_GRAY_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_LIME_CONCRETE_POWDER.get(), Items.LIME_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.LIME_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_MAGENTA_CONCRETE_POWDER.get(), Items.MAGENTA_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.MAGENTA_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_ORANGE_CONCRETE_POWDER.get(), Items.ORANGE_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.ORANGE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_PINK_CONCRETE_POWDER.get(), Items.PINK_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.PINK_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_PURPLE_CONCRETE_POWDER.get(), Items.PURPLE_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.PURPLE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_RED_CONCRETE_POWDER.get(), Items.RED_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.RED_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_WHITE_CONCRETE_POWDER.get(), Items.WHITE_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.WHITE_DYE, consumer);
        CompressedWoolRecipeBuilder(BlockRegistration.COMPRESSED_YELLOW_CONCRETE_POWDER.get(), Items.YELLOW_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.YELLOW_DYE, consumer);

        //Glass Blocks
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_GLASS.get(), Items.GLASS, 9, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS.get(), Items.BLACK_STAINED_GLASS, Items.BLACK_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS.get(), Items.BLUE_STAINED_GLASS, Items.BLUE_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS.get(), Items.BROWN_STAINED_GLASS, Items.BROWN_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS.get(), Items.CYAN_STAINED_GLASS, Items.CYAN_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS.get(), Items.GRAY_STAINED_GLASS, Items.GRAY_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS.get(), Items.GREEN_STAINED_GLASS, Items.GREEN_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS.get(), Items.LIGHT_BLUE_STAINED_GLASS, Items.LIGHT_BLUE_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS.get(), Items.LIGHT_GRAY_STAINED_GLASS, Items.LIGHT_GRAY_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS.get(), Items.LIME_STAINED_GLASS, Items.LIME_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS.get(), Items.MAGENTA_STAINED_GLASS, Items.MAGENTA_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS.get(), Items.ORANGE_STAINED_GLASS, Items.ORANGE_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS.get(), Items.PINK_STAINED_GLASS, Items.PINK_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS.get(), Items.PURPLE_STAINED_GLASS, Items.PURPLE_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_RED_STAINED_GLASS.get(), Items.RED_STAINED_GLASS, Items.RED_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS.get(), Items.WHITE_STAINED_GLASS, Items.WHITE_DYE, consumer);
        StainedGlassRecipeBuilder(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS.get(), Items.YELLOW_STAINED_GLASS, Items.YELLOW_DYE, consumer);

        //Glass Panes
        ShapedRecipeBuilder.shaped(BlockRegistration.COMPRESSED_GLASS_PANE.get(), 16).pattern("xxx").pattern("xxx").define('x', BlockRegistration.COMPRESSED_GLASS.get()).group("uc").unlockedBy("has_" + ForgeRegistries.BLOCKS.getKey(BlockRegistration.COMPRESSED_GLASS.get()), InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistration.COMPRESSED_GLASS.get())).save(consumer, ForgeRegistries.BLOCKS.getKey(BlockRegistration.COMPRESSED_GLASS_PANE.get()) + "ucglasspane");
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS_PANE.get(), Items.BLACK_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS_PANE.get(), Items.BLUE_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS_PANE.get(), Items.BROWN_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS_PANE.get(), Items.CYAN_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS_PANE.get(), Items.GRAY_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS_PANE.get(), Items.GREEN_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS_PANE.get(), Items.LIGHT_BLUE_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS_PANE.get(), Items.LIGHT_GRAY_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_LIME_STAINED_GLASS_PANE.get(), Items.LIME_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS_PANE.get(), Items.MAGENTA_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS_PANE.get(), Items.ORANGE_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_PINK_STAINED_GLASS_PANE.get(), Items.PINK_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS_PANE.get(), Items.PURPLE_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_RED_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_RED_STAINED_GLASS_PANE.get(), Items.RED_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS_PANE.get(), Items.WHITE_DYE, consumer);
        StainedGlassPaneRecipeBuilder(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS_PANE.get(), BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS_PANE.get(), Items.YELLOW_DYE, consumer);

        //Obsidian
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_OBSIDIAN.get(), Items.OBSIDIAN, 9, consumer);
        ShapedRecipeBuilder.shaped(Blocks.BEDROCK).pattern("xnx").pattern("nxn").pattern("xnx").define('x', BlockRegistration.COMPRESSED_OBSIDIAN.get()).define('n', BlockRegistration.COMPRESSED_NETHERITE_BLOCK.get()).unlockedBy("has_" + BlockRegistration.COMPRESSED_OBSIDIAN.get(), InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistration.COMPRESSED_OBSIDIAN.get())).group("uc").save(consumer, ForgeRegistries.BLOCKS.getKey(Blocks.BEDROCK) + "_uc");

        //Compressed Smelting & Blasting
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_IRON_ORE.get(), ItemRegistration.COMPRESSED_RAW_IRON.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), 0.7F, 200, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_GOLD_ORE.get(), ItemRegistration.COMPRESSED_RAW_GOLD.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), 0.7F, 200, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_COPPER_ORE.get(), ItemRegistration.COMPRESSED_RAW_COPPER.get(), ItemRegistration.COMPRESSED_COPPER_INGOT.get(), 0.7F, 200, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_DIAMOND_ORE.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), 0.7F, 200, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_COAL_ORE.get(), ItemRegistration.COMPRESSED_COAL.get(), 0.7F, 200, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_EMERALD_ORE.get(), ItemRegistration.COMPRESSED_EMERALD_GEM.get(), 0.7F, 200, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_LAPIS_ORE.get(), ItemRegistration.COMPRESSED_LAPIS.get(), 0.7F, 200, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_REDSTONE_ORE.get(), ItemRegistration.COMPRESSED_REDSTONE.get(), 0.7F, 200, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_ANCIENT_DEBRIS.get(), Items.NETHERITE_INGOT, 5.0F, 200, consumer);

        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_IRON_ORE.get(), ItemRegistration.COMPRESSED_RAW_IRON.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), 0.7F, 200, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_GOLD_ORE.get(), ItemRegistration.COMPRESSED_RAW_GOLD.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), 0.7F, 200, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_COPPER_ORE.get(), ItemRegistration.COMPRESSED_RAW_COPPER.get(), ItemRegistration.COMPRESSED_COPPER_INGOT.get(), 0.7F, 200, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_DIAMOND_ORE.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), 0.7F, 200, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_COAL_ORE.get(), ItemRegistration.COMPRESSED_COAL.get(), 0.7F, 200, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_EMERALD_ORE.get(), ItemRegistration.COMPRESSED_EMERALD_GEM.get(), 0.7F, 200, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_LAPIS_ORE.get(), ItemRegistration.COMPRESSED_LAPIS.get(), 0.7F, 200, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_REDSTONE_ORE.get(), ItemRegistration.COMPRESSED_REDSTONE.get(), 0.7F, 200, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_ANCIENT_DEBRIS.get(), Items.NETHERITE_INGOT, 5.0F, 100, consumer);

        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), 1.0F, 100, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), 1.0F, 100, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get(), ItemRegistration.COMPRESSED_COPPER_INGOT.get(), 1.0F, 100, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), 1.0F, 100, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get(), ItemRegistration.COMPRESSED_COAL.get(), 1.0F, 100, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(), ItemRegistration.COMPRESSED_EMERALD_GEM.get(), 1.0F, 100, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(), ItemRegistration.COMPRESSED_LAPIS.get(), 1.0F, 100, consumer);
        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(), ItemRegistration.COMPRESSED_REDSTONE.get(), 1.0F, 100, consumer);

        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), 1.0F, 100, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), 1.0F, 100, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get(), ItemRegistration.COMPRESSED_COPPER_INGOT.get(), 1.0F, 100, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), 1.0F, 100, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get(), ItemRegistration.COMPRESSED_COAL.get(), 1.0F, 100, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(), ItemRegistration.COMPRESSED_EMERALD_GEM.get(), 1.0F, 100, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(), ItemRegistration.COMPRESSED_LAPIS.get(), 1.0F, 100, consumer);
        BlockBlastingRecipeBuilder(BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(), ItemRegistration.COMPRESSED_REDSTONE.get(), 1.0F, 100, consumer);

        BlockSmeltingRecipeBuilder(BlockRegistration.COMPRESSED_SAND.get(), BlockRegistration.COMPRESSED_GLASS.get().asItem(), 1.0F, 200, consumer);

        //TOOLSItemRegistration
        //Pickaxes
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_PICKAXE.get(), BlockRegistration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_PICKAXE.get(), ItemRegistration.COMPRESSED_COBBLESTONE.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_PICKAXE.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_PICKAXE.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_PICKAXE.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_PICKAXE.get(), ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.PICKAXE, consumer);
        //Axes
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_AXE.get(), BlockRegistration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_AXE.get(), ItemRegistration.COMPRESSED_COBBLESTONE.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_AXE.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_AXE.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_AXE.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_AXE.get(), ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.AXE, consumer);
        //Shovels
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_SHOVEL.get(), BlockRegistration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_SHOVEL.get(), ItemRegistration.COMPRESSED_COBBLESTONE.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_SHOVEL.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_SHOVEL.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_SHOVEL.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_SHOVEL.get(), ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.SHOVEL, consumer);
        //Swords
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_SWORD.get(), BlockRegistration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_SWORD.get(), ItemRegistration.COMPRESSED_COBBLESTONE.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_SWORD.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_SWORD.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_SWORD.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_SWORD.get(), ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.SWORD, consumer);
        //Hoes
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_HOE.get(), BlockRegistration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_HOE.get(), ItemRegistration.COMPRESSED_COBBLESTONE.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_HOE.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_HOE.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_HOE.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_HOE.get(), ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.HOE, consumer);

        //ARMOR
        //Leather
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_LEATHER_HELMET.get(), ItemRegistration.COMPRESSED_LEATHER.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_LEATHER_CHESTPLATE.get(), ItemRegistration.COMPRESSED_LEATHER.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_LEATHER_LEGGINGS.get(), ItemRegistration.COMPRESSED_LEATHER.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_LEATHER_BOOTS.get(), ItemRegistration.COMPRESSED_LEATHER.get(), BodyPart.FEET, consumer);
        //Iron
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_HELMET.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_CHESTPLATE.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_LEGGINGS.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_BOOTS.get(), ItemRegistration.COMPRESSED_IRON_INGOT.get(), BodyPart.FEET, consumer);
        //Gold
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_HELMET.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_CHESTPLATE.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_LEGGINGS.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_BOOTS.get(), ItemRegistration.COMPRESSED_GOLD_INGOT.get(), BodyPart.FEET, consumer);
        //Diamond
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_DIAMOND_HELMET.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_DIAMOND_CHESTPLATE.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_DIAMOND_LEGGINGS.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_DIAMOND_BOOTS.get(), ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.FEET, consumer);
        //Netherite
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_NETHERITE_HELMET.get(), ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_NETHERITE_CHESTPLATE.get(), ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_NETHERITE_LEGGINGS.get(), ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_NETHERITE_BOOTS.get(), ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.FEET, consumer);

        //FOOD
        //Basic (Raw) Food
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_APPLE.get(), Items.APPLE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_BEEF.get(), Items.BEEF, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_BEETROOT.get(), Items.BEETROOT, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_BREAD.get(), Items.BREAD, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_CARROT.get(), Items.CARROT, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_CHICKEN.get(), Items.CHICKEN, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_COD.get(), Items.COD, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKIE.get(), Items.COOKIE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_DRIED_KELP.get(), Items.DRIED_KELP, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_GLOW_BERRIES.get(), Items.GLOW_BERRIES, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_GOLDEN_APPLE.get(), Items.GOLDEN_APPLE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_ENCHANTED_GOLDEN_APPLE.get(), Items.ENCHANTED_GOLDEN_APPLE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_MELON_SLICE.get(), Items.MELON_SLICE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_MUTTON.get(), Items.MUTTON, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_POISONOUS_POTATO.get(), Items.POISONOUS_POTATO, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_PORKCHOP.get(), Items.PORKCHOP, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_POTATO.get(), Items.POTATO, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_PUFFERFISH.get(), Items.PUFFERFISH, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_PUMPKIN_PIE.get(), Items.PUMPKIN_PIE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_RABBIT.get(), Items.RABBIT, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_ROTTEN_FLESH.get(), Items.ROTTEN_FLESH, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_SALMON.get(), Items.SALMON, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_SPIDER_EYE.get(), Items.SPIDER_EYE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_SWEET_BERRIES.get(), Items.SWEET_BERRIES, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_TROPICAL_FISH.get(), Items.TROPICAL_FISH, consumer);
        //Stew Food
        StewFoodRecipeBuilder(FoodRegistration.COMPRESSED_BEETROOT_SOUP.get(), Items.BEETROOT_SOUP, consumer);
        StewFoodRecipeBuilder(FoodRegistration.COMPRESSED_MUSHROOM_STEW.get(), Items.MUSHROOM_STEW, consumer);
        StewFoodRecipeBuilder(FoodRegistration.COMPRESSED_RABBIT_STEW.get(), Items.RABBIT_STEW, consumer);
        //Cooking Food
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_BAKED_POTATO.get(), FoodRegistration.COMPRESSED_POTATO.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_BEEF.get(), FoodRegistration.COMPRESSED_BEEF.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_CHICKEN.get(), FoodRegistration.COMPRESSED_CHICKEN.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_COD.get(), FoodRegistration.COMPRESSED_COD.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_MUTTON.get(), FoodRegistration.COMPRESSED_MUTTON.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_PORKCHOP.get(), FoodRegistration.COMPRESSED_PORKCHOP.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_RABBIT.get(), FoodRegistration.COMPRESSED_RABBIT.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_SALMON.get(), FoodRegistration.COMPRESSED_SALMON.get(), consumer);

        //Single Items
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_FLINT.get(), Items.FLINT, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_STICK.get(), Items.STICK, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_LEATHER.get(), Items.LEATHER, 9, consumer);
        FourItemMaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_GLOWSTONE_DUST.get(), Items.GLOWSTONE_DUST, 9, consumer);
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_GLOWSTONE.get(), ItemRegistration.COMPRESSED_GLOWSTONE_DUST.get(), 9, consumer);

        //Snowball & Bucket of Powder Snow
        BasicFoodRecipeBuilder(ItemRegistration.COMPRESSED_SNOWBALL.get(), Items.SNOWBALL, consumer);
        BasicFoodRecipeBuilder(ItemRegistration.COMPRESSED_POWDER_SNOW_BUCKET.get(), Items.POWDER_SNOW_BUCKET, consumer);

        //Snow
        ShapedRecipeBuilder.shaped(Items.SNOW, 54).pattern("xxx").define('x', BlockRegistration.COMPRESSED_SNOW_BLOCK.get()).unlockedBy("has_" + ForgeRegistries.BLOCKS.getKey(BlockRegistration.COMPRESSED_SNOW_BLOCK.get()), InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistration.COMPRESSED_SNOW_BLOCK.get()));

        //Sculk
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_SCULK.get(), Items.SCULK, 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.COMPRESSED_SCULK_CATALYST.get(), Items.SCULK_CATALYST, 9, consumer);

        //Projectiles
        ShapedRecipeBuilder.shaped(ItemRegistration.COMPRESSED_ARROW.get(), 4).pattern("x").pattern("s").pattern("f").define('x', ItemRegistration.COMPRESSED_FLINT.get()).define('s', Items.STICK).define('f', Items.FEATHER).group("uc").unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_FLINT.get()), InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COMPRESSED_FLINT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ItemRegistration.COMPRESSED_SPECTRAL_ARROW.get(), 2).pattern(" x ").pattern("xax").pattern(" x ").define('x', Items.GLOWSTONE_DUST).define('a', ItemRegistration.COMPRESSED_ARROW.get()).group("uc").unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_ARROW.get()), InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COMPRESSED_ARROW.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ItemRegistration.COMPRESSED_SNOWBALL.get(), 16).requires(Items.SNOWBALL, 4).group("uc").unlockedBy("has_" + Items.SNOWBALL, InventoryChangeTrigger.TriggerInstance.hasItems(Items.SNOWBALL));

        //Torches
        ShapedRecipeBuilder.shaped(Items.TORCH, 36).pattern("x").pattern("s").define('x', ItemRegistration.COMPRESSED_COAL.get()).define('s', ItemRegistration.COMPRESSED_STICK.get()).group("uc").unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_STICK.get()), InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COMPRESSED_STICK.get())).save(consumer, "torch1");
        ShapedRecipeBuilder.shaped(Items.SOUL_TORCH, 36).pattern("x").pattern("s").pattern("y").define('x', ItemRegistration.COMPRESSED_COAL.get()).define('s', ItemRegistration.COMPRESSED_STICK.get()).define('y', BlockRegistration.COMPRESSED_SOUL_SAND.get()).group("uc").unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_STICK.get()), InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COMPRESSED_STICK.get())).save(consumer, "soul_torch1");

        //Custom Additional Blasting & Smelting Recipes
        //Iron
        ItemBlastingRecipeBuilder(ToolRegistration.COMPRESSED_IRON_PICKAXE.get(), ItemRegistration.COMPRESSED_IRON_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ToolRegistration.COMPRESSED_IRON_AXE.get(), ItemRegistration.COMPRESSED_IRON_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ToolRegistration.COMPRESSED_IRON_SHOVEL.get(), ItemRegistration.COMPRESSED_IRON_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ToolRegistration.COMPRESSED_IRON_SWORD.get(), ItemRegistration.COMPRESSED_IRON_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ToolRegistration.COMPRESSED_IRON_HOE.get(), ItemRegistration.COMPRESSED_IRON_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_HELMET.get(), ItemRegistration.COMPRESSED_IRON_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_CHESTPLATE.get(), ItemRegistration.COMPRESSED_IRON_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_LEGGINGS.get(), ItemRegistration.COMPRESSED_IRON_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_BOOTS.get(), ItemRegistration.COMPRESSED_IRON_NUGGET.get(), 1, 100, consumer);

        //Gold
        ItemBlastingRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_PICKAXE.get(), ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_AXE.get(), ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_SHOVEL.get(), ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_SWORD.get(), ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_HOE.get(), ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_HELMET.get(), ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_CHESTPLATE.get(), ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_LEGGINGS.get(), ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), 1, 100, consumer);
        ItemBlastingRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_BOOTS.get(), ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), 1, 100, consumer);

        //Compressor Items -> Compressed Items
        CompressorRecipeBuilder(Items.COAL, ItemRegistration.COMPRESSED_COAL.get(), 9, consumer);
        CompressorRecipeBuilder(Items.COPPER_INGOT, ItemRegistration.COMPRESSED_COPPER_INGOT.get(), 9, consumer);
        CompressorRecipeBuilder(Items.IRON_INGOT, ItemRegistration.COMPRESSED_IRON_INGOT.get(), 9, consumer);
        CompressorRecipeBuilder(Items.GOLD_INGOT, ItemRegistration.COMPRESSED_GOLD_INGOT.get(), 9, consumer);
        CompressorRecipeBuilder(Items.DIAMOND, ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), 9, consumer);
        CompressorRecipeBuilder(Items.EMERALD, ItemRegistration.COMPRESSED_EMERALD_GEM.get(), 9, consumer);
        CompressorRecipeBuilder(Items.LAPIS_LAZULI, ItemRegistration.COMPRESSED_LAPIS.get(), 9, consumer);
        CompressorRecipeBuilder(Items.REDSTONE, ItemRegistration.COMPRESSED_REDSTONE.get(), 9, consumer);
        CompressorRecipeBuilder(Items.NETHERITE_INGOT, ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), 9, consumer);

        CompressorRecipeBuilder(Items.GOLD_NUGGET, ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), 9, consumer);
        CompressorRecipeBuilder(Items.IRON_NUGGET, ItemRegistration.COMPRESSED_IRON_NUGGET.get(), 9, consumer);


        //Double Compressed
        CompressorDecompressorRecipeBuilder(BlockRegistration.DOUBLE_COMPRESSED_COBBLED_DEEPSLATE.get(), ItemRegistration.COMPRESSED_COBBLED_DEEPSLATE.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.DOUBLE_COMPRESSED_COBBLESTONE.get(), ItemRegistration.COMPRESSED_COBBLESTONE.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.DOUBLE_COMPRESSED_DEEPSLATE.get(), ItemRegistration.COMPRESSED_DEEPSLATE.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.DOUBLE_COMPRESSED_DIRT.get(), ItemRegistration.COMPRESSED_DIRT.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.DOUBLE_COMPRESSED_GRAVEL.get(), ItemRegistration.COMPRESSED_GRAVEL.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.DOUBLE_COMPRESSED_NETHERRACK.get(), ItemRegistration.COMPRESSED_NETHERRACK.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.DOUBLE_COMPRESSED_RED_SAND.get(), ItemRegistration.COMPRESSED_RED_SAND.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.DOUBLE_COMPRESSED_SAND.get(), ItemRegistration.COMPRESSED_SAND.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(BlockRegistration.DOUBLE_COMPRESSED_STONE.get(), ItemRegistration.COMPRESSED_STONE.get(), 9, consumer);
    }
}
