//package com.starfish_studios.hearth_and_home.integration;
//
//import com.starfish_studios.hearth_and_home.integration.moonlight.MoonlightIntegration;
////import com.starfish_studios.hearth_and_home.integration.supplementaries.SupplementariesIntegration;
//import com.starfish_studios.hearth_and_home.util.Utils;
//import com.starfish_studios.hearth_and_home.util.block.BlocksColorAPI;
//import com.starfish_studios.hearth_and_home.util.block.BlocksColorInternal;
//import net.minecraft.world.item.DyeColor;
//import net.minecraft.world.item.Item;
//
//public class IntegrationHandler {
//
//    public static final boolean moonlight = Utils.isModLoaded("moonlight");
//    public static final boolean supplementaries = Utils.isModLoaded("supplementaries");
//    public static final boolean create = Utils.isModLoaded("create");
//
////    public static boolean supplementaries_soap_cauldron = supplementaries && SupplementariesIntegration.isConfigEnabled("soap");
//
//    public static void init() {
//
//        //if (create) //allow washing interactions while on contraption?
//    }
//
//    public static void postInit() {
//        // The BlocksColorAPI is copied from moonlight lib so there's no need to run it twice.
//        // Run on FMLLoadCompleteEvent on forge, since if not it'll only register vanilla items.
//        if (!moonlight) BlocksColorInternal.setup();
//    }
//
//    public static Item changeColor(Item old, DyeColor newColor) {
//        if (moonlight) return MoonlightIntegration.changeColor(old, newColor);
//        return BlocksColorAPI.changeColor(old, newColor);
//    }
//}
