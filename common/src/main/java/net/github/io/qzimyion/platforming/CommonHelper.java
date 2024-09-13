package net.github.io.qzimyion.platforming;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class CommonHelper {

    /**
     *One of the examples of using an {@code @ExpectPlatform} annotation for loader specific methods
     * like for example these entity registration methods.
     *
     * To see the full implementation of this, please go to the other loader subproject and search for an {@code CommonHelperImpl} class
     */

    @ExpectPlatform
    public static <T extends Item, M extends Mob> Supplier<T> registerSpawnEggItem(String name, Supplier<EntityType<M>> entityType, int backgroundColor, int highlightColor) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Entity> Supplier<EntityType<T>> registerEntityType(String name, EntityType.EntityFactory<T> factory, MobCategory category, float width, float height, int clientTrackingRange) {
        throw new AssertionError();
    }
}
