package com.crispytwig.hearth_and_home.integration.supplementaries;

import net.mehvahdjukaar.supplementaries.configs.CommonConfigs;

public class SupplementariesIntegration {

    public static boolean isConfigEnabled(String config) {
        return CommonConfigs.isEnabled(config);
    }
}
