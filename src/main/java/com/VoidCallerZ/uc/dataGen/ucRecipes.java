package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.dataGen.custom.CompressorRecipeBuilder;
import com.VoidCallerZ.uc.setup.registration.*;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
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
//        ShapedRecipeBuilder.shaped(Registration.ULTIMATE_POWERGEN.get())
//                .pattern("iii")
//                .pattern("iri")
//                .pattern("iii")
//                .define('i', Registration.COMPRESSED_IRON_INGOT.get())
//                .define('r', Tags.Items.STORAGE_BLOCKS_REDSTONE)
//                .group("uc")
//                .unlockedBy("compressed_iron_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COMPRESSED_IRON_INGOT.get()))
//                .save(consumer);

        ShapedRecipeBuilder.shaped(Registration.COMPRESSOR.get())
                .pattern("iii")
                .pattern("dgd")
                .pattern("iii")
                .define('i', Registration.COMPRESSED_IRON_INGOT.get())
                .define('d', Items.DIAMOND)
                .define('g', Registration.COMPRESSED_GOLD_BLOCK.get())
                .group("uc")
                .unlockedBy("compressed_gold_iron_ingot_diamond", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COMPRESSED_GOLD_INGOT.get(),
                        Registration.COMPRESSED_IRON_INGOT.get(),
                        Items.DIAMOND))
                .save(consumer);

        //Compression & decompression of most blocks
        //Material Blocks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_IRON_BLOCK.get(),
                Registration.COMPRESSED_IRON_INGOT.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_GOLD_BLOCK.get(),
                Registration.COMPRESSED_GOLD_INGOT.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DIAMOND_BLOCK.get(),
                Registration.COMPRESSED_DIAMOND_GEM.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_COPPER_BLOCK.get(),
                Registration.COMPRESSED_COPPER_INGOT.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_COAL_BLOCK.get(),
                Registration.COMPRESSED_COAL.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_EMERALD_BLOCK.get(),
                Registration.COMPRESSED_EMERALD_GEM.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_LAPIS_BLOCK.get(),
                Registration.COMPRESSED_LAPIS.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_REDSTONE_BLOCK.get(),
                Registration.COMPRESSED_REDSTONE.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_NETHERITE_BLOCK.get(),
                Registration.COMPRESSED_NETHERITE_INGOT.get(), 9, consumer);

        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_IRON_INGOT.get(), Items.IRON_INGOT, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_GOLD_INGOT.get(), Items.GOLD_INGOT, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_DIAMOND_GEM.get(), Items.DIAMOND, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_COPPER_INGOT.get(), Items.COPPER_INGOT, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_COAL.get(), Items.COAL, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_EMERALD_GEM.get(), Items.EMERALD, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_LAPIS.get(), Items.LAPIS_LAZULI, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_REDSTONE.get(), Items.REDSTONE, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_NETHERITE_INGOT.get(), Items.NETHERITE_INGOT, 9, consumer);

        FourItemMaterialCompressionRecipeBuilder(Registration.COMPRESSED_NETHER_QUARTZ_BLOCK.get(), ItemRegistration.COMPRESSED_QUARTZ.get(), 4, consumer);

        //Raw Blocks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RAW_IRON_BLOCK.get(),
                Registration.COMPRESSED_RAW_IRON.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RAW_GOLD_BLOCK.get(),
                Registration.COMPRESSED_RAW_GOLD.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RAW_COPPER_BLOCK.get(),
                Registration.COMPRESSED_RAW_COPPER.get(), 9, consumer);

        //Basic Blocks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_ANDESITE.get(), Items.ANDESITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CALCITE.get(), Items.CALCITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_COBBLED_DEEPSLATE.get(), Items.COBBLED_DEEPSLATE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_COBBLESTONE.get(), Items.COBBLESTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DEEPSLATE.get(), Items.DEEPSLATE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DIORITE.get(), Items.DIORITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DIRT.get(), Items.DIRT, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_GRANITE.get(), Items.GRANITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_GRAVEL.get(), Items.GRAVEL, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_NETHERRACK.get(), Items.NETHERRACK, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RED_SAND.get(), Items.RED_SAND, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SAND.get(), Items.SAND, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_STONE.get(), Items.STONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_TUFF.get(), Items.TUFF, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CLAY.get(), Items.CLAY, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_MOSSY_COBBLESTONE.get(), Items.MOSSY_COBBLESTONE, 9, consumer);

        //Polished Blocks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_POLISHED_ANDESITE.get(), Items.POLISHED_ANDESITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_POLISHED_BASALT.get(), Items.POLISHED_BASALT, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_POLISHED_DEEPSLATE.get(), Items.POLISHED_DEEPSLATE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_POLISHED_BLACKSTONE.get(), Items.POLISHED_BLACKSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get(), Items.POLISHED_BLACKSTONE_BRICKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_POLISHED_DIORITE.get(), Items.POLISHED_DIORITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_POLISHED_GRANITE.get(), Items.POLISHED_GRANITE, 9, consumer);

        //Smooth Blocks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SMOOTH_BASALT.get(), Items.SMOOTH_BASALT, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SMOOTH_STONE.get(), Items.SMOOTH_STONE, 9, consumer);

        //Stone Bricks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CHISELED_STONE_BRICKS.get(), Items.CHISELED_STONE_BRICKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CRACKED_STONE_BRICKS.get(), Items.CRACKED_STONE_BRICKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_MOSSY_STONE_BRICKS.get(), Items.MOSSY_STONE_BRICKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_STONE_BRICKS.get(), Items.STONE_BRICKS, 9, consumer);

        //Sandstone
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CHISELED_RED_SANDSTONE.get(), Items.CHISELED_RED_SANDSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CHISELED_SANDSTONE.get(), Items.CHISELED_SANDSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CUT_RED_SANDSTONE.get(), Items.CUT_RED_SANDSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CUT_SANDSTONE.get(), Items.CUT_SANDSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RED_SANDSTONE.get(), Items.RED_SANDSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SANDSTONE.get(), Items.SANDSTONE, 9, consumer);

        //Nether Blocks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_NETHER_QUARTZ_BLOCK.get(), Items.QUARTZ_BLOCK, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_BASALT.get(), Items.BASALT, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_BLACKSTONE.get(), Items.BLACKSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CHISELED_POLISHED_BLACKSTONE.get(), Items.CHISELED_POLISHED_BLACKSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.get(), Items.CRACKED_POLISHED_BLACKSTONE_BRICKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_GILDED_BLACKSTONE.get(), Items.GILDED_BLACKSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_GLOWSTONE.get(), Items.GLOWSTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_MAGMA.get(), Items.MAGMA_BLOCK, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SOUL_SAND.get(), Items.SOUL_SAND, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SOUL_SOIL.get(), Items.SOUL_SOIL, 9, consumer);

        //Logs & Planks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_ACACIA_LOG.get(), Items.ACACIA_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_ACACIA_PLANKS.get(), Items.ACACIA_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_BIRCH_LOG.get(), Items.BIRCH_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_BIRCH_PLANKS.get(), Items.BIRCH_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DARK_OAK_LOG.get(), Items.DARK_OAK_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DARK_OAK_PLANKS.get(), Items.DARK_OAK_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_JUNGLE_LOG.get(), Items.JUNGLE_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_JUNGLE_PLANKS.get(), Items.JUNGLE_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_OAK_LOG.get(), Items.OAK_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_OAK_PLANKS.get(), Items.OAK_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SPRUCE_LOG.get(), Items.SPRUCE_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SPRUCE_PLANKS.get(), Items.SPRUCE_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CRIMSON_STEM.get(), Items.CRIMSON_STEM, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CRIMSON_PLANKS.get(), Items.CRIMSON_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_WARPED_STEM.get(), Items.WARPED_STEM, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_WARPED_PLANKS.get(), Items.WARPED_PLANKS, 9, consumer);

        //Wool
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_BLACK_WOOL.get(), Items.BLACK_WOOL, ColorBlockType.WOOL, Items.BLACK_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_BLUE_WOOL.get(), Items.BLUE_WOOL, ColorBlockType.WOOL, Items.BLUE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_BROWN_WOOL.get(), Items.BROWN_WOOL, ColorBlockType.WOOL, Items.BROWN_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_CYAN_WOOL.get(), Items.CYAN_WOOL, ColorBlockType.WOOL, Items.CYAN_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_GRAY_WOOL.get(), Items.GRAY_WOOL, ColorBlockType.WOOL, Items.GRAY_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_GREEN_WOOL.get(), Items.GREEN_WOOL, ColorBlockType.WOOL, Items.GREEN_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_LIGHT_BLUE_WOOL.get(), Items.LIGHT_BLUE_WOOL, ColorBlockType.WOOL, Items.LIGHT_BLUE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_LIGHT_GRAY_WOOL.get(), Items.LIGHT_GRAY_WOOL, ColorBlockType.WOOL, Items.LIGHT_GRAY_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_LIME_WOOL.get(), Items.LIME_WOOL, ColorBlockType.WOOL, Items.LIME_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_MAGENTA_WOOL.get(), Items.MAGENTA_WOOL, ColorBlockType.WOOL, Items.MAGENTA_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_ORANGE_WOOL.get(), Items.ORANGE_WOOL, ColorBlockType.WOOL, Items.ORANGE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_PINK_WOOL.get(), Items.PINK_WOOL, ColorBlockType.WOOL, Items.PINK_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_PURPLE_WOOL.get(), Items.PURPLE_WOOL, ColorBlockType.WOOL, Items.PURPLE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_RED_WOOL.get(), Items.RED_WOOL, ColorBlockType.WOOL, Items.RED_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_WHITE_WOOL.get(), Items.WHITE_WOOL, ColorBlockType.WOOL, Items.WHITE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_YELLOW_WOOL.get(), Items.YELLOW_WOOL, ColorBlockType.WOOL, Items.YELLOW_DYE, consumer);

        //Concrete
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_BLACK_CONCRETE.get(), Items.BLACK_CONCRETE, ColorBlockType.CONCRETE, Items.BLACK_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_BLUE_CONCRETE.get(), Items.BLUE_CONCRETE, ColorBlockType.CONCRETE, Items.BLUE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_BROWN_CONCRETE.get(), Items.BROWN_CONCRETE, ColorBlockType.CONCRETE, Items.BROWN_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_CYAN_CONCRETE.get(), Items.CYAN_CONCRETE, ColorBlockType.CONCRETE, Items.CYAN_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_GRAY_CONCRETE.get(), Items.GRAY_CONCRETE, ColorBlockType.CONCRETE, Items.GRAY_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_GREEN_CONCRETE.get(), Items.GREEN_CONCRETE, ColorBlockType.CONCRETE, Items.GREEN_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_LIGHT_BLUE_CONCRETE.get(), Items.LIGHT_BLUE_CONCRETE, ColorBlockType.CONCRETE, Items.LIGHT_BLUE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_LIGHT_GRAY_CONCRETE.get(), Items.LIGHT_GRAY_CONCRETE, ColorBlockType.CONCRETE, Items.LIGHT_GRAY_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_LIME_CONCRETE.get(), Items.LIME_CONCRETE, ColorBlockType.CONCRETE, Items.LIME_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_MAGENTA_CONCRETE.get(), Items.MAGENTA_CONCRETE, ColorBlockType.CONCRETE, Items.MAGENTA_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_ORANGE_CONCRETE.get(), Items.ORANGE_CONCRETE, ColorBlockType.CONCRETE, Items.ORANGE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_PINK_CONCRETE.get(), Items.PINK_CONCRETE, ColorBlockType.CONCRETE, Items.PINK_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_PURPLE_CONCRETE.get(), Items.PURPLE_CONCRETE, ColorBlockType.CONCRETE, Items.PURPLE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_RED_CONCRETE.get(), Items.RED_CONCRETE, ColorBlockType.CONCRETE, Items.RED_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_WHITE_CONCRETE.get(), Items.WHITE_CONCRETE, ColorBlockType.CONCRETE, Items.WHITE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_YELLOW_CONCRETE.get(), Items.YELLOW_CONCRETE, ColorBlockType.CONCRETE, Items.YELLOW_DYE, consumer);

        //Concrete Powder
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_BLACK_CONCRETE_POWDER.get(), Items.BLACK_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.BLACK_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_BLUE_CONCRETE_POWDER.get(), Items.BLUE_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.BLUE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_BROWN_CONCRETE_POWDER.get(), Items.BROWN_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.BROWN_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_CYAN_CONCRETE_POWDER.get(), Items.CYAN_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.CYAN_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_GRAY_CONCRETE_POWDER.get(), Items.GRAY_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.GRAY_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_GREEN_CONCRETE_POWDER.get(), Items.GREEN_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.GREEN_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER.get(), Items.LIGHT_BLUE_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.LIGHT_BLUE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER.get(), Items.LIGHT_GRAY_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.LIGHT_GRAY_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_LIME_CONCRETE_POWDER.get(), Items.LIME_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.LIME_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_MAGENTA_CONCRETE_POWDER.get(), Items.MAGENTA_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.MAGENTA_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_ORANGE_CONCRETE_POWDER.get(), Items.ORANGE_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.ORANGE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_PINK_CONCRETE_POWDER.get(), Items.PINK_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.PINK_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_PURPLE_CONCRETE_POWDER.get(), Items.PURPLE_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.PURPLE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_RED_CONCRETE_POWDER.get(), Items.RED_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.RED_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_WHITE_CONCRETE_POWDER.get(), Items.WHITE_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.WHITE_DYE, consumer);
        CompressedWoolRecipeBuilder(Registration.COMPRESSED_YELLOW_CONCRETE_POWDER.get(), Items.YELLOW_CONCRETE_POWDER, ColorBlockType.CONCRETE_POWDER, Items.YELLOW_DYE, consumer);

        //Compressed Iron Ingot
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_IRON_ORE.get()), Registration.COMPRESSED_IRON_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.COMPRESSED_IRON_ORE.get()))
                .save(consumer, "compressed_iron_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_RAW_IRON.get()), Registration.COMPRESSED_IRON_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.COMPRESSED_RAW_IRON.get()))
                .save(consumer, "compressed_iron_ingot2");

        //Compressed Gold Ingot
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_GOLD_ORE.get()), Registration.COMPRESSED_GOLD_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.COMPRESSED_GOLD_ORE.get()))
                .save(consumer, "compressed_gold_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_RAW_GOLD.get()), Registration.COMPRESSED_GOLD_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.COMPRESSED_RAW_GOLD.get()))
                .save(consumer, "compressed_gold_ingot2");

        //Compressed Diamond
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_DIAMOND_ORE.get()), Registration.COMPRESSED_DIAMOND_GEM.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.COMPRESSED_DIAMOND_ORE.get()))
                .save(consumer, "compressed_diamond_gem");

        //Compressed Copper Ingot
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_COPPER_ORE.get()), Registration.COMPRESSED_COPPER_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.COMPRESSED_COPPER_ORE.get()))
                .save(consumer, "compressed_copper_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_RAW_COPPER.get()), Registration.COMPRESSED_COPPER_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.COMPRESSED_RAW_COPPER.get()))
                .save(consumer, "compressed_copper_ingot2");

        //TOOLS
        //Pickaxes
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_PICKAXE.get(), Registration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_PICKAXE.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_PICKAXE.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_PICKAXE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_PICKAXE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_PICKAXE.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.PICKAXE, consumer);
        //Axes
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_AXE.get(), Registration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_AXE.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_AXE.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_AXE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_AXE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_AXE.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.AXE, consumer);
        //Shovels
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_SHOVEL.get(), Registration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_SHOVEL.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_SHOVEL.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_SHOVEL.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_SHOVEL.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_SHOVEL.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.SHOVEL, consumer);
        //Swords
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_SWORD.get(), Registration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_SWORD.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_SWORD.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_SWORD.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_SWORD.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_SWORD.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.SWORD, consumer);
        //Hoes
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_HOE.get(), Registration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_HOE.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_HOE.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_HOE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_HOE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_HOE.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.HOE, consumer);

        //ARMOR
        //Iron
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_HELMET.get(), Registration.COMPRESSED_IRON_INGOT.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_CHESTPLATE.get(), Registration.COMPRESSED_IRON_INGOT.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_LEGGINGS.get(), Registration.COMPRESSED_IRON_INGOT.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_BOOTS.get(), Registration.COMPRESSED_IRON_INGOT.get(), BodyPart.FEET, consumer);
        //Iron
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_HELMET.get(), Registration.COMPRESSED_GOLD_INGOT.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_CHESTPLATE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_LEGGINGS.get(), Registration.COMPRESSED_GOLD_INGOT.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_BOOTS.get(), Registration.COMPRESSED_GOLD_INGOT.get(), BodyPart.FEET, consumer);
        //Iron
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_DIAMOND_HELMET.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_DIAMOND_CHESTPLATE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_DIAMOND_LEGGINGS.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_DIAMOND_BOOTS.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.FEET, consumer);
        //Iron
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_NETHERITE_HELMET.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_NETHERITE_CHESTPLATE.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_NETHERITE_LEGGINGS.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_NETHERITE_BOOTS.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.FEET, consumer);

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

        //Arrows
        ShapedRecipeBuilder.shaped(ItemRegistration.COMPRESSED_ARROW.get(), 4)
                .pattern("x")
                .pattern("s")
                .pattern("f")
                .define('x', ItemRegistration.COMPRESSED_FLINT.get())
                .define('s', Items.STICK)
                .define('f', Items.FEATHER)
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_FLINT.get()), InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COMPRESSED_FLINT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistration.COMPRESSED_SPECTRAL_ARROW.get(), 2)
                .pattern(" x ")
                .pattern("xax")
                .pattern(" x ")
                .define('x', Items.GLOWSTONE_DUST)
                .define('a', ItemRegistration.COMPRESSED_ARROW.get())
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_ARROW.get()), InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COMPRESSED_ARROW.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Items.TORCH, 36)
                .pattern("x")
                .pattern("s")
                .define('x', Registration.COMPRESSED_COAL.get())
                .define('s', ItemRegistration.COMPRESSED_STICK.get())
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_STICK.get()), InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COMPRESSED_STICK.get()))
                .save(consumer, "torch1");

        ShapedRecipeBuilder.shaped(Items.SOUL_TORCH, 36)
                .pattern("x")
                .pattern("s")
                .pattern("y")
                .define('x', Registration.COMPRESSED_COAL.get())
                .define('s', ItemRegistration.COMPRESSED_STICK.get())
                .define('y', Registration.COMPRESSED_SOUL_SAND.get())
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(ItemRegistration.COMPRESSED_STICK.get()), InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COMPRESSED_STICK.get()))
                .save(consumer, "soul_torch1");

        new CompressorRecipeBuilder(Items.COAL, Registration.COMPRESSED_COAL.get(), 9, 0)
                .unlockedBy("compressor_has_" + Items.COAL, InventoryChangeTrigger.TriggerInstance.hasItems(Items.COAL))
                .save(consumer);
        new CompressorRecipeBuilder(Items.COPPER_INGOT, Registration.COMPRESSED_COPPER_INGOT.get(), 9, 0)
                .unlockedBy("compressor_has_" + Items.COPPER_INGOT, InventoryChangeTrigger.TriggerInstance.hasItems(Items.COPPER_INGOT))
                .save(consumer);
        new CompressorRecipeBuilder(Items.IRON_INGOT, Registration.COMPRESSED_IRON_INGOT.get(), 9, 0)
                .unlockedBy("compressor_has_" + Items.IRON_INGOT, InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .save(consumer);
        new CompressorRecipeBuilder(Items.GOLD_INGOT, Registration.COMPRESSED_GOLD_INGOT.get(), 9, 0)
                .unlockedBy("compressor_has_" + Items.GOLD_INGOT, InventoryChangeTrigger.TriggerInstance.hasItems(Items.GOLD_INGOT))
                .save(consumer);
        new CompressorRecipeBuilder(Items.DIAMOND, Registration.COMPRESSED_DIAMOND_GEM.get(), 9, 0)
                .unlockedBy("compressor_has_" + Items.DIAMOND, InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIAMOND))
                .save(consumer);
        new CompressorRecipeBuilder(Items.EMERALD, Registration.COMPRESSED_EMERALD_GEM.get(), 9, 0)
                .unlockedBy("compressor_has_" + Items.EMERALD, InventoryChangeTrigger.TriggerInstance.hasItems(Items.EMERALD))
                .save(consumer);
        new CompressorRecipeBuilder(Items.LAPIS_LAZULI, Registration.COMPRESSED_LAPIS.get(), 9, 0)
                .unlockedBy("compressor_has_" + Items.LAPIS_LAZULI, InventoryChangeTrigger.TriggerInstance.hasItems(Items.LAPIS_LAZULI))
                .save(consumer);
        new CompressorRecipeBuilder(Items.REDSTONE, Registration.COMPRESSED_REDSTONE.get(), 9, 0)
                .unlockedBy("compressor_has_" + Items.REDSTONE, InventoryChangeTrigger.TriggerInstance.hasItems(Items.REDSTONE))
                .save(consumer);
        new CompressorRecipeBuilder(Items.NETHERITE_INGOT, Registration.COMPRESSED_NETHERITE_INGOT.get(), 9, 0)
                .unlockedBy("compressor_has_" + Items.NETHERITE_INGOT, InventoryChangeTrigger.TriggerInstance.hasItems(Items.NETHERITE_INGOT))
                .save(consumer);
    }
}
