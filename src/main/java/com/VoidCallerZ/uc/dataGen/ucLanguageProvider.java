package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.registration.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.VoidCallerZ.uc.blocks.machines.PowergenBlock.MESSAGE_ULTIMATE_POWERGEN;
import static com.VoidCallerZ.uc.blocks.machines.PowergenBlock.SCREEN_ULTIMATE_POWERGEN;
import static com.VoidCallerZ.uc.setup.ModSetup.*;

public class ucLanguageProvider extends LanguageProvider
{
    public ucLanguageProvider(DataGenerator gen, String locale) { super(gen, UltimateCompression.MODID, locale); }

    @Override
    protected void  addTranslations()
    {
        add("itemGroup." + UC_TAB, "Ultimate Compression");
        add("itemGroup." + UC_TOOLS_TAB, "Ultimate Tool Compression");
        add("itemGroup." + UC_FOOD_TAB, "Ultimate Food Compression");
        add(MESSAGE_ULTIMATE_POWERGEN, "Power generator generating %s per tick!");
        add(SCREEN_ULTIMATE_POWERGEN, "Power generator");

        add(Registration.ULTIMATE_POWERGEN.get(), "Ultimate power generator");
        add(Registration.COMPRESSOR.get(), "Ultimate Compressor");

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
        add(Registration.COMPRESSED_NETHER_GOLD_ORE.get(), "Compressed Nether Gold ore");
        add(Registration.COMPRESSED_NETHER_QUARTZ_ORE.get(), "Compressed Nether Quartz Ore");

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

        //Wool
        add(Registration.COMPRESSED_BLACK_WOOL.get(), "Compressed Black Wool");
        add(Registration.COMPRESSED_BLUE_WOOL.get(), "Compressed Blue Wool");
        add(Registration.COMPRESSED_BROWN_WOOL.get(), "Compressed Brown Wool");
        add(Registration.COMPRESSED_CYAN_WOOL.get(), "Compressed Cyan Wool");
        add(Registration.COMPRESSED_GRAY_WOOL.get(), "Compressed Gray Wool");
        add(Registration.COMPRESSED_GREEN_WOOL.get(), "Compressed Green Wool");
        add(Registration.COMPRESSED_LIGHT_BLUE_WOOL.get(), "Compressed Light Blue Wool");
        add(Registration.COMPRESSED_LIGHT_GRAY_WOOL.get(), "Compressed Light Gray Wool");
        add(Registration.COMPRESSED_LIME_WOOL.get(), "Compressed Lime Wool");
        add(Registration.COMPRESSED_MAGENTA_WOOL.get(), "Compressed Magenta Wool");
        add(Registration.COMPRESSED_ORANGE_WOOL.get(), "Compressed Orange Wool");
        add(Registration.COMPRESSED_PINK_WOOL.get(), "Compressed Pink Wool");
        add(Registration.COMPRESSED_PURPLE_WOOL.get(), "Compressed Purple Wool");
        add(Registration.COMPRESSED_RED_WOOL.get(), "Compressed Red Wool");
        add(Registration.COMPRESSED_WHITE_WOOL.get(), "Compressed White Wool");
        add(Registration.COMPRESSED_YELLOW_WOOL.get(), "Compressed Yellow Wool");

        //Concrete
        add(Registration.COMPRESSED_BLACK_CONCRETE.get(), "Compressed Black Concrete");
        add(Registration.COMPRESSED_BLUE_CONCRETE.get(), "Compressed Blue Concrete");
        add(Registration.COMPRESSED_BROWN_CONCRETE.get(), "Compressed Brown Concrete");
        add(Registration.COMPRESSED_CYAN_CONCRETE.get(), "Compressed Cyan Concrete");
        add(Registration.COMPRESSED_GRAY_CONCRETE.get(), "Compressed Gray Concrete");
        add(Registration.COMPRESSED_GREEN_CONCRETE.get(), "Compressed Green Concrete");
        add(Registration.COMPRESSED_LIGHT_BLUE_CONCRETE.get(), "Compressed Light Blue Concrete");
        add(Registration.COMPRESSED_LIGHT_GRAY_CONCRETE.get(), "Compressed Light Gray Concrete");
        add(Registration.COMPRESSED_LIME_CONCRETE.get(), "Compressed Lime Concrete");
        add(Registration.COMPRESSED_MAGENTA_CONCRETE.get(), "Compressed Magenta Concrete");
        add(Registration.COMPRESSED_ORANGE_CONCRETE.get(), "Compressed Orange Concrete");
        add(Registration.COMPRESSED_PINK_CONCRETE.get(), "Compressed Pink Concrete");
        add(Registration.COMPRESSED_PURPLE_CONCRETE.get(), "Compressed Purple Concrete");
        add(Registration.COMPRESSED_RED_CONCRETE.get(), "Compressed Red Concrete");
        add(Registration.COMPRESSED_WHITE_CONCRETE.get(), "Compressed White Concrete");
        add(Registration.COMPRESSED_YELLOW_CONCRETE.get(), "Compressed Yellow Concrete");

        //Concrete Powder
        add(Registration.COMPRESSED_BLACK_CONCRETE_POWDER.get(), "Compressed Black Concrete Powder");
        add(Registration.COMPRESSED_BLUE_CONCRETE_POWDER.get(), "Compressed Blue Concrete Powder");
        add(Registration.COMPRESSED_BROWN_CONCRETE_POWDER.get(), "Compressed Brown Concrete Powder");
        add(Registration.COMPRESSED_CYAN_CONCRETE_POWDER.get(), "Compressed Cyan Concrete Powder");
        add(Registration.COMPRESSED_GRAY_CONCRETE_POWDER.get(), "Compressed Gray Concrete Powder");
        add(Registration.COMPRESSED_GREEN_CONCRETE_POWDER.get(), "Compressed Green Concrete Powder");
        add(Registration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER.get(), "Compressed Light Blue Concrete Powder");
        add(Registration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER.get(), "Compressed Light Gray Concrete Powder");
        add(Registration.COMPRESSED_LIME_CONCRETE_POWDER.get(), "Compressed Lime Concrete Powder");
        add(Registration.COMPRESSED_MAGENTA_CONCRETE_POWDER.get(), "Compressed Magenta Concrete Powder");
        add(Registration.COMPRESSED_ORANGE_CONCRETE_POWDER.get(), "Compressed Orange Concrete Powder");
        add(Registration.COMPRESSED_PINK_CONCRETE_POWDER.get(), "Compressed Pink Concrete Powder");
        add(Registration.COMPRESSED_PURPLE_CONCRETE_POWDER.get(), "Compressed Purple Concrete Powder");
        add(Registration.COMPRESSED_RED_CONCRETE_POWDER.get(), "Compressed Red Concrete Powder");
        add(Registration.COMPRESSED_WHITE_CONCRETE_POWDER.get(), "Compressed White Concrete Powder");
        add(Registration.COMPRESSED_YELLOW_CONCRETE_POWDER.get(), "Compressed Yellow Concrete Powder");

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

        //Basic Blocks
        add(Registration.COMPRESSED_ANDESITE.get(), "Compressed Andesite");
        add(Registration.COMPRESSED_CALCITE.get(), "Compressed Calcite");
        add(Registration.COMPRESSED_COBBLED_DEEPSLATE.get(), "Compressed Cobbled Deepslate");
        add(Registration.COMPRESSED_COBBLESTONE.get(), "Compressed Cobblestone");
        add(Registration.COMPRESSED_DEEPSLATE.get(), "Compressed Deepslate");
        add(Registration.COMPRESSED_DIORITE.get(), "Compressed Diorite");
        add(Registration.COMPRESSED_DIRT.get(), "Compressed Dirt");
        add(Registration.COMPRESSED_GRANITE.get(), "Compressed Granite");
        add(Registration.COMPRESSED_GRAVEL.get(), "Compressed Gravel");
        add(Registration.COMPRESSED_NETHERRACK.get(), "Compressed Netherrack");
        add(Registration.COMPRESSED_RED_SAND.get(), "Compressed Red Sand");
        add(Registration.COMPRESSED_SAND.get(), "Compressed Sand");
        add(Registration.COMPRESSED_STONE.get(), "Compressed Stone");
        add(Registration.COMPRESSED_TUFF.get(), "Compressed Tuff");
        add(Registration.COMPRESSED_CLAY.get(), "Compressed Clay");

        //Polished Blocks
        add(Registration.COMPRESSED_POLISHED_ANDESITE.get(), "Compressed Polished Andesite");
        add(Registration.COMPRESSED_POLISHED_BASALT.get(), "Compressed Polished Basalt");
        add(Registration.COMPRESSED_POLISHED_DEEPSLATE.get(), "Compressed Polished Deepslate");
        add(Registration.COMPRESSED_POLISHED_BLACKSTONE.get(), "Compressed Polished Blackstone");
        add(Registration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get(), "Compressed Polished Blackstone Bricks");
        add(Registration.COMPRESSED_POLISHED_DIORITE.get(), "Compressed Polished Diorite");
        add(Registration.COMPRESSED_POLISHED_GRANITE.get(), "Compressed Polished Granite");

        //Smooth Blocks
        add(Registration.COMPRESSED_SMOOTH_BASALT.get(), "Compressed Smooth Basalt");
        add(Registration.COMPRESSED_SMOOTH_STONE.get(), "Compressed Smooth Stone");

        //Nether Blocks
        add(Registration.COMPRESSED_NETHER_QUARTZ_BLOCK.get(), "Compressed Block of Quartz");
        add(Registration.COMPRESSED_BASALT.get(), "Compressed Basalt");
        add(Registration.COMPRESSED_BLACKSTONE.get(), "Compressed Blackstone");
        add(Registration.COMPRESSED_GLOWSTONE.get(), "Compressed Glowstone");
        add(Registration.COMPRESSED_MAGMA.get(), "Compressed Magma Block");
        add(Registration.COMPRESSED_SOUL_SAND.get(), "Compressed Soul Sand");
        add(Registration.COMPRESSED_SOUL_SOIL.get(), "Compressed Soul Soil");

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

        //Arrows
        add(ItemRegistration.COMPRESSED_ARROW.get(), "Compressed Arrow");
        add(ItemRegistration.COMPRESSED_ARROW_ENTITY.get(), "Compressed Arrow Entity");
        add(ItemRegistration.COMPRESSED_SPECTRAL_ARROW.get(), "Compressed Spectral Arrow");
        add(ItemRegistration.COMPRESSED_SPECTRAL_ARROW_ENTITY.get(), "Compressed Spectral Arrow Entity");
        add(ItemRegistration.COMPRESSED_TIPPED_ARROW.get(), "Compressed Tipped Arrow");
        add(ItemRegistration.COMPRESSED_TIPPED_ARROW_ENTITY.get(), "Compressed Tipped Arrow Entity");
    }
}
