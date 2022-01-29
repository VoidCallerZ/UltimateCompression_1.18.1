package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.worldgen.ores.Ores;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup
{
    public static final String TAB_NAME = "ultimatecompression";

    public static final CreativeModeTab ULTIMATE_COMPRESSION_TAB = new CreativeModeTab(TAB_NAME)
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(Registration.COMPRESSED_DIAMOND_GEM.get());
        }
    };

    public static void setup()
    {
        IEventBus bus = MinecraftForge.EVENT_BUS;
        bus.addListener(Ores::onBiomeLoadingEvent);
    }

    public static void init(FMLCommonSetupEvent event)
    {
        event.enqueueWork(() ->
        {
            Ores.registerConfiguredFeatures();
        });
    }
}
