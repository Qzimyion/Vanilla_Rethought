package net.github.io.qzimyion.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;

import static net.github.io.qzimyion.registry.RegBlocks.*;
import static net.github.io.qzimyion.registry.RegBlocks.MOSSY_ANDESITE_BRICKS_WALL;

public class ModelGen extends FabricModelProvider {
    public ModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        //==Andesite==//
        //Bricks
        BlockModelGenerators.BlockFamilyProvider AndesiteBricks = blockModelGenerators.family(ANDESITE_BRICKS.get());
        BlockModelGenerators.BlockFamilyProvider CrackedAndesiteBricks = blockModelGenerators.family(CRACKED_ANDESITE_BRICKS.get());
        BlockModelGenerators.BlockFamilyProvider MossyAndesiteBricks = blockModelGenerators.family(MOSSY_ANDESITE_BRICKS.get());
        //Tiles
        BlockModelGenerators.BlockFamilyProvider AndesiteTiles = blockModelGenerators.family(ANDESITE_TILES.get());
        BlockModelGenerators.BlockFamilyProvider CrackedAndesiteTiles = blockModelGenerators.family(CRACKED_ANDESITE_TILES.get());
        BlockModelGenerators.BlockFamilyProvider MossyAndesiteTiles = blockModelGenerators.family(MOSSY_ANDESITE_TILES.get());

        AndesiteBricks.slab(ANDESITE_BRICKS_SLAB.get()).stairs(ANDESITE_BRICKS_STAIRS.get()).wall(ANDESITE_BRICKS_WALL.get());
        CrackedAndesiteBricks.slab(CRACKED_ANDESITE_BRICKS_SLAB.get()).stairs(CRACKED_ANDESITE_BRICKS_STAIRS.get()).wall(CRACKED_ANDESITE_BRICKS_WALL.get());
        MossyAndesiteBricks.slab(MOSSY_ANDESITE_BRICKS_SLAB.get()).stairs(MOSSY_ANDESITE_BRICKS_STAIRS.get()).wall(MOSSY_ANDESITE_BRICKS_WALL.get());
        AndesiteTiles.slab(ANDESITE_TILES_SLAB.get()).stairs(ANDESITE_TILES_STAIRS.get()).wall(ANDESITE_TILES_WALL.get());
        CrackedAndesiteTiles.slab(CRACKED_ANDESITE_TILES_SLAB.get()).stairs(CRACKED_ANDESITE_TILES_STAIRS.get()).wall(CRACKED_ANDESITE_TILES_WALL.get());
        MossyAndesiteTiles.slab(MOSSY_ANDESITE_TILES_SLAB.get()).stairs(MOSSY_ANDESITE_TILES_STAIRS.get()).wall(MOSSY_ANDESITE_TILES_WALL.get());

        //==Diorite==//
        //Bricks
        BlockModelGenerators.BlockFamilyProvider DioriteBricks = blockModelGenerators.family(DIORITE_BRICKS.get());
        BlockModelGenerators.BlockFamilyProvider CrackedDioriteBricks = blockModelGenerators.family(CRACKED_DIORITE_BRICKS.get());
        BlockModelGenerators.BlockFamilyProvider MossyDioriteBricks = blockModelGenerators.family(MOSSY_DIORITE_BRICKS.get());
        //Tiles
        BlockModelGenerators.BlockFamilyProvider DioriteTiles = blockModelGenerators.family(DIORITE_TILES.get());
        BlockModelGenerators.BlockFamilyProvider CrackedDioriteTiles = blockModelGenerators.family(CRACKED_DIORITE_TILES.get());
        BlockModelGenerators.BlockFamilyProvider MossyDioriteTiles = blockModelGenerators.family(MOSSY_DIORITE_TILES.get());

        DioriteBricks.slab(DIORITE_BRICKS_SLAB.get()).stairs(DIORITE_BRICKS_STAIRS.get()).wall(DIORITE_BRICKS_WALL.get());
        CrackedDioriteBricks.slab(CRACKED_DIORITE_BRICKS_SLAB.get()).stairs(CRACKED_DIORITE_BRICKS_STAIRS.get()).wall(CRACKED_DIORITE_BRICKS_WALL.get());
        MossyDioriteBricks.slab(MOSSY_DIORITE_BRICKS_SLAB.get()).stairs(MOSSY_DIORITE_BRICKS_STAIRS.get()).wall(MOSSY_DIORITE_BRICKS_WALL.get());
        DioriteTiles.slab(DIORITE_TILES_SLAB.get()).stairs(DIORITE_TILES_STAIRS.get()).wall(DIORITE_TILES_WALL.get());
        CrackedDioriteTiles.slab(CRACKED_DIORITE_TILES_SLAB.get()).stairs(CRACKED_DIORITE_TILES_STAIRS.get()).wall(CRACKED_DIORITE_TILES_WALL.get());
        MossyDioriteTiles.slab(MOSSY_DIORITE_TILES_SLAB.get()).stairs(MOSSY_DIORITE_TILES_STAIRS.get()).wall(MOSSY_DIORITE_TILES_WALL.get());

        //==Granite==//
        //Bricks
        BlockModelGenerators.BlockFamilyProvider GraniteBricks = blockModelGenerators.family(GRANITE_BRICKS.get());
        BlockModelGenerators.BlockFamilyProvider CrackedGraniteBricks = blockModelGenerators.family(CRACKED_GRANITE_BRICKS.get());
        BlockModelGenerators.BlockFamilyProvider MossyGraniteBricks = blockModelGenerators.family(MOSSY_GRANITE_BRICKS.get());
        //Tiles
        BlockModelGenerators.BlockFamilyProvider GraniteTiles = blockModelGenerators.family(GRANITE_TILES.get());
        BlockModelGenerators.BlockFamilyProvider CrackedGraniteTiles = blockModelGenerators.family(CRACKED_GRANITE_TILES.get());
        BlockModelGenerators.BlockFamilyProvider MossyGraniteTiles = blockModelGenerators.family(MOSSY_GRANITE_TILES.get());

        GraniteBricks.slab(GRANITE_BRICKS_SLAB.get()).stairs(GRANITE_BRICKS_STAIRS.get()).wall(GRANITE_BRICKS_WALL.get());
        CrackedGraniteBricks.slab(CRACKED_GRANITE_BRICKS_SLAB.get()).stairs(CRACKED_GRANITE_BRICKS_STAIRS.get()).wall(CRACKED_GRANITE_BRICKS_WALL.get());
        MossyGraniteBricks.slab(MOSSY_GRANITE_BRICKS_SLAB.get()).stairs(MOSSY_GRANITE_BRICKS_STAIRS.get()).wall(MOSSY_GRANITE_BRICKS_WALL.get());
        GraniteTiles.slab(GRANITE_TILES_SLAB.get()).stairs(GRANITE_TILES_STAIRS.get()).wall(GRANITE_TILES_WALL.get());
        CrackedGraniteTiles.slab(CRACKED_GRANITE_TILES_SLAB.get()).stairs(CRACKED_GRANITE_TILES_STAIRS.get()).wall(CRACKED_GRANITE_TILES_WALL.get());
        MossyGraniteTiles.slab(MOSSY_GRANITE_TILES_SLAB.get()).stairs(MOSSY_GRANITE_TILES_STAIRS.get()).wall(MOSSY_GRANITE_TILES_WALL.get());

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }
}
