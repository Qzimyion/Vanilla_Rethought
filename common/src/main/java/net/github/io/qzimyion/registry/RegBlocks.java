package net.github.io.qzimyion.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

import java.util.function.Supplier;

import static net.github.io.qzimyion.VanillaRethoughtCommon.MOD_ID;

public class RegBlocks {

    /** A simple way to register blocks on multi-loader with Arch API.
     The method is reminiscent of how you'd register stuff on forge
     This also applies to other objects like Items, Mobs and more. (Events are an exception, but we'll get to them later)
     */

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);


    // Example Content
    public static final RegistrySupplier<Block> SKIBIDI_BLOCK = registerBlock("block_of_skibidi", ()-> new
            Block(BlockBehaviour.Properties.copy(Blocks.STONE)), true);

    public static final  RegistrySupplier<Block> SUSSY_BLOCK = registerBlock("block_of_sussy", ()-> new Block(BlockBehaviour.Properties.of()
            .destroyTime(10f).instrument(NoteBlockInstrument.BIT)), false);

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
