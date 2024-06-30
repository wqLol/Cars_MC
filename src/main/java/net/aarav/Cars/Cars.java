package net.aarav.Cars;


import com.mojang.logging.LogUtils;
import net.aarav.Cars.block.ModBlocks;
import net.aarav.Cars.entity.ModEntities;
import net.aarav.Cars.entity.client.CarRenderer;
import net.aarav.Cars.entity.custom.CarEntity;
import net.aarav.Cars.item.ModCreativeModeTabs;
import net.aarav.Cars.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.main.GameConfig;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.network.chat.Component;
import net.minecraft.server.commands.GiveCommand;
import net.minecraft.server.commands.SummonCommand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.animal.ShoulderRidingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.VehicleEntity;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jline.utils.Log;
import org.slf4j.Logger;

import static net.minecraft.util.Mth.cos;
import static net.minecraft.util.Mth.sin;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Cars.MOD_ID)
public class Cars
{
    public static final String MOD_ID = "cars";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);




    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.STEERING_WHEEL);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.CAR.get(), CarRenderer::new);
            CarEntity.setViewScale(20d);
        }
    }
//    @SubscribeEvent
//    public void onKeyInputEvent(InputEvent.Key event) {
//        if (Minecraft.getInstance().options.keyUp.isDown()) {
//            Player player = Minecraft.getInstance().player;
////            Minecraft.getInstance().cameraEntity.
////            player.setDeltaMovement(2d* sin(player.xRotO+180), 1.0d, 2d* cos(player.xRotO+180));
//            player.move(MoverType.SELF, new Vec3(1.0d,1.0d,0.0d));
//            if (player.isPassenger()){
//
//
////                LOGGER.info(player.getVehicle().getName().toString());
//
//                if (player.getVehicle() instanceof Entity){
////                    player.getVehicle().move(MoverType.PLAYER, new Vec3(3d,3d,3d));
//
////                    player.sendSystemMessage(Component.literal("Hello"));
////                    ((CarEntity) player.getVehicle()).useCar();
//                    Entity vehicle = null;
//                    vehicle = player.getVehicle();
////                    vehicle.setInvisible(true);
////                    player.getVehicle().unRide();
//                    player.stopRiding();
//                    player.move(MoverType.SELF, new Vec3(1.0d,1.0d,0.0d));
//
//
//                    player.startRiding(vehicle);
//
////                        player.unRide();
//
//
//
//                }
//            }
//
////            LOGGER.info("Hello");
//        }
//    }


}
