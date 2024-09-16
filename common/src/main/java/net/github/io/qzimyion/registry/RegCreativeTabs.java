package net.github.io.qzimyion.registry;

import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RegCreativeTabs {

    public static void addItems(RegHelper.ItemToTabEvent event){
        //==Andesite==//
        after(event, Items.POLISHED_ANDESITE_SLAB, CreativeModeTabs.BUILDING_BLOCKS, RegBlocks.ANDESITE_BRICKS, RegBlocks.ANDESITE_BRICKS_SLAB, RegBlocks.ANDESITE_BRICKS_STAIRS, RegBlocks.ANDESITE_BRICKS_WALL, RegBlocks.ANDESITE_TILES);
        //==Diorite==//
        after(event, Items.POLISHED_DIORITE_SLAB, CreativeModeTabs.BUILDING_BLOCKS, RegBlocks.DIORITE_BRICKS, RegBlocks.DIORITE_BRICKS_SLAB, RegBlocks.DIORITE_BRICKS_STAIRS, RegBlocks.DIORITE_BRICKS_WALL, RegBlocks.DIORITE_TILES);
        //==Granite==//
        after(event, Items.POLISHED_GRANITE_SLAB, CreativeModeTabs.BUILDING_BLOCKS, RegBlocks.GRANITE_BRICKS, RegBlocks.GRANITE_BRICKS_SLAB, RegBlocks.GRANITE_BRICKS_STAIRS, RegBlocks.GRANITE_BRICKS_WALL, RegBlocks.GRANITE_TILES);
    }

    //Code taken from:https://github.com/AstralOrdana/Immersive-Weathering/blob/1.20.0-multiloader/common/src/main/java/com/ordana/immersive_weathering/reg/ModCreativeTab.java
    public static void init(){
        RegHelper.addItemsToTabsRegistration(RegCreativeTabs::addItems);
    }

    private static void after(RegHelper.ItemToTabEvent event, Item target,
                              ResourceKey<CreativeModeTab> tab, Supplier<?>... items) {
        after(event, i -> i.is(target), tab, items);
    }

    private static void after(RegHelper.ItemToTabEvent event, Predicate<ItemStack> targetPred,
                              ResourceKey<CreativeModeTab> tab, Supplier<?>... items) {
        ItemLike[] entries = Arrays.stream(items).map((s -> (ItemLike) (s.get()))).toArray(ItemLike[]::new);
        event.addAfter(tab, targetPred, entries);
    }

    private static void before(RegHelper.ItemToTabEvent event, Item target,
                               ResourceKey<CreativeModeTab> tab, Supplier<?>... items) {
        before(event, i -> i.is(target), tab, items);
    }

    private static void before(RegHelper.ItemToTabEvent event, Predicate<ItemStack> targetPred,
                               ResourceKey<CreativeModeTab> tab, Supplier<?>... items) {
        ItemLike[] entries = Arrays.stream(items).map(s -> (ItemLike) s.get()).toArray(ItemLike[]::new);
        event.addBefore(tab, targetPred, entries);
    }
}
