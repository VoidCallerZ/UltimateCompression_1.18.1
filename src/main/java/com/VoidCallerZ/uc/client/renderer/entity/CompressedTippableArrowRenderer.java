package com.VoidCallerZ.uc.client.renderer.entity;

import com.VoidCallerZ.uc.world.entity.projectile.CompressedArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CompressedTippableArrowRenderer extends ArrowRenderer<CompressedArrow>
{
    public static final ResourceLocation NORMAL_ARROW_LOCATION = new ResourceLocation("textures/entity/projectiles/compressed_arrow.png");
    public static final ResourceLocation TIPPED_ARROW_LOCATION = new ResourceLocation("textures/entity/projectiles/compressed_tipped_arrow.png");

    public CompressedTippableArrowRenderer(EntityRendererProvider.Context context)
    {
        super(context);
    }

    public ResourceLocation getTextureLocation(CompressedArrow entity)
    {
        return entity.getColor() > 0 ? TIPPED_ARROW_LOCATION : NORMAL_ARROW_LOCATION;
    }
}
