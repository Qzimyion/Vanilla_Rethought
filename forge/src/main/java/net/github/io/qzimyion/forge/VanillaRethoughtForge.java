package net.github.io.qzimyion.forge;

import dev.architectury.platform.forge.EventBuses;
import net.github.io.qzimyion.events.ModServerSideEvents;
import net.minecraft.world.InteractionResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.github.io.qzimyion.VanillaRethoughtCommon;

@Mod(VanillaRethoughtCommon.MOD_ID)
public final class VanillaRethoughtForge {
    public VanillaRethoughtForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(VanillaRethoughtCommon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        VanillaRethoughtCommon.init();
    }
}
