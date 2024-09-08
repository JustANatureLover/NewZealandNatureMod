package com.justanaturelover.newzealandnaturemod.entity;

import com.justanaturelover.newzealandnaturemod.NewZealandNatureMod;
import com.justanaturelover.newzealandnaturemod.entity.custom.MoaEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, NewZealandNatureMod.MOD_ID);

    public static final RegistryObject<EntityType<MoaEntity>> MOA =
            ENTITY_TYPES.register("moa",
            () -> EntityType.Builder.of(MoaEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(NewZealandNatureMod.MOD_ID, "moa").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
