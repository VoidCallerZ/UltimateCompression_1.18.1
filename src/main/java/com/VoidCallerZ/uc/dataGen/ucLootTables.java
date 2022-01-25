package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.data.DataGenerator;

public class ucLootTables extends BaseLootTableProvider
{
    public ucLootTables(DataGenerator dataGeneratorIn) {super(dataGeneratorIn);}

    @Override
    protected void addTables()
    {
        lootTables.put(Registration.ULTIMATE_POWERGEN.get(), createStandardTable("ultimate_powergen", Registration.ULTIMATE_POWERGEN.get(), Registration.ULTIMATE_POWERGEN_BE.get()));
        lootTables.put(Registration.COMPRESSED_IRON_ORE.get(), createSilkTouchTable("compressed_iron_ore", Registration.COMPRESSED_IRON_ORE.get(), Registration.COMPRESSED_RAW_IRON.get(), 1, 3));
    }
}
