package com.justanaturelover.newzealandnaturemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.justanaturelover.newzealandnaturemod.NewZealandNatureMod;
import com.justanaturelover.newzealandnaturemod.entity.custom.MoaEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MoaRenderer extends GeoEntityRenderer<MoaEntity> {
    public MoaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MoaModel());
        this.shadowRadius = 0.8f;
    }

    @Override
    public ResourceLocation getTextureLocation(MoaEntity instance) {
        return new ResourceLocation(NewZealandNatureMod.MOD_ID, "textures/entity/moa/giantmoa.png");
    }

    @Override
    public RenderType getRenderType(MoaEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F, 1.0F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
