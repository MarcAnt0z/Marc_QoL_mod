package net.marc.marc_qol.sound;

import net.marc.marc_qol.Marc_QoL;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Marc_QoL.MOD_ID);


    public static final RegistryObject<SoundEvent> PAPERPLANE_SONG = registerSoundEvents("paperplane_song");



    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {

        ResourceLocation id = new ResourceLocation(Marc_QoL.MOD_ID, name);
        return  SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

}
