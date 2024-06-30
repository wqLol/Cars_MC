package net.aarav.Cars.entity;

import net.aarav.Cars.Cars;
import net.aarav.Cars.entity.custom.CarEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Cars.MOD_ID);

    public static final RegistryObject<EntityType<CarEntity>> CAR =
            ENTITY_TYPES.register("car", () -> EntityType.Builder.of(CarEntity::new, MobCategory.CREATURE)
                    .sized(1.5f, 0.5f).build("car"));


    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
