package net.github.io.qzimyion.platform.fabric;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

import java.util.function.Supplier;

import static net.github.io.qzimyion.VanillaRethoughtCommon.MOD_ID;

public class CommonHelperImpl {

    /** Do keep in mind that this is not necessary to do when you have arch API installed in your multiloader setup.
     * This is just for the process to demonstrate how to use the @ExpectPlatform annotation provided by the Arch API.
     */

    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        T registry = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), item.get());
        return () -> registry;
    }

    public static <T extends Item, M extends Mob> Supplier<SpawnEggItem> registerSpawnEggItem(String name, Supplier<EntityType<M>> entityType, int backgroundColor, int highlightColor) {
        return registerItem(name, () -> new SpawnEggItem(entityType.get(), backgroundColor, highlightColor, new Item.Properties()));
    }

    public static <T extends Entity> Supplier<EntityType<T>> registerEntityType(String name, EntityType.EntityFactory<T> factory, MobCategory category, float width, float height, int clientTrackingRange) {
        EntityType<T> registry = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(MOD_ID, name), FabricEntityTypeBuilder.create(category, factory).dimensions(EntityDimensions.scalable(width, height)).trackRangeChunks(clientTrackingRange).build());
        return () -> registry;
    }
}
