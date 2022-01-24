package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ucRecipes extends RecipeProvider
{
    public ucRecipes(DataGenerator generatorIn) { super(generatorIn); }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_ORE_ITEM), Registration.COMPRESSED_IRON_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.COMPRESSED_ORE_ITEM))
                .save(consumer, "compressed_iron_ingot1");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_RAW_IRON.get()), Registration.COMPRESSED_IRON_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.COMPRESSED_RAW_IRON.get()))
                .save(consumer, "compressed_iron_ingot2");
    }
}
