package net.marc.marc_qol.item;

import net.marc.marc_qol.Marc_QoL;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public  static  final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Marc_QoL.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MARC_QOL_TAB = CREATIVE_MODE_TAB.register("marc_qol_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOUQUET.get()))
                    .title(Component.translatable("creativetab.marcqol_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BOUQUET.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
