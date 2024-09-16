package net.github.io.qzimyion.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.github.io.qzimyion.fabric.datagen.language.GBEngLanguageGen;
import net.github.io.qzimyion.fabric.datagen.language.USEngLanguageGen;

public class VanillaRethoughDatagenFabric implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(BlockTagGen::new);
        pack.addProvider(LootTableGen::new);
        pack.addProvider(ModelGen::new);
        pack.addProvider(RecipeGen::new);

        //Language Datagen
        pack.addProvider(USEngLanguageGen::new);
        pack.addProvider(GBEngLanguageGen::new);
    }
}
