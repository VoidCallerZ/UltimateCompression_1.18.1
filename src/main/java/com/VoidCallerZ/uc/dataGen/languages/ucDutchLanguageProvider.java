package com.VoidCallerZ.uc.dataGen.languages;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.registration.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.VoidCallerZ.uc.setup.ModSetup.*;

public class ucDutchLanguageProvider extends LanguageProvider
{
    public ucDutchLanguageProvider(DataGenerator gen, String locale)
    {
        super(gen, UltimateCompression.MODID, locale);
    }

    @Override
    protected void addTranslations()
    {
        add("itemGroup." + UC_TAB, "Ultimate Compression");
        add("itemGroup." + UC_TOOLS_TAB, "Ultimate Tool Compression");
        add("itemGroup." + UC_FOOD_TAB, "Ultimate Food Compression");

        add("sounds.uc.compressor_use", "Compressor Pressing");

        add(BlockRegistration.IRON_COMPRESSOR.get(), "IJzeren Compressor");
        add(BlockRegistration.GOLDEN_COMPRESSOR.get(), "Gouden Compressor");
        add(BlockRegistration.DIAMOND_COMPRESSOR.get(), "Diamanten Compressor");
        add(BlockRegistration.NETHERITE_COMPRESSOR.get(), "Netheriet Compressor");

        add("tooltip.uc.default", "Druk op §eSHIFT§r voor meer informatie!");
        add("tooltip.uc.block.iron_compressor", "Perst elke §e5§r seconden een item samen");
        add("tooltip.uc.block.gold_compressor", "Perst elke§e3.5§r seconden een item samen");
        add("tooltip.uc.block.diamond_compressor", "Perst elke §e1§r seconde een item samen");
        add("tooltip.uc.block.netherite_compressor", "Perst elke §e0.5§r seconden een item samen");

        add("uc.jei.category.compressor", "Samenpersen");

        //Ores
        add(BlockRegistration.COMPRESSED_IRON_ORE.get(), "Samengeperste IJzererts");
        add(BlockRegistration.COMPRESSED_GOLD_ORE.get(), "Samengeperste Gouderts");
        add(BlockRegistration.COMPRESSED_DIAMOND_ORE.get(), "Samengeperste Diamanterts");
        add(BlockRegistration.COMPRESSED_COPPER_ORE.get(), "Samengeperste Kopererts");
        add(BlockRegistration.COMPRESSED_COAL_ORE.get(), "Samengeperste Steenkoolerts");
        add(BlockRegistration.COMPRESSED_EMERALD_ORE.get(), "Samengeperste Smaragderts");
        add(BlockRegistration.COMPRESSED_LAPIS_ORE.get(), "Samengeperste Lapis Lazuli-erts");
        add(BlockRegistration.COMPRESSED_REDSTONE_ORE.get(), "Samengeperste Redstone-erts");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get(), "Samengeperste Wrevelsteen IJzererts");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get(), "Samengeperste Wrevelsteen Gouderts");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(), "Samengeperste Wrevelsteen Diamanterts");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get(), "Samengeperste Wrevelsteen Kopererts");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get(), "Samengeperste Wrevelsteen Steenkoolerts");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(), "Samengeperste Wrevelsteen Smaragderts");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(), "Samengeperste Wrevelsteen Lapis Lazuli-erts");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(), "Samengeperste Wrevelsteen Redstone-erts");
        add(BlockRegistration.COMPRESSED_NETHER_GOLD_ORE.get(), "Samengeperste Nethergouderts");
        add(BlockRegistration.COMPRESSED_NETHER_QUARTZ_ORE.get(), "Samengeperste Netherkwartserts");

        //Blocks
        add(BlockRegistration.COMPRESSED_IRON_BLOCK.get(), "Samengeperst IJzerblok");
        add(BlockRegistration.COMPRESSED_GOLD_BLOCK.get(), "Samengeperst Goudblock");
        add(BlockRegistration.COMPRESSED_DIAMOND_BLOCK.get(), "Samengeperst Diamantblok");
        add(BlockRegistration.COMPRESSED_COPPER_BLOCK.get(), "Samengeperst Koperblok");
        add(BlockRegistration.COMPRESSED_COAL_BLOCK.get(), "Samengeperst Steenkoolblok");
        add(BlockRegistration.COMPRESSED_EMERALD_BLOCK.get(), "Samengeperst Smaragdblok");
        add(BlockRegistration.COMPRESSED_LAPIS_BLOCK.get(), "Samengeperst Lapis Lazuliblok");
        add(BlockRegistration.COMPRESSED_REDSTONE_BLOCK.get(), "Samengeperst Redstoneblok");
        add(BlockRegistration.COMPRESSED_NETHERITE_BLOCK.get(), "Samengeperst Netherietblok");
        add(BlockRegistration.COMPRESSED_RAW_IRON_BLOCK.get(), "Samengeperste Ruw IJzerblok");
        add(BlockRegistration.COMPRESSED_RAW_GOLD_BLOCK.get(), "Samengeperste Ruw Goudblok");
        add(BlockRegistration.COMPRESSED_RAW_COPPER_BLOCK.get(), "Samengeperste Ruw Koperblok");

        //Logs & Planks
        add(BlockRegistration.COMPRESSED_ACACIA_LOG.get(), "Samengeperste Acaciastam");
        add(BlockRegistration.COMPRESSED_ACACIA_PLANKS.get(), "Samengeperste Acaciahouten Planken");
        add(BlockRegistration.COMPRESSED_BIRCH_LOG.get(), "Samengeperste Berkenstam");
        add(BlockRegistration.COMPRESSED_BIRCH_PLANKS.get(), "Samengeperste Berkenhouten Planken");
        add(BlockRegistration.COMPRESSED_DARK_OAK_LOG.get(), "Samengeperste Donkereikenstam");
        add(BlockRegistration.COMPRESSED_DARK_OAK_PLANKS.get(), "Samengeperste Donkereikenhouten Planken");
        add(BlockRegistration.COMPRESSED_JUNGLE_LOG.get(), "Samengeperste Oerwoudstam");
        add(BlockRegistration.COMPRESSED_JUNGLE_PLANKS.get(), "Samengeperste Oerwoudhouten Planken");
        add(BlockRegistration.COMPRESSED_OAK_LOG.get(), "Samengeperste Eikenstam");
        add(BlockRegistration.COMPRESSED_OAK_PLANKS.get(), "Samengeperste Eikenhouten Planken");
        add(BlockRegistration.COMPRESSED_SPRUCE_LOG.get(), "Samengeperste Sparrenstam");
        add(BlockRegistration.COMPRESSED_SPRUCE_PLANKS.get(), "Samengeperste Sparrenhouten Planken");
        add(BlockRegistration.COMPRESSED_CRIMSON_STEM.get(), "Samengeperste Helrode Stam");
        add(BlockRegistration.COMPRESSED_CRIMSON_PLANKS.get(), "Samengeperste Helrode Houten Planken");
        add(BlockRegistration.COMPRESSED_WARPED_STEM.get(), "Samengeperste Spookachtige Stam");
        add(BlockRegistration.COMPRESSED_WARPED_PLANKS.get(), "Samengeperste Spookachtige Houten Planken");

        //Wool
        add(BlockRegistration.COMPRESSED_BLACK_WOOL.get(), "Samengeperste Zwarte Wol");
        add(BlockRegistration.COMPRESSED_BLUE_WOOL.get(), "Samengeperste Blauwe Wol");
        add(BlockRegistration.COMPRESSED_BROWN_WOOL.get(), "Samengeperste Bruine Wol");
        add(BlockRegistration.COMPRESSED_CYAN_WOOL.get(), "Samengeperste Turquoise Wol");
        add(BlockRegistration.COMPRESSED_GRAY_WOOL.get(), "Samengeperste Grijze Wol");
        add(BlockRegistration.COMPRESSED_GREEN_WOOL.get(), "Samengeperste Groene Wol");
        add(BlockRegistration.COMPRESSED_LIGHT_BLUE_WOOL.get(), "Samengeperste Lichtblauw Wol");
        add(BlockRegistration.COMPRESSED_LIGHT_GRAY_WOOL.get(), "Samengeperste Lichtgrijs Wol");
        add(BlockRegistration.COMPRESSED_LIME_WOOL.get(), "Samengeperste Lichtgroene Wol");
        add(BlockRegistration.COMPRESSED_MAGENTA_WOOL.get(), "Samengeperste Magenta Wol");
        add(BlockRegistration.COMPRESSED_ORANGE_WOOL.get(), "Samengeperste Oranje Wol");
        add(BlockRegistration.COMPRESSED_PINK_WOOL.get(), "Samengeperste Roze Wol");
        add(BlockRegistration.COMPRESSED_PURPLE_WOOL.get(), "Samengeperste Paarse Wol");
        add(BlockRegistration.COMPRESSED_RED_WOOL.get(), "Samengeperste Rode Wol");
        add(BlockRegistration.COMPRESSED_WHITE_WOOL.get(), "Samengeperste Witte Wol");
        add(BlockRegistration.COMPRESSED_YELLOW_WOOL.get(), "Samengeperste Gele Wol");

        //Concrete
        add(BlockRegistration.COMPRESSED_BLACK_CONCRETE.get(), "Samengeperst Zwart Beton");
        add(BlockRegistration.COMPRESSED_BLUE_CONCRETE.get(), "Samengeperst Blauw Beton");
        add(BlockRegistration.COMPRESSED_BROWN_CONCRETE.get(), "Samengeperst Bruin Beton");
        add(BlockRegistration.COMPRESSED_CYAN_CONCRETE.get(), "Samengeperst Turquoise Beton");
        add(BlockRegistration.COMPRESSED_GRAY_CONCRETE.get(), "Samengeperst Grijs Beton");
        add(BlockRegistration.COMPRESSED_GREEN_CONCRETE.get(), "Samengeperst Groen Beton");
        add(BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE.get(), "Samengeperst Lichtblauw Beton");
        add(BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE.get(), "Samengeperst Lichtgrijs Beton");
        add(BlockRegistration.COMPRESSED_LIME_CONCRETE.get(), "Samengeperst Lichtgroen Beton");
        add(BlockRegistration.COMPRESSED_MAGENTA_CONCRETE.get(), "Samengeperst Magenta Beton");
        add(BlockRegistration.COMPRESSED_ORANGE_CONCRETE.get(), "Samengeperst Oranje Beton");
        add(BlockRegistration.COMPRESSED_PINK_CONCRETE.get(), "Samengeperst Roze Beton");
        add(BlockRegistration.COMPRESSED_PURPLE_CONCRETE.get(), "Samengeperst Paars Beton");
        add(BlockRegistration.COMPRESSED_RED_CONCRETE.get(), "Samengeperst Rood Beton");
        add(BlockRegistration.COMPRESSED_WHITE_CONCRETE.get(), "Samengeperst Wit Beton");
        add(BlockRegistration.COMPRESSED_YELLOW_CONCRETE.get(), "Samengeperst Geel Beton");

        //Concrete Powder
        add(BlockRegistration.COMPRESSED_BLACK_CONCRETE_POWDER.get(), "Samengeperst Zwart Cement");
        add(BlockRegistration.COMPRESSED_BLUE_CONCRETE_POWDER.get(), "Samengeperst Blauw Cement");
        add(BlockRegistration.COMPRESSED_BROWN_CONCRETE_POWDER.get(), "Samengeperst Bruin Cement");
        add(BlockRegistration.COMPRESSED_CYAN_CONCRETE_POWDER.get(), "Samengeperst Turquoise Cement");
        add(BlockRegistration.COMPRESSED_GRAY_CONCRETE_POWDER.get(), "Samengeperst Grijs Cement");
        add(BlockRegistration.COMPRESSED_GREEN_CONCRETE_POWDER.get(), "Samengeperst Groen Cement");
        add(BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER.get(), "Samengeperst Lichtblauw Cement");
        add(BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER.get(), "Samengeperst Lichtgrijs Cement");
        add(BlockRegistration.COMPRESSED_LIME_CONCRETE_POWDER.get(), "Samengeperst Lichtgroen Cement");
        add(BlockRegistration.COMPRESSED_MAGENTA_CONCRETE_POWDER.get(), "Samengeperst Magenta Cement");
        add(BlockRegistration.COMPRESSED_ORANGE_CONCRETE_POWDER.get(), "Samengeperst Oranje Cement");
        add(BlockRegistration.COMPRESSED_PINK_CONCRETE_POWDER.get(), "Samengeperst Roze Cement");
        add(BlockRegistration.COMPRESSED_PURPLE_CONCRETE_POWDER.get(), "Samengeperst Paars Cement");
        add(BlockRegistration.COMPRESSED_RED_CONCRETE_POWDER.get(), "Samengeperst Rood Cement");
        add(BlockRegistration.COMPRESSED_WHITE_CONCRETE_POWDER.get(), "Samengeperst Wit Cement");
        add(BlockRegistration.COMPRESSED_YELLOW_CONCRETE_POWDER.get(), "Samengeperst Geel Cement");

        //Snow Blocks
        add(BlockRegistration.COMPRESSED_SNOW_BLOCK.get(), "Samengeperst Sneeuwblok");

        //Glass Blocks
        add(BlockRegistration.COMPRESSED_GLASS.get(), "Samengeperst Glas");
        add(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS.get(), "Samengeperst Zwartgekleurd Glas");
        add(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS.get(), "Samengeperst Blauwgekleurd Glas");
        add(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS.get(), "Samengeperst Bruingekleurd Glas");
        add(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS.get(), "Samengeperst Turquoisegekleurd Glas");
        add(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS.get(), "Samengeperst Grijsgekleurd Glas");
        add(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS.get(), "Samengeperst Groengekleurd Glas");
        add(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS.get(), "Samengeperst Lichtblauwgekleurd Glas");
        add(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS.get(), "Samengeperst Lichtgrijsgekleurd Glas");
        add(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS.get(), "Samengeperst Lichtgroengekleurd Glas");
        add(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS.get(), "Samengeperst Magentagekleurd Glas");
        add(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS.get(), "Samengeperst Oranjegekleurd Glas");
        add(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS.get(), "Samengeperst Rozegekleurd Glas");
        add(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS.get(), "Samengeperst Paarsgekleurd Glas");
        add(BlockRegistration.COMPRESSED_RED_STAINED_GLASS.get(), "Samengeperst Roodgekleurd Glas");
        add(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS.get(), "Samengeperst Witgekleurd Glas");
        add(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS.get(), "Samengeperst Geelgekleurd Glas");

        //Glass Panes
        add(BlockRegistration.COMPRESSED_GLASS_PANE.get(), "Samengeperste Glazen Ruit");
        add(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS_PANE.get(), "Samengeperste Zwartgekleurde Ruit");
        add(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS_PANE.get(), "Samengeperste Blauwgekleurde Ruit");
        add(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS_PANE.get(), "Samengeperste Bruingekleurde Ruit");
        add(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS_PANE.get(), "Samengeperste Turquoisegekleurde Ruit");
        add(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS_PANE.get(), "Samengeperste Grijsgekleurde Ruit");
        add(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS_PANE.get(), "Samengeperste Groengekleurde Ruit");
        add(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS_PANE.get(), "Samengeperste Lichtblauwgekleurde Ruit");
        add(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS_PANE.get(), "Samengeperste Lichtgrijsgekleurde Ruit");
        add(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS_PANE.get(), "Samengeperste LichtgroengekleurdGeelgekleurde Ruit");
        add(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS_PANE.get(), "Samengeperste MagentagekleurdGeelgekleurde Ruit");
        add(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS_PANE.get(), "Samengeperste OranjegekleurdGeelgekleurde Ruit");
        add(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS_PANE.get(), "Samengeperste RozegekleurdGeelgekleurde Ruit");
        add(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS_PANE.get(), "Samengeperste PaarsgekleurdGeelgekleurde Ruit");
        add(BlockRegistration.COMPRESSED_RED_STAINED_GLASS_PANE.get(), "Samengeperste RoodgekleurdGeelgekleurde Ruit");
        add(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS_PANE.get(), "Samengeperste WitgekleurdGeelgekleurde Ruit");
        add(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS_PANE.get(), "Samengeperste GeelgekleurdGeelgekleurde Ruit");

        //Obsidian
        add(BlockRegistration.COMPRESSED_OBSIDIAN.get(), "Samengeperst Obsidiaan");

        //Ingots & Chunks
        add(ItemRegistration.COMPRESSED_RAW_IRON.get(), "Samengeperst Ruw IJzer");
        add(ItemRegistration.COMPRESSED_IRON_INGOT.get(), "Samengeperste IJzerstaaf");
        add(ItemRegistration.COMPRESSED_RAW_GOLD.get(), "Samengeperst Ruw Goud");
        add(ItemRegistration.COMPRESSED_GOLD_INGOT.get(), "Samengeperste Goudstaaf");
        add(ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), "Samengeperste Diamant");
        add(ItemRegistration.COMPRESSED_RAW_COPPER.get(), "Samengeperst Ruw Koper");
        add(ItemRegistration.COMPRESSED_COPPER_INGOT.get(), "Samengeperste Koperstaaf");
        add(ItemRegistration.COMPRESSED_COAL.get(), "Samengeperst Steenkool");
        add(ItemRegistration.COMPRESSED_EMERALD_GEM.get(), "Samengeperste Smaragd");
        add(ItemRegistration.COMPRESSED_LAPIS.get(), "Samengeperste Lapis Lazuli");
        add(ItemRegistration.COMPRESSED_REDSTONE.get(), "Samengeperste Redstone");
        add(ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), "Samengeperste Netherietstaaf");

        //Nuggets
        add(ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), "Samengeperst Goudklompje");
        add(ItemRegistration.COMPRESSED_IRON_NUGGET.get(), "Samengeperst IJzerklompje");

        //Basic Blocks
        add(BlockRegistration.COMPRESSED_ANDESITE.get(), "Samengeperst Andesiet");
        add(BlockRegistration.COMPRESSED_CALCITE.get(), "Samengeperst Calciet");
        add(BlockRegistration.COMPRESSED_COBBLED_DEEPSLATE.get(), "Samengeperste Geplaveid Wrevelsteen");
        add(BlockRegistration.COMPRESSED_COBBLESTONE.get(), "Samengeperste Keisteen");
        add(BlockRegistration.COMPRESSED_DEEPSLATE.get(), "Samengeperste Wrevelsteen");
        add(BlockRegistration.COMPRESSED_DIORITE.get(), "Samengeperst Dioriet");
        add(BlockRegistration.COMPRESSED_DIRT.get(), "Samengeperste Aarde");
        add(BlockRegistration.COMPRESSED_GRANITE.get(), "Samengeperst Graniet");
        add(BlockRegistration.COMPRESSED_GRAVEL.get(), "Samengeperst Grind");
        add(BlockRegistration.COMPRESSED_NETHERRACK.get(), "Samengeperst Netherkruidblok");
        add(BlockRegistration.COMPRESSED_RED_SAND.get(), "Samengeperst Rood Zand");
        add(BlockRegistration.COMPRESSED_SAND.get(), "Samengeperst Zand");
        add(BlockRegistration.COMPRESSED_STONE.get(), "Samengeperste Steen");
        add(BlockRegistration.COMPRESSED_TUFF.get(), "Samengeperste Tufsteen");
        add(BlockRegistration.COMPRESSED_CLAY.get(), "Samengeperst Klei");
        add(BlockRegistration.COMPRESSED_MOSSY_COBBLESTONE.get(), "Samengeperste Mossige Keisteen");

        //Polished Blocks
        add(BlockRegistration.COMPRESSED_POLISHED_ANDESITE.get(), "Samengeperst Gepolijst Andesiet");
        add(BlockRegistration.COMPRESSED_POLISHED_BASALT.get(), "Samengeperste Gepolijst Basalt");
        add(BlockRegistration.COMPRESSED_POLISHED_DEEPSLATE.get(), "Samengeperste Gepolijst Wrevelsteen");
        add(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE.get(), "Samengeperst Gepolijst Zwartsteen");
        add(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get(), "Samengeperste Gepolijste Zwartstenen Blokstenen");
        add(BlockRegistration.COMPRESSED_POLISHED_DIORITE.get(), "Samengeperst Gepolijst Dioriet");
        add(BlockRegistration.COMPRESSED_POLISHED_GRANITE.get(), "Samengeperst Gepolijst Graniet");

        //Smooth Blocks
        add(BlockRegistration.COMPRESSED_SMOOTH_BASALT.get(), "Samengeperst Glad Basalt");
        add(BlockRegistration.COMPRESSED_SMOOTH_STONE.get(), "Samengeperste Gladde Steen");

        //Stone Bricks
        add(BlockRegistration.COMPRESSED_CHISELED_STONE_BRICKS.get(), "Samengeperste Gebeitelde Blokstenen");
        add(BlockRegistration.COMPRESSED_CRACKED_STONE_BRICKS.get(), "Samengeperste Gebarsten Blokstenen");
        add(BlockRegistration.COMPRESSED_MOSSY_STONE_BRICKS.get(), "Samengeperste Mossige Blokstenen");
        add(BlockRegistration.COMPRESSED_STONE_BRICKS.get(), "Samengeperste Blokstenen");

        //Sandstone
        add(BlockRegistration.COMPRESSED_CHISELED_RED_SANDSTONE.get(), "Samengeperste Gebeiteld Rood Zandsteen");
        add(BlockRegistration.COMPRESSED_CHISELED_SANDSTONE.get(), "Samengeperste Gebeiteld Zandsteen");
        add(BlockRegistration.COMPRESSED_CUT_RED_SANDSTONE.get(), "Samengeperste Gesneden Rood Zandsteen");
        add(BlockRegistration.COMPRESSED_CUT_SANDSTONE.get(), "Samengeperste Gesneden Zandsteen");
        add(BlockRegistration.COMPRESSED_RED_SANDSTONE.get(), "Samengeperste Rood Zandsteen");
        add(BlockRegistration.COMPRESSED_SANDSTONE.get(), "Samengeperste Zandsteen");

        //Nether Blocks
        add(BlockRegistration.COMPRESSED_NETHER_QUARTZ_BLOCK.get(), "Samengeperst Kwartsblok");
        add(BlockRegistration.COMPRESSED_BASALT.get(), "Samengeperst Basalt");
        add(BlockRegistration.COMPRESSED_BLACKSTONE.get(), "Samengeperst Zwartsteen");
        add(BlockRegistration.COMPRESSED_CHISELED_POLISHED_BLACKSTONE.get(), "Samengeperst Gebeiteld Gepolijst Zwartsteen");
        add(BlockRegistration.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.get(), "Samengeperste Gebarsten Gepolijste Zwartstenen Blokstenen");
        add(BlockRegistration.COMPRESSED_GILDED_BLACKSTONE.get(), "Samengeperst Verguld Zwartsteen");
        add(BlockRegistration.COMPRESSED_GLOWSTONE.get(), "Samengeperste Gloeisteen");
        add(BlockRegistration.COMPRESSED_MAGMA.get(), "Samengeperste Magmablok");
        add(BlockRegistration.COMPRESSED_SOUL_SAND.get(), "Samengeperst Zielenzand");
        add(BlockRegistration.COMPRESSED_SOUL_SOIL.get(), "Samengeperste Zielenaarde");

        //TOOLS
        //Pickaxes
        add(ToolRegistration.COMPRESSED_WOODEN_PICKAXE.get(), "Samengeperste Houten Houweel");
        add(ToolRegistration.COMPRESSED_STONE_PICKAXE.get(), "Samengeperste Stenen Houweel");
        add(ToolRegistration.COMPRESSED_IRON_PICKAXE.get(), "Samengeperste IJzeren Houweel");
        add(ToolRegistration.COMPRESSED_GOLD_PICKAXE.get(), "Samengeperste Gouden Houweel");
        add(ToolRegistration.COMPRESSED_DIAMOND_PICKAXE.get(), "Samengeperste Diamanten Houweel");
        add(ToolRegistration.COMPRESSED_NETHERITE_PICKAXE.get(), "Samengeperste Netherieten Houweel");
        //Axes
        add(ToolRegistration.COMPRESSED_WOODEN_AXE.get(), "Samengeperste Houten Bijl");
        add(ToolRegistration.COMPRESSED_STONE_AXE.get(), "Samengeperste Stenen Bijl");
        add(ToolRegistration.COMPRESSED_IRON_AXE.get(), "Samengeperste IJzeren Bijl");
        add(ToolRegistration.COMPRESSED_GOLD_AXE.get(), "Samengeperste Gouden Bijl");
        add(ToolRegistration.COMPRESSED_DIAMOND_AXE.get(), "Samengeperste Diamanten Bijl");
        add(ToolRegistration.COMPRESSED_NETHERITE_AXE.get(), "Samengeperste Netherieten Bijl");
        //Shovels
        add(ToolRegistration.COMPRESSED_WOODEN_SHOVEL.get(), "Samengeperste Houten Schep");
        add(ToolRegistration.COMPRESSED_STONE_SHOVEL.get(), "Samengeperste Stenen Schep");
        add(ToolRegistration.COMPRESSED_IRON_SHOVEL.get(), "Samengeperste IJzeren Schep");
        add(ToolRegistration.COMPRESSED_GOLD_SHOVEL.get(), "Samengeperste Gouden Schep");
        add(ToolRegistration.COMPRESSED_DIAMOND_SHOVEL.get(), "Samengeperste Diamanten Schep");
        add(ToolRegistration.COMPRESSED_NETHERITE_SHOVEL.get(), "Samengeperste Netherieten Schep");
        //Swords
        add(ToolRegistration.COMPRESSED_WOODEN_SWORD.get(), "Samengeperste Houten Zwaard");
        add(ToolRegistration.COMPRESSED_STONE_SWORD.get(), "Samengeperste Stenen Zwaard");
        add(ToolRegistration.COMPRESSED_IRON_SWORD.get(), "Samengeperste IJzeren Zwaard");
        add(ToolRegistration.COMPRESSED_GOLD_SWORD.get(), "Samengeperste Gouden Zwaard");
        add(ToolRegistration.COMPRESSED_DIAMOND_SWORD.get(), "Samengeperste Diamanten Zwaard");
        add(ToolRegistration.COMPRESSED_NETHERITE_SWORD.get(), "Samengeperste Netherieten Zwaard");
        //Hoes
        add(ToolRegistration.COMPRESSED_WOODEN_HOE.get(), "Samengeperste Houten Schoffel");
        add(ToolRegistration.COMPRESSED_STONE_HOE.get(), "Samengeperste Stenen Schoffel");
        add(ToolRegistration.COMPRESSED_IRON_HOE.get(), "Samengeperste IJzeren Schoffel");
        add(ToolRegistration.COMPRESSED_GOLD_HOE.get(), "Samengeperste Gouden Schoffel");
        add(ToolRegistration.COMPRESSED_DIAMOND_HOE.get(), "Samengeperste Diamanten Schoffel");
        add(ToolRegistration.COMPRESSED_NETHERITE_HOE.get(), "Samengeperste Netherieten Schoffel");

        //ARMOR
        //Iron Armor
        add(ArmorRegistration.COMPRESSED_IRON_HELMET.get(), "Samengeperste IJzeren Helm");
        add(ArmorRegistration.COMPRESSED_IRON_CHESTPLATE.get(), "Samengeperste IJzeren Borstplaat");
        add(ArmorRegistration.COMPRESSED_IRON_LEGGINGS.get(), "Samengeperste IJzeren Beenstukken");
        add(ArmorRegistration.COMPRESSED_IRON_BOOTS.get(), "Samengeperste IJzeren Laarzen");
        //Gold Armor
        add(ArmorRegistration.COMPRESSED_GOLD_HELMET.get(), "Samengeperste Gouden Helm");
        add(ArmorRegistration.COMPRESSED_GOLD_CHESTPLATE.get(), "Samengeperste Gouden Borstplaat");
        add(ArmorRegistration.COMPRESSED_GOLD_LEGGINGS.get(), "Samengeperste Gouden Beenstukken");
        add(ArmorRegistration.COMPRESSED_GOLD_BOOTS.get(), "Samengeperste Gouden Laarzen");
        //Diamond Armor
        add(ArmorRegistration.COMPRESSED_DIAMOND_HELMET.get(), "Samengeperste Diamanten Helm");
        add(ArmorRegistration.COMPRESSED_DIAMOND_CHESTPLATE.get(), "Samengeperste Diamanten Borstplaat");
        add(ArmorRegistration.COMPRESSED_DIAMOND_LEGGINGS.get(), "Samengeperste Diamanten Beenstukken");
        add(ArmorRegistration.COMPRESSED_DIAMOND_BOOTS.get(), "Samengeperste Diamanten Laarzen");
        //Netherite Armor
        add(ArmorRegistration.COMPRESSED_NETHERITE_HELMET.get(), "Samengeperste Netherieten Helm");
        add(ArmorRegistration.COMPRESSED_NETHERITE_CHESTPLATE.get(), "Samengeperste Netherieten Borstplaat");
        add(ArmorRegistration.COMPRESSED_NETHERITE_LEGGINGS.get(), "Samengeperste Netherieten Beenstukken");
        add(ArmorRegistration.COMPRESSED_NETHERITE_BOOTS.get(), "Samengeperste Netherieten Laarzen");

        //FOOD
        add(FoodRegistration.COMPRESSED_APPLE.get(), "Samengeperste Appel");
        add(FoodRegistration.COMPRESSED_BAKED_POTATO.get(), "Samengeperste Gebakken Aardappel");
        add(FoodRegistration.COMPRESSED_BEEF.get(), "Samengeperste Rauwe Biefstuk");
        add(FoodRegistration.COMPRESSED_BEETROOT.get(), "Samengeperste Biet");
        add(FoodRegistration.COMPRESSED_BEETROOT_SOUP.get(), "Samengeperste Bietensoep");
        add(FoodRegistration.COMPRESSED_BREAD.get(), "Samengeperst Brood");
        add(FoodRegistration.COMPRESSED_CARROT.get(), "Samengeperste Wortel");
        add(FoodRegistration.COMPRESSED_CHICKEN.get(), "Samengeperste Rauwe Kip");
        add(FoodRegistration.COMPRESSED_COD.get(), "Samengeperste Rauwe Kabeljauw");
        add(FoodRegistration.COMPRESSED_COOKED_BEEF.get(), "Samengeperste Biefstuk");
        add(FoodRegistration.COMPRESSED_COOKED_CHICKEN.get(), "Samengeperste Gebraden Kip");
        add(FoodRegistration.COMPRESSED_COOKED_COD.get(), "Samengeperste Gebakken Kabeljauw");
        add(FoodRegistration.COMPRESSED_COOKED_MUTTON.get(), "Samengeperst Gebraden Schapenvlees");
        add(FoodRegistration.COMPRESSED_COOKED_PORKCHOP.get(), "Samengeperst Gebraden Varkensvlees");
        add(FoodRegistration.COMPRESSED_COOKED_RABBIT.get(), "Samengeperst Gebraden Konijnenvlees");
        add(FoodRegistration.COMPRESSED_COOKED_SALMON.get(), "Samengeperste Gebakken Zalm");
        add(FoodRegistration.COMPRESSED_COOKIE.get(), "Samengeperst Koekje");
        add(FoodRegistration.COMPRESSED_DRIED_KELP.get(), "Samengeperste Gedroogde Kelp");
        add(FoodRegistration.COMPRESSED_GLOW_BERRIES.get(), "Samengeperste Gloeibessen");
        add(FoodRegistration.COMPRESSED_GOLDEN_APPLE.get(), "Samengeperste Gouden Appel");
        add(FoodRegistration.COMPRESSED_ENCHANTED_GOLDEN_APPLE.get(), "Samengeperste Betoverde Gouden Appel");
        add(FoodRegistration.COMPRESSED_MELON_SLICE.get(), "Samengeperste Meloenschijf");
        add(FoodRegistration.COMPRESSED_MUSHROOM_STEW.get(), "Samengeperste Paddenstoelenstoofpot");
        add(FoodRegistration.COMPRESSED_MUTTON.get(), "Samengeperst Rauw Schapenvlees");
        add(FoodRegistration.COMPRESSED_POISONOUS_POTATO.get(), "Samengeperste Giftige Aardappel");
        add(FoodRegistration.COMPRESSED_PORKCHOP.get(), "Samengeperst Rauw Varkensvlees");
        add(FoodRegistration.COMPRESSED_POTATO.get(), "Samengeperste Aardappel");
        add(FoodRegistration.COMPRESSED_PUFFERFISH.get(), "Samengeperste Kogelvis");
        add(FoodRegistration.COMPRESSED_PUMPKIN_PIE.get(), "Samengeperste Pompoentaart");
        add(FoodRegistration.COMPRESSED_RABBIT.get(), "Samengeperst Rauw Konijnenvlees");
        add(FoodRegistration.COMPRESSED_RABBIT_STEW.get(), "Samengeperste Konijnenstoofpot");
        add(FoodRegistration.COMPRESSED_ROTTEN_FLESH.get(), "Samengeperst Bedorven Vlees");
        add(FoodRegistration.COMPRESSED_SALMON.get(), "Samengeperste Rauw Zalm");
        add(FoodRegistration.COMPRESSED_SPIDER_EYE.get(), "Samengeperst Spinnenoog");
        add(FoodRegistration.COMPRESSED_SWEET_BERRIES.get(), "Samengeperste Zoetbessen");
        add(FoodRegistration.COMPRESSED_TROPICAL_FISH.get(), "Samengeperste Tropische Vis");

        //Single Items
        add(ItemRegistration.COMPRESSED_FLINT.get(), "Samengeperste Vuursteen");
        add(ItemRegistration.COMPRESSED_QUARTZ.get(), "Samengeperste Kwarts");
        add(ItemRegistration.COMPRESSED_STICK.get(), "Samengeperste Stok");
        add(ItemRegistration.COMPRESSED_LEATHER.get(), "Samengeperst Leer");

        //Projectiles
        add(ItemRegistration.COMPRESSED_ARROW.get(), "Samengeperste Pijl");
        add(ItemRegistration.COMPRESSED_ARROW_ENTITY.get(), "Samengeperste Pijl Entity");
        add(ItemRegistration.COMPRESSED_SPECTRAL_ARROW.get(), "Samengeperste Spectrale Pijl");
        add(ItemRegistration.COMPRESSED_SPECTRAL_ARROW_ENTITY.get(), "Samengeperste Spectrale Pijl Entity");
        add("item.uc.compressed_tipped_arrow.effect.empty", "Onmaakbare Samengeperste Pijl");
        add("item.uc.compressed_tipped_arrow.effect.water", "Samengeperste Pijl der Spatting");
        add("item.uc.compressed_tipped_arrow.effect.mundane", "Samengeperste Getipte Pijl");
        add("item.uc.compressed_tipped_arrow.effect.thick", "Samengeperste Getipte Pijl");
        add("item.uc.compressed_tipped_arrow.effect.awkward", "Samengeperste Getipte Pijl");
        add("item.uc.compressed_tipped_arrow.effect.night_vision", "Samengeperste Pijl des Nachtzichts");
        add("item.uc.compressed_tipped_arrow.effect.invisibility", "Samengeperste Pijl der Onzichtbaarheid");
        add("item.uc.compressed_tipped_arrow.effect.leaping", "Samengeperste Pijl der sprongen");
        add("item.uc.compressed_tipped_arrow.effect.fire_resistance", "Samengeperste Pijl der Vuurbestendigheid");
        add("item.uc.compressed_tipped_arrow.effect.swiftness", "Samengeperste Pijl der Vlotheid");
        add("item.uc.compressed_tipped_arrow.effect.slowness", "Samengeperste Pijl der Traagheid");
        add("item.uc.compressed_tipped_arrow.effect.water_breathing", "Samengeperste Pijl der Wateradems");
        add("item.uc.compressed_tipped_arrow.effect.healing", "Samengeperste Pijl der Genezing");
        add("item.uc.compressed_tipped_arrow.effect.harming", "Samengeperste Pijl der Verwonding");
        add("item.uc.compressed_tipped_arrow.effect.poison", "Samengeperste Pijl des Gifs");
        add("item.uc.compressed_tipped_arrow.effect.regeneration", "Samengeperste Pijl der Regeneratie");
        add("item.uc.compressed_tipped_arrow.effect.strength", "Samengeperste Pijl der Kracht");
        add("item.uc.compressed_tipped_arrow.effect.weakness", "Samengeperste Pijl der Zwakheid");
        add("item.uc.compressed_tipped_arrow.effect.levitation", "Samengeperste Pijl der Zweving");
        add("item.uc.compressed_tipped_arrow.effect.luck", "Samengeperste Pijl des Geluk");
        add("item.uc.compressed_tipped_arrow.effect.turtle_master", "Samengeperste Pijl der Schildpadmeester");
        add("item.uc.compressed_tipped_arrow.effect.slow_falling", "Samengeperste Pijl der Valvertraging");

        //Colored Leather Armor
        //Default
        add(ArmorRegistration.COMPRESSED_LEATHER_HELMET.get(), "Samengeperste Leren Kap");
        add(ArmorRegistration.COMPRESSED_LEATHER_CHESTPLATE.get(), "Samengeperste Leren Tuniek");
        add(ArmorRegistration.COMPRESSED_LEATHER_LEGGINGS.get(), "Samengeperste Leren Broek");
        add(ArmorRegistration.COMPRESSED_LEATHER_BOOTS.get(), "Samengeperste Leren Laarzen");

        add(ItemRegistration.COMPRESSED_SNOWBALL.get(), "Samengeperste Sneeuwbal");
        add(ItemRegistration.COMPRESSED_SNOWBALL_ENTITY.get(), "Samengeperste Sneeuwbal Entity");

        add(BlockRegistration.DOUBLE_COMPRESSED_COBBLED_DEEPSLATE.get(), "Dubbel Samengeperste Geplaveid Wrevelsteen");
        add(BlockRegistration.DOUBLE_COMPRESSED_COBBLESTONE.get(), "Dubbel Samengeperste Keisteen");
        add(BlockRegistration.DOUBLE_COMPRESSED_DEEPSLATE.get(), "Dubbel Samengeperste Wrevelsteen");
        add(BlockRegistration.DOUBLE_COMPRESSED_DIRT.get(), "Dubbel Samengeperste Aarde");
        add(BlockRegistration.DOUBLE_COMPRESSED_GRAVEL.get(), "Dubbel Samengeperst Grind");
        add(BlockRegistration.DOUBLE_COMPRESSED_NETHERRACK.get(), "Dubbel Samengeperst Netherkruidblok");
        add(BlockRegistration.DOUBLE_COMPRESSED_RED_SAND.get(), "Dubbel Samengeperst Rood Zand");
        add(BlockRegistration.DOUBLE_COMPRESSED_SAND.get(), "Dubbel Samengeperst Zand");
        add(BlockRegistration.DOUBLE_COMPRESSED_STONE.get(), "Dubbel Samengeperste Steen");
    }
}
