package com.VoidCallerZ.uc.integration;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.recipe.CompressorItemRecipe;
import com.VoidCallerZ.uc.setup.registration.Registration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class CompressorRecipeCategory implements IRecipeCategory<CompressorItemRecipe>
{
    public final static ResourceLocation UID = new ResourceLocation(UltimateCompression.MODID, "item_compression");
    public final static ResourceLocation TEXTURE = new ResourceLocation(UltimateCompression.MODID, "textures/gui/compressor_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public CompressorRecipeCategory(IGuiHelper helper)
    {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(Registration.COMPRESSOR.get()));
    }

    @Override
    public ResourceLocation getUid()
    {
        return UID;
    }

    @Override
    public Class<? extends CompressorItemRecipe> getRecipeClass()
    {
        return CompressorItemRecipe.class;
    }

    @Override
    public Component getTitle()
    {
        return new TextComponent("Compressor");
    }

    @Override
    public IDrawable getBackground()
    {
        return this.background;
    }

    @Override
    public IDrawable getIcon()
    {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull CompressorItemRecipe recipe, @Nonnull IFocusGroup focusGroup)
    {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 28).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 59).addItemStack(recipe.getResultItem());
    }
}
