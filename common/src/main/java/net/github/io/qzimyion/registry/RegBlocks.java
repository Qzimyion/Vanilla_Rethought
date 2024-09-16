package net.github.io.qzimyion.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

import static net.github.io.qzimyion.VanillaRethoughtCommon.MOD_ID;

@SuppressWarnings("SameParameterValue")
public class RegBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    //==Vanilla Stone==//


    //==Andesite==//
    public static final RegistrySupplier<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> ANDESITE_BRICKS_SLAB = registerBlock("andesite_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> ANDESITE_BRICKS_STAIRS = registerBlock("andesite_bricks_stairs", ()-> new StairBlock(ANDESITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> ANDESITE_BRICKS_WALL = registerBlock("andesite_bricks_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_ANDESITE_BRICKS_SLAB = registerBlock("cracked_andesite_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_ANDESITE_BRICKS_STAIRS = registerBlock("cracked_andesite_bricks_stairs", ()-> new StairBlock(CRACKED_ANDESITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_ANDESITE_BRICKS_WALL = registerBlock("cracked_andesite_bricks_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_ANDESITE_BRICKS_SLAB = registerBlock("mossy_andesite_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_ANDESITE_BRICKS_STAIRS = registerBlock("mossy_andesite_bricks_stairs", ()-> new StairBlock(CRACKED_ANDESITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_ANDESITE_BRICKS_WALL = registerBlock("mossy_andesite_bricks_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_CHISELED_ANDESITE_BRICKS = registerBlock("cracked_chiseled_andesite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> ANDESITE_TILES = registerBlock("andesite_tiles", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> ANDESITE_TILES_SLAB = registerBlock("andesite_tiles_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> ANDESITE_TILES_STAIRS = registerBlock("andesite_tiles_stairs", ()-> new StairBlock(ANDESITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> ANDESITE_TILES_WALL = registerBlock("andesite_tiles_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_ANDESITE_TILES = registerBlock("cracked_andesite_tiles", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_ANDESITE_TILES_SLAB = registerBlock("cracked_andesite_tiles_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_ANDESITE_TILES_STAIRS = registerBlock("cracked_andesite_tiles_stairs", ()-> new StairBlock(ANDESITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_ANDESITE_TILES_WALL = registerBlock("cracked_andesite_tiles_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_ANDESITE_TILES = registerBlock("mossy_andesite_tiles", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_ANDESITE_TILES_SLAB = registerBlock("mossy_andesite_tiles_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_ANDESITE_TILES_STAIRS = registerBlock("mossy_andesite_tiles_stairs", ()-> new StairBlock(ANDESITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_ANDESITE_TILES_WALL = registerBlock("mossy_andesite_tiles_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);

    //==Diorite==//
    public static final RegistrySupplier<Block> DIORITE_BRICKS = registerBlock("diorite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> DIORITE_BRICKS_SLAB = registerBlock("diorite_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> DIORITE_BRICKS_STAIRS = registerBlock("diorite_bricks_stairs", ()-> new StairBlock(DIORITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> DIORITE_BRICKS_WALL = registerBlock("diorite_bricks_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_DIORITE_BRICKS_SLAB = registerBlock("cracked_diorite_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_DIORITE_BRICKS_STAIRS = registerBlock("cracked_diorite_bricks_stairs", ()-> new StairBlock(CRACKED_DIORITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_DIORITE_BRICKS_WALL = registerBlock("cracked_diorite_bricks_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_DIORITE_BRICKS_SLAB = registerBlock("mossy_diorite_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_DIORITE_BRICKS_STAIRS = registerBlock("mossy_diorite_bricks_stairs", ()-> new StairBlock(CRACKED_DIORITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_DIORITE_BRICKS_WALL = registerBlock("mossy_diorite_bricks_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_CHISELED_DIORITE_BRICKS = registerBlock("cracked_chiseled_diorite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> DIORITE_TILES = registerBlock("diorite_tiles", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> DIORITE_TILES_SLAB = registerBlock("diorite_tiles_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> DIORITE_TILES_STAIRS = registerBlock("diorite_tiles_stairs", ()-> new StairBlock(DIORITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> DIORITE_TILES_WALL = registerBlock("diorite_tiles_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_DIORITE_TILES = registerBlock("cracked_diorite_tiles", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_DIORITE_TILES_SLAB = registerBlock("cracked_diorite_tiles_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_DIORITE_TILES_STAIRS = registerBlock("cracked_diorite_tiles_stairs", ()-> new StairBlock(DIORITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_DIORITE_TILES_WALL = registerBlock("cracked_diorite_tiles_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_DIORITE_TILES = registerBlock("mossy_diorite_tiles", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_DIORITE_TILES_SLAB = registerBlock("mossy_diorite_tiles_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_DIORITE_TILES_STAIRS = registerBlock("mossy_diorite_tiles_stairs", ()-> new StairBlock(DIORITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_DIORITE_TILES_WALL = registerBlock("mossy_diorite_tiles_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);

    //==Granite==//
    public static final RegistrySupplier<Block> GRANITE_BRICKS = registerBlock("granite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> GRANITE_BRICKS_SLAB = registerBlock("granite_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> GRANITE_BRICKS_STAIRS = registerBlock("granite_bricks_stairs", ()-> new StairBlock(GRANITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> GRANITE_BRICKS_WALL = registerBlock("granite_bricks_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_GRANITE_BRICKS_SLAB = registerBlock("cracked_granite_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_GRANITE_BRICKS_STAIRS = registerBlock("cracked_granite_bricks_stairs", ()-> new StairBlock(CRACKED_GRANITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_GRANITE_BRICKS_WALL = registerBlock("cracked_granite_bricks_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_GRANITE_BRICKS_SLAB = registerBlock("mossy_granite_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_GRANITE_BRICKS_STAIRS = registerBlock("mossy_granite_bricks_stairs", ()-> new StairBlock(CRACKED_GRANITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_GRANITE_BRICKS_WALL = registerBlock("mossy_granite_bricks_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_CHISELED_GRANITE_BRICKS = registerBlock("cracked_chiseled_granite_bricks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> GRANITE_TILES = registerBlock("granite_tiles", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> GRANITE_TILES_SLAB = registerBlock("granite_tiles_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> GRANITE_TILES_STAIRS = registerBlock("granite_tiles_stairs", ()-> new StairBlock(GRANITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> GRANITE_TILES_WALL = registerBlock("granite_tiles_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_GRANITE_TILES = registerBlock("cracked_granite_tiles", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_GRANITE_TILES_SLAB = registerBlock("cracked_granite_tiles_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_GRANITE_TILES_STAIRS = registerBlock("cracked_granite_tiles_stairs", ()-> new StairBlock(GRANITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> CRACKED_GRANITE_TILES_WALL = registerBlock("cracked_granite_tiles_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_GRANITE_TILES = registerBlock("mossy_granite_tiles", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_GRANITE_TILES_SLAB = registerBlock("mossy_granite_tiles_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_GRANITE_TILES_STAIRS = registerBlock("mossy_granite_tiles_stairs", ()-> new StairBlock(GRANITE_BRICKS.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final RegistrySupplier<Block> MOSSY_GRANITE_TILES_WALL = registerBlock("mossy_granite_tiles_wall", ()-> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);


    // Reg methods
    private static <T extends Block> RegistrySupplier<T> registerBlock(String name, Supplier<T> block, boolean isBlockItem) {
        RegistrySupplier<T> supplier = BLOCKS.register(name, block);
        if (isBlockItem){
            registerBlockItem(name, supplier);
        }
        return supplier;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistrySupplier<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerBlocks(){
        BLOCKS.register();
        ITEMS.register();
    }
}
