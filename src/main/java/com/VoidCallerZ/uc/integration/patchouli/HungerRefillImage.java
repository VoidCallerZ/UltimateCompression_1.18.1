package com.VoidCallerZ.uc.integration.patchouli;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.resources.ResourceLocation;
import vazkii.patchouli.api.IComponentRenderContext;
import vazkii.patchouli.api.ICustomComponent;
import vazkii.patchouli.api.IVariable;

import java.util.function.UnaryOperator;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class HungerRefillImage implements ICustomComponent
{
    private String halfImage = "textures/patchouli/halfsaturation.png";
    private String fullImage = "textures/patchouli/fullsaturation.png";
    private int width, height = 18;
    private int u, v = 9;
    private float scale = 1F;

    transient ResourceLocation halfResource;
    transient ResourceLocation fullResrouce;

    @Override
    public void build(int componentX, int componentY, int pageNum)
    {
        halfResource = new ResourceLocation(MODID, halfImage);
        fullResrouce = new ResourceLocation(MODID, fullImage);
    }

    @Override
    public void onVariablesAvailable(UnaryOperator<IVariable> lookup)
    {
        fullImage = lookup.apply(IVariable.wrap(fullImage)).asString();
        halfImage = lookup.apply(IVariable.wrap(halfImage)).asString();
    }

    @Override
    public void render(PoseStack ms, IComponentRenderContext context, float pticks, int mouseX, int mouseY)
    {
        if (scale == 0F)
        {
            return;
        }

        RenderSystem.setShaderTexture(0, fullResrouce);
        ms.pushPose();
        ms.translate(0, 0, 0);
        ms.scale(scale, scale, scale);
        RenderSystem.setShaderColor(1, 1, 1, 1);
        RenderSystem.enableBlend();
        GuiComponent.blit(ms, 0, 0, u, v, width, height, width, height);
        ms.popPose();
    }
}
