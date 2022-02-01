package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.blocks.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PumpkinBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class Registration
{
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITIES.register(bus);
        CONTAINERS.register(bus);
    }

    //Block & Item properties
    public static final BlockBehaviour.Properties ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final BlockBehaviour.Properties DEEPSLATE_ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(4.5f).requiresCorrectToolForDrops();
    public static final BlockBehaviour.Properties INGOT_BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops();
    public static final BlockBehaviour.Properties WOOD_BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.WOOD).strength(2f);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_COMPRESSION_TAB);

    //parentBlocks & Items
    //Ores
    public static final RegistryObject<Block> COMPRESSED_IRON_ORE = BLOCKS.register("compressed_iron_ore", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_IRON_ORE_ITEM = fromBlock(COMPRESSED_IRON_ORE);
    public static final RegistryObject<Block> COMPRESSED_GOLD_ORE = BLOCKS.register("compressed_gold_ore", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GOLD_ORE_ITEM = fromBlock(COMPRESSED_GOLD_ORE);
    public static final RegistryObject<Block> COMPRESSED_DIAMOND_ORE = BLOCKS.register("compressed_diamond_ore", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DIAMOND_ORE_ITEM = fromBlock(COMPRESSED_DIAMOND_ORE);
    public static final RegistryObject<Block> COMPRESSED_COPPER_ORE = BLOCKS.register("compressed_copper_ore", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COPPER_ORE_ITEM = fromBlock(COMPRESSED_COPPER_ORE);
    public static final RegistryObject<Block> COMPRESSED_COAL_ORE = BLOCKS.register("compressed_coal_ore", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COAL_ORE_ITEM = fromBlock(COMPRESSED_COAL_ORE);
    public static final RegistryObject<Block> COMPRESSED_EMERALD_ORE = BLOCKS.register("compressed_emerald_ore", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_EMERALD_ORE_ITEM = fromBlock(COMPRESSED_EMERALD_ORE);
    public static final RegistryObject<Block> COMPRESSED_LAPIS_ORE = BLOCKS.register("compressed_lapis_ore", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LAPIS_ORE_ITEM = fromBlock(COMPRESSED_LAPIS_ORE);
    public static final RegistryObject<Block> COMPRESSED_REDSTONE_ORE = BLOCKS.register("compressed_redstone_ore", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_REDSTONE_ORE_ITEM = fromBlock(COMPRESSED_REDSTONE_ORE);

    //Deepslate Ores
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_IRON_ORE = BLOCKS.register("compressed_deepslate_iron_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_IRON_ORE_ITEM = fromBlock(COMPRESSED_DEEPSLATE_IRON_ORE);
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_GOLD_ORE = BLOCKS.register("compressed_deepslate_gold_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_GOLD_ORE_ITEM = fromBlock(COMPRESSED_DEEPSLATE_GOLD_ORE);
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_DIAMOND_ORE = BLOCKS.register("compressed_deepslate_diamond_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_DIAMOND_ORE_ITEM = fromBlock(COMPRESSED_DEEPSLATE_DIAMOND_ORE);
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_COPPER_ORE = BLOCKS.register("compressed_deepslate_copper_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_COPPER_ORE_ITEM = fromBlock(COMPRESSED_DEEPSLATE_COPPER_ORE);
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_COAL_ORE = BLOCKS.register("compressed_deepslate_coal_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_COAL_ORE_ITEM = fromBlock(COMPRESSED_DEEPSLATE_COAL_ORE);
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_EMERALD_ORE = BLOCKS.register("compressed_deepslate_emerald_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_EMERALD_ORE_ITEM = fromBlock(COMPRESSED_DEEPSLATE_EMERALD_ORE);
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_LAPIS_ORE = BLOCKS.register("compressed_deepslate_lapis_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_LAPIS_ORE_ITEM = fromBlock(COMPRESSED_DEEPSLATE_LAPIS_ORE);
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_REDSTONE_ORE = BLOCKS.register("compressed_deepslate_redstone_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_REDSTONE_ORE_ITEM = fromBlock(COMPRESSED_DEEPSLATE_REDSTONE_ORE);

    //Ingot Blocks
    public static final RegistryObject<Block> COMPRESSED_IRON_BLOCK = BLOCKS.register("compressed_iron_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_IRON_BLOCK_ITEM = fromBlock(COMPRESSED_IRON_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_GOLD_BLOCK = BLOCKS.register("compressed_gold_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GOLD_BLOCK_ITEM = fromBlock(COMPRESSED_GOLD_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK = BLOCKS.register("compressed_diamond_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DIAMOND_BLOCK_ITEM = fromBlock(COMPRESSED_DIAMOND_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_COPPER_BLOCK = BLOCKS.register("compressed_copper_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COPPER_BLOCK_ITEM = fromBlock(COMPRESSED_COPPER_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_COAL_BLOCK = BLOCKS.register("compressed_coal_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COAL_BLOCK_ITEM = fromBlock(COMPRESSED_COAL_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_EMERALD_BLOCK = BLOCKS.register("compressed_emerald_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_EMERALD_BLOCK_ITEM = fromBlock(COMPRESSED_EMERALD_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_LAPIS_BLOCK = BLOCKS.register("compressed_lapis_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LAPIS_BLOCK_ITEM = fromBlock(COMPRESSED_LAPIS_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_NETHERITE_BLOCK = BLOCKS.register("compressed_netherite_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_NETHERITE_BLOCK_ITEM = fromBlock(COMPRESSED_NETHERITE_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_REDSTONE_BLOCK = BLOCKS.register("compressed_redstone_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_REDSTONE_BLOCK_ITEM = fromBlock(COMPRESSED_REDSTONE_BLOCK);

    //Raw Blocks
    public static final RegistryObject<Block> COMPRESSED_RAW_IRON_BLOCK = BLOCKS.register("compressed_raw_iron_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RAW_IRON_BLOCK_ITEM = fromBlock(COMPRESSED_RAW_IRON_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_RAW_GOLD_BLOCK = BLOCKS.register("compressed_raw_gold_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RAW_GOLD_BLOCK_ITEM = fromBlock(COMPRESSED_RAW_GOLD_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_RAW_COPPER_BLOCK = BLOCKS.register("compressed_raw_copper_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RAW_COPPER_BLOCK_ITEM = fromBlock(COMPRESSED_RAW_COPPER_BLOCK);

    //Basic Blocks
    public static final RegistryObject<Block> COMPRESSED_ANDESITE = BLOCKS.register("compressed_andesite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_ANDESITE_ITEM = fromBlock(COMPRESSED_ANDESITE);
    public static final RegistryObject<Block> COMPRESSED_CALCITE = BLOCKS.register("compressed_calcite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_CALCITE_ITEM = fromBlock(COMPRESSED_CALCITE);
    public static final RegistryObject<Block> COMPRESSED_COBBLED_DEEPSLATE = BLOCKS.register("compressed_cobbled_deepslate", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COBBLED_DEEPSLATE_ITEM = fromBlock(COMPRESSED_COBBLED_DEEPSLATE);
    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE = BLOCKS.register("compressed_cobblestone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COBBLESTONE_ITEM = fromBlock(COMPRESSED_COBBLESTONE);
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE = BLOCKS.register("compressed_deepslate", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DEEPSLATE_ITEM = fromBlock(COMPRESSED_DEEPSLATE);
    public static final RegistryObject<Block> COMPRESSED_DIORITE = BLOCKS.register("compressed_diorite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DIORITE_ITEM = fromBlock(COMPRESSED_DIORITE);
    public static final RegistryObject<Block> COMPRESSED_DIRT = BLOCKS.register("compressed_dirt", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DIRT_ITEM = fromBlock(COMPRESSED_DIRT);
    public static final RegistryObject<Block> COMPRESSED_GRANITE = BLOCKS.register("compressed_granite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GRANITE_ITEM = fromBlock(COMPRESSED_GRANITE);
    public static final RegistryObject<Block> COMPRESSED_GRAVEL = BLOCKS.register("compressed_gravel", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GRAVEL_ITEM = fromBlock(COMPRESSED_GRAVEL);
    public static final RegistryObject<Block> COMPRESSED_NETHERRACK = BLOCKS.register("compressed_netherrack", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_NETHERRACK_ITEM = fromBlock(COMPRESSED_NETHERRACK);
    public static final RegistryObject<Block> COMPRESSED_RED_SAND = BLOCKS.register("compressed_red_sand", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RED_SAND_ITEM = fromBlock(COMPRESSED_RED_SAND);
    public static final RegistryObject<Block> COMPRESSED_SAND = BLOCKS.register("compressed_sand", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_SAND_ITEM = fromBlock(COMPRESSED_SAND);
    public static final RegistryObject<Block> COMPRESSED_STONE = BLOCKS.register("compressed_stone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_STONE_ITEM = fromBlock(COMPRESSED_STONE);
    public static final RegistryObject<Block> COMPRESSED_TUFF = BLOCKS.register("compressed_tuff", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_TUFF_ITEM = fromBlock(COMPRESSED_TUFF);

    //Logs & Planks
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_ACACIA_LOG = BLOCKS.register("compressed_acacia_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_ACACIA_LOG_ITEM = fromBlock(COMPRESSED_ACACIA_LOG);
    public static final RegistryObject<Block> COMPRESSED_ACACIA_PLANKS = BLOCKS.register("compressed_acacia_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_ACACIA_PLANKS_ITEM = fromBlock(COMPRESSED_ACACIA_PLANKS);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_BIRCH_LOG = BLOCKS.register("compressed_birch_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BIRCH_LOG_ITEM = fromBlock(COMPRESSED_BIRCH_LOG);
    public static final RegistryObject<Block> COMPRESSED_BIRCH_PLANKS = BLOCKS.register("compressed_birch_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BIRCH_PLANKS_ITEM = fromBlock(COMPRESSED_BIRCH_PLANKS);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_DARK_OAK_LOG = BLOCKS.register("compressed_dark_oak_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DARK_OAK_LOG_ITEM = fromBlock(COMPRESSED_DARK_OAK_LOG);
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_PLANKS = BLOCKS.register("compressed_dark_oak_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DARK_OAK_PLANKS_ITEM = fromBlock(COMPRESSED_DARK_OAK_PLANKS);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_JUNGLE_LOG = BLOCKS.register("compressed_jungle_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_JUNGLE_LOG_ITEM = fromBlock(COMPRESSED_JUNGLE_LOG);
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_PLANKS = BLOCKS.register("compressed_jungle_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_JUNGLE_PLANKS_ITEM = fromBlock(COMPRESSED_JUNGLE_PLANKS);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_OAK_LOG = BLOCKS.register("compressed_oak_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_OAK_LOG_ITEM = fromBlock(COMPRESSED_OAK_LOG);
    public static final RegistryObject<Block> COMPRESSED_OAK_PLANKS = BLOCKS.register("compressed_oak_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_OAK_PLANKS_ITEM = fromBlock(COMPRESSED_OAK_PLANKS);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_SPRUCE_LOG = BLOCKS.register("compressed_spruce_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_SPRUCE_LOG_ITEM = fromBlock(COMPRESSED_SPRUCE_LOG);
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_PLANKS = BLOCKS.register("compressed_spruce_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_SPRUCE_PLANKS_ITEM = fromBlock(COMPRESSED_SPRUCE_PLANKS);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_CRIMSON_STEM = BLOCKS.register("compressed_crimson_stem", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_SPRUCE_CRIMSON_STEM_ITEM = fromBlock(COMPRESSED_CRIMSON_STEM);
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_PLANKS = BLOCKS.register("compressed_crimson_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_CRIMSON_PLANKS_ITEM = fromBlock(COMPRESSED_CRIMSON_PLANKS);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_WARPED_STEM = BLOCKS.register("compressed_warped_stem", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_WARPED_STEM_ITEM = fromBlock(COMPRESSED_WARPED_STEM);
    public static final RegistryObject<Block> COMPRESSED_WARPED_PLANKS = BLOCKS.register("compressed_warped_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_WARPED_PLANKS_ITEM = fromBlock(COMPRESSED_WARPED_PLANKS);

    //Only items
    public static final RegistryObject<Item> COMPRESSED_RAW_IRON = ITEMS.register("compressed_raw_iron", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_IRON_INGOT = ITEMS.register("compressed_iron_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RAW_GOLD = ITEMS.register("compressed_raw_gold", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GOLD_INGOT = ITEMS.register("compressed_gold_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DIAMOND_GEM = ITEMS.register("compressed_diamond_gem", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RAW_COPPER = ITEMS.register("compressed_raw_copper", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COPPER_INGOT = ITEMS.register("compressed_copper_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COAL = ITEMS.register("compressed_coal", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_EMERALD_GEM = ITEMS.register("compressed_emerald_gem", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LAPIS = ITEMS.register("compressed_lapis", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_NETHERITE_INGOT = ITEMS.register("compressed_netherite_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_REDSTONE = ITEMS.register("compressed_redstone", () -> new Item(ITEM_PROPERTIES));

    //Custom Tags
    //For ores that are multi-dimensional
    //public static final Tags.IOptionalNamedTag<Block> COMPRESSED_ORE = BlockTags.createOptional(new ResourceLocation(UltimateCompression.MODID, "compressed_ore"));
    //public static final Tags.IOptionalNamedTag<Item> COMPRESSED_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(UltimateCompression.MODID, "compressed_ore"));

    //Power generator
    public static final RegistryObject<PowergenBlock> ULTIMATE_POWERGEN = BLOCKS.register("ultimate_powergen", PowergenBlock::new);
    public static final RegistryObject<Item> ULTIMATE_POWERGEN_ITEM = fromBlock(ULTIMATE_POWERGEN);
    public static final RegistryObject<BlockEntityType<PowergenBE>> ULTIMATE_POWERGEN_BE = BLOCK_ENTITIES.register("ultimate_powergen", () -> BlockEntityType.Builder.of(PowergenBE::new, ULTIMATE_POWERGEN.get()).build(null));
    public static final RegistryObject<MenuType<PowergenContainer>> ULTIMATE_POWERGEN_CONTAINER = CONTAINERS.register("ultimate_powergen", () -> IForgeMenuType.create((windowId, inv, data) -> new PowergenContainer(windowId, data.readBlockPos(), inv, inv.player)));

    //Compressor
    public static final RegistryObject<CompressorBlock> COMPRESSOR = BLOCKS.register("compressor", CompressorBlock::new);
    public static final RegistryObject<Item> COMPRESSOR_ITEM = fromBlock(COMPRESSOR);
    public static final RegistryObject<BlockEntityType<CompressorBE>> COMPRESSOR_BE = BLOCK_ENTITIES.register("compressor", () -> BlockEntityType.Builder.of(CompressorBE::new, COMPRESSOR.get()).build(null));
    public static final RegistryObject<MenuType<CompressorContainer>> COMPRESSOR_CONTAINER = CONTAINERS.register("compressor", () -> IForgeMenuType.create((windowId, inv, data) -> new CompressorContainer(windowId, data.readBlockPos(), inv, inv.player)));
    public static final Tags.IOptionalNamedTag<Item> COMPRESSOR_VALID_ITEMS = ItemTags.createOptional(new ResourceLocation(UltimateCompression.MODID, "compressor_valid_items"));


    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block)
    {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
