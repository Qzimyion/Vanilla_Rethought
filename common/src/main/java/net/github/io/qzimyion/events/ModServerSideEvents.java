package net.github.io.qzimyion.events;

import net.github.io.qzimyion.registry.RegConfig;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static net.minecraft.world.level.block.Blocks.*;

public class ModServerSideEvents {

    //Code borrowed and modified from: https://github.com/AstralOrdana/Immersive-Weathering/blob/1.20.0-multiloader/common/src/main/java/com/ordana/immersive_weathering/events/ModEvents.java#L86
    //Basically Makes the event run on both forge and fabric
    @FunctionalInterface
    public interface BlockCallBackInteractionEvent {
        InteractionResult run(Item i, ItemStack stack, BlockPos pos, BlockState state, Player player, Level level, InteractionHand hand, BlockHitResult hit);
    }

    //This is just a single type of event (Fabric:UseBlockCallBack/Forge:BlockHitEvent)
    //For adding more types of events more Interfaces and methods like these need to be created
    public static InteractionResult onBlockCLicked(ItemStack stack, Player player, Level level, InteractionHand hand, BlockHitResult hitResult) {
        if (stack.isEmpty()) return InteractionResult.PASS;
        Item i = stack.getItem();
        BlockPos pos = hitResult.getBlockPos();
        BlockState state = level.getBlockState(pos);
        for (var event : EVENTS) {
            var result = event.run(i, stack, pos, state, player, level, hand, hitResult);
            if (result != InteractionResult.PASS) return result;
        }
        return InteractionResult.PASS;
    }

    private static final List<BlockCallBackInteractionEvent> EVENTS = new ArrayList<>();

    static {
        EVENTS.add(ModServerSideEvents::pickaxeCracking);
    }

    public static final HashMap<Block, Block> CRACKING = new HashMap<>();

    static {
        CRACKING.put(STONE_BRICKS, CRACKED_STONE_BRICKS);
        CRACKING.put(NETHER_BRICKS, CRACKED_NETHER_BRICKS);
        CRACKING.put(DEEPSLATE_BRICKS, CRACKED_DEEPSLATE_BRICKS);
        CRACKING.put(POLISHED_BLACKSTONE_BRICKS, CRACKED_POLISHED_BLACKSTONE_BRICKS);
        CRACKING.put(DEEPSLATE_TILES, CRACKED_DEEPSLATE_TILES);
    }

    //Events
    private static InteractionResult pickaxeCracking(Item item, ItemStack stack, BlockPos pos, BlockState state, Player player, Level level, InteractionHand hand, BlockHitResult hitResult) {
        if (item instanceof PickaxeItem && player.isShiftKeyDown() && !RegConfig.BricksCrackingViaPick) {
            BlockState newBlock = CRACKING.get(state.getBlock()).defaultBlockState();
            if (newBlock != state) {
                if (level.isClientSide) {
                    ParticleUtils.spawnParticlesOnBlockFaces(level, pos, new BlockParticleOption(ParticleTypes.BLOCK, state), UniformInt.of(3, 5));
                    level.playSound(player, pos, newBlock.getSoundType().getHitSound(), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer) player, pos, stack);
                    stack.hurtAndBreak(1, player, (l) -> l.broadcastBreakEvent(hand));
                    player.awardStat(Stats.ITEM_USED.get(stack.getItem()));
                    level.setBlockAndUpdate(pos, newBlock);
                }
                return InteractionResult.sidedSuccess(level.isClientSide);
            }
        }
        return InteractionResult.PASS;
    }
}
