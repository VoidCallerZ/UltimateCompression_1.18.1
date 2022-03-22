package com.VoidCallerZ.uc.client.renderer.entity;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.world.entity.projectile.CompressedArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CompressedArrowRenderer extends ArrowRenderer<CompressedArrow>
{
    public CompressedArrowRenderer(EntityRendererProvider.Context context)
    {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(CompressedArrow entity)
    {
        return new ResourceLocation(UltimateCompression.MODID, "textures/entity/projectiles/compressed_arrow.png");
    }
}
