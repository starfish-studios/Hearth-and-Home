package com.crispytwig.hearth_and_home.registry;

import com.crispytwig.hearth_and_home.Mod;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class ModSoundEvents {

    public static final Supplier<SoundEvent> CHIMNEY_CRACKLE = ModRegistry.registerSoundEvent("chimney_crackle", () -> new SoundEvent(new ResourceLocation(Mod.MOD_ID, "block.chimney.crackle")));


    public static void init() {}
}
