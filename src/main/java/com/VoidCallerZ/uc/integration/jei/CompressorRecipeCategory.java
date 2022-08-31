package com.VoidCallerZ.uc.integration.jei;

import com.VoidCallerZ.uc.recipe.CompressorItemRecipe;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.blaze3d.vertex.PoseStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class CompressorRecipeCategory implements IRecipeCategory<CompressorItemRecipe>
{
    public final static ResourceLocation UID = new ResourceLocation(MODID, "item_compression");
    public IGuiHelper guiHelper;
    protected final IDrawableStatic staticArrow;
    protected final IDrawableAnimated animatedArrow;

    public CompressorRecipeCategory(IGuiHelper guiHelper)
    {
        this.guiHelper = guiHelper;
        staticArrow = guiHelper.createDrawable(new ResourceLocation(MODID, "textures/gui/compressor_gui_jei.png"), 176, 0, 8, 26);
        animatedArrow = guiHelper.createAnimatedDrawable(staticArrow, 300, IDrawableAnimated.StartDirection.TOP, false);
    }

    @Override
    public RecipeType<CompressorItemRecipe> getRecipeType()
    {
        return UltimateCompressionJEIPlugin.COMPRESSOR_TYPE;
    }

    @Override
    public Component getTitle()
    {
        return Component.translatable("uc.jei.category.compressor");
    }

    @Override
    public IDrawable getBackground()
    {
        return guiHelper.createDrawable(new ResourceLocation(MODID, "textures/gui/compressor_gui_jei.png"), 0, 0, 176, 85);
    }

    @Override
    public IDrawable getIcon()
    {
        return guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(BlockRegistration.IRON_COMPRESSOR.get()));
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, CompressorItemRecipe recipe, IFocusGroup focuses)
    {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 28).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 59).addItemStack(recipe.getResultItem());
    }

    @Override
    public void draw(CompressorItemRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY)
    {
        animatedArrow.draw(stack, 101, 40);
    }

    @Override
    public boolean handleInput(CompressorItemRecipe recipe, double mouseX, double mouseY, InputConstants.Key input)
    {
        return IRecipeCategory.super.handleInput(recipe, mouseX, mouseY, input);
    }

    @Override
    public boolean isHandled(CompressorItemRecipe recipe)
    {
        return IRecipeCategory.super.isHandled(recipe);
    }

    @Override
    public @Nullable ResourceLocation getRegistryName(CompressorItemRecipe recipe)
    {
        return IRecipeCategory.super.getRegistryName(recipe);
    }
}
