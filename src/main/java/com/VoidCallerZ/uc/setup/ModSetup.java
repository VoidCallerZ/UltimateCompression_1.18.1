package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.setup.registration.FoodRegistration;
import com.VoidCallerZ.uc.setup.registration.Registration;
import com.VoidCallerZ.uc.setup.registration.ToolRegistration;
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
            return new ItemStack(Registration.COMPRESSED_DIAMOND_GEM.get());
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
        IEventBus bus = MinecraftForge.EVENT_BUS;
    }

    public static void init(FMLCommonSetupEvent event)
    {

    }
}
