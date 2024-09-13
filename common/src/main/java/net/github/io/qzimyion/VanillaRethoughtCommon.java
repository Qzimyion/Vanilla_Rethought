package net.github.io.qzimyion;

import net.github.io.qzimyion.registry.RegBlocks;

public final class VanillaRethoughtCommon {
    public static final String MOD_ID = "vanilla_rethought";

    /** We would write and initialize most of our code in common subproject.
     If we want to use any of the very loader specific stuff use the {@code @ExpectPlatform} annotation
     and then return a new Assertion error in common
     And then later create the same class and directory in the other loader subprojects
     And then implement the loader specific methods
     */

    public static void init() {
        RegBlocks.registerBlocks();
    }
}
