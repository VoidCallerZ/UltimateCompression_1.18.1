package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.blocks.PowergenBlock;
import com.VoidCallerZ.uc.blocks.PowergenBlockEntity;
import com.VoidCallerZ.uc.blocks.PowergenContainer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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
    public static final RegistryObject<BlockEntityType<PowergenBlockEntity>> ULTIMATE_POWERGEN_BE = BLOCK_ENTITIES.register("ultimate_powergen", () -> BlockEntityType.Builder.of(PowergenBlockEntity::new, ULTIMATE_POWERGEN.get()).build(null));
    public static final RegistryObject<MenuType<PowergenContainer>> ULTIMATE_POWERGEN_CONTAINER = CONTAINERS.register("ultimate_powergen", () -> IForgeMenuType.create((windowId, inv, data) -> new PowergenContainer(windowId, data.readBlockPos(), inv, inv.player)));

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block)
    {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
