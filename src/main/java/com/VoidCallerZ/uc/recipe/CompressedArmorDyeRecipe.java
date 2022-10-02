package com.VoidCallerZ.uc.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.Level;
import org.apache.commons.compress.utils.Lists;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class CompressedArmorDyeRecipe extends CustomRecipe
{
    public CompressedArmorDyeRecipe(ResourceLocation id, ItemStack output, NonNullList<Ingredient> inputs)
    {
        super(id);
    }

    public boolean matches(CraftingContainer inventory, Level level)
    {
        ItemStack itemStack = ItemStack.EMPTY;
        List<ItemStack> list = Lists.newArrayList();

        for (int i = 0; i < inventory.getContainerSize(); i++)
        {
            ItemStack itemStack1 = inventory.getItem(i);
            if (!itemStack1.isEmpty())
            {
                if (itemStack1.getItem() instanceof DyeableLeatherItem)
                {
                    if (!itemStack.isEmpty())
                        return false;
                }
                else
                {
                    if (!(itemStack1.getItem() instanceof DyeItem))
                    {
                        return false;
                    }

                    list.add(itemStack1);
                }

            }
        }
        return !itemStack.isEmpty() && !list.isEmpty();
    }

    public ItemStack assemble(CraftingContainer inventory)
    {
        List<DyeItem> list = Lists.newArrayList();
        ItemStack itemStack = ItemStack.EMPTY;

        for (int i = 0; i < inventory.getContainerSize(); i++)
        {
            ItemStack itemStack1 = inventory.getItem(i);
            if (!itemStack1.isEmpty())
            {
                Item item = itemStack1.getItem();
                if (item instanceof DyeableLeatherItem)
                {
                    if (!itemStack.isEmpty())
                    {
                        return ItemStack.EMPTY;
                    }
                    itemStack = itemStack1.copy();
                }
                else
                {
                    if (!(item instanceof DyeItem))
                    {
                        return ItemStack.EMPTY;
                    }
                    list.add((DyeItem) item);
                }
            }
        }
        return !itemStack.isEmpty() && !list.isEmpty() ? DyeableLeatherItem.dyeArmor(itemStack, list) : ItemStack.EMPTY;
    }

    public boolean canCraftInDimensions(int width, int height)
    {
        return true;
    }

    public RecipeSerializer<?> getSerializer()
    {
        return Serializer.INSTANCE;
    }

    public static class Serializer implements RecipeSerializer<CompressedArmorDyeRecipe>
    {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(MODID, "compressed_armor_dye_recipe");

        @Override
        public CompressedArmorDyeRecipe fromJson(ResourceLocation id, JsonObject json)
        {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));
            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++)
            {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new CompressedArmorDyeRecipe(id, output, inputs);
        }

        @Override
        public CompressedArmorDyeRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf)
        {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);
            for (int i = 0; i < inputs.size(); i++)
            {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();
            return new CompressedArmorDyeRecipe(id, output, inputs);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, CompressedArmorDyeRecipe recipe)
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

        @Override
        public RecipeSerializer<?> setRegistryName(ResourceLocation name)
        {
            return INSTANCE;
        }

        @Nullable
        @Override
        public ResourceLocation getRegistryName()
        {
            return ID;
        }

        @Override
        public Class<RecipeSerializer<?>> getRegistryType()
        {
            return Serializer.castClass(RecipeSerializer.class);
        }
    }
}


