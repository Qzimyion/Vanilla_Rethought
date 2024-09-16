package net.github.io.qzimyion.fabric.datagen.language;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import static net.github.io.qzimyion.registry.RegBlocks.*;

public class USEngLanguageGen extends FabricLanguageProvider {

    public USEngLanguageGen(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //=Andesite==//
        //Bricks
        translationBuilder.add(ANDESITE_BRICKS.get(), "Andesite Bricks");
        translationBuilder.add(ANDESITE_BRICKS_SLAB.get(), "Andesite Bricks Slab");
        translationBuilder.add(ANDESITE_BRICKS_STAIRS.get(), "Andesite Bricks Stairs");
        translationBuilder.add(ANDESITE_BRICKS_WALL.get(), "Andesite Bricks Wall");
        translationBuilder.add(CRACKED_ANDESITE_BRICKS.get(), "Cracked Andesite Bricks");
        translationBuilder.add(CRACKED_ANDESITE_BRICKS_SLAB.get(), "Cracked Andesite Bricks Slab");
        translationBuilder.add(CRACKED_ANDESITE_BRICKS_STAIRS.get(), "Cracked Andesite Bricks Stairs");
        translationBuilder.add(CRACKED_ANDESITE_BRICKS_WALL.get(), "Cracked Andesite Bricks Wall");
        translationBuilder.add(MOSSY_ANDESITE_BRICKS.get(), "Mossy Andesite Bricks");
        translationBuilder.add(MOSSY_ANDESITE_BRICKS_SLAB.get(), "Mossy Andesite Bricks Slab");
        translationBuilder.add(MOSSY_ANDESITE_BRICKS_STAIRS.get(), "Mossy Andesite Bricks Stairs");
        translationBuilder.add(MOSSY_ANDESITE_BRICKS_WALL.get(), "Mossy Andesite Bricks Wall");
        //Chiseled Bricks
        translationBuilder.add(CHISELED_ANDESITE_BRICKS.get(), "Chiseled Andesite Bricks");
        translationBuilder.add(CRACKED_CHISELED_ANDESITE_BRICKS.get(), "Chiseled Andesite Bricks");
        //Tiles
        translationBuilder.add(ANDESITE_TILES.get(), "Andesite Tiles");
        translationBuilder.add(ANDESITE_TILES_SLAB.get(), "Andesite Tile Slab");
        translationBuilder.add(ANDESITE_TILES_STAIRS.get(), "Andesite Tile Stairs");
        translationBuilder.add(ANDESITE_TILES_WALL.get(), "Andesite Tile Wall");
        translationBuilder.add(CRACKED_ANDESITE_TILES.get(), "Cracked Andesite Tiles");
        translationBuilder.add(CRACKED_ANDESITE_TILES_SLAB.get(), "Cracked Andesite Tile Slab");
        translationBuilder.add(CRACKED_ANDESITE_TILES_STAIRS.get(), "Cracked Andesite Tile Stairs");
        translationBuilder.add(CRACKED_ANDESITE_TILES_WALL.get(), "Cracked Andesite Tile Wall");
        translationBuilder.add(MOSSY_ANDESITE_TILES.get(), "Mossy Andesite Tiles");
        translationBuilder.add(MOSSY_ANDESITE_TILES_SLAB.get(), "Mossy Andesite Tile Slab");
        translationBuilder.add(MOSSY_ANDESITE_TILES_STAIRS.get(), "Mossy Andesite Tile Stairs");
        translationBuilder.add(MOSSY_ANDESITE_TILES_WALL.get(), "Mossy Andesite Tile Wall");

        //=Diorite==//
        //Bricks
        translationBuilder.add(DIORITE_BRICKS.get(), "Diorite Bricks");
        translationBuilder.add(DIORITE_BRICKS_SLAB.get(), "Diorite Bricks Slab");
        translationBuilder.add(DIORITE_BRICKS_STAIRS.get(), "Diorite Bricks Stairs");
        translationBuilder.add(DIORITE_BRICKS_WALL.get(), "Diorite Bricks Wall");
        translationBuilder.add(CRACKED_DIORITE_BRICKS.get(), "Cracked Diorite Bricks");
        translationBuilder.add(CRACKED_DIORITE_BRICKS_SLAB.get(), "Cracked Diorite Bricks Slab");
        translationBuilder.add(CRACKED_DIORITE_BRICKS_STAIRS.get(), "Cracked Diorite Bricks Stairs");
        translationBuilder.add(CRACKED_DIORITE_BRICKS_WALL.get(), "Cracked Diorite Bricks Wall");
        translationBuilder.add(MOSSY_DIORITE_BRICKS.get(), "Mossy Diorite Bricks");
        translationBuilder.add(MOSSY_DIORITE_BRICKS_SLAB.get(), "Mossy Diorite Bricks Slab");
        translationBuilder.add(MOSSY_DIORITE_BRICKS_STAIRS.get(), "Mossy Diorite Bricks Stairs");
        translationBuilder.add(MOSSY_DIORITE_BRICKS_WALL.get(), "Mossy Diorite Bricks Wall");
        //Chiseled Bricks
        translationBuilder.add(CHISELED_DIORITE_BRICKS.get(), "Chiseled Diorite Bricks");
        translationBuilder.add(CRACKED_CHISELED_DIORITE_BRICKS.get(), "Chiseled Diorite Bricks");
        //Tiles
        translationBuilder.add(DIORITE_TILES.get(), "Diorite Tiles");
        translationBuilder.add(DIORITE_TILES_SLAB.get(), "Diorite Tile Slab");
        translationBuilder.add(DIORITE_TILES_STAIRS.get(), "Diorite Tile Stairs");
        translationBuilder.add(DIORITE_TILES_WALL.get(), "Diorite Tile Wall");
        translationBuilder.add(CRACKED_DIORITE_TILES.get(), "Cracked Diorite Tiles");
        translationBuilder.add(CRACKED_DIORITE_TILES_SLAB.get(), "Cracked Diorite Tile Slab");
        translationBuilder.add(CRACKED_DIORITE_TILES_STAIRS.get(), "Cracked Diorite Tile Stairs");
        translationBuilder.add(CRACKED_DIORITE_TILES_WALL.get(), "Cracked Diorite Tile Wall");
        translationBuilder.add(MOSSY_DIORITE_TILES.get(), "Mossy Diorite Tiles");
        translationBuilder.add(MOSSY_DIORITE_TILES_SLAB.get(), "Mossy Diorite Tile Slab");
        translationBuilder.add(MOSSY_DIORITE_TILES_STAIRS.get(), "Mossy Diorite Tile Stairs");
        translationBuilder.add(MOSSY_DIORITE_TILES_WALL.get(), "Mossy Diorite Tile Wall");

        //=Granite==//
        //Bricks
        translationBuilder.add(GRANITE_BRICKS.get(), "Granite Bricks");
        translationBuilder.add(GRANITE_BRICKS_SLAB.get(), "Granite Bricks Slab");
        translationBuilder.add(GRANITE_BRICKS_STAIRS.get(), "Granite Bricks Stairs");
        translationBuilder.add(GRANITE_BRICKS_WALL.get(), "Granite Bricks Wall");
        translationBuilder.add(CRACKED_GRANITE_BRICKS.get(), "Cracked Granite Bricks");
        translationBuilder.add(CRACKED_GRANITE_BRICKS_SLAB.get(), "Cracked Granite Bricks Slab");
        translationBuilder.add(CRACKED_GRANITE_BRICKS_STAIRS.get(), "Cracked Granite Bricks Stairs");
        translationBuilder.add(CRACKED_GRANITE_BRICKS_WALL.get(), "Cracked Granite Bricks Wall");
        translationBuilder.add(MOSSY_GRANITE_BRICKS.get(), "Mossy Granite Bricks");
        translationBuilder.add(MOSSY_GRANITE_BRICKS_SLAB.get(), "Mossy Granite Bricks Slab");
        translationBuilder.add(MOSSY_GRANITE_BRICKS_STAIRS.get(), "Mossy Granite Bricks Stairs");
        translationBuilder.add(MOSSY_GRANITE_BRICKS_WALL.get(), "Mossy Granite Bricks Wall");
        //Chiseled Bricks
        translationBuilder.add(CHISELED_GRANITE_BRICKS.get(), "Chiseled Granite Bricks");
        translationBuilder.add(CRACKED_CHISELED_GRANITE_BRICKS.get(), "Chiseled Granite Bricks");
        //Tiles
        translationBuilder.add(GRANITE_TILES.get(), "Granite Tiles");
        translationBuilder.add(GRANITE_TILES_SLAB.get(), "Granite Tile Slab");
        translationBuilder.add(GRANITE_TILES_STAIRS.get(), "Granite Tile Stairs");
        translationBuilder.add(GRANITE_TILES_WALL.get(), "Granite Tile Wall");
        translationBuilder.add(CRACKED_GRANITE_TILES.get(), "Cracked Granite Tiles");
        translationBuilder.add(CRACKED_GRANITE_TILES_SLAB.get(), "Cracked Granite Tile Slab");
        translationBuilder.add(CRACKED_GRANITE_TILES_STAIRS.get(), "Cracked Granite Tile Stairs");
        translationBuilder.add(CRACKED_GRANITE_TILES_WALL.get(), "Cracked Granite Tile Wall");
        translationBuilder.add(MOSSY_GRANITE_TILES.get(), "Mossy Granite Tiles");
        translationBuilder.add(MOSSY_GRANITE_TILES_SLAB.get(), "Mossy Granite Tile Slab");
        translationBuilder.add(MOSSY_GRANITE_TILES_STAIRS.get(), "Mossy Granite Tile Stairs");
        translationBuilder.add(MOSSY_GRANITE_TILES_WALL.get(), "Mossy Granite Tile Wall");
    }
}
