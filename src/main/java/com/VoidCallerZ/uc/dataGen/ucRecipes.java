package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class ucRecipes extends BaseRecipeProvider
{
    public ucRecipes(DataGenerator generatorIn) { super(generatorIn); }

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

        //Compression & decompression of most blocks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_IRON_BLOCK.get(),
                Registration.COMPRESSED_IRON_INGOT.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_GOLD_BLOCK.get(),
                Registration.COMPRESSED_GOLD_INGOT.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DIAMOND_BLOCK.get(),
                Registration.COMPRESSED_DIAMOND_GEM.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_COPPER_BLOCK.get(),
                Registration.COMPRESSED_COPPER_INGOT.get(), 9, consumer);

        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RAW_IRON_BLOCK.get(),
                Registration.COMPRESSED_RAW_IRON.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RAW_GOLD_BLOCK.get(),
                Registration.COMPRESSED_RAW_GOLD.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RAW_COPPER_BLOCK.get(),
                Registration.COMPRESSED_RAW_COPPER.get(), 9, consumer);

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
    }
}
