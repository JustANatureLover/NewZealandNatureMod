package com.justanaturelover.newzealandnaturemod.entity.client;

import com.justanaturelover.newzealandnaturemod.NewZealandNatureMod;
import com.justanaturelover.newzealandnaturemod.entity.custom.MoaEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MoaModel extends AnimatedGeoModel<MoaEntity> {
    @Override
    public ResourceLocation getModelLocation(MoaEntity moaEntity) {
        return new ResourceLocation(NewZealandNatureMod.MOD_ID, "geo/simplemoa.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MoaEntity moaEntity) {
        return new ResourceLocation(NewZealandNatureMod.MOD_ID, "textures/entity/moa/simplemoa.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MoaEntity moaEntity) {
        return new ResourceLocation(NewZealandNatureMod.MOD_ID, "animations/simplemoa.animation.json");
    }
}
