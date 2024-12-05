package com.justanaturelover.newzealandnaturemod.entity.client;

import com.justanaturelover.newzealandnaturemod.NewZealandNatureMod;
import com.justanaturelover.newzealandnaturemod.entity.custom.KakapoEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

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

    @Override
    public void setCustomAnimations(KakapoEntity animatable, int instanceId, AnimationEvent animationEvent) {
        super.setCustomAnimations(animatable, instanceId, animationEvent);
        IBone head = this.getAnimationProcessor().getBone("Head");

        EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * Mth.DEG_TO_RAD);
            head.setRotationY(extraData.netHeadYaw * Mth.DEG_TO_RAD);
        }
    }
}
