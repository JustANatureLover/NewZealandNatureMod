package com.justanaturelover.newzealandnaturemod.entity.client;

import com.justanaturelover.newzealandnaturemod.NewZealandNatureMod;
import com.justanaturelover.newzealandnaturemod.entity.custom.KakapoEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KakapoModel extends AnimatedGeoModel<KakapoEntity> {
    @Override
    public ResourceLocation getModelLocation(KakapoEntity kakapoEntity) {
        return new ResourceLocation(NewZealandNatureMod.MOD_ID, "geo/kakapo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KakapoEntity kakapoEntity) {
        return new ResourceLocation(NewZealandNatureMod.MOD_ID, "textures/entity/kakapo/simplekakapo.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KakapoEntity kakapoEntity) {
        return new ResourceLocation(NewZealandNatureMod.MOD_ID, "animations/kakapo.animation.json");
    }
}
