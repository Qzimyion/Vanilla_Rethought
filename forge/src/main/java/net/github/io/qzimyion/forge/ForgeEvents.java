package net.github.io.qzimyion.forge;

import net.github.io.qzimyion.VanillaRethoughtCommon;
import net.github.io.qzimyion.events.ModServerSideEvents;
import net.minecraft.world.InteractionResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VanillaRethoughtCommon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvents {

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        var ret = ModServerSideEvents.onBlockCLicked(event.getItemStack(), event.getEntity(), event.getLevel(), event.getHand(), event.getHitVec());
        if (ret != InteractionResult.PASS) {
            event.setCanceled(true);
            event.setCancellationResult(ret);
        }
    }
}
