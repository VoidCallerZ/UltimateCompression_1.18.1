package com.VoidCallerZ.uc.integration.jei;

import com.VoidCallerZ.uc.recipe.CompressorItemRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

@JeiPlugin
public class UltimateCompressionJEIPlugin implements IModPlugin
{
    public static RecipeType<CompressorItemRecipe> COMPRESSOR_TYPE = new RecipeType<>(CompressorRecipeCategory.UID, CompressorItemRecipe.class);

    @Override
    public ResourceLocation getPluginUid()
    {
        return new ResourceLocation(MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration)
    {
        registration.addRecipeCategories(new CompressorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration)
    {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<CompressorItemRecipe> recipes = rm.getAllRecipesFor(CompressorItemRecipe.Type.INSTANCE);
        registration.addRecipes(COMPRESSOR_TYPE, recipes);
    }


}
