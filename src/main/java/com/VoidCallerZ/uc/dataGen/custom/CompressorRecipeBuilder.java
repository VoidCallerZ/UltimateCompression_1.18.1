package com.VoidCallerZ.uc.dataGen.custom;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.recipe.CompressorItemRecipe;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class CompressorRecipeBuilder implements RecipeBuilder
{
    private final Item result;
    private final Ingredient ingredient;
    private final int inputCount;
    private final int count;
    private final Advancement.Builder advancement = Advancement.Builder.advancement();

    public CompressorRecipeBuilder(ItemLike ingredient, ItemLike result, int inputCount, int count)
    {
        this.ingredient = Ingredient.of(ingredient);
        this.result = result.asItem();
        this.inputCount = inputCount;
        this.count = count;
    }

    @Override
    public RecipeBuilder unlockedBy(String pCriterionName, CriterionTriggerInstance pCriterionTrigger)
    {
        this.advancement.addCriterion(pCriterionName, pCriterionTrigger);
        return this;
    }

    @Override
    public RecipeBuilder group(@Nullable String pGroupName)
    {
        return this.group("uc");
    }

    @Override
    public Item getResult()
    {
        return result;
    }

    @Override
    public void save(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ResourceLocation pRecipeId)
    {
        this.advancement.parent(new ResourceLocation("recipes/root"))
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(pRecipeId))
                .rewards(AdvancementRewards.Builder.recipe(pRecipeId)).requirements(RequirementsStrategy.OR);

        pFinishedRecipeConsumer.accept(new Result(pRecipeId, this.result, this.inputCount, this.count, this.ingredient, this.advancement,
                new ResourceLocation(pRecipeId.getNamespace(), "recipes/" + this.result.getItemCategory().getRecipeFolderName() + "/" +
                        pRecipeId.getPath())));
    }

    public static class Result implements FinishedRecipe
    {
        private final ResourceLocation id;
        private final Item result;
        private final Ingredient ingredient;
        private final int inputCount;
        private final int count;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;

        public Result(ResourceLocation id, Item result, int inputCount, int count, Ingredient ingredient, Advancement.Builder advancement, ResourceLocation advancementId)
        {
            this.id = id;
            this.result = result;
            this.inputCount = inputCount;
            this.count = count;
            this.ingredient = ingredient;
            this.advancement = advancement;
            this.advancementId = advancementId;
        }

        @Override
        public void serializeRecipeData(JsonObject json)
        {
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(ingredient.toJson());

            json.add("ingredients", jsonArray);

            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("item", ForgeRegistries.ITEMS.getKey(this.result).toString());
            if (this.count > 1)
            {
                jsonObject.addProperty("count", this.count);
            }

            json.add("output", jsonObject);
        }

        @Override
        public ResourceLocation getId()
        {
            return new ResourceLocation(UltimateCompression.MODID, ForgeRegistries.ITEMS.getKey(this.result).getPath() + "_from_item_compression");
        }

        @Override
        public RecipeSerializer<?> getType()
        {
            return CompressorItemRecipe.Serializer.INSTANCE;
        }

        @javax.annotation.Nullable
        public JsonObject serializeAdvancement()
        {
            return this.advancement.serializeToJson();
        }

        @javax.annotation.Nullable
        public ResourceLocation getAdvancementId()
        {
            return this.advancementId;
        }
    }
}
