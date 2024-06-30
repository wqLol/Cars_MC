package net.aarav.Cars.event;

import net.aarav.Cars.Cars;
import net.aarav.Cars.entity.ModEntities;
import net.aarav.Cars.entity.custom.CarEntity;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.jar.Attributes;

@Mod.EventBusSubscriber(modid = Cars.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.CAR.get(), CarEntity.createAttributes().build());
    }
}
