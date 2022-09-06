package com.VoidCallerZ.uc.recipe;

import com.VoidCallerZ.uc.registration.ItemRegistration;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.Level;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class CompressedTippedArrowRecipe extends CustomRecipe
{
    public CompressedTippedArrowRecipe(ResourceLocation id, ItemStack output, NonNullList<Ingredient> inputs)
    {
        super(id);
    }

    public boolean matches(CraftingContainer inv, Level level)
    {
        if (inv.getWidth() == 3 && inv.getHeight() == 3)
        {
            for (int i = 0; i < inv.getWidth(); i++)
            {
                for (int j = 0; j < inv.getHeight(); j++)
                {
                    ItemStack itemStack = inv.getItem(i + j * inv.getWidth());
                    if (itemStack.isEmpty())
                        return false;

                    if (i == 1 && j == 1)
                    {
                        if (!itemStack.is(Items.LINGERING_POTION))
                            return false;
                    }
                    else if (!itemStack.is(ItemRegistration.COMPRESSED_ARROW.get()))
                        return false;
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    public ItemStack assemble(CraftingContainer inv)
    {
        ItemStack itemStack = inv.getItem(1 + inv.getWidth());
        if (!itemStack.is(Items.LINGERING_POTION))
            return ItemStack.EMPTY;
        else
        {
            ItemStack itemStack1 = new ItemStack(ItemRegistration.COMPRESSED_TIPPED_ARROW.get(), 8);
            PotionUtils.setPotion(itemStack1, PotionUtils.getPotion(itemStack));
            PotionUtils.setCustomEffects(itemStack1, PotionUtils.getCustomEffects(itemStack));
            return itemStack1;
        }
    }

    public boolean canCraftInDimensions(int width, int height)
    {
        return true;
    }

    public RecipeSerializer<?> getSerializer()
    {
        return Serializer.INSTANCE;
    }

    public static class Serializer implements RecipeSerializer<CompressedTippedArrowRecipe>
    {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(MODID, "compressed_tipped_arrow_recipe");

        @Override
        public CompressedTippedArrowRecipe fromJson(ResourceLocation id, JsonObject json)
        {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));
            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++)
            {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new CompressedTippedArrowRecipe(id, output, inputs);
        }

        @Override
        public CompressedTippedArrowRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf)
        {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);
            for (int i = 0; i < inputs.size(); i++)
            {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();
            return new CompressedTippedArrowRecipe(id, output, inputs);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, CompressedTippedArrowRecipe recipe)
        {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ingredient : recipe.getIngredients())
            {
                ingredient.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(), false);
        }

        @SuppressWarnings("unchecked") // Need this wrapper, because generics
        private static <G> Class<G> castClass(Class<?> cls) {return (Class<G>)cls;}
    }
}