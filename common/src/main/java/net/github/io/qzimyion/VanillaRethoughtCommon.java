package net.github.io.qzimyion;

import eu.midnightdust.lib.config.MidnightConfig;
import net.github.io.qzimyion.registry.RegBlocks;
import net.github.io.qzimyion.registry.RegConfig;
import net.github.io.qzimyion.registry.RegCreativeTabs;

public final class VanillaRethoughtCommon {
    public static final String MOD_ID = "vanilla_rethought";

    public static void init() {
        //Config
        MidnightConfig.init(MOD_ID, RegConfig.class);

        RegBlocks.registerBlocks();
        RegCreativeTabs.init();
    }
}
