package com.VoidCallerZ.uc.registration;

import com.VoidCallerZ.uc.blocks.UcFuelBlockItem;
import com.VoidCallerZ.uc.entities.projectiles.CompressedArrow;
import com.VoidCallerZ.uc.entities.projectiles.CompressedSpectralArrow;
import com.VoidCallerZ.uc.items.UcFuelItem;
import com.VoidCallerZ.uc.items.UcSnowball;
import com.VoidCallerZ.uc.items.UcSnowballItem;
import com.VoidCallerZ.uc.items.arrows.UcArrowItem;
import com.VoidCallerZ.uc.items.arrows.UcSpectralArrowItem;
import com.VoidCallerZ.uc.setup.ModSetup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SolidBucketItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class ItemRegistration
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        ENTITIES.register(bus);
    }

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_COMPRESSION_TAB);

    //Itemblocks
    //Ores
    public static final RegistryObject<Item> COMPRESSED_IRON_ORE = fromBlock(BlockRegistration.COMPRESSED_IRON_ORE);
    public static final RegistryObject<Item> COMPRESSED_GOLD_ORE = fromBlock(BlockRegistration.COMPRESSED_GOLD_ORE);
    public static final RegistryObject<Item> COMPRESSED_DIAMOND_ORE = fromBlock(BlockRegistration.COMPRESSED_DIAMOND_ORE);
    public static final RegistryObject<Item> COMPRESSED_COPPER_ORE = fromBlock(BlockRegistration.COMPRESSED_COPPER_ORE);
    public static final RegistryObject<Item> COMPRESSED_COAL_ORE = fromBlock(BlockRegistration.COMPRESSED_COAL_ORE);
    public static final RegistryObject<Item> COMPRESSED_EMERALD_ORE = fromBlock(BlockRegistration.COMPRESSED_EMERALD_ORE);
    public static final RegistryObject<Item> COMPRESSED_LAPIS_ORE = fromBlock(BlockRegistration.COMPRESSED_LAPIS_ORE);
    public static final RegistryObject<Item> COMPRESSED_REDSTONE_ORE = fromBlock(BlockRegistration.COMPRESSED_REDSTONE_ORE);
    public static final RegistryObject<Item> COMPRESSED_NETHER_GOLD_ORE = fromBlock(BlockRegistration.COMPRESSED_NETHER_GOLD_ORE);
    public static final RegistryObject<Item> COMPRESSED_NETHER_QUARTZ_ORE = fromBlock(BlockRegistration.COMPRESSED_NETHER_QUARTZ_ORE);

    //Deepslate Ores
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_IRON_ORE = fromBlock(BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE);
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_GOLD_ORE = fromBlock(BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE);
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_DIAMOND_ORE = fromBlock(BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE);
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_COPPER_ORE = fromBlock(BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE);
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_COAL_ORE = fromBlock(BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE);
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_EMERALD_ORE = fromBlock(BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE);
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_LAPIS_ORE = fromBlock(BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE);
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_REDSTONE_ORE = fromBlock(BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE);
    
    //Ingot Blocks
    public static final RegistryObject<Item> COMPRESSED_IRON_BLOCK = fromBlock(BlockRegistration.COMPRESSED_IRON_BLOCK);
    public static final RegistryObject<Item> COMPRESSED_GOLD_BLOCK = fromBlock(BlockRegistration.COMPRESSED_GOLD_BLOCK);
    public static final RegistryObject<Item> COMPRESSED_DIAMOND_BLOCK = fromBlock(BlockRegistration.COMPRESSED_DIAMOND_BLOCK);
    public static final RegistryObject<Item> COMPRESSED_COPPER_BLOCK = fromBlock(BlockRegistration.COMPRESSED_COPPER_BLOCK);
    public static final RegistryObject<Item> COMPRESSED_COAL_BLOCK = fromBlockFuelItem(BlockRegistration.COMPRESSED_COAL_BLOCK, 144000);
    public static final RegistryObject<Item> COMPRESSED_EMERALD_BLOCK = fromBlock(BlockRegistration.COMPRESSED_EMERALD_BLOCK);
    public static final RegistryObject<Item> COMPRESSED_LAPIS_BLOCK = fromBlock(BlockRegistration.COMPRESSED_LAPIS_BLOCK);
    public static final RegistryObject<Item> COMPRESSED_NETHERITE_BLOCK = fromBlock(BlockRegistration.COMPRESSED_NETHERITE_BLOCK);
    public static final RegistryObject<Item> COMPRESSED_REDSTONE_BLOCK = fromBlock(BlockRegistration.COMPRESSED_REDSTONE_BLOCK);
    
    //Raw Blocks
    public static final RegistryObject<Item> COMPRESSED_RAW_IRON_BLOCK = fromBlock(BlockRegistration.COMPRESSED_RAW_IRON_BLOCK);
    public static final RegistryObject<Item> COMPRESSED_RAW_GOLD_BLOCK = fromBlock(BlockRegistration.COMPRESSED_RAW_GOLD_BLOCK);
    public static final RegistryObject<Item> COMPRESSED_RAW_COPPER_BLOCK = fromBlock(BlockRegistration.COMPRESSED_RAW_COPPER_BLOCK);
    
    //Basic Blocks
    public static final RegistryObject<Item> COMPRESSED_ANDESITE = fromBlock(BlockRegistration.COMPRESSED_ANDESITE);
    public static final RegistryObject<Item> COMPRESSED_CALCITE = fromBlock(BlockRegistration.COMPRESSED_CALCITE);
    public static final RegistryObject<Item> COMPRESSED_COBBLED_DEEPSLATE = fromBlock(BlockRegistration.COMPRESSED_COBBLED_DEEPSLATE);
    public static final RegistryObject<Item> COMPRESSED_COBBLESTONE = fromBlock(BlockRegistration.COMPRESSED_COBBLESTONE);
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE = fromBlock(BlockRegistration.COMPRESSED_DEEPSLATE);
    public static final RegistryObject<Item> COMPRESSED_DIORITE = fromBlock(BlockRegistration.COMPRESSED_DIORITE);
    public static final RegistryObject<Item> COMPRESSED_DIRT = fromBlock(BlockRegistration.COMPRESSED_DIRT);
    public static final RegistryObject<Item> COMPRESSED_GRANITE = fromBlock(BlockRegistration.COMPRESSED_GRANITE);
    public static final RegistryObject<Item> COMPRESSED_GRAVEL = fromBlock(BlockRegistration.COMPRESSED_GRAVEL);
    public static final RegistryObject<Item> COMPRESSED_NETHERRACK = fromBlock(BlockRegistration.COMPRESSED_NETHERRACK);
    public static final RegistryObject<Item> COMPRESSED_RED_SAND = fromBlock(BlockRegistration.COMPRESSED_RED_SAND);
    public static final RegistryObject<Item> COMPRESSED_SAND = fromBlock(BlockRegistration.COMPRESSED_SAND);
    public static final RegistryObject<Item> COMPRESSED_STONE = fromBlock(BlockRegistration.COMPRESSED_STONE);
    public static final RegistryObject<Item> COMPRESSED_TUFF = fromBlock(BlockRegistration.COMPRESSED_TUFF);
    public static final RegistryObject<Item> COMPRESSED_CLAY = fromBlock(BlockRegistration.COMPRESSED_CLAY);
    public static final RegistryObject<Item> COMPRESSED_MOSSY_COBBLESTONE = fromBlock(BlockRegistration.COMPRESSED_MOSSY_COBBLESTONE);
    
    //Polished Blocks
    public static final RegistryObject<Item> COMPRESSED_POLISHED_ANDESITE = fromBlock(BlockRegistration.COMPRESSED_POLISHED_ANDESITE);
    public static final RegistryObject<Item> COMPRESSED_POLISHED_BASALT = fromBlock(BlockRegistration.COMPRESSED_POLISHED_BASALT);
    public static final RegistryObject<Item> COMPRESSED_POLISHED_BLACKSTONE = fromBlock(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE);
    public static final RegistryObject<Item> COMPRESSED_POLISHED_BLACKSTONE_BRICKS = fromBlock(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS);
    public static final RegistryObject<Item> COMPRESSED_POLISHED_DEEPSLATE = fromBlock(BlockRegistration.COMPRESSED_POLISHED_DEEPSLATE);
    public static final RegistryObject<Item> COMPRESSED_POLISHED_DIORITE = fromBlock(BlockRegistration.COMPRESSED_POLISHED_DIORITE);
    public static final RegistryObject<Item> COMPRESSED_POLISHED_GRANITE = fromBlock(BlockRegistration.COMPRESSED_POLISHED_GRANITE);

    //Smooth Blocks
    public static final RegistryObject<Item> COMPRESSED_SMOOTH_BASALT = fromBlock(BlockRegistration.COMPRESSED_SMOOTH_BASALT);
    public static final RegistryObject<Item> COMPRESSED_SMOOTH_STONE = fromBlock(BlockRegistration.COMPRESSED_SMOOTH_STONE);
    
    //Stone Bricks
    public static final RegistryObject<Item> COMPRESSED_CHISELED_STONE_BRICKS = fromBlock(BlockRegistration.COMPRESSED_CHISELED_STONE_BRICKS);
    public static final RegistryObject<Item> COMPRESSED_CRACKED_STONE_BRICKS = fromBlock(BlockRegistration.COMPRESSED_CRACKED_STONE_BRICKS);
    public static final RegistryObject<Item> COMPRESSED_MOSSY_STONE_BRICKS = fromBlock(BlockRegistration.COMPRESSED_MOSSY_STONE_BRICKS);
    public static final RegistryObject<Item> COMPRESSED_STONE_BRICKS = fromBlock(BlockRegistration.COMPRESSED_STONE_BRICKS);
    
    //Sandstone
    public static final RegistryObject<Item> COMPRESSED_CHISELED_RED_SANDSTONE = fromBlock(BlockRegistration.COMPRESSED_CHISELED_RED_SANDSTONE);
    public static final RegistryObject<Item> COMPRESSED_CHISELED_SANDSTONE = fromBlock(BlockRegistration.COMPRESSED_CHISELED_SANDSTONE);
    public static final RegistryObject<Item> COMPRESSED_CUT_RED_SANDSTONE = fromBlock(BlockRegistration.COMPRESSED_CUT_RED_SANDSTONE);
    public static final RegistryObject<Item> COMPRESSED_CUT_SANDSTONE = fromBlock(BlockRegistration.COMPRESSED_CUT_SANDSTONE);
    public static final RegistryObject<Item> COMPRESSED_RED_SANDSTONE = fromBlock(BlockRegistration.COMPRESSED_RED_SANDSTONE);
    public static final RegistryObject<Item> COMPRESSED_SANDSTONE = fromBlock(BlockRegistration.COMPRESSED_SANDSTONE);
    
    //Nether Blocks
    public static final RegistryObject<Item> COMPRESSED_NETHER_QUARTZ_BLOCK = fromBlock(BlockRegistration.COMPRESSED_NETHER_QUARTZ_BLOCK);
    public static final RegistryObject<Item> COMPRESSED_BASALT = fromBlock(BlockRegistration.COMPRESSED_BASALT);
    public static final RegistryObject<Item> COMPRESSED_BLACKSTONE = fromBlock(BlockRegistration.COMPRESSED_BLACKSTONE);
    public static final RegistryObject<Item> COMPRESSED_CHISELED_POLISHED_BLACKSTONE = fromBlock(BlockRegistration.COMPRESSED_CHISELED_POLISHED_BLACKSTONE);
    public static final RegistryObject<Item> COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS = fromBlock(BlockRegistration.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final RegistryObject<Item> COMPRESSED_GILDED_BLACKSTONE = fromBlock(BlockRegistration.COMPRESSED_GILDED_BLACKSTONE);
    public static final RegistryObject<Item> COMPRESSED_GLOWSTONE = fromBlock(BlockRegistration.COMPRESSED_GLOWSTONE);
    public static final RegistryObject<Item> COMPRESSED_MAGMA = fromBlock(BlockRegistration.COMPRESSED_MAGMA);
    public static final RegistryObject<Item> COMPRESSED_SOUL_SAND = fromBlock(BlockRegistration.COMPRESSED_SOUL_SAND);
    public static final RegistryObject<Item> COMPRESSED_SOUL_SOIL = fromBlock(BlockRegistration.COMPRESSED_SOUL_SOIL);
    
    //Logs & Planks
    public static final RegistryObject<Item> COMPRESSED_ACACIA_LOG = fromBlockFuelItem(BlockRegistration.COMPRESSED_ACACIA_LOG, 2700);
    public static final RegistryObject<Item> COMPRESSED_ACACIA_PLANKS = fromBlockFuelItem(BlockRegistration.COMPRESSED_ACACIA_PLANKS, 2700);
    public static final RegistryObject<Item> COMPRESSED_BIRCH_LOG = fromBlockFuelItem(BlockRegistration.COMPRESSED_BIRCH_LOG, 2700);
    public static final RegistryObject<Item> COMPRESSED_BIRCH_PLANKS = fromBlockFuelItem(BlockRegistration.COMPRESSED_BIRCH_PLANKS, 2700);
    public static final RegistryObject<Item> COMPRESSED_DARK_OAK_LOG = fromBlockFuelItem(BlockRegistration.COMPRESSED_DARK_OAK_LOG, 2700);
    public static final RegistryObject<Item> COMPRESSED_DARK_OAK_PLANKS = fromBlockFuelItem(BlockRegistration.COMPRESSED_DARK_OAK_PLANKS, 2700);
    public static final RegistryObject<Item> COMPRESSED_JUNGLE_LOG = fromBlockFuelItem(BlockRegistration.COMPRESSED_JUNGLE_LOG, 2700);
    public static final RegistryObject<Item> COMPRESSED_JUNGLE_PLANKS = fromBlockFuelItem(BlockRegistration.COMPRESSED_JUNGLE_PLANKS, 2700);
    public static final RegistryObject<Item> COMPRESSED_OAK_LOG = fromBlockFuelItem(BlockRegistration.COMPRESSED_OAK_LOG, 2700);
    public static final RegistryObject<Item> COMPRESSED_OAK_PLANKS = fromBlockFuelItem(BlockRegistration.COMPRESSED_OAK_PLANKS, 2700);
    public static final RegistryObject<Item> COMPRESSED_SPRUCE_LOG = fromBlockFuelItem(BlockRegistration.COMPRESSED_SPRUCE_LOG, 2700);
    public static final RegistryObject<Item> COMPRESSED_SPRUCE_PLANKS = fromBlockFuelItem(BlockRegistration.COMPRESSED_SPRUCE_PLANKS, 2700);
    public static final RegistryObject<Item> COMPRESSED_SPRUCE_CRIMSON_STEM = fromBlockFuelItem(BlockRegistration.COMPRESSED_CRIMSON_STEM, 2700);
    public static final RegistryObject<Item> COMPRESSED_CRIMSON_PLANKS = fromBlockFuelItem(BlockRegistration.COMPRESSED_CRIMSON_PLANKS, 2700);
    public static final RegistryObject<Item> COMPRESSED_WARPED_STEM = fromBlockFuelItem(BlockRegistration.COMPRESSED_WARPED_STEM, 2700);
    public static final RegistryObject<Item> COMPRESSED_WARPED_PLANKS = fromBlockFuelItem(BlockRegistration.COMPRESSED_WARPED_PLANKS, 2700);
    public static final RegistryObject<Item> COMPRESSED_MANGROVE_LOG = fromBlockFuelItem(BlockRegistration.COMPRESSED_MANGROVE_LOG, 2700);
    public static final RegistryObject<Item> COMPRESSED_MANGROVE_PLANKS = fromBlockFuelItem(BlockRegistration.COMPRESSED_MANGROVE_PLANKS, 2700);
    public static final RegistryObject<Item> COMPRESSED_MANGROVE_ROOTS = fromBlockFuelItem(BlockRegistration.COMPRESSED_MANGROVE_ROOTS, 2700);
    
    //Wool Blocks
    public static final RegistryObject<Item> COMPRESSED_BLACK_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_BLACK_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_BLUE_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_BLUE_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_BROWN_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_BROWN_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_CYAN_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_CYAN_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_GRAY_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_GRAY_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_GREEN_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_GREEN_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_LIGHT_BLUE_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_LIGHT_BLUE_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_LIGHT_GRAY_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_LIGHT_GRAY_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_LIME_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_LIME_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_MAGENTA_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_MAGENTA_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_ORANGE_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_ORANGE_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_PINK_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_PINK_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_PURPLE_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_PURPLE_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_RED_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_RED_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_WHITE_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_WHITE_WOOL, 200);
    public static final RegistryObject<Item> COMPRESSED_YELLOW_WOOL = fromBlockFuelItem(BlockRegistration.COMPRESSED_YELLOW_WOOL, 200);

    //Concrete
    public static final RegistryObject<Item> COMPRESSED_BLACK_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_BLACK_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_BLUE_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_BLUE_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_BROWN_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_BROWN_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_CYAN_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_CYAN_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_GRAY_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_GRAY_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_GREEN_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_GREEN_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_LIGHT_BLUE_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_LIGHT_GRAY_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_LIME_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_LIME_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_MAGENTA_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_MAGENTA_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_ORANGE_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_ORANGE_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_PINK_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_PINK_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_PURPLE_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_PURPLE_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_RED_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_RED_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_WHITE_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_WHITE_CONCRETE);
    public static final RegistryObject<Item> COMPRESSED_YELLOW_CONCRETE = fromBlock(BlockRegistration.COMPRESSED_YELLOW_CONCRETE);
    
    //Concrete Powder
    public static final RegistryObject<Item> COMPRESSED_BLACK_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_BLACK_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_BLUE_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_BLUE_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_BROWN_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_BROWN_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_CYAN_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_CYAN_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_GRAY_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_GRAY_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_GREEN_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_GREEN_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_LIME_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_LIME_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_MAGENTA_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_MAGENTA_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_ORANGE_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_ORANGE_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_PINK_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_PINK_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_PURPLE_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_PURPLE_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_RED_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_RED_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_WHITE_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_WHITE_CONCRETE_POWDER);
    public static final RegistryObject<Item> COMPRESSED_YELLOW_CONCRETE_POWDER = fromBlock(BlockRegistration.COMPRESSED_YELLOW_CONCRETE_POWDER);
    
    //Snow Blocks
    public static final RegistryObject<Item> COMPRESSED_SNOW_BLOCK = fromBlock(BlockRegistration.COMPRESSED_SNOW_BLOCK);
    
    //Sculk Blocks
    public static final RegistryObject<Item> COMPRESSED_SCULK_CATALYST = fromBlock(BlockRegistration.COMPRESSED_SCULK_CATALYST);
    public static final RegistryObject<Item> COMPRESSED_SCULK = fromBlock(BlockRegistration.COMPRESSED_SCULK);
    
    //Glass Blocks
    public static final RegistryObject<Item> COMPRESSED_GLASS = fromBlock(BlockRegistration.COMPRESSED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_BLACK_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_BLUE_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_BROWN_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_CYAN_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_GRAY_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_GREEN_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_LIGHT_BLUE_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_LIGHT_GRAY_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_LIME_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_MAGENTA_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_ORANGE_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_PINK_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_PURPLE_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_RED_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_RED_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_WHITE_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS);
    public static final RegistryObject<Item> COMPRESSED_YELLOW_STAINED_GLASS = fromBlock(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS);

    //Glass Pane Blocks
    public static final RegistryObject<Item> COMPRESSED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_BLACK_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_BLACK_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_BLUE_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_BLUE_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_BROWN_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_BROWN_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_CYAN_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_CYAN_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_GRAY_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_GRAY_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_GREEN_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_GREEN_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_LIGHT_BLUE_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_LIGHT_BLUE_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_LIGHT_GRAY_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_LIGHT_GRAY_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_LIME_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_LIME_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_MAGENTA_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_MAGENTA_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_ORANGE_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_ORANGE_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_PINK_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_PINK_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_PURPLE_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_PURPLE_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_RED_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_RED_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_WHITE_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_WHITE_STAINED_GLASS_PANE);
    public static final RegistryObject<Item> COMPRESSED_YELLOW_STAINED_GLASS_PANE = fromBlock(BlockRegistration.COMPRESSED_YELLOW_STAINED_GLASS_PANE);

    //Obsidian
    public static final RegistryObject<Item> COMPRESSED_OBSIDIAN = fromBlock(BlockRegistration.COMPRESSED_OBSIDIAN);

    //Compressor
    public static final RegistryObject<Item> IRON_COMPRESSOR = fromBlock(BlockRegistration.IRON_COMPRESSOR);
    public static final RegistryObject<Item> GOLDEN_COMPRESSOR = fromBlock(BlockRegistration.GOLDEN_COMPRESSOR);
    public static final RegistryObject<Item> DIAMOND_COMPRESSOR = fromBlock(BlockRegistration.DIAMOND_COMPRESSOR);
    public static final RegistryObject<Item> NETHERITE_COMPRESSOR = fromBlock(BlockRegistration.NETHERITE_COMPRESSOR);

    public static final RegistryObject<Item> COMPRESSED_FLINT = ITEMS.register("compressed_flint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LEATHER = ITEMS.register("compressed_leather", () -> new Item(ITEM_PROPERTIES));

    //Ingots & Gems
    public static final RegistryObject<Item> COMPRESSED_RAW_IRON = ITEMS.register("compressed_raw_iron", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_IRON_INGOT = ITEMS.register("compressed_iron_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RAW_GOLD = ITEMS.register("compressed_raw_gold", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GOLD_INGOT = ITEMS.register("compressed_gold_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DIAMOND_GEM = ITEMS.register("compressed_diamond_gem", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RAW_COPPER = ITEMS.register("compressed_raw_copper", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COPPER_INGOT = ITEMS.register("compressed_copper_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COAL = ITEMS.register("compressed_coal", () -> new UcFuelItem(ITEM_PROPERTIES, 14400));
    public static final RegistryObject<Item> COMPRESSED_EMERALD_GEM = ITEMS.register("compressed_emerald_gem", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LAPIS = ITEMS.register("compressed_lapis", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_NETHERITE_INGOT = ITEMS.register("compressed_netherite_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_REDSTONE = ITEMS.register("compressed_redstone", () -> new Item(ITEM_PROPERTIES));

    //Nuggets
    public static final RegistryObject<Item> COMPRESSED_GOLD_NUGGET = ITEMS.register("compressed_gold_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_IRON_NUGGET = ITEMS.register("compressed_iron_nugget", () -> new Item(ITEM_PROPERTIES));

    //Arrows
    //Basic
    public static final RegistryObject<Item> COMPRESSED_ARROW = ITEMS.register("compressed_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
    public static final RegistryObject<EntityType<CompressedArrow>> COMPRESSED_ARROW_ENTITY = ENTITIES.register("compressed_arrow_entity", () ->
            EntityType.Builder.<CompressedArrow>of(CompressedArrow::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(new ResourceLocation(MODID, "compressed_arrow_entity").toString()));

    //Spectral
    public static final RegistryObject<Item> COMPRESSED_SPECTRAL_ARROW = ITEMS.register("compressed_spectral_arrow", () -> new UcSpectralArrowItem(ITEM_PROPERTIES, 1.5f));
    public static final RegistryObject<EntityType<CompressedSpectralArrow>> COMPRESSED_SPECTRAL_ARROW_ENTITY = ENTITIES.register("compressed_spectral_arrow_entity", () ->
            EntityType.Builder.<CompressedSpectralArrow>of(CompressedSpectralArrow::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(new ResourceLocation(MODID, "compressed_spectral_arrow_entity").toString()));

    //Snowball
    public static final RegistryObject<Item> COMPRESSED_SNOWBALL = ITEMS.register("compressed_snowball", () -> new UcSnowballItem(ITEM_PROPERTIES));
    public static final RegistryObject<EntityType<UcSnowball>> COMPRESSED_SNOWBALL_ENTITY = ENTITIES.register("compressed_snowball_entity", () ->
            EntityType.Builder.<UcSnowball>of(UcSnowball::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(new ResourceLocation(MODID, "compressed_snowball_entity").toString()));

    //Bucket of Compressed Powder Snow
    public static final RegistryObject<Item> COMPRESSED_POWDER_SNOW_BUCKET = ITEMS.register("compressed_powder_snow_bucket", () -> new SolidBucketItem(BlockRegistration.COMPRESSED_POWDER_SNOW.get(), SoundEvents.BUCKET_EMPTY_POWDER_SNOW, ITEM_PROPERTIES));

    //Nether Items
    public static final RegistryObject<Item> COMPRESSED_QUARTZ = ITEMS.register("compressed_quartz", () -> new Item(ITEM_PROPERTIES));

    public static final RegistryObject<Item> COMPRESSED_STICK = ITEMS.register("compressed_stick", () -> new Item(ITEM_PROPERTIES));



    private static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block)
    {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }

    private static <B extends Block> RegistryObject<Item> fromBlockFuelItem(RegistryObject<B> block, int burnTime)
    {
        return ITEMS.register(block.getId().getPath(), () -> new UcFuelBlockItem(block.get(), ITEM_PROPERTIES, burnTime));
    }
}