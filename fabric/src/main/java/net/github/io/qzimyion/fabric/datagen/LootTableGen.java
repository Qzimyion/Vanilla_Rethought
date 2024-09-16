package net.github.io.qzimyion.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import static net.github.io.qzimyion.registry.RegBlocks.*;

public class LootTableGen extends FabricBlockLootTableProvider {

    public LootTableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //==Andesite==//
        //Bricks
        dropSelf(ANDESITE_BRICKS.get());
        dropSelf(ANDESITE_BRICKS_SLAB.get());
        dropSelf(ANDESITE_BRICKS_STAIRS.get());
        dropSelf(ANDESITE_BRICKS_WALL.get());
        dropSelf(CRACKED_ANDESITE_BRICKS.get());
        dropSelf(CRACKED_ANDESITE_BRICKS_SLAB.get());
        dropSelf(CRACKED_ANDESITE_BRICKS_STAIRS.get());
        dropSelf(CRACKED_ANDESITE_BRICKS_WALL.get());
        dropSelf(MOSSY_ANDESITE_BRICKS.get());
        dropSelf(MOSSY_ANDESITE_BRICKS_SLAB.get());
        dropSelf(MOSSY_ANDESITE_BRICKS_STAIRS.get());
        dropSelf(MOSSY_ANDESITE_BRICKS_WALL.get());
        //Chiseled Bricks
        dropSelf(CHISELED_ANDESITE_BRICKS.get());
        dropSelf(CRACKED_CHISELED_ANDESITE_BRICKS.get());
        //Tiles
        dropSelf(ANDESITE_TILES.get());
        dropSelf(ANDESITE_TILES_SLAB.get());
        dropSelf(ANDESITE_TILES_STAIRS.get());
        dropSelf(ANDESITE_TILES_WALL.get());
        dropSelf(CRACKED_ANDESITE_TILES.get());
        dropSelf(CRACKED_ANDESITE_TILES_SLAB.get());
        dropSelf(CRACKED_ANDESITE_TILES_STAIRS.get());
        dropSelf(CRACKED_ANDESITE_TILES_WALL.get());
        dropSelf(MOSSY_ANDESITE_TILES.get());
        dropSelf(MOSSY_ANDESITE_TILES_SLAB.get());
        dropSelf(MOSSY_ANDESITE_TILES_STAIRS.get());
        dropSelf(MOSSY_ANDESITE_TILES_WALL.get());

        //==Diorite==//
        //Bricks
        dropSelf(DIORITE_BRICKS.get());
        dropSelf(DIORITE_BRICKS_SLAB.get());
        dropSelf(DIORITE_BRICKS_STAIRS.get());
        dropSelf(DIORITE_BRICKS_WALL.get());
        dropSelf(CRACKED_DIORITE_BRICKS.get());
        dropSelf(CRACKED_DIORITE_BRICKS_SLAB.get());
        dropSelf(CRACKED_DIORITE_BRICKS_STAIRS.get());
        dropSelf(CRACKED_DIORITE_BRICKS_WALL.get());
        dropSelf(MOSSY_DIORITE_BRICKS.get());
        dropSelf(MOSSY_DIORITE_BRICKS_SLAB.get());
        dropSelf(MOSSY_DIORITE_BRICKS_STAIRS.get());
        dropSelf(MOSSY_DIORITE_BRICKS_WALL.get());
        //Chiseled Bricks
        dropSelf(CHISELED_DIORITE_BRICKS.get());
        dropSelf(CRACKED_CHISELED_DIORITE_BRICKS.get());
        //Tiles
        dropSelf(DIORITE_TILES.get());
        dropSelf(DIORITE_TILES_SLAB.get());
        dropSelf(DIORITE_TILES_STAIRS.get());
        dropSelf(DIORITE_TILES_WALL.get());
        dropSelf(CRACKED_DIORITE_TILES.get());
        dropSelf(CRACKED_DIORITE_TILES_SLAB.get());
        dropSelf(CRACKED_DIORITE_TILES_STAIRS.get());
        dropSelf(CRACKED_DIORITE_TILES_WALL.get());
        dropSelf(MOSSY_DIORITE_TILES.get());
        dropSelf(MOSSY_DIORITE_TILES_SLAB.get());
        dropSelf(MOSSY_DIORITE_TILES_STAIRS.get());
        dropSelf(MOSSY_DIORITE_TILES_WALL.get());

        //==Granite==//
        //Bricks
        dropSelf(GRANITE_BRICKS.get());
        dropSelf(GRANITE_BRICKS_SLAB.get());
        dropSelf(GRANITE_BRICKS_STAIRS.get());
        dropSelf(GRANITE_BRICKS_WALL.get());
        dropSelf(CRACKED_GRANITE_BRICKS.get());
        dropSelf(CRACKED_GRANITE_BRICKS_SLAB.get());
        dropSelf(CRACKED_GRANITE_BRICKS_STAIRS.get());
        dropSelf(CRACKED_GRANITE_BRICKS_WALL.get());
        dropSelf(MOSSY_GRANITE_BRICKS.get());
        dropSelf(MOSSY_GRANITE_BRICKS_SLAB.get());
        dropSelf(MOSSY_GRANITE_BRICKS_STAIRS.get());
        dropSelf(MOSSY_GRANITE_BRICKS_WALL.get());
        //Chiseled Bricks
        dropSelf(CHISELED_GRANITE_BRICKS.get());
        dropSelf(CRACKED_CHISELED_GRANITE_BRICKS.get());
        //Tiles
        dropSelf(GRANITE_TILES.get());
        dropSelf(GRANITE_TILES_SLAB.get());
        dropSelf(GRANITE_TILES_STAIRS.get());
        dropSelf(GRANITE_TILES_WALL.get());
        dropSelf(CRACKED_GRANITE_TILES.get());
        dropSelf(CRACKED_GRANITE_TILES_SLAB.get());
        dropSelf(CRACKED_GRANITE_TILES_STAIRS.get());
        dropSelf(CRACKED_GRANITE_TILES_WALL.get());
        dropSelf(MOSSY_GRANITE_TILES.get());
        dropSelf(MOSSY_GRANITE_TILES_SLAB.get());
        dropSelf(MOSSY_GRANITE_TILES_STAIRS.get());
        dropSelf(MOSSY_GRANITE_TILES_WALL.get());
    }
}
