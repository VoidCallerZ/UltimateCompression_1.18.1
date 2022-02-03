package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.setup.ArmorRegistration;
import com.VoidCallerZ.uc.setup.Registration;
import com.VoidCallerZ.uc.setup.ToolRegistration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

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
        ShapedRecipeBuilder.shaped(Registration.ULTIMATE_POWERGEN.get())
                .pattern("iii")
                .pattern("iri")
                .pattern("iii")
                .define('i', Registration.COMPRESSED_IRON_INGOT.get())
                .define('r', Tags.Items.STORAGE_BLOCKS_REDSTONE)
                .group("uc")
                .unlockedBy("compressed_iron_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COMPRESSED_IRON_INGOT.get()))
                .save(consumer);

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

        //Raw Blocks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RAW_IRON_BLOCK.get(),
                Registration.COMPRESSED_RAW_IRON.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RAW_GOLD_BLOCK.get(),
                Registration.COMPRESSED_RAW_GOLD.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RAW_COPPER_BLOCK.get(),
                Registration.COMPRESSED_RAW_COPPER.get(), 9, consumer);

        //Basic Blocks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_ANDESITE.get(),
                Items.ANDESITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CALCITE.get(),
                Items.CALCITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_COBBLED_DEEPSLATE.get(),
                Items.COBBLED_DEEPSLATE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_COBBLESTONE.get(),
                Items.COBBLESTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DEEPSLATE.get(),
                Items.DEEPSLATE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DIORITE.get(),
                Items.DIORITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DIRT.get(),
                Items.DIRT, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_GRANITE.get(),
                Items.GRANITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_GRAVEL.get(),
                Items.GRAVEL, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_NETHERRACK.get(),
                Items.NETHERRACK, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RED_SAND.get(),
                Items.RED_SAND, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SAND.get(),
                Items.SAND, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_STONE.get(),
                Items.STONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_TUFF.get(),
                Items.TUFF, 9, consumer);

        //Logs & Planks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_ACACIA_LOG.get(),
                Items.ACACIA_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_ACACIA_PLANKS.get(),
                Items.ACACIA_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_BIRCH_LOG.get(),
                Items.BIRCH_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_BIRCH_PLANKS.get(),
                Items.BIRCH_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DARK_OAK_LOG.get(),
                Items.DARK_OAK_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DARK_OAK_PLANKS.get(),
                Items.DARK_OAK_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_JUNGLE_LOG.get(),
                Items.JUNGLE_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_JUNGLE_PLANKS.get(),
                Items.JUNGLE_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_OAK_LOG.get(),
                Items.OAK_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_OAK_PLANKS.get(),
                Items.OAK_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SPRUCE_LOG.get(),
                Items.SPRUCE_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SPRUCE_PLANKS.get(),
                Items.SPRUCE_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CRIMSON_STEM.get(),
                Items.CRIMSON_STEM, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CRIMSON_PLANKS.get(),
                Items.CRIMSON_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_WARPED_STEM.get(),
                Items.WARPED_STEM, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_WARPED_PLANKS.get(),
                Items.WARPED_PLANKS, 9, consumer);

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
        ShapedRecipeBuilder.shaped(ToolRegistration.COMPRESSED_WOODEN_PICKAXE.get())
                .pattern("xxx")
                .pattern(" s ")
                .pattern(" s ")
                .define('x', Registration.COMPRESSED_PLANKS_FOR_TOOLS)
                .define('s', Items.STICK)
                .group("uc")
                .unlockedBy("has_compressed_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COMPRESSED_OAK_PLANKS.get()))
                .save(consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_PICKAXE.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_PICKAXE.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_PICKAXE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_PICKAXE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_PICKAXE.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.PICKAXE, consumer);
        //Axes
        ShapedRecipeBuilder.shaped(ToolRegistration.COMPRESSED_WOODEN_AXE.get())
                .pattern(" xx")
                .pattern(" sx")
                .pattern(" s ")
                .define('x', Registration.COMPRESSED_PLANKS_FOR_TOOLS)
                .define('s', Items.STICK)
                .group("uc")
                .unlockedBy("has_compressed_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COMPRESSED_OAK_PLANKS.get()))
                .save(consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_AXE.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_AXE.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_AXE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_AXE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_AXE.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.AXE, consumer);
        //Shovels
        ShapedRecipeBuilder.shaped(ToolRegistration.COMPRESSED_WOODEN_SHOVEL.get())
                .pattern(" x ")
                .pattern(" s ")
                .pattern(" s ")
                .define('x', Registration.COMPRESSED_PLANKS_FOR_TOOLS)
                .define('s', Items.STICK)
                .group("uc")
                .unlockedBy("has_compressed_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COMPRESSED_OAK_PLANKS.get()))
                .save(consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_SHOVEL.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_SHOVEL.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_SHOVEL.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_SHOVEL.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_SHOVEL.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.SHOVEL, consumer);
        //Swords
        ShapedRecipeBuilder.shaped(ToolRegistration.COMPRESSED_WOODEN_SWORD.get())
                .pattern(" x ")
                .pattern(" x ")
                .pattern(" s ")
                .define('x', Registration.COMPRESSED_PLANKS_FOR_TOOLS)
                .define('s', Items.STICK)
                .group("uc")
                .unlockedBy("has_compressed_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COMPRESSED_OAK_PLANKS.get()))
                .save(consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_SWORD.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_SWORD.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_SWORD.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_SWORD.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_SWORD.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.SWORD, consumer);
        //Hoes
        ShapedRecipeBuilder.shaped(ToolRegistration.COMPRESSED_WOODEN_HOE.get())
                .pattern(" xx")
                .pattern(" s ")
                .pattern(" s ")
                .define('x', Registration.COMPRESSED_PLANKS_FOR_TOOLS)
                .define('s', Items.STICK)
                .group("uc")
                .unlockedBy("has_compressed_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COMPRESSED_OAK_PLANKS.get()))
                .save(consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_HOE.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_HOE.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_HOE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_HOE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_HOE.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.HOE, consumer);

        //ARMOR
        //Iron
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_IRON_HELMET.get(), Registration.COMPRESSED_IRON_INGOT.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_IRON_CHESTPLATE.get(), Registration.COMPRESSED_IRON_INGOT.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_IRON_LEGGINGS.get(), Registration.COMPRESSED_IRON_INGOT.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_IRON_BOOTS.get(), Registration.COMPRESSED_IRON_INGOT.get(), BodyPart.FEET, consumer);
        //Iron
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_GOLD_HELMET.get(), Registration.COMPRESSED_GOLD_INGOT.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_GOLD_CHESTPLATE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_GOLD_LEGGINGS.get(), Registration.COMPRESSED_GOLD_INGOT.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_GOLD_BOOTS.get(), Registration.COMPRESSED_GOLD_INGOT.get(), BodyPart.FEET, consumer);
        //Iron
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_DIAMOND_HELMET.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_DIAMOND_CHESTPLATE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_DIAMOND_LEGGINGS.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_DIAMOND_BOOTS.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.FEET, consumer);
        //Iron
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_NETHERITE_HELMET.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_NETHERITE_CHESTPLATE.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_NETHERITE_LEGGINGS.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipleBuilder(ArmorRegistration.COMPRESSED_NETHERITE_BOOTS.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.FEET, consumer);
    }
}
