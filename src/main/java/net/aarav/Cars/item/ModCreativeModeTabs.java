package net.aarav.Cars.item;

import net.aarav.Cars.Cars;
import net.aarav.Cars.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister <CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cars.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Car_Tab = CREATIVE_MODE_TABS.register("cars", ()->CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEERING_WHEEL.get()))
            .title(Component.translatable("creativetab.cars"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.STEERING_WHEEL.get());
                pOutput.accept(ModBlocks.ASPHALT.get());
            })
            .build());

    public static void register(IEventBus eventbus){
        CREATIVE_MODE_TABS.register(eventbus);
    }
}
