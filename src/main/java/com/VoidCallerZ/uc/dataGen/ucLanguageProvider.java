package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.registration.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.VoidCallerZ.uc.setup.ModSetup.*;

public class ucLanguageProvider extends LanguageProvider
{
    public ucLanguageProvider(DataGenerator gen, String locale)
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

        add(BlockRegistration.IRON_COMPRESSOR.get(), "Iron Compressor");
        add(BlockRegistration.GOLDEN_COMPRESSOR.get(), "Golden Compressor");
        add(BlockRegistration.DIAMOND_COMPRESSOR.get(), "Diamond Compressor");
        add(BlockRegistration.NETHERITE_COMPRESSOR.get(), "Netherite Compressor");

        add("tooltip.uc.default", "Press §eSHIFT§r for more information!");
        add("tooltip.uc.block.iron_compressor", "Compresses an item every §e5§r seconds");
        add("tooltip.uc.block.gold_compressor", "Compresses an item every §e3.5§r seconds");
        add("tooltip.uc.block.diamond_compressor", "Compresses an item every §e1§r second");
        add("tooltip.uc.block.netherite_compressor", "Compresses an item every §e0.5§r seconds");

        add("uc.jei.category.compressor", "Compressing");

        //Ores
        add(BlockRegistration.COMPRESSED_IRON_ORE.get(), "Compressed Iron Ore");
        add(BlockRegistration.COMPRESSED_GOLD_ORE.get(), "Compressed Gold Ore");
        add(BlockRegistration.COMPRESSED_DIAMOND_ORE.get(), "Compressed Diamond Ore");
        add(BlockRegistration.COMPRESSED_COPPER_ORE.get(), "Compressed Copper Ore");
        add(BlockRegistration.COMPRESSED_COAL_ORE.get(), "Compressed Coal Ore");
        add(BlockRegistration.COMPRESSED_EMERALD_ORE.get(), "Compressed Emerald Ore");
        add(BlockRegistration.COMPRESSED_LAPIS_ORE.get(), "Compressed Lapis Ore");
        add(BlockRegistration.COMPRESSED_REDSTONE_ORE.get(), "Compressed Redstone Ore");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get(), "Compressed Deepslate Iron Ore");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get(), "Compressed Deepslate Gold Ore");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(), "Compressed Deepslate Diamond Ore");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get(), "Compressed Deepslate Copper Ore");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get(), "Compressed Deepslate Coal Ore");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(), "Compressed Deepslate Emerald Ore");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(), "Compressed Deepslate Lapis Ore");
        add(BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(), "Compressed Deepslate Redstone Ore");
        add(BlockRegistration.COMPRESSED_NETHER_GOLD_ORE.get(), "Compressed Nether Gold ore");
        add(BlockRegistration.COMPRESSED_NETHER_QUARTZ_ORE.get(), "Compressed Nether Quartz Ore");

        //Blocks
        add(BlockRegistration.COMPRESSED_IRON_BLOCK.get(), "Compressed Block of Iron");
        add(BlockRegistration.COMPRESSED_GOLD_BLOCK.get(), "Compressed Block of Gold");
        add(BlockRegistration.COMPRESSED_DIAMOND_BLOCK.get(), "Compressed Block of Diamond");
        add(BlockRegistration.COMPRESSED_COPPER_BLOCK.get(), "Compressed Block of Copper");
        add(BlockRegistration.COMPRESSED_COAL_BLOCK.get(), "Compressed Block of Coal");
        add(BlockRegistration.COMPRESSED_EMERALD_BLOCK.get(), "Compressed Block of Emerald");
        add(BlockRegistration.COMPRESSED_LAPIS_BLOCK.get(), "Compressed Block of Lapis");
        add(BlockRegistration.COMPRESSED_REDSTONE_BLOCK.get(), "Compressed Block of Redstone");
        add(BlockRegistration.COMPRESSED_NETHERITE_BLOCK.get(), "Compressed Block of Netherite");
        add(BlockRegistration.COMPRESSED_RAW_IRON_BLOCK.get(), "Compressed Block of Raw Iron");
        add(BlockRegistration.COMPRESSED_RAW_GOLD_BLOCK.get(), "Compressed Block of Raw Gold");
        add(BlockRegistration.COMPRESSED_RAW_COPPER_BLOCK.get(), "Compressed Block of Raw Copper");

        //Logs & Planks
        add(BlockRegistration.COMPRESSED_ACACIA_LOG.get(), "Compressed Acacia Log");
        add(BlockRegistration.COMPRESSED_ACACIA_PLANKS.get(), "Compressed Acacia Planks");
        add(BlockRegistration.COMPRESSED_BIRCH_LOG.get(), "Compressed Birch Log");
        add(BlockRegistration.COMPRESSED_BIRCH_PLANKS.get(), "Compressed Birch Planks");
        add(BlockRegistration.COMPRESSED_DARK_OAK_LOG.get(), "Compressed Dark Oak Log");
        add(BlockRegistration.COMPRESSED_DARK_OAK_PLANKS.get(), "Compressed Dark Oak Planks");
        add(BlockRegistration.COMPRESSED_JUNGLE_LOG.get(), "Compressed Jungle Log");
        add(BlockRegistration.COMPRESSED_JUNGLE_PLANKS.get(), "Compressed Jungle Planks");
        add(BlockRegistration.COMPRESSED_OAK_LOG.get(), "Compressed Oak Log");
        add(BlockRegistration.COMPRESSED_OAK_PLANKS.get(), "Compressed Oak Planks");
        add(BlockRegistration.COMPRESSED_SPRUCE_LOG.get(), "Compressed Spruce Log");
        add(BlockRegistration.COMPRESSED_SPRUCE_PLANKS.get(), "Compressed Spruce Planks");
        add(BlockRegistration.COMPRESSED_CRIMSON_STEM.get(), "Compressed Crimson Stem");
        add(BlockRegistration.COMPRESSED_CRIMSON_PLANKS.get(), "Compressed Crimson Planks");
        add(BlockRegistration.COMPRESSED_WARPED_STEM.get(), "Compressed Warped Stem");
        add(BlockRegistration.COMPRESSED_WARPED_PLANKS.get(), "Compressed Warped Planks");
        add(BlockRegistration.COMPRESSED_MANGROVE_LOG.get(), "Compressed Mangrove Log");
        add(BlockRegistration.COMPRESSED_MANGROVE_PLANKS.get(), "Compressed Mangrove Planks");
        add(BlockRegistration.COMPRESSED_MANGROVE_ROOTS.get(), "Compressed Mangrove Roots");

        //Leaves
        add(BlockRegistration.COMPRESSED_ACACIA_LEAVES.get(), "Compressed Acacia Leaves");
        add(BlockRegistration.COMPRESSED_BIRCH_LEAVES.get(), "Compressed Birch Leaves");
        add(BlockRegistration.COMPRESSED_DARK_OAK_LEAVES.get(), "Compressed Dark Oak Leaves");
        add(BlockRegistration.COMPRESSED_JUNGLE_LEAVES.get(), "Compressed Jungle Leaves");
        add(BlockRegistration.COMPRESSED_MANGROVE_LEAVES.get(), "Compressed Mangrove Leaves");
        add(BlockRegistration.COMPRESSED_OAK_LEAVES.get(), "Compressed Oak Leaves");
        add(BlockRegistration.COMPRESSED_SPRUCE_LEAVES.get(), "Compressed Spruce Leaves");

        //Wool
        add(BlockRegistration.COMPRESSED_BLACK_WOOL.get(), "Compressed Black Wool");
        add(BlockRegistration.COMPRESSED_BLUE_WOOL.get(), "Compressed Blue Wool");
        add(BlockRegistration.COMPRESSED_BROWN_WOOL.get(), "Compressed Brown Wool");
        add(BlockRegistration.COMPRESSED_CYAN_WOOL.get(), "Compressed Cyan Wool");
        add(BlockRegistration.COMPRESSED_GRAY_WOOL.get(), "Compressed Gray Wool");
        add(BlockRegistration.COMPRESSED_GREEN_WOOL.get(), "Compressed Green Wool");
        add(BlockRegistration.COMPRESSED_LIGHT_BLUE_WOOL.get(), "Compressed Light Blue Wool");
        add(BlockRegistration.COMPRESSED_LIGHT_GRAY_WOOL.get(), "Compressed Light Gray Wool");
        add(BlockRegistration.COMPRESSED_LIME_WOOL.get(), "Compressed Lime Wool");
        add(BlockRegistration.COMPRESSED_MAGENTA_WOOL.get(), "Compressed Magenta Wool");
        add(BlockRegistration.COMPRESSED_ORANGE_WOOL.get(), "Compressed Orange Wool");
        add(BlockRegistration.COMPRESSED_PINK_WOOL.get(), "Compressed Pink Wool");
        add(BlockRegistration.COMPRESSED_PURPLE_WOOL.get(), "Compressed Purple Wool");
        add(BlockRegistration.COMPRESSED_RED_WOOL.get(), "Compressed Red Wool");
        add(BlockRegistration.COMPRESSED_WHITE_WOOL.get(), "Compressed White Wool");
        add(BlockRegistration.COMPRESSED_YELLOW_WOOL.get(), "Compressed Yellow Wool");

        //Concrete
        add(BlockRegistration.COMPRESSED_BLACK_CONCRETE.get(), "Compressed Black Concrete");
        add(BlockRegistration.COMPRESSED_BLUE_CONCRETE.get(), "Compressed Blue Concrete");
        add(BlockRegistration.COMPRESSED_BROWN_CONCRETE.get(), "Compressed Brown Concrete");
        add(BlockRegistration.COMPRESSED_CYAN_CONCRETE.get(), "Compressed Cyan Concrete");
        add(BlockRegistration.COMPRESSED_GRAY_CONCRETE.get(), "Compressed Gray Concrete");
        add(BlockRegistration.COMPRESSED_GREEN_CONCRETE.get(), "Compressed Green Concrete");
        add(BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE.get(), "Compressed Light Blue Concrete");
        add(BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE.get(), "Compressed Light Gray Concrete");
        add(BlockRegistration.COMPRESSED_LIME_CONCRETE.get(), "Compressed Lime Concrete");
        add(BlockRegistration.COMPRESSED_MAGENTA_CONCRETE.get(), "Compressed Magenta Concrete");
        add(BlockRegistration.COMPRESSED_ORANGE_CONCRETE.get(), "Compressed Orange Concrete");
        add(BlockRegistration.COMPRESSED_PINK_CONCRETE.get(), "Compressed Pink Concrete");
        add(BlockRegistration.COMPRESSED_PURPLE_CONCRETE.get(), "Compressed Purple Concrete");
        add(BlockRegistration.COMPRESSED_RED_CONCRETE.get(), "Compressed Red Concrete");
        add(BlockRegistration.COMPRESSED_WHITE_CONCRETE.get(), "Compressed White Concrete");
        add(BlockRegistration.COMPRESSED_YELLOW_CONCRETE.get(), "Compressed Yellow Concrete");

        //Concrete Powder
        add(BlockRegistration.COMPRESSED_BLACK_CONCRETE_POWDER.get(), "Compressed Black Concrete Powder");
        add(BlockRegistration.COMPRESSED_BLUE_CONCRETE_POWDER.get(), "Compressed Blue Concrete Powder");
        add(BlockRegistration.COMPRESSED_BROWN_CONCRETE_POWDER.get(), "Compressed Brown Concrete Powder");
        add(BlockRegistration.COMPRESSED_CYAN_CONCRETE_POWDER.get(), "Compressed Cyan Concrete Powder");
        add(BlockRegistration.COMPRESSED_GRAY_CONCRETE_POWDER.get(), "Compressed Gray Concrete Powder");
        add(BlockRegistration.COMPRESSED_GREEN_CONCRETE_POWDER.get(), "Compressed Green Concrete Powder");
        add(BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER.get(), "Compressed Light Blue Concrete Powder");
        add(BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER.get(), "Compressed Light Gray Concrete Powder");
        add(BlockRegistration.COMPRESSED_LIME_CONCRETE_POWDER.get(), "Compressed Lime Concrete Powder");
        add(BlockRegistration.COMPRESSED_MAGENTA_CONCRETE_POWDER.get(), "Compressed Magenta Concrete Powder");
        add(BlockRegistration.COMPRESSED_ORANGE_CONCRETE_POWDER.get(), "Compressed Orange Concrete Powder");
        add(BlockRegistration.COMPRESSED_PINK_CONCRETE_POWDER.get(), "Compressed Pink Concrete Powder");
        add(BlockRegistration.COMPRESSED_PURPLE_CONCRETE_POWDER.get(), "Compressed Purple Concrete Powder");
        add(BlockRegistration.COMPRESSED_RED_CONCRETE_POWDER.get(), "Compressed Red Concrete Powder");
        add(BlockRegistration.COMPRESSED_WHITE_CONCRETE_POWDER.get(), "Compressed White Concrete Powder");
        add(BlockRegistration.COMPRESSED_YELLOW_CONCRETE_POWDER.get(), "Compressed Yellow Concrete Powder");

        //Snow Blocks
        add(BlockRegistration.COMPRESSED_SNOW_BLOCK.get(), "Compressed Snow Block");
        add(BlockRegistration.COMPRESSED_POWDER_SNOW.get(), "Compressed Powder Snow");

        //Sculk Blocks
        add(BlockRegistration.COMPRESSED_SCULK.get(), "Compressed Sculk");
        add(BlockRegistration.COMPRESSED_SCULK_CATALYST.get(), "Compressed Sculk Catalyst");

        //Glass Blocks
        add(BlockRegistration.COMPRESSED_GLASS.get(), "Compressed Glass");
        add(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS.get(), "Compressed Black Stained Glass");
        add(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS.get(), "Compressed Blue Stained Glass");
        add(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS.get(), "Compressed Brown Stained Glass");
        add(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS.get(), "Compressed Cyan Stained Glass");
        add(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS.get(), "Compressed Gray Stained Glass");
        add(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS.get(), "Compressed Green Stained Glass");
        add(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS.get(), "Compressed Light Blue Stained Glass");
        add(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS.get(), "Compressed Light Gray Stained Glass");
        add(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS.get(), "Compressed Lime Stained Glass");
        add(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS.get(), "Compressed Magenta Stained Glass");
        add(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS.get(), "Compressed Orange Stained Glass");
        add(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS.get(), "Compressed Pink Stained Glass");
        add(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS.get(), "Compressed Purple Stained Glass");
        add(BlockRegistration.COMPRESSED_RED_STAINED_GLASS.get(), "Compressed Red Stained Glass");
        add(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS.get(), "Compressed White Stained Glass");
        add(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS.get(), "Compressed Yellow Stained Glass");

        //Glass Panes
        add(BlockRegistration.COMPRESSED_GLASS_PANE.get(), "Compressed Glass Pane");
        add(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS_PANE.get(), "Compressed Black Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS_PANE.get(), "Compressed Blue Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS_PANE.get(), "Compressed Brown Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS_PANE.get(), "Compressed Cyan Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS_PANE.get(), "Compressed Gray Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS_PANE.get(), "Compressed Green Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS_PANE.get(), "Compressed Light Blue Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS_PANE.get(), "Compressed Light Gray Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS_PANE.get(), "Compressed Lime Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS_PANE.get(), "Compressed Magenta Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS_PANE.get(), "Compressed Orange Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS_PANE.get(), "Compressed Pink Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS_PANE.get(), "Compressed Purple Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_RED_STAINED_GLASS_PANE.get(), "Compressed Red Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS_PANE.get(), "Compressed White Stained Glass Pane");
        add(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS_PANE.get(), "Compressed Yellow Stained Glass Pane");

        //Obsidian
        add(BlockRegistration.COMPRESSED_OBSIDIAN.get(), "Compressed Obsidian");

        //Ingots & Chunks
        add(ItemRegistration.COMPRESSED_RAW_IRON.get(), "Compressed Raw Iron");
        add(ItemRegistration.COMPRESSED_IRON_INGOT.get(), "Compressed Iron Ingot");
        add(ItemRegistration.COMPRESSED_RAW_GOLD.get(), "Compressed Raw Gold");
        add(ItemRegistration.COMPRESSED_GOLD_INGOT.get(), "Compressed Gold Ingot");
        add(ItemRegistration.COMPRESSED_DIAMOND_GEM.get(), "Compressed Diamond");
        add(ItemRegistration.COMPRESSED_RAW_COPPER.get(), "Compressed Raw Copper");
        add(ItemRegistration.COMPRESSED_COPPER_INGOT.get(), "Compressed Copper Ingot");
        add(ItemRegistration.COMPRESSED_COAL.get(), "Compressed Coal");
        add(ItemRegistration.COMPRESSED_EMERALD_GEM.get(), "Compressed Emerald");
        add(ItemRegistration.COMPRESSED_LAPIS.get(), "Compressed Lapis");
        add(ItemRegistration.COMPRESSED_REDSTONE.get(), "Compressed Redstone");
        add(ItemRegistration.COMPRESSED_NETHERITE_INGOT.get(), "Compressed Netherite Ingot");

        //Nuggets
        add(ItemRegistration.COMPRESSED_GOLD_NUGGET.get(), "Compressed Golden Nugget");
        add(ItemRegistration.COMPRESSED_IRON_NUGGET.get(), "Compressed Iron Nugget");

        //Basic Blocks
        add(BlockRegistration.COMPRESSED_ANDESITE.get(), "Compressed Andesite");
        add(BlockRegistration.COMPRESSED_CALCITE.get(), "Compressed Calcite");
        add(BlockRegistration.COMPRESSED_COBBLED_DEEPSLATE.get(), "Compressed Cobbled Deepslate");
        add(BlockRegistration.COMPRESSED_COBBLESTONE.get(), "Compressed Cobblestone");
        add(BlockRegistration.COMPRESSED_DEEPSLATE.get(), "Compressed Deepslate");
        add(BlockRegistration.COMPRESSED_DIORITE.get(), "Compressed Diorite");
        add(BlockRegistration.COMPRESSED_DIRT.get(), "Compressed Dirt");
        add(BlockRegistration.COMPRESSED_GRANITE.get(), "Compressed Granite");
        add(BlockRegistration.COMPRESSED_GRAVEL.get(), "Compressed Gravel");
        add(BlockRegistration.COMPRESSED_NETHERRACK.get(), "Compressed Netherrack");
        add(BlockRegistration.COMPRESSED_RED_SAND.get(), "Compressed Red Sand");
        add(BlockRegistration.COMPRESSED_SAND.get(), "Compressed Sand");
        add(BlockRegistration.COMPRESSED_STONE.get(), "Compressed Stone");
        add(BlockRegistration.COMPRESSED_TUFF.get(), "Compressed Tuff");
        add(BlockRegistration.COMPRESSED_CLAY.get(), "Compressed Clay");
        add(BlockRegistration.COMPRESSED_MOSSY_COBBLESTONE.get(), "Compressed Mossy Cobblestone");

        //Polished Blocks
        add(BlockRegistration.COMPRESSED_POLISHED_ANDESITE.get(), "Compressed Polished Andesite");
        add(BlockRegistration.COMPRESSED_POLISHED_BASALT.get(), "Compressed Polished Basalt");
        add(BlockRegistration.COMPRESSED_POLISHED_DEEPSLATE.get(), "Compressed Polished Deepslate");
        add(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE.get(), "Compressed Polished Blackstone");
        add(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get(), "Compressed Polished Blackstone Bricks");
        add(BlockRegistration.COMPRESSED_POLISHED_DIORITE.get(), "Compressed Polished Diorite");
        add(BlockRegistration.COMPRESSED_POLISHED_GRANITE.get(), "Compressed Polished Granite");

        //Smooth Blocks
        add(BlockRegistration.COMPRESSED_SMOOTH_BASALT.get(), "Compressed Smooth Basalt");
        add(BlockRegistration.COMPRESSED_SMOOTH_STONE.get(), "Compressed Smooth Stone");

        //Stone Bricks
        add(BlockRegistration.COMPRESSED_CHISELED_STONE_BRICKS.get(), "Compressed Chiseled Stone Bricks");
        add(BlockRegistration.COMPRESSED_CRACKED_STONE_BRICKS.get(), "Compressed Cracked Stone Bricks");
        add(BlockRegistration.COMPRESSED_MOSSY_STONE_BRICKS.get(), "Compressed Mossy Stone Bricks");
        add(BlockRegistration.COMPRESSED_STONE_BRICKS.get(), "Compressed Stone Bricks");

        //Sandstone
        add(BlockRegistration.COMPRESSED_CHISELED_RED_SANDSTONE.get(), "Compressed Chiseled Red Sandstone");
        add(BlockRegistration.COMPRESSED_CHISELED_SANDSTONE.get(), "Compressed Chiseled Sandstone");
        add(BlockRegistration.COMPRESSED_CUT_RED_SANDSTONE.get(), "Compressed Cut Red Sandstone");
        add(BlockRegistration.COMPRESSED_CUT_SANDSTONE.get(), "Compressed Cut Sandstone");
        add(BlockRegistration.COMPRESSED_RED_SANDSTONE.get(), "Compressed Red Sandstone");
        add(BlockRegistration.COMPRESSED_SANDSTONE.get(), "Compressed Sandstone");

        //Nether Blocks
        add(BlockRegistration.COMPRESSED_NETHER_QUARTZ_BLOCK.get(), "Compressed Block of Quartz");
        add(BlockRegistration.COMPRESSED_BASALT.get(), "Compressed Basalt");
        add(BlockRegistration.COMPRESSED_BLACKSTONE.get(), "Compressed Blackstone");
        add(BlockRegistration.COMPRESSED_CHISELED_POLISHED_BLACKSTONE.get(), "Compressed Chiseled Polished Blackstone");
        add(BlockRegistration.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.get(), "Compressed Cracked Polished Blackstone Bricks");
        add(BlockRegistration.COMPRESSED_GILDED_BLACKSTONE.get(), "Compressed Gilded Blackstone");
        add(BlockRegistration.COMPRESSED_GLOWSTONE.get(), "Compressed Glowstone");
        add(BlockRegistration.COMPRESSED_MAGMA.get(), "Compressed Magma Block");
        add(BlockRegistration.COMPRESSED_SOUL_SAND.get(), "Compressed Soul Sand");
        add(BlockRegistration.COMPRESSED_SOUL_SOIL.get(), "Compressed Soul Soil");

        //TOOLS
        //Pickaxes
        add(ToolRegistration.COMPRESSED_WOODEN_PICKAXE.get(), "Compressed Wooden Pickaxe");
        add(ToolRegistration.COMPRESSED_STONE_PICKAXE.get(), "Compressed Stone Pickaxe");
        add(ToolRegistration.COMPRESSED_IRON_PICKAXE.get(), "Compressed Iron Pickaxe");
        add(ToolRegistration.COMPRESSED_GOLD_PICKAXE.get(), "Compressed Golden Pickaxe");
        add(ToolRegistration.COMPRESSED_DIAMOND_PICKAXE.get(), "Compressed Diamond Pickaxe");
        add(ToolRegistration.COMPRESSED_NETHERITE_PICKAXE.get(), "Compressed Netherite Pickaxe");
        //Axes
        add(ToolRegistration.COMPRESSED_WOODEN_AXE.get(), "Compressed Wooden Axe");
        add(ToolRegistration.COMPRESSED_STONE_AXE.get(), "Compressed Stone Axe");
        add(ToolRegistration.COMPRESSED_IRON_AXE.get(), "Compressed Iron Axe");
        add(ToolRegistration.COMPRESSED_GOLD_AXE.get(), "Compressed Golden Axe");
        add(ToolRegistration.COMPRESSED_DIAMOND_AXE.get(), "Compressed Diamond Axe");
        add(ToolRegistration.COMPRESSED_NETHERITE_AXE.get(), "Compressed Netherite Axe");
        //Shovels
        add(ToolRegistration.COMPRESSED_WOODEN_SHOVEL.get(), "Compressed Wooden Shovel");
        add(ToolRegistration.COMPRESSED_STONE_SHOVEL.get(), "Compressed Stone Shovel");
        add(ToolRegistration.COMPRESSED_IRON_SHOVEL.get(), "Compressed Iron Shovel");
        add(ToolRegistration.COMPRESSED_GOLD_SHOVEL.get(), "Compressed Golden Shovel");
        add(ToolRegistration.COMPRESSED_DIAMOND_SHOVEL.get(), "Compressed Diamond Shovel");
        add(ToolRegistration.COMPRESSED_NETHERITE_SHOVEL.get(), "Compressed Netherite Shovel");
        //Swords
        add(ToolRegistration.COMPRESSED_WOODEN_SWORD.get(), "Compressed Wooden Sword");
        add(ToolRegistration.COMPRESSED_STONE_SWORD.get(), "Compressed Stone Sword");
        add(ToolRegistration.COMPRESSED_IRON_SWORD.get(), "Compressed Iron Sword");
        add(ToolRegistration.COMPRESSED_GOLD_SWORD.get(), "Compressed Golden Sword");
        add(ToolRegistration.COMPRESSED_DIAMOND_SWORD.get(), "Compressed Diamond Sword");
        add(ToolRegistration.COMPRESSED_NETHERITE_SWORD.get(), "Compressed Netherite Sword");
        //Hoes
        add(ToolRegistration.COMPRESSED_WOODEN_HOE.get(), "Compressed Wooden Hoe");
        add(ToolRegistration.COMPRESSED_STONE_HOE.get(), "Compressed Stone Hoe");
        add(ToolRegistration.COMPRESSED_IRON_HOE.get(), "Compressed Iron Hoe");
        add(ToolRegistration.COMPRESSED_GOLD_HOE.get(), "Compressed Golden Hoe");
        add(ToolRegistration.COMPRESSED_DIAMOND_HOE.get(), "Compressed Diamond Hoe");
        add(ToolRegistration.COMPRESSED_NETHERITE_HOE.get(), "Compressed Netherite Hoe");

        //ARMOR
        //Iron Armor
        add(ArmorRegistration.COMPRESSED_IRON_HELMET.get(), "Compressed Iron Helmet");
        add(ArmorRegistration.COMPRESSED_IRON_CHESTPLATE.get(), "Compressed Iron Chestplate");
        add(ArmorRegistration.COMPRESSED_IRON_LEGGINGS.get(), "Compressed Iron Leggings");
        add(ArmorRegistration.COMPRESSED_IRON_BOOTS.get(), "Compressed Iron Boots");
        //Gold Armor
        add(ArmorRegistration.COMPRESSED_GOLD_HELMET.get(), "Compressed Gold Helmet");
        add(ArmorRegistration.COMPRESSED_GOLD_CHESTPLATE.get(), "Compressed Gold Chestplate");
        add(ArmorRegistration.COMPRESSED_GOLD_LEGGINGS.get(), "Compressed Gold Leggings");
        add(ArmorRegistration.COMPRESSED_GOLD_BOOTS.get(), "Compressed Gold Boots");
        //Diamond Armor
        add(ArmorRegistration.COMPRESSED_DIAMOND_HELMET.get(), "Compressed Diamond Helmet");
        add(ArmorRegistration.COMPRESSED_DIAMOND_CHESTPLATE.get(), "Compressed Diamond Chestplate");
        add(ArmorRegistration.COMPRESSED_DIAMOND_LEGGINGS.get(), "Compressed Diamond Leggings");
        add(ArmorRegistration.COMPRESSED_DIAMOND_BOOTS.get(), "Compressed Diamond Boots");
        //Netherite Armor
        add(ArmorRegistration.COMPRESSED_NETHERITE_HELMET.get(), "Compressed Netherite Helmet");
        add(ArmorRegistration.COMPRESSED_NETHERITE_CHESTPLATE.get(), "Compressed Netherite Chestplate");
        add(ArmorRegistration.COMPRESSED_NETHERITE_LEGGINGS.get(), "Compressed Netherite Leggings");
        add(ArmorRegistration.COMPRESSED_NETHERITE_BOOTS.get(), "Compressed Netherite Boots");

        //FOOD
        add(FoodRegistration.COMPRESSED_APPLE.get(), "Compressed Apple");
        add(FoodRegistration.COMPRESSED_BAKED_POTATO.get(), "Compressed Baked Potato");
        add(FoodRegistration.COMPRESSED_BEEF.get(), "Compressed Beef");
        add(FoodRegistration.COMPRESSED_BEETROOT.get(), "Compressed Beetroot");
        add(FoodRegistration.COMPRESSED_BEETROOT_SOUP.get(), "Compressed Beetroot Soup");
        add(FoodRegistration.COMPRESSED_BREAD.get(), "Compressed Bread");
        add(FoodRegistration.COMPRESSED_CARROT.get(), "Compressed Carrot");
        add(FoodRegistration.COMPRESSED_CHICKEN.get(), "Compressed Chicken");
        add(FoodRegistration.COMPRESSED_COD.get(), "Compressed Cod");
        add(FoodRegistration.COMPRESSED_COOKED_BEEF.get(), "Compressed Cooked Beef");
        add(FoodRegistration.COMPRESSED_COOKED_CHICKEN.get(), "Compressed Cooked Chicken");
        add(FoodRegistration.COMPRESSED_COOKED_COD.get(), "Compressed Cooked Cod");
        add(FoodRegistration.COMPRESSED_COOKED_MUTTON.get(), "Compressed Cooked Mutton");
        add(FoodRegistration.COMPRESSED_COOKED_PORKCHOP.get(), "Compressed Cooked Porkchop");
        add(FoodRegistration.COMPRESSED_COOKED_RABBIT.get(), "Compressed Cooked Rabbit");
        add(FoodRegistration.COMPRESSED_COOKED_SALMON.get(), "Compressed Cooked Salmon");
        add(FoodRegistration.COMPRESSED_COOKIE.get(), "Compressed Cookie");
        add(FoodRegistration.COMPRESSED_DRIED_KELP.get(), "Compressed Dried Kelp");
        add(FoodRegistration.COMPRESSED_GLOW_BERRIES.get(), "Compressed Glow Berries");
        add(FoodRegistration.COMPRESSED_GOLDEN_APPLE.get(), "Compressed Golden Apple");
        add(FoodRegistration.COMPRESSED_ENCHANTED_GOLDEN_APPLE.get(), "Compressed Enchanted Golden Apple");
        add(FoodRegistration.COMPRESSED_MELON_SLICE.get(), "Compressed Melon Slice");
        add(FoodRegistration.COMPRESSED_MUSHROOM_STEW.get(), "Compressed Mushroom Stew");
        add(FoodRegistration.COMPRESSED_MUTTON.get(), "Compressed Mutton");
        add(FoodRegistration.COMPRESSED_POISONOUS_POTATO.get(), "Compressed Poisonous Potato");
        add(FoodRegistration.COMPRESSED_PORKCHOP.get(), "Compressed Porkchop");
        add(FoodRegistration.COMPRESSED_POTATO.get(), "Compressed Potato");
        add(FoodRegistration.COMPRESSED_PUFFERFISH.get(), "Compressed Pufferfish");
        add(FoodRegistration.COMPRESSED_PUMPKIN_PIE.get(), "Compressed Pumpkin Pie");
        add(FoodRegistration.COMPRESSED_RABBIT.get(), "Compressed Rabbit");
        add(FoodRegistration.COMPRESSED_RABBIT_STEW.get(), "Compressed Rabbit Stew");
        add(FoodRegistration.COMPRESSED_ROTTEN_FLESH.get(), "Compressed Rotten Flesh");
        add(FoodRegistration.COMPRESSED_SALMON.get(), "Compressed Salmon");
        add(FoodRegistration.COMPRESSED_SPIDER_EYE.get(), "Compressed Spider Eye");
        add(FoodRegistration.COMPRESSED_SWEET_BERRIES.get(), "Compressed Sweet Berries");
        add(FoodRegistration.COMPRESSED_TROPICAL_FISH.get(), "Compressed Tropical Fish");

        //Single Items
        add(ItemRegistration.COMPRESSED_FLINT.get(), "Compressed Flint");
        add(ItemRegistration.COMPRESSED_QUARTZ.get(), "Compressed Quartz");
        add(ItemRegistration.COMPRESSED_STICK.get(), "Compressed Stick");
        add(ItemRegistration.COMPRESSED_LEATHER.get(), "Compressed Leather");
        add(ItemRegistration.COMPRESSED_POWDER_SNOW_BUCKET.get(), "Compressed Powder Snow Bucket");

        //Projectiles
        add(ItemRegistration.COMPRESSED_ARROW.get(), "Compressed Arrow");
        add(ItemRegistration.COMPRESSED_ARROW_ENTITY.get(), "Compressed Arrow Entity");
        add(ItemRegistration.COMPRESSED_SPECTRAL_ARROW.get(), "Compressed Spectral Arrow");
        add(ItemRegistration.COMPRESSED_SPECTRAL_ARROW_ENTITY.get(), "Compressed Spectral Arrow Entity");
        add(ItemRegistration.COMPRESSED_SNOWBALL.get(), "Compressed Snowball");
        add(ItemRegistration.COMPRESSED_SNOWBALL_ENTITY.get(), "Compressed SnowBall Entity");
    }
}
