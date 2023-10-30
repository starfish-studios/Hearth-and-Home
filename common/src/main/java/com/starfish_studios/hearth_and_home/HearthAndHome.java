package com.starfish_studios.hearth_and_home;

import com.starfish_studios.hearth_and_home.registry.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HearthAndHome {
    public static final String MOD_ID = "hearth_and_home";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        HNHBlocks.init();
        HNHItems.init();
        HNHSoundEvents.init();
        HNHEntityTypes.init();
        HNHBlockEntityTypes.init();
    }
}