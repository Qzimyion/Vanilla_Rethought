package net.github.io.qzimyion.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

import static net.github.io.qzimyion.registry.RegBlocks.*;

public class BlockTagGen extends FabricTagProvider.BlockTagProvider {

    public BlockTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)

                //==Andesite==//
                //Bricks
                .add(ANDESITE_BRICKS.get())
                .add(ANDESITE_BRICKS_SLAB.get())
                .add(ANDESITE_BRICKS_STAIRS.get())
                .add(ANDESITE_BRICKS_WALL.get())
                .add(CRACKED_ANDESITE_BRICKS.get())
                .add(CRACKED_ANDESITE_BRICKS_SLAB.get())
                .add(CRACKED_ANDESITE_BRICKS_STAIRS.get())
                .add(CRACKED_ANDESITE_BRICKS_WALL.get())
                .add(MOSSY_ANDESITE_BRICKS.get())
                .add(MOSSY_ANDESITE_BRICKS_SLAB.get())
                .add(MOSSY_ANDESITE_BRICKS_STAIRS.get())
                .add(MOSSY_ANDESITE_BRICKS_WALL.get())
                //Chiseled Bricks
                .add(CHISELED_ANDESITE_BRICKS.get())
                .add(CRACKED_CHISELED_ANDESITE_BRICKS.get())
                //Tiles
                .add(ANDESITE_TILES.get())
                .add(ANDESITE_TILES_SLAB.get())
                .add(ANDESITE_TILES_STAIRS.get())
                .add(ANDESITE_TILES_WALL.get())
                .add(CRACKED_ANDESITE_TILES.get())
                .add(CRACKED_ANDESITE_TILES_SLAB.get())
                .add(CRACKED_ANDESITE_TILES_STAIRS.get())
                .add(CRACKED_ANDESITE_TILES_WALL.get())
                .add(MOSSY_ANDESITE_TILES.get())
                .add(MOSSY_ANDESITE_TILES_SLAB.get())
                .add(MOSSY_ANDESITE_TILES_STAIRS.get())
                .add(MOSSY_ANDESITE_TILES_WALL.get())

                //==Diorite==//
                //Bricks
                .add(DIORITE_BRICKS.get())
                .add(DIORITE_BRICKS_SLAB.get())
                .add(DIORITE_BRICKS_STAIRS.get())
                .add(DIORITE_BRICKS_WALL.get())
                .add(CRACKED_DIORITE_BRICKS.get())
                .add(CRACKED_DIORITE_BRICKS_SLAB.get())
                .add(CRACKED_DIORITE_BRICKS_STAIRS.get())
                .add(CRACKED_DIORITE_BRICKS_WALL.get())
                .add(MOSSY_DIORITE_BRICKS.get())
                .add(MOSSY_DIORITE_BRICKS_SLAB.get())
                .add(MOSSY_DIORITE_BRICKS_STAIRS.get())
                .add(MOSSY_DIORITE_BRICKS_WALL.get())
                //Chiseled Bricks
                .add(CHISELED_DIORITE_BRICKS.get())
                .add(CRACKED_CHISELED_DIORITE_BRICKS.get())
                //Tiles
                .add(DIORITE_TILES.get())
                .add(DIORITE_TILES_SLAB.get())
                .add(DIORITE_TILES_STAIRS.get())
                .add(DIORITE_TILES_WALL.get())
                .add(CRACKED_DIORITE_TILES.get())
                .add(CRACKED_DIORITE_TILES_SLAB.get())
                .add(CRACKED_DIORITE_TILES_STAIRS.get())
                .add(CRACKED_DIORITE_TILES_WALL.get())
                .add(MOSSY_DIORITE_TILES.get())
                .add(MOSSY_DIORITE_TILES_SLAB.get())
                .add(MOSSY_DIORITE_TILES_STAIRS.get())
                .add(MOSSY_DIORITE_TILES_WALL.get())

                //==Granite==//
                //Bricks
                .add(GRANITE_BRICKS.get())
                .add(GRANITE_BRICKS_SLAB.get())
                .add(GRANITE_BRICKS_STAIRS.get())
                .add(GRANITE_BRICKS_WALL.get())
                .add(CRACKED_GRANITE_BRICKS.get())
                .add(CRACKED_GRANITE_BRICKS_SLAB.get())
                .add(CRACKED_GRANITE_BRICKS_STAIRS.get())
                .add(CRACKED_GRANITE_BRICKS_WALL.get())
                .add(MOSSY_GRANITE_BRICKS.get())
                .add(MOSSY_GRANITE_BRICKS_SLAB.get())
                .add(MOSSY_GRANITE_BRICKS_STAIRS.get())
                .add(MOSSY_GRANITE_BRICKS_WALL.get())
                //Chiseled Bricks
                .add(CHISELED_GRANITE_BRICKS.get())
                .add(CRACKED_CHISELED_GRANITE_BRICKS.get())
                //Tiles
                .add(GRANITE_TILES.get())
                .add(GRANITE_TILES_SLAB.get())
                .add(GRANITE_TILES_STAIRS.get())
                .add(GRANITE_TILES_WALL.get())
                .add(CRACKED_GRANITE_TILES.get())
                .add(CRACKED_GRANITE_TILES_SLAB.get())
                .add(CRACKED_GRANITE_TILES_STAIRS.get())
                .add(CRACKED_GRANITE_TILES_WALL.get())
                .add(CRACKED_GRANITE_TILES_WALL.get())
                .add(MOSSY_GRANITE_TILES.get())
                .add(MOSSY_GRANITE_TILES_SLAB.get())
                .add(MOSSY_GRANITE_TILES_STAIRS.get())
                .add(MOSSY_GRANITE_TILES_WALL.get())
        ;
    }
}
