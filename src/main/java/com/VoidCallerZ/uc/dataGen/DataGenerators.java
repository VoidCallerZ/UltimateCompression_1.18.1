package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = UltimateCompression.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        boolean isClient = event.includeClient();
        boolean isServer = event.includeServer();

        DataGenerator generator = event.getGenerator();
        generator.addProvider(isClient, new ucRecipes(generator));
        generator.addProvider(isClient, new ucLootTables(generator));
        ucBlockTags blockTags = new ucBlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(isClient, blockTags);
        generator.addProvider(isClient, new ucItemTags(generator, blockTags, event.getExistingFileHelper()));
        generator.addProvider(isClient, new ucAdvancements(generator, event.getExistingFileHelper()));
        generator.addProvider(isClient, new ucBiomeModifiers(generator));

        generator.addProvider(isServer, new ucBlockStates(generator, event.getExistingFileHelper()));
        generator.addProvider(isServer, new ucItemModels(generator, event.getExistingFileHelper()));
        generator.addProvider(isServer, new ucLanguageProvider(generator, "en_us"));

    }
}
