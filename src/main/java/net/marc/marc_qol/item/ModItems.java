package net.marc.marc_qol.item;

import net.marc.marc_qol.Marc_QoL;
import net.marc.marc_qol.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Marc_QoL.MOD_ID);

public static final RegistryObject<Item> BOUQUET = ITEMS.register("flower_bouquet",
        () -> new Item(new Item.Properties()));

public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries",
        () -> new Item(new Item.Properties().food(ModFoodProperties.BLUEBERRIES)));

    public static final RegistryObject<Item> PAPERPLANE_RECORD = ITEMS.register("paperplane_record",
            () -> new RecordItem(4, ModSounds.PAPERPLANE_SONG, new Item.Properties().stacksTo(1),6820));

public static void  register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}
}
