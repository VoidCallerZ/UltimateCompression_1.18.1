package com.VoidCallerZ.uc.dataGen;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

public abstract class BaseRecipeProvider extends RecipeProvider
{
    public BaseRecipeProvider(DataGenerator pGenerator)
    {
        super(pGenerator);
    }

    protected void CompressorDecompressorRecipeBuilder(Block compressedBlock, Item compressedItem, int decompAmountItem, Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped((compressedBlock))
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', compressedItem)
                .group("uc")
                .unlockedBy("has_" + compressedBlock.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(compressedItem))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(compressedItem, decompAmountItem)
                .requires(compressedBlock)
                .unlockedBy("has_" + compressedItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(compressedBlock))
                .save(consumer);
    }
}
