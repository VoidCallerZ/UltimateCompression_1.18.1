package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.blocks.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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
    //IngotBlocks
    public static final RegistryObject<Block> COMPRESSED_IRON_BLOCK = BLOCKS.register("compressed_iron_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_IRON_BLOCK_ITEM = fromBlock(COMPRESSED_IRON_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_GOLD_BLOCK = BLOCKS.register("compressed_gold_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GOLD_BLOCK_ITEM = fromBlock(COMPRESSED_GOLD_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK = BLOCKS.register("compressed_diamond_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DIAMOND_BLOCK_ITEM = fromBlock(COMPRESSED_DIAMOND_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_COPPER_BLOCK = BLOCKS.register("compressed_copper_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COPPER_BLOCK_ITEM = fromBlock(COMPRESSED_COPPER_BLOCK);
    //RawBlocks
    public static final RegistryObject<Block> COMPRESSED_RAW_IRON_BLOCK = BLOCKS.register("compressed_raw_iron_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RAW_IRON_BLOCK_ITEM = fromBlock(COMPRESSED_RAW_IRON_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_RAW_GOLD_BLOCK = BLOCKS.register("compressed_raw_gold_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RAW_GOLD_BLOCK_ITEM = fromBlock(COMPRESSED_RAW_GOLD_BLOCK);
    public static final RegistryObject<Block> COMPRESSED_RAW_COPPER_BLOCK = BLOCKS.register("compressed_raw_copper_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RAW_COPPER_BLOCK_ITEM = fromBlock(COMPRESSED_RAW_COPPER_BLOCK);

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
