package com.VoidCallerZ.uc;

import com.VoidCallerZ.uc.registration.*;
import com.VoidCallerZ.uc.setup.ClientSetup;
import com.VoidCallerZ.uc.setup.Config;
import com.VoidCallerZ.uc.setup.ModSetup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(UltimateCompression.MODID)
public class UltimateCompression
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "uc";

    public UltimateCompression()
    {
        ModSetup.setup();
        BlockRegistration.init();
        ToolRegistration.init();
        ArmorRegistration.init();
        FoodRegistration.init();
        ItemRegistration.init();
        RecipeRegistration.init();
        SoundRegistration.init();

        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
}
