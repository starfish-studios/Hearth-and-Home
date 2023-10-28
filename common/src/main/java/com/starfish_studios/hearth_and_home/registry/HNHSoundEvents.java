package com.starfish_studios.hearth_and_home.registry;

import com.starfish_studios.hearth_and_home.HearthAndHome;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class HNHSoundEvents {

    public static final Supplier<SoundEvent> CHIMNEY_CRACKLE = register("block.chimney.crackle");

    public static Supplier<SoundEvent> register(String name) {
        return HNHRegistry.registerSoundEvent(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(HearthAndHome.MOD_ID, name)));
    }

    public static void init() {}
}
