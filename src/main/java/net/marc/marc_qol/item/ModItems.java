package net.marc.marc_qol.item;

import net.marc.marc_qol.Marc_QoL;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Marc_QoL.MOD_ID);

public static final RegistryObject<Item> BOUQUET = ITEMS.register("flower_bouquet",
        () -> new Item(new Item.Properties()));



public static void  register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}
}
