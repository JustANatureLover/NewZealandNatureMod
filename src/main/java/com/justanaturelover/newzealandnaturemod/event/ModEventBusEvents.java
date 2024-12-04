package com.justanaturelover.newzealandnaturemod.event;

import com.justanaturelover.newzealandnaturemod.NewZealandNatureMod;
import com.justanaturelover.newzealandnaturemod.entity.ModEntityTypes;
import com.justanaturelover.newzealandnaturemod.entity.custom.KakapoEntity;
import com.justanaturelover.newzealandnaturemod.entity.custom.MoaEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = NewZealandNatureMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.MOA.get(), MoaEntity.setAttributes());
        event.put(ModEntityTypes.KAKAPO.get(), KakapoEntity.setAttributes());
    }
}
