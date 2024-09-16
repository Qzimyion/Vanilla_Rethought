package net.github.io.qzimyion.fabric;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.github.io.qzimyion.events.ModServerSideEvents;
import net.github.io.qzimyion.fabriclike.ExampleModFabricLike;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public final class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleModFabricLike.init();

        //Events
        UseBlockCallback.EVENT.register(ExampleModFabric::onRightClickBlock);

    }
    public static InteractionResult onRightClickBlock(Player player, Level level, InteractionHand hand, BlockHitResult hitResult) {
        return ModServerSideEvents.onBlockCLicked(player.getItemInHand(hand), player, level, hand, hitResult);
    }
}
