package com.VoidCallerZ.uc.setup.registration;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.blocks.CompressorBlock;
import com.VoidCallerZ.uc.blocks.UcFuelBlockItem;
import com.VoidCallerZ.uc.blocks.entity.custom.CompressorBlockEntity;
import com.VoidCallerZ.uc.blocks.machines.*;
import com.VoidCallerZ.uc.blocks.screen.CompressorBlockMenu;
import com.VoidCallerZ.uc.items.UcFuelItem;
import com.VoidCallerZ.uc.setup.ModSetup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class Registration
{
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
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
    public static final BlockBehaviour.Properties NETHER_ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(3).requiresCorrectToolForDrops();
    public static final BlockBehaviour.Properties INGOT_BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops();
    public static final BlockBehaviour.Properties WOOD_BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.WOOD).strength(2f);
    public static final BlockBehaviour.Properties SOFT_BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.DIRT).strength(0.5f);
    public static final BlockBehaviour.Properties WOOL_BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.WOOL).strength(0.8f);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_COMPRESSION_TAB);

    public static final TagKey<Item> COMPRESSED_PLANKS_FOR_TOOLS = ItemTags.create(new ResourceLocation(UltimateCompression.MODID, "compressed_planks_for_tools"));

    public static final RegistryObject<Item> UC_ICON = ITEMS.register("uc_icon", () -> new Item(new Item.Properties()));

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
    public static final RegistryObject<Block> COMPRESSED_NETHER_GOLD_ORE = BLOCKS.register("compressed_gold_nether_ore", () -> new Block(NETHER_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_NETHER_GOLD_ORE_ITEM = fromBlock(COMPRESSED_NETHER_GOLD_ORE);
    public static final RegistryObject<Block> COMPRESSED_NETHER_QUARTZ_ORE = BLOCKS.register("compressed_nether_quartz_ore", () -> new Block(NETHER_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_NETHER_QUARTZ_ORE_ITEM = fromBlock(COMPRESSED_NETHER_QUARTZ_ORE);

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
    public static final RegistryObject<Item> COMPRESSED_COAL_BLOCK_ITEM = fromBlockFuelItem(COMPRESSED_COAL_BLOCK, 144000);
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
    public static final RegistryObject<Block> COMPRESSED_DIRT = BLOCKS.register("compressed_dirt", () -> new Block(SOFT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DIRT_ITEM = fromBlock(COMPRESSED_DIRT);
    public static final RegistryObject<Block> COMPRESSED_GRANITE = BLOCKS.register("compressed_granite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GRANITE_ITEM = fromBlock(COMPRESSED_GRANITE);
    public static final RegistryObject<GravelBlock> COMPRESSED_GRAVEL = BLOCKS.register("compressed_gravel", () -> new GravelBlock(SOFT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GRAVEL_ITEM = fromBlock(COMPRESSED_GRAVEL);
    public static final RegistryObject<Block> COMPRESSED_NETHERRACK = BLOCKS.register("compressed_netherrack", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_NETHERRACK_ITEM = fromBlock(COMPRESSED_NETHERRACK);
    public static final RegistryObject<SandBlock> COMPRESSED_RED_SAND = BLOCKS.register("compressed_red_sand", () -> new SandBlock(11690015, SOFT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RED_SAND_ITEM = fromBlock(COMPRESSED_RED_SAND);
    public static final RegistryObject<SandBlock> COMPRESSED_SAND = BLOCKS.register("compressed_sand", () -> new SandBlock(14009494, SOFT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_SAND_ITEM = fromBlock(COMPRESSED_SAND);
    public static final RegistryObject<Block> COMPRESSED_STONE = BLOCKS.register("compressed_stone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_STONE_ITEM = fromBlock(COMPRESSED_STONE);
    public static final RegistryObject<Block> COMPRESSED_TUFF = BLOCKS.register("compressed_tuff", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_TUFF_ITEM = fromBlock(COMPRESSED_TUFF);
    public static final RegistryObject<Block> COMPRESSED_CLAY = BLOCKS.register("compressed_clay", () -> new Block(SOFT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_CLAY_ITEM = fromBlock(COMPRESSED_CLAY);

    //Polished Blocks
    public static final RegistryObject<Block> COMPRESSED_POLISHED_ANDESITE = BLOCKS.register("compressed_polished_andesite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_POLISHED_ANDESITE_ITEM = fromBlock(COMPRESSED_POLISHED_ANDESITE);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_POLISHED_BASALT = BLOCKS.register("compressed_polished_basalt", () -> new RotatedPillarBlock(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_POLISHED_BASALT_ITEM = fromBlock(COMPRESSED_POLISHED_BASALT);
    public static final RegistryObject<Block> COMPRESSED_POLISHED_BLACKSTONE = BLOCKS.register("compressed_polished_blackstone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_POLISHED_BLACKSTONE_ITEM = fromBlock(COMPRESSED_POLISHED_BLACKSTONE);
    public static final RegistryObject<Block> COMPRESSED_POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("compressed_polished_blackstone_bricks", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_POLISHED_BLACKSTONE_BRICKS_ITEM = fromBlock(COMPRESSED_POLISHED_BLACKSTONE_BRICKS);
    public static final RegistryObject<Block> COMPRESSED_POLISHED_DEEPSLATE = BLOCKS.register("compressed_polished_deepslate", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_POLISHED_DEEPSLATE_ITEM = fromBlock(COMPRESSED_POLISHED_DEEPSLATE);
    public static final RegistryObject<Block> COMPRESSED_POLISHED_DIORITE = BLOCKS.register("compressed_polished_diorite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_POLISHED_DIORITE_ITEM = fromBlock(COMPRESSED_POLISHED_DIORITE);
    public static final RegistryObject<Block> COMPRESSED_POLISHED_GRANITE = BLOCKS.register("compressed_polished_granite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_POLISHED_GRANITE_ITEM = fromBlock(COMPRESSED_POLISHED_GRANITE);

    //Smooth Blocks
    public static final RegistryObject<Block> COMPRESSED_SMOOTH_STONE = BLOCKS.register("compressed_smooth_stone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_SMOOTH_BASALT = BLOCKS.register("compressed_smooth_basalt", () -> new Block(ORE_PROPERTIES));

    //Nether Blocks
    public static final RegistryObject<Block> COMPRESSED_NETHER_QUARTZ_BLOCK = BLOCKS.register("compressed_nether_quartz_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)));
    public static final RegistryObject<Item> COMPRESSED_NETHER_QUARTZ_BLOCK_ITEM = fromBlock(COMPRESSED_NETHER_QUARTZ_BLOCK);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_BASALT = BLOCKS.register("compressed_basalt", () -> new RotatedPillarBlock(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BASALT_ITEM = fromBlock(COMPRESSED_BASALT);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_BLACKSTONE = BLOCKS.register("compressed_blackstone", () -> new RotatedPillarBlock(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BLACKSTONE_ITEM = fromBlock(COMPRESSED_BLACKSTONE);
    public static final RegistryObject<Block> COMPRESSED_GLOWSTONE = BLOCKS.register("compressed_glowstone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GLOWSTONE_ITEM = fromBlock(COMPRESSED_GLOWSTONE);
    public static final RegistryObject<Block> COMPRESSED_MAGMA = BLOCKS.register("compressed_magma", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_MAGMA_ITEM = fromBlock(COMPRESSED_MAGMA);
    public static final RegistryObject<Block> COMPRESSED_SOUL_SAND = BLOCKS.register("compressed_soul_sand", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_SOUL_SAND_ITEM = fromBlock(COMPRESSED_SOUL_SAND);
    public static final RegistryObject<Block> COMPRESSED_SOUL_SOIL = BLOCKS.register("compressed_soul_soil", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_SOUL_SOIL_ITEM = fromBlock(COMPRESSED_SOUL_SOIL);

    //Logs & Planks
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_ACACIA_LOG = BLOCKS.register("compressed_acacia_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_ACACIA_LOG_ITEM = fromBlockFuelItem(COMPRESSED_ACACIA_LOG, 2700);
    public static final RegistryObject<Block> COMPRESSED_ACACIA_PLANKS = BLOCKS.register("compressed_acacia_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_ACACIA_PLANKS_ITEM = fromBlockFuelItem(COMPRESSED_ACACIA_PLANKS, 2700);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_BIRCH_LOG = BLOCKS.register("compressed_birch_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BIRCH_LOG_ITEM = fromBlockFuelItem(COMPRESSED_BIRCH_LOG, 2700);
    public static final RegistryObject<Block> COMPRESSED_BIRCH_PLANKS = BLOCKS.register("compressed_birch_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BIRCH_PLANKS_ITEM = fromBlockFuelItem(COMPRESSED_BIRCH_PLANKS, 2700);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_DARK_OAK_LOG = BLOCKS.register("compressed_dark_oak_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DARK_OAK_LOG_ITEM = fromBlockFuelItem(COMPRESSED_DARK_OAK_LOG, 2700);
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_PLANKS = BLOCKS.register("compressed_dark_oak_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DARK_OAK_PLANKS_ITEM = fromBlockFuelItem(COMPRESSED_DARK_OAK_PLANKS, 2700);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_JUNGLE_LOG = BLOCKS.register("compressed_jungle_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_JUNGLE_LOG_ITEM = fromBlockFuelItem(COMPRESSED_JUNGLE_LOG, 2700);
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_PLANKS = BLOCKS.register("compressed_jungle_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_JUNGLE_PLANKS_ITEM = fromBlockFuelItem(COMPRESSED_JUNGLE_PLANKS, 2700);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_OAK_LOG = BLOCKS.register("compressed_oak_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_OAK_LOG_ITEM = fromBlockFuelItem(COMPRESSED_OAK_LOG, 2700);
    public static final RegistryObject<Block> COMPRESSED_OAK_PLANKS = BLOCKS.register("compressed_oak_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_OAK_PLANKS_ITEM = fromBlockFuelItem(COMPRESSED_OAK_PLANKS, 2700);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_SPRUCE_LOG = BLOCKS.register("compressed_spruce_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_SPRUCE_LOG_ITEM = fromBlockFuelItem(COMPRESSED_SPRUCE_LOG, 2700);
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_PLANKS = BLOCKS.register("compressed_spruce_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_SPRUCE_PLANKS_ITEM = fromBlockFuelItem(COMPRESSED_SPRUCE_PLANKS, 2700);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_CRIMSON_STEM = BLOCKS.register("compressed_crimson_stem", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_SPRUCE_CRIMSON_STEM_ITEM = fromBlockFuelItem(COMPRESSED_CRIMSON_STEM, 2700);
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_PLANKS = BLOCKS.register("compressed_crimson_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_CRIMSON_PLANKS_ITEM = fromBlockFuelItem(COMPRESSED_CRIMSON_PLANKS, 2700);
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_WARPED_STEM = BLOCKS.register("compressed_warped_stem", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_WARPED_STEM_ITEM = fromBlockFuelItem(COMPRESSED_WARPED_STEM, 2700);
    public static final RegistryObject<Block> COMPRESSED_WARPED_PLANKS = BLOCKS.register("compressed_warped_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_WARPED_PLANKS_ITEM = fromBlockFuelItem(COMPRESSED_WARPED_PLANKS, 2700);

    //Wool Blocks
    public static final RegistryObject<Block> COMPRESSED_BLACK_WOOL = BLOCKS.register("compressed_black_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BLACK_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_BLACK_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_BLUE_WOOL = BLOCKS.register("compressed_blue_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BLUE_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_BLUE_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_BROWN_WOOL = BLOCKS.register("compressed_brown_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BROWN_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_BROWN_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_CYAN_WOOL = BLOCKS.register("compressed_cyan_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_CYAN_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_CYAN_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_GRAY_WOOL = BLOCKS.register("compressed_gray_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GRAY_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_GRAY_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_GREEN_WOOL = BLOCKS.register("compressed_green_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GREEN_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_GREEN_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_LIGHT_BLUE_WOOL = BLOCKS.register("compressed_light_blue_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LIGHT_BLUE_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_LIGHT_BLUE_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_LIGHT_GRAY_WOOL = BLOCKS.register("compressed_light_gray_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LIGHT_GRAY_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_LIGHT_GRAY_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_LIME_WOOL = BLOCKS.register("compressed_lime_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LIME_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_LIME_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_MAGENTA_WOOL = BLOCKS.register("compressed_magenta_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_MAGENTA_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_MAGENTA_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_ORANGE_WOOL = BLOCKS.register("compressed_orange_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_ORANGE_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_ORANGE_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_PINK_WOOL = BLOCKS.register("compressed_pink_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_PINK_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_PINK_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_PURPLE_WOOL = BLOCKS.register("compressed_purple_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_PURPLE_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_PURPLE_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_RED_WOOL = BLOCKS.register("compressed_red_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RED_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_RED_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_WHITE_WOOL = BLOCKS.register("compressed_white_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_WHITE_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_WHITE_WOOL, 200);
    public static final RegistryObject<Block> COMPRESSED_YELLOW_WOOL = BLOCKS.register("compressed_yellow_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_YELLOW_WOOL_ITEM = fromBlockFuelItem(COMPRESSED_YELLOW_WOOL, 200);

    //Concrete
    public static final RegistryObject<Block> COMPRESSED_BLACK_CONCRETE = BLOCKS.register("compressed_black_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BLACK_CONCRETE_ITEM = fromBlock(COMPRESSED_BLACK_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_BLUE_CONCRETE = BLOCKS.register("compressed_blue_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BLUE_CONCRETE_ITEM = fromBlock(COMPRESSED_BLUE_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_BROWN_CONCRETE = BLOCKS.register("compressed_brown_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BROWN_CONCRETE_ITEM = fromBlock(COMPRESSED_BROWN_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_CYAN_CONCRETE = BLOCKS.register("compressed_cyan_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_CYAN_CONCRETE_ITEM = fromBlock(COMPRESSED_CYAN_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_GRAY_CONCRETE = BLOCKS.register("compressed_gray_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GRAY_CONCRETE_ITEM = fromBlock(COMPRESSED_GRAY_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_GREEN_CONCRETE = BLOCKS.register("compressed_green_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GREEN_CONCRETE_ITEM = fromBlock(COMPRESSED_GREEN_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_LIGHT_BLUE_CONCRETE = BLOCKS.register("compressed_light_blue_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LIGHT_BLUE_CONCRETE_ITEM = fromBlock(COMPRESSED_LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_LIGHT_GRAY_CONCRETE = BLOCKS.register("compressed_light_gray_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LIGHT_GRAY_CONCRETE_ITEM = fromBlock(COMPRESSED_LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_LIME_CONCRETE = BLOCKS.register("compressed_lime_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LIME_CONCRETE_ITEM = fromBlock(COMPRESSED_LIME_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_MAGENTA_CONCRETE = BLOCKS.register("compressed_magenta_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_MAGENTA_CONCRETE_ITEM = fromBlock(COMPRESSED_MAGENTA_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_ORANGE_CONCRETE = BLOCKS.register("compressed_orange_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_ORANGE_CONCRETE_ITEM = fromBlock(COMPRESSED_ORANGE_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_PINK_CONCRETE = BLOCKS.register("compressed_pink_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_PINK_CONCRETE_ITEM = fromBlock(COMPRESSED_PINK_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_PURPLE_CONCRETE = BLOCKS.register("compressed_purple_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_PURPLE_CONCRETE_ITEM = fromBlock(COMPRESSED_PURPLE_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_RED_CONCRETE = BLOCKS.register("compressed_red_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RED_CONCRETE_ITEM = fromBlock(COMPRESSED_RED_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_WHITE_CONCRETE = BLOCKS.register("compressed_white_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_WHITE_CONCRETE_ITEM = fromBlock(COMPRESSED_WHITE_CONCRETE);
    public static final RegistryObject<Block> COMPRESSED_YELLOW_CONCRETE = BLOCKS.register("compressed_yellow_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_YELLOW_CONCRETE_ITEM = fromBlock(COMPRESSED_YELLOW_CONCRETE);

    //Concrete Powder
    public static final RegistryObject<Block> COMPRESSED_BLACK_CONCRETE_POWDER = BLOCKS.register("compressed_black_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BLACK_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_BLACK_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_BLUE_CONCRETE_POWDER = BLOCKS.register("compressed_blue_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BLUE_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_BLUE_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_BROWN_CONCRETE_POWDER = BLOCKS.register("compressed_brown_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_BROWN_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_BROWN_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_CYAN_CONCRETE_POWDER = BLOCKS.register("compressed_cyan_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_CYAN_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_CYAN_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_GRAY_CONCRETE_POWDER = BLOCKS.register("compressed_gray_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GRAY_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_GRAY_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_GREEN_CONCRETE_POWDER = BLOCKS.register("compressed_green_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GREEN_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_GREEN_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER = BLOCKS.register("compressed_light_blue_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER = BLOCKS.register("compressed_light_gray_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_LIME_CONCRETE_POWDER = BLOCKS.register("compressed_lime_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LIME_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_LIME_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_MAGENTA_CONCRETE_POWDER = BLOCKS.register("compressed_magenta_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_MAGENTA_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_MAGENTA_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_ORANGE_CONCRETE_POWDER = BLOCKS.register("compressed_orange_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_ORANGE_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_ORANGE_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_PINK_CONCRETE_POWDER = BLOCKS.register("compressed_pink_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_PINK_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_PINK_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_PURPLE_CONCRETE_POWDER = BLOCKS.register("compressed_purple_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_PURPLE_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_PURPLE_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_RED_CONCRETE_POWDER = BLOCKS.register("compressed_red_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RED_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_RED_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_WHITE_CONCRETE_POWDER = BLOCKS.register("compressed_white_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_WHITE_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_WHITE_CONCRETE_POWDER);
    public static final RegistryObject<Block> COMPRESSED_YELLOW_CONCRETE_POWDER = BLOCKS.register("compressed_yellow_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_YELLOW_CONCRETE_POWDER_ITEM = fromBlock(COMPRESSED_YELLOW_CONCRETE_POWDER);

    //Only items
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

    //Power generator
    public static final RegistryObject<PowergenBlock> ULTIMATE_POWERGEN = BLOCKS.register("ultimate_powergen", PowergenBlock::new);
    public static final RegistryObject<Item> ULTIMATE_POWERGEN_ITEM = fromBlock(ULTIMATE_POWERGEN);
    public static final RegistryObject<BlockEntityType<PowergenBE>> ULTIMATE_POWERGEN_BE = BLOCK_ENTITIES.register("ultimate_powergen", () -> BlockEntityType.Builder.of(PowergenBE::new, ULTIMATE_POWERGEN.get()).build(null));
    public static final RegistryObject<MenuType<PowergenContainer>> ULTIMATE_POWERGEN_CONTAINER = CONTAINERS.register("ultimate_powergen", () -> IForgeMenuType.create((windowId, inv, data) -> new PowergenContainer(windowId, data.readBlockPos(), inv, inv.player)));

    //Compressor
    public static final RegistryObject<CompressorBlock> COMPRESSOR = BLOCKS.register("compressor", () -> new CompressorBlock(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSOR_ITEM = fromBlock(COMPRESSOR);
    public static final RegistryObject<BlockEntityType<CompressorBlockEntity>> COMPRESSOR_BLOCK_ENTITY = BLOCK_ENTITIES.register("compressor_block_entity", () -> BlockEntityType.Builder.of(CompressorBlockEntity::new, COMPRESSOR.get()).build(null));
    public static final RegistryObject<MenuType<CompressorBlockMenu>> COMPRESSOR_BLOCK_MENU = registerMenuType(CompressorBlockMenu::new, "compressor_block_menu");

    public static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name)
    {
        return CONTAINERS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block)
    {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }

    public static <B extends Block> RegistryObject<Item> fromBlockFuelItem(RegistryObject<B> block, int burnTime)
    {
        return ITEMS.register(block.getId().getPath(), () -> new UcFuelBlockItem(block.get(), ITEM_PROPERTIES, burnTime));
    }
}
