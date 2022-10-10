package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.registration.FoodRegistration;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import com.VoidCallerZ.uc.registration.ItemRegistration;
import com.VoidCallerZ.uc.registration.ToolRegistration;
import com.VoidCallerZ.uc.world.ores.Ores;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup
{
    public static final String UC_TAB = "ultimatecompression";
    public static final String UC_TOOLS_TAB = "ultimatetoolcompression";
    public static final String UC_FOOD_TAB = "ultiamtefoodcompression";

    public static final CreativeModeTab ULTIMATE_COMPRESSION_TAB = new CreativeModeTab(UC_TAB)
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ItemRegistration.COMPRESSED_DIAMOND_GEM.get());
        }
    };

    public static final CreativeModeTab ULTIMATE_TOOL_COMPRESSION_TAB = new CreativeModeTab(UC_TOOLS_TAB)
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ToolRegistration.COMPRESSED_IRON_PICKAXE.get());
        }
    };

    public static final CreativeModeTab ULTIMATE_FOOD_COMPRESSION_TAB = new CreativeModeTab(UC_FOOD_TAB)
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(FoodRegistration.COMPRESSED_APPLE.get());
        }
    };

    public static void setup()
    {

    }

    public static void init(FMLCommonSetupEvent event)
    {
        event.enqueueWork(() ->
                Ores.registerConfiguredFeatures());
    }
}
