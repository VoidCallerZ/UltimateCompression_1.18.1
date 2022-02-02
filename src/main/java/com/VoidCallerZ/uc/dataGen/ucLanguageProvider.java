package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.VoidCallerZ.uc.blocks.PowergenBlock.MESSAGE_ULTIMATE_POWERGEN;
import static com.VoidCallerZ.uc.blocks.PowergenBlock.SCREEN_ULTIMATE_POWERGEN;
import static com.VoidCallerZ.uc.blocks.CompressorBlock.MESSAGE_COMPRESSOR;
import static com.VoidCallerZ.uc.blocks.CompressorBlock.SCREEN_MESSAGE_COMPRESSOR;
import static com.VoidCallerZ.uc.setup.ModSetup.UC_TAB;

public class ucLanguageProvider extends LanguageProvider
{
    public ucLanguageProvider(DataGenerator gen, String locale) { super(gen, UltimateCompression.MODID, locale); }

    @Override
    protected void  addTranslations()
    {
        add("itemGroup." + UC_TAB, "Ultimate Compression");
        add(MESSAGE_ULTIMATE_POWERGEN, "Power generator generating %s per tick!");
        add(SCREEN_ULTIMATE_POWERGEN, "Power generator");
        add(MESSAGE_COMPRESSOR, "A block capable to compress normal ingots and blocks into compressed ones.");
        add(SCREEN_MESSAGE_COMPRESSOR, "Compressor");

        add(Registration.ULTIMATE_POWERGEN.get(), "Ultimate power generator");
        add(Registration.COMPRESSOR.get(), "Ultimate Compressor Tier I");

        //Ores
        add(Registration.COMPRESSED_IRON_ORE.get(), "Compressed Iron Ore");
        add(Registration.COMPRESSED_GOLD_ORE.get(), "Compressed Gold Ore");
        add(Registration.COMPRESSED_DIAMOND_ORE.get(), "Compressed Diamond Ore");
        add(Registration.COMPRESSED_COPPER_ORE.get(), "Compressed Copper Ore");
        add(Registration.COMPRESSED_COAL_ORE.get(), "Compressed Coal Ore");
        add(Registration.COMPRESSED_EMERALD_ORE.get(), "Compressed Emerald Ore");
        add(Registration.COMPRESSED_LAPIS_ORE.get(), "Compressed Lapis Ore");
        add(Registration.COMPRESSED_REDSTONE_ORE.get(), "Compressed Redstone Ore");
        add(Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get(), "Compressed Deepslate Iron Ore");
        add(Registration.COMPRESSED_DEEPSLATE_GOLD_ORE.get(), "Compressed Deepslate Gold Ore");
        add(Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(), "Compressed Deepslate Diamond Ore");
        add(Registration.COMPRESSED_DEEPSLATE_COPPER_ORE.get(), "Compressed Deepslate Copper Ore");
        add(Registration.COMPRESSED_DEEPSLATE_COAL_ORE.get(), "Compressed Deepslate Coal Ore");
        add(Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(), "Compressed Deepslate Emerald Ore");
        add(Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(), "Compressed Deepslate Lapis Ore");
        add(Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(), "Compressed Deepslate Redstone Ore");

        //Blocks
        add(Registration.COMPRESSED_IRON_BLOCK.get(), "Compressed Block of Iron");
        add(Registration.COMPRESSED_GOLD_BLOCK.get(), "Compressed Block of Gold");
        add(Registration.COMPRESSED_DIAMOND_BLOCK.get(), "Compressed Block of Diamond");
        add(Registration.COMPRESSED_COPPER_BLOCK.get(), "Compressed Block of Copper");
        add(Registration.COMPRESSED_COAL_BLOCK.get(), "Compressed Block of Coal");
        add(Registration.COMPRESSED_EMERALD_BLOCK.get(), "Compressed Block of Emerald");
        add(Registration.COMPRESSED_LAPIS_BLOCK.get(), "Compressed Block of Lapis");
        add(Registration.COMPRESSED_REDSTONE_BLOCK.get(), "Compressed Block of Redstone");
        add(Registration.COMPRESSED_NETHERITE_BLOCK.get(), "Compressed Block of Netherite");
        add(Registration.COMPRESSED_RAW_IRON_BLOCK.get(), "Compressed Block of Raw Iron");
        add(Registration.COMPRESSED_RAW_GOLD_BLOCK.get(), "Compressed Block of Raw Gold");
        add(Registration.COMPRESSED_RAW_COPPER_BLOCK.get(), "Compressed Block of Raw Copper");

        //Logs & Planks
        add(Registration.COMPRESSED_ACACIA_LOG.get(), "Compressed Acacia Log");
        add(Registration.COMPRESSED_ACACIA_PLANKS.get(), "Compressed Acacia Planks");
        add(Registration.COMPRESSED_BIRCH_LOG.get(), "Compressed Birch Log");
        add(Registration.COMPRESSED_BIRCH_PLANKS.get(), "Compressed Birch Planks");
        add(Registration.COMPRESSED_DARK_OAK_LOG.get(), "Compressed Dark Oak Log");
        add(Registration.COMPRESSED_DARK_OAK_PLANKS.get(), "Compressed Dark Oak Planks");
        add(Registration.COMPRESSED_JUNGLE_LOG.get(), "Compressed Jungle Log");
        add(Registration.COMPRESSED_JUNGLE_PLANKS.get(), "Compressed Jungle Planks");
        add(Registration.COMPRESSED_OAK_LOG.get(), "Compressed Oak Log");
        add(Registration.COMPRESSED_OAK_PLANKS.get(), "Compressed Oak Planks");
        add(Registration.COMPRESSED_SPRUCE_LOG.get(), "Compressed Spruce Log");
        add(Registration.COMPRESSED_SPRUCE_PLANKS.get(), "Compressed Spruce Planks");
        add(Registration.COMPRESSED_CRIMSON_STEM.get(), "Compressed Crimson Stem");
        add(Registration.COMPRESSED_CRIMSON_PLANKS.get(), "Compressed Crimson Planks");
        add(Registration.COMPRESSED_WARPED_STEM.get(), "Compressed Warped Stem");
        add(Registration.COMPRESSED_WARPED_PLANKS.get(), "Compressed Warped Planks");

        //Ingots & Chunks
        add(Registration.COMPRESSED_RAW_IRON.get(), "Compressed Raw Iron");
        add(Registration.COMPRESSED_IRON_INGOT.get(), "Compressed Iron Ingot");
        add(Registration.COMPRESSED_RAW_GOLD.get(), "Compressed Raw Gold");
        add(Registration.COMPRESSED_GOLD_INGOT.get(), "Compressed Gold Ingot");
        add(Registration.COMPRESSED_DIAMOND_GEM.get(), "Compressed Diamond");
        add(Registration.COMPRESSED_RAW_COPPER.get(), "Compressed Raw Copper");
        add(Registration.COMPRESSED_COPPER_INGOT.get(), "Compressed Copper Ingot");
        add(Registration.COMPRESSED_COAL.get(), "Compressed Coal");
        add(Registration.COMPRESSED_EMERALD_GEM.get(), "Compressed Emerald");
        add(Registration.COMPRESSED_LAPIS.get(), "Compressed Lapis");
        add(Registration.COMPRESSED_REDSTONE.get(), "Compressed Redstone");
        add(Registration.COMPRESSED_NETHERITE_INGOT.get(), "Compressed Netherite Ingot");
    }
}
