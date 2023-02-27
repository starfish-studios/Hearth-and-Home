package com.crispytwig.hearth_and_home.registry;

import com.crispytwig.hearth_and_home.Mod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class ModSoundEvents {


    public static Supplier<SoundEvent> register(String name) {
        return ModRegistry.registerSoundEvent(name, () -> new SoundEvent(new ResourceLocation(Mod.MOD_ID, name)));
    }

    public static void init() {}
}
