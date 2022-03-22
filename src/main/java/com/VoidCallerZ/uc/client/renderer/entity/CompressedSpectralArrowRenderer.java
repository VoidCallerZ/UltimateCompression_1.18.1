package com.VoidCallerZ.uc.client.renderer.entity;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.world.entity.projectile.CompressedSpectralArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class CompressedSpectralArrowRenderer extends ArrowRenderer<CompressedSpectralArrow>
{
    public CompressedSpectralArrowRenderer(EntityRendererProvider.Context context)
    {
        super(context);
    }

    public ResourceLocation getTextureLocation(CompressedSpectralArrow entity)
    {
        return new ResourceLocation(UltimateCompression.MODID, "textures/entity/projectiles/compressed_spectral_arrow.png");
    }
}
