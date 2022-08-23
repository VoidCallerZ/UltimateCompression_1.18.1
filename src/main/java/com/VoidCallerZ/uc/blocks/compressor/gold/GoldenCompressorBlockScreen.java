package com.VoidCallerZ.uc.blocks.compressor.gold;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.blocks.compressor.iron.IronCompressorBlockMenu;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class GoldenCompressorBlockScreen extends AbstractContainerScreen<GoldenCompressorBlockMenu>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(UltimateCompression.MODID, "textures/gui/golden_compressor_gui.png");

    public GoldenCompressorBlockScreen(GoldenCompressorBlockMenu menu, Inventory inventory, Component title)
    {
        super(menu, inventory, title);
    }

    @Override
    protected void renderBg(PoseStack poseStack, float partialTick, int mouseX, int mouseY)
    {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(poseStack, x, y, 0, 0, imageWidth, imageHeight);

        if (menu.isCrafting())
        {
            blit(poseStack, x + 101, y + 40, 176, 0, 8, menu.getScaledProgress());
        }
    }

    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float delta)
    {
        renderBackground(poseStack);
        super.render(poseStack, mouseX, mouseY, delta);
        renderTooltip(poseStack, mouseX, mouseY);
    }
}
