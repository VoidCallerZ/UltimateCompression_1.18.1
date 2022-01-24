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
        DataGenerator generator = event.getGenerator();
        if(event.includeServer())
        {
            generator.addProvider(new ucRecipes(generator));
            generator.addProvider(new ucLootTables(generator));
            ucBlockTags blockTags = new ucBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new ucItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if(event.includeClient())
        {
            generator.addProvider(new ucBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new ucItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new ucLanguageProvider(generator, "en_us"));
        }
    }
}
