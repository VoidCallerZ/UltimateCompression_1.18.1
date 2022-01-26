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
        lootTables.put(Registration.COMPRESSED_IRON_ORE.get(), createSilkTouchTable("compressed_iron_ore", Registration.COMPRESSED_IRON_ORE.get(), Registration.COMPRESSED_RAW_IRON.get(), 1, 2));
        lootTables.put(Registration.COMPRESSED_GOLD_ORE.get(), createSilkTouchTable("compressed_gold_ore", Registration.COMPRESSED_GOLD_ORE.get(), Registration.COMPRESSED_RAW_GOLD.get(), 1, 2));
        lootTables.put(Registration.COMPRESSED_DIAMOND_ORE.get(), createSilkTouchTable("compressed_diamond_ore", Registration.COMPRESSED_DIAMOND_ORE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), 1, 1));
        lootTables.put(Registration.COMPRESSED_COPPER_ORE.get(), createSilkTouchTable("compressed_copper_ore", Registration.COMPRESSED_COPPER_ORE.get(), Registration.COMPRESSED_RAW_COPPER.get(), 1, 3));

        lootTables.put(Registration.COMPRESSED_IRON_BLOCK.get(), createSimpleTable("compessed_iron_block", Registration.COMPRESSED_IRON_BLOCK.get()));
        lootTables.put(Registration.COMPRESSED_GOLD_BLOCK.get(), createSimpleTable("compessed_gold_block", Registration.COMPRESSED_GOLD_BLOCK.get()));
        lootTables.put(Registration.COMPRESSED_DIAMOND_BLOCK.get(), createSimpleTable("compessed_diamond_block", Registration.COMPRESSED_DIAMOND_BLOCK.get()));
        lootTables.put(Registration.COMPRESSED_COPPER_BLOCK.get(), createSimpleTable("compessed_copper_block", Registration.COMPRESSED_COPPER_BLOCK.get()));

        lootTables.put(Registration.COMPRESSED_RAW_IRON_BLOCK.get(), createSimpleTable("compressed_raw_iron_block", Registration.COMPRESSED_RAW_IRON_BLOCK.get()));
        lootTables.put(Registration.COMPRESSED_RAW_GOLD_BLOCK.get(), createSimpleTable("compressed_raw_gold_block", Registration.COMPRESSED_RAW_GOLD_BLOCK.get()));
        lootTables.put(Registration.COMPRESSED_RAW_COPPER_BLOCK.get(), createSimpleTable("compressed_raw_copper_block", Registration.COMPRESSED_RAW_COPPER_BLOCK.get()));
    }
}
