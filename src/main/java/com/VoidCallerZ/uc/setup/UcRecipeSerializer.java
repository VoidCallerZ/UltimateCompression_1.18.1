package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.items.arrows.UcTippedArrowRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleRecipeSerializer;

public interface UcRecipeSerializer extends RecipeSerializer
{
    SimpleRecipeSerializer<UcTippedArrowRecipe> COMPRESSED_TIPPED_ARROW = register("crafting_special_tippedarrow", new SimpleRecipeSerializer<>(UcTippedArrowRecipe::new));

    static <S extends RecipeSerializer<T>, T extends Recipe<?>> S register(String pKey, S pRecipeSerializer) {
        return Registry.register(Registry.RECIPE_SERIALIZER, pKey, pRecipeSerializer);
    }
}
