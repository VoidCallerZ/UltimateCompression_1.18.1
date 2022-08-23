package com.VoidCallerZ.uc.registration;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.blocks.*;
import com.VoidCallerZ.uc.blocks.compressor.diamond.DiamondCompressorBlock;
import com.VoidCallerZ.uc.blocks.compressor.diamond.DiamondCompressorBlockEntity;
import com.VoidCallerZ.uc.blocks.compressor.diamond.DiamondCompressorBlockMenu;
import com.VoidCallerZ.uc.blocks.compressor.gold.GoldenCompressorBlock;
import com.VoidCallerZ.uc.blocks.compressor.gold.GoldenCompressorBlockMenu;
import com.VoidCallerZ.uc.blocks.compressor.iron.IronCompressorBlock;
import com.VoidCallerZ.uc.blocks.compressor.gold.GoldenCompressorBlockEntity;
import com.VoidCallerZ.uc.blocks.compressor.iron.IronCompressorBlockEntity;
import com.VoidCallerZ.uc.blocks.compressor.iron.IronCompressorBlockMenu;
import com.VoidCallerZ.uc.blocks.compressor.netherite.NetheriteCompressorBlock;
import com.VoidCallerZ.uc.blocks.compressor.netherite.NetheriteCompressorBlockEntity;
import com.VoidCallerZ.uc.blocks.compressor.netherite.NetheriteCompressorBlockMenu;
import com.VoidCallerZ.uc.blocks.entity.UcSculkCatalystBlockEntity;
import com.VoidCallerZ.uc.blocks.glass.UcGlassBlock;
import com.VoidCallerZ.uc.blocks.glass.UcGlassPaneBlock;
import com.VoidCallerZ.uc.blocks.glass.UcStainedGlassBlock;
import com.VoidCallerZ.uc.blocks.glass.UcStainedGlassPaneBlock;
import com.VoidCallerZ.uc.setup.ModSetup;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class BlockRegistration
{
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MODID);

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
    public static final BlockBehaviour.Properties GLASS_BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f).sound(SoundType.GLASS).noOcclusion().isValidSpawn(BlockRegistration::never).isRedstoneConductor(BlockRegistration::never).isSuffocating(BlockRegistration::never).isViewBlocking(BlockRegistration::never);
    public static final BlockBehaviour.Properties OBSIDIAN_BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(50, 1200).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_COMPRESSION_TAB);

    public static final TagKey<Item> COMPRESSED_PLANKS_FOR_TOOLS = ItemTags.create(new ResourceLocation(UltimateCompression.MODID, "compressed_planks_for_tools"));
    public static final TagKey<Item> COMPRESSOR_VALID_ITEMS = ItemTags.create(new ResourceLocation(MODID, "compressor_valid_items"));

    public static final RegistryObject<Item> UC_ICON = ITEMS.register("uc_icon", () -> new Item(new Item.Properties()));

    //parentBlocks & Items
    //Ores
    public static final RegistryObject<Block> COMPRESSED_IRON_ORE = BLOCKS.register("compressed_iron_ore", () -> new UcOreBlock(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GOLD_ORE = BLOCKS.register("compressed_gold_ore", () -> new UcOreBlock(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DIAMOND_ORE = BLOCKS.register("compressed_diamond_ore", () -> new UcOreBlock(ORE_PROPERTIES, 5, 9));
    public static final RegistryObject<Block> COMPRESSED_COPPER_ORE = BLOCKS.register("compressed_copper_ore", () -> new UcOreBlock(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_COAL_ORE = BLOCKS.register("compressed_coal_ore", () -> new UcOreBlock(ORE_PROPERTIES, 2, 4));
    public static final RegistryObject<Block> COMPRESSED_EMERALD_ORE = BLOCKS.register("compressed_emerald_ore", () -> new UcOreBlock(ORE_PROPERTIES, 5, 9));
    public static final RegistryObject<Block> COMPRESSED_LAPIS_ORE = BLOCKS.register("compressed_lapis_ore", () -> new UcOreBlock(ORE_PROPERTIES, 4, 7));
    public static final RegistryObject<Block> COMPRESSED_REDSTONE_ORE = BLOCKS.register("compressed_redstone_ore", () -> new UcOreBlock(ORE_PROPERTIES, 4, 7));
    public static final RegistryObject<Block> COMPRESSED_NETHER_GOLD_ORE = BLOCKS.register("compressed_gold_nether_ore", () -> new UcOreBlock(NETHER_ORE_PROPERTIES, 2, 3));
    public static final RegistryObject<Block> COMPRESSED_NETHER_QUARTZ_ORE = BLOCKS.register("compressed_nether_quartz_ore", () -> new UcOreBlock(NETHER_ORE_PROPERTIES, 4, 7));

    //Deepslate Ores
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_IRON_ORE = BLOCKS.register("compressed_deepslate_iron_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_GOLD_ORE = BLOCKS.register("compressed_deepslate_gold_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_DIAMOND_ORE = BLOCKS.register("compressed_deepslate_diamond_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_COPPER_ORE = BLOCKS.register("compressed_deepslate_copper_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_COAL_ORE = BLOCKS.register("compressed_deepslate_coal_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_EMERALD_ORE = BLOCKS.register("compressed_deepslate_emerald_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_LAPIS_ORE = BLOCKS.register("compressed_deepslate_lapis_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE_REDSTONE_ORE = BLOCKS.register("compressed_deepslate_redstone_ore", () -> new Block(DEEPSLATE_ORE_PROPERTIES));

    //Ingot Blocks
    public static final RegistryObject<Block> COMPRESSED_IRON_BLOCK = BLOCKS.register("compressed_iron_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GOLD_BLOCK = BLOCKS.register("compressed_gold_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK = BLOCKS.register("compressed_diamond_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_COPPER_BLOCK = BLOCKS.register("compressed_copper_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_COAL_BLOCK = BLOCKS.register("compressed_coal_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_EMERALD_BLOCK = BLOCKS.register("compressed_emerald_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LAPIS_BLOCK = BLOCKS.register("compressed_lapis_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_NETHERITE_BLOCK = BLOCKS.register("compressed_netherite_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_REDSTONE_BLOCK = BLOCKS.register("compressed_redstone_block", () -> new Block(INGOT_BLOCK_PROPERTIES));


    //Raw Blocks
    public static final RegistryObject<Block> COMPRESSED_RAW_IRON_BLOCK = BLOCKS.register("compressed_raw_iron_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_RAW_GOLD_BLOCK = BLOCKS.register("compressed_raw_gold_block", () -> new Block(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_RAW_COPPER_BLOCK = BLOCKS.register("compressed_raw_copper_block", () -> new Block(INGOT_BLOCK_PROPERTIES));


    //Basic Blocks
    public static final RegistryObject<Block> COMPRESSED_ANDESITE = BLOCKS.register("compressed_andesite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CALCITE = BLOCKS.register("compressed_calcite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_COBBLED_DEEPSLATE = BLOCKS.register("compressed_cobbled_deepslate", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE = BLOCKS.register("compressed_cobblestone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DEEPSLATE = BLOCKS.register("compressed_deepslate", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DIORITE = BLOCKS.register("compressed_diorite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DIRT = BLOCKS.register("compressed_dirt", () -> new Block(SOFT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GRANITE = BLOCKS.register("compressed_granite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<GravelBlock> COMPRESSED_GRAVEL = BLOCKS.register("compressed_gravel", () -> new GravelBlock(SOFT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_NETHERRACK = BLOCKS.register("compressed_netherrack", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<SandBlock> COMPRESSED_RED_SAND = BLOCKS.register("compressed_red_sand", () -> new SandBlock(11690015, SOFT_BLOCK_PROPERTIES));
    public static final RegistryObject<SandBlock> COMPRESSED_SAND = BLOCKS.register("compressed_sand", () -> new SandBlock(14009494, SOFT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_STONE = BLOCKS.register("compressed_stone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_TUFF = BLOCKS.register("compressed_tuff", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CLAY = BLOCKS.register("compressed_clay", () -> new Block(SOFT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_MOSSY_COBBLESTONE = BLOCKS.register("compressed_mossy_cobblestone", () -> new Block(ORE_PROPERTIES));

    //Polished Blocks
    public static final RegistryObject<Block> COMPRESSED_POLISHED_ANDESITE = BLOCKS.register("compressed_polished_andesite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_POLISHED_BASALT = BLOCKS.register("compressed_polished_basalt", () -> new RotatedPillarBlock(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_POLISHED_BLACKSTONE = BLOCKS.register("compressed_polished_blackstone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("compressed_polished_blackstone_bricks", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_POLISHED_DEEPSLATE = BLOCKS.register("compressed_polished_deepslate", () -> new Block(DEEPSLATE_ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_POLISHED_DIORITE = BLOCKS.register("compressed_polished_diorite", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_POLISHED_GRANITE = BLOCKS.register("compressed_polished_granite", () -> new Block(ORE_PROPERTIES));

    //Smooth Blocks
    public static final RegistryObject<Block> COMPRESSED_SMOOTH_BASALT = BLOCKS.register("compressed_smooth_basalt", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_SMOOTH_STONE = BLOCKS.register("compressed_smooth_stone", () -> new Block(ORE_PROPERTIES));

    //Stone Bricks
    public static final RegistryObject<Block> COMPRESSED_CHISELED_STONE_BRICKS = BLOCKS.register("compressed_chiseled_stone_bricks", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CRACKED_STONE_BRICKS = BLOCKS.register("compressed_cracked_stone_bricks", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_MOSSY_STONE_BRICKS = BLOCKS.register("compressed_mossy_stone_bricks", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_STONE_BRICKS = BLOCKS.register("compressed_stone_bricks", () -> new Block(ORE_PROPERTIES));

    //Sandstone
    public static final RegistryObject<Block> COMPRESSED_CHISELED_RED_SANDSTONE = BLOCKS.register("compressed_chiseled_red_sandstone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CHISELED_SANDSTONE = BLOCKS.register("compressed_chiseled_sandstone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CUT_RED_SANDSTONE = BLOCKS.register("compressed_cut_red_sandstone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CUT_SANDSTONE = BLOCKS.register("compressed_cut_sandstone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_RED_SANDSTONE = BLOCKS.register("compressed_red_sandstone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_SANDSTONE = BLOCKS.register("compressed_sandstone", () -> new Block(ORE_PROPERTIES));

    //Nether Blocks
    public static final RegistryObject<Block> COMPRESSED_NETHER_QUARTZ_BLOCK = BLOCKS.register("compressed_nether_quartz_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)));
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_BASALT = BLOCKS.register("compressed_basalt", () -> new RotatedPillarBlock(ORE_PROPERTIES));
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_BLACKSTONE = BLOCKS.register("compressed_blackstone", () -> new RotatedPillarBlock(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CHISELED_POLISHED_BLACKSTONE = BLOCKS.register("compressed_chiseled_polished_blackstone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("compressed_cracked_polished_blackstone_bricks", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GILDED_BLACKSTONE = BLOCKS.register("compressed_gilded_blackstone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GLOWSTONE = BLOCKS.register("compressed_glowstone", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_MAGMA = BLOCKS.register("compressed_magma", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_SOUL_SAND = BLOCKS.register("compressed_soul_sand", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_SOUL_SOIL = BLOCKS.register("compressed_soul_soil", () -> new Block(ORE_PROPERTIES));

    //Logs & Planks
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_ACACIA_LOG = BLOCKS.register("compressed_acacia_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_ACACIA_PLANKS = BLOCKS.register("compressed_acacia_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_BIRCH_LOG = BLOCKS.register("compressed_birch_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BIRCH_PLANKS = BLOCKS.register("compressed_birch_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_DARK_OAK_LOG = BLOCKS.register("compressed_dark_oak_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_DARK_OAK_PLANKS = BLOCKS.register("compressed_dark_oak_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_JUNGLE_LOG = BLOCKS.register("compressed_jungle_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_JUNGLE_PLANKS = BLOCKS.register("compressed_jungle_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_OAK_LOG = BLOCKS.register("compressed_oak_log", ()-> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_OAK_PLANKS = BLOCKS.register("compressed_oak_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_SPRUCE_LOG = BLOCKS.register("compressed_spruce_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_SPRUCE_PLANKS = BLOCKS.register("compressed_spruce_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_CRIMSON_STEM = BLOCKS.register("compressed_crimson_stem", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CRIMSON_PLANKS = BLOCKS.register("compressed_crimson_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_WARPED_STEM = BLOCKS.register("compressed_warped_stem", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_WARPED_PLANKS = BLOCKS.register("compressed_warped_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_MANGROVE_LOG = BLOCKS.register("compressed_mangrove_log", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_MANGROVE_PLANKS = BLOCKS.register("compressed_mangrove_planks", () -> new Block(WOOD_BLOCK_PROPERTIES));
    public static final RegistryObject<RotatedPillarBlock> COMPRESSED_MANGROVE_ROOTS = BLOCKS.register("compressed_mangrove_roots", () -> new RotatedPillarBlock(WOOD_BLOCK_PROPERTIES));

    //Wool Blocks
    public static final RegistryObject<Block> COMPRESSED_BLACK_WOOL = BLOCKS.register("compressed_black_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BLUE_WOOL = BLOCKS.register("compressed_blue_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BROWN_WOOL = BLOCKS.register("compressed_brown_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CYAN_WOOL = BLOCKS.register("compressed_cyan_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GRAY_WOOL = BLOCKS.register("compressed_gray_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GREEN_WOOL = BLOCKS.register("compressed_green_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIGHT_BLUE_WOOL = BLOCKS.register("compressed_light_blue_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIGHT_GRAY_WOOL = BLOCKS.register("compressed_light_gray_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIME_WOOL = BLOCKS.register("compressed_lime_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_MAGENTA_WOOL = BLOCKS.register("compressed_magenta_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_ORANGE_WOOL = BLOCKS.register("compressed_orange_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_PINK_WOOL = BLOCKS.register("compressed_pink_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_PURPLE_WOOL = BLOCKS.register("compressed_purple_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_RED_WOOL = BLOCKS.register("compressed_red_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_WHITE_WOOL = BLOCKS.register("compressed_white_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_YELLOW_WOOL = BLOCKS.register("compressed_yellow_wool", () -> new Block(WOOL_BLOCK_PROPERTIES));

    //Concrete
    public static final RegistryObject<Block> COMPRESSED_BLACK_CONCRETE = BLOCKS.register("compressed_black_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BLUE_CONCRETE = BLOCKS.register("compressed_blue_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BROWN_CONCRETE = BLOCKS.register("compressed_brown_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CYAN_CONCRETE = BLOCKS.register("compressed_cyan_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GRAY_CONCRETE = BLOCKS.register("compressed_gray_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GREEN_CONCRETE = BLOCKS.register("compressed_green_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIGHT_BLUE_CONCRETE = BLOCKS.register("compressed_light_blue_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIGHT_GRAY_CONCRETE = BLOCKS.register("compressed_light_gray_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIME_CONCRETE = BLOCKS.register("compressed_lime_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_MAGENTA_CONCRETE = BLOCKS.register("compressed_magenta_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_ORANGE_CONCRETE = BLOCKS.register("compressed_orange_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_PINK_CONCRETE = BLOCKS.register("compressed_pink_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_PURPLE_CONCRETE = BLOCKS.register("compressed_purple_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_RED_CONCRETE = BLOCKS.register("compressed_red_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_WHITE_CONCRETE = BLOCKS.register("compressed_white_concrete", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_YELLOW_CONCRETE = BLOCKS.register("compressed_yellow_concrete", () -> new Block(ORE_PROPERTIES));

    //Concrete Powder
    public static final RegistryObject<Block> COMPRESSED_BLACK_CONCRETE_POWDER = BLOCKS.register("compressed_black_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BLUE_CONCRETE_POWDER = BLOCKS.register("compressed_blue_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BROWN_CONCRETE_POWDER = BLOCKS.register("compressed_brown_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CYAN_CONCRETE_POWDER = BLOCKS.register("compressed_cyan_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GRAY_CONCRETE_POWDER = BLOCKS.register("compressed_gray_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GREEN_CONCRETE_POWDER = BLOCKS.register("compressed_green_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIGHT_BLUE_CONCRETE_POWDER = BLOCKS.register("compressed_light_blue_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIGHT_GRAY_CONCRETE_POWDER = BLOCKS.register("compressed_light_gray_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIME_CONCRETE_POWDER = BLOCKS.register("compressed_lime_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_MAGENTA_CONCRETE_POWDER = BLOCKS.register("compressed_magenta_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_ORANGE_CONCRETE_POWDER = BLOCKS.register("compressed_orange_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_PINK_CONCRETE_POWDER = BLOCKS.register("compressed_pink_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_PURPLE_CONCRETE_POWDER = BLOCKS.register("compressed_purple_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_RED_CONCRETE_POWDER = BLOCKS.register("compressed_red_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_WHITE_CONCRETE_POWDER = BLOCKS.register("compressed_white_concrete_powder", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_YELLOW_CONCRETE_POWDER = BLOCKS.register("compressed_yellow_concrete_powder", () -> new Block(ORE_PROPERTIES));

    //Snow Blocks
    public static final RegistryObject<Block> COMPRESSED_SNOW_BLOCK = BLOCKS.register("compressed_snow_block", () -> new Block(SOFT_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_POWDER_SNOW = BLOCKS.register("compressed_powder_snow", () -> new UcPowderSnowBlock(BlockBehaviour.Properties.of(Material.POWDER_SNOW).strength(0.25F).sound(SoundType.POWDER_SNOW).dynamicShape()));

    //Sculk Blocks
    public static final RegistryObject<Block> COMPRESSED_SCULK_CATALYST = BLOCKS.register("compressed_sculk_catalyst", () -> new UcSculkCatalystBlock(SOFT_BLOCK_PROPERTIES));
    public static final RegistryObject<BlockEntityType<UcSculkCatalystBlockEntity>> COMPRESSED_SCULK_CATALYST_ENTITY = BLOCK_ENTITIES.register("compressed_sculk_catalyst_entity", () -> BlockEntityType.Builder.of(UcSculkCatalystBlockEntity::new, COMPRESSED_SCULK_CATALYST.get()).build(null));
    public static final RegistryObject<Block> COMPRESSED_SCULK = BLOCKS.register("compressed_sculk", () -> new SculkBlock(SOFT_BLOCK_PROPERTIES));

    //Glass Blocks
    public static final RegistryObject<Block> COMPRESSED_GLASS = BLOCKS.register("compressed_glass", () -> new UcGlassBlock(GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BLACK_STAINED_GLASS = BLOCKS.register("compressed_black_stained_glass", () -> new UcStainedGlassBlock(DyeColor.BLACK, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BLUE_STAINED_GLASS = BLOCKS.register("compressed_blue_stained_glass", () -> new UcStainedGlassBlock(DyeColor.BLUE, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BROWN_STAINED_GLASS = BLOCKS.register("compressed_brown_stained_glass", () -> new UcStainedGlassBlock(DyeColor.BROWN, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CYAN_STAINED_GLASS = BLOCKS.register("compressed_cyan_stained_glass", () -> new UcStainedGlassBlock(DyeColor.CYAN, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GRAY_STAINED_GLASS = BLOCKS.register("compressed_gray_stained_glass", () -> new UcStainedGlassBlock(DyeColor.GRAY, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GREEN_STAINED_GLASS = BLOCKS.register("compressed_green_stained_glass", () -> new UcStainedGlassBlock(DyeColor.GREEN, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIGHT_BLUE_STAINED_GLASS = BLOCKS.register("compressed_light_blue_stained_glass", () -> new UcStainedGlassBlock(DyeColor.LIGHT_BLUE, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIGHT_GRAY_STAINED_GLASS = BLOCKS.register("compressed_light_gray_stained_glass", () -> new UcStainedGlassBlock(DyeColor.LIGHT_GRAY, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIME_STAINED_GLASS = BLOCKS.register("compressed_lime_stained_glass", () -> new UcStainedGlassBlock(DyeColor.LIME, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_MAGENTA_STAINED_GLASS = BLOCKS.register("compressed_magenta_stained_glass", () -> new UcStainedGlassBlock(DyeColor.MAGENTA, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_ORANGE_STAINED_GLASS = BLOCKS.register("compressed_orange_stained_glass", () -> new UcStainedGlassBlock(DyeColor.ORANGE, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_PINK_STAINED_GLASS = BLOCKS.register("compressed_pink_stained_glass", () -> new UcStainedGlassBlock(DyeColor.PINK, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_PURPLE_STAINED_GLASS = BLOCKS.register("compressed_purple_stained_glass", () -> new UcStainedGlassBlock(DyeColor.PURPLE, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_RED_STAINED_GLASS = BLOCKS.register("compressed_red_stained_glass", () -> new UcStainedGlassBlock(DyeColor.RED, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_WHITE_STAINED_GLASS = BLOCKS.register("compressed_white_stained_glass", () -> new UcStainedGlassBlock(DyeColor.WHITE, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_YELLOW_STAINED_GLASS = BLOCKS.register("compressed_yellow_stained_glass", () -> new UcStainedGlassBlock(DyeColor.YELLOW, GLASS_BLOCK_PROPERTIES));

    //Glass Pane Blocks
    public static final RegistryObject<Block> COMPRESSED_GLASS_PANE = BLOCKS.register("compressed_glass_pane", () -> new UcGlassPaneBlock(GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BLACK_STAINED_GLASS_PANE = BLOCKS.register("compressed_black_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.BLACK, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BLUE_STAINED_GLASS_PANE = BLOCKS.register("compressed_blue_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.BLUE, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_BROWN_STAINED_GLASS_PANE = BLOCKS.register("compressed_brown_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.BROWN, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_CYAN_STAINED_GLASS_PANE = BLOCKS.register("compressed_cyan_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.CYAN, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GRAY_STAINED_GLASS_PANE = BLOCKS.register("compressed_gray_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.GRAY, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_GREEN_STAINED_GLASS_PANE = BLOCKS.register("compressed_green_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.GREEN, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIGHT_BLUE_STAINED_GLASS_PANE = BLOCKS.register("compressed_light_blue_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.LIGHT_BLUE, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIGHT_GRAY_STAINED_GLASS_PANE = BLOCKS.register("compressed_light_gray_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.LIGHT_GRAY, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_LIME_STAINED_GLASS_PANE = BLOCKS.register("compressed_lime_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.LIME, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_MAGENTA_STAINED_GLASS_PANE = BLOCKS.register("compressed_magenta_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.MAGENTA, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_ORANGE_STAINED_GLASS_PANE = BLOCKS.register("compressed_orange_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.ORANGE, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_PINK_STAINED_GLASS_PANE = BLOCKS.register("compressed_pink_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.PINK, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_PURPLE_STAINED_GLASS_PANE = BLOCKS.register("compressed_purple_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.PURPLE, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_RED_STAINED_GLASS_PANE = BLOCKS.register("compressed_red_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.RED, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_WHITE_STAINED_GLASS_PANE = BLOCKS.register("compressed_white_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.WHITE, GLASS_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> COMPRESSED_YELLOW_STAINED_GLASS_PANE = BLOCKS.register("compressed_yellow_stained_glass_pane", () -> new UcStainedGlassPaneBlock(DyeColor.YELLOW, GLASS_BLOCK_PROPERTIES));

    //Obsidian
    public static final RegistryObject<Block> COMPRESSED_OBSIDIAN = BLOCKS.register("compressed_obsidian", () -> new Block(OBSIDIAN_BLOCK_PROPERTIES));

    //Compressor
    //Iron Compressor
    public static final RegistryObject<IronCompressorBlock> IRON_COMPRESSOR = BLOCKS.register("iron_compressor", () -> new IronCompressorBlock(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<BlockEntityType<IronCompressorBlockEntity>> IRON_COMPRESSOR_BLOCK_ENTITY = BLOCK_ENTITIES.register("iron_compressor_block_entity", () -> BlockEntityType.Builder.of(IronCompressorBlockEntity::new, IRON_COMPRESSOR.get()).build(null));
    public static final RegistryObject<MenuType<IronCompressorBlockMenu>> IRON_COMPRESSOR_BLOCK_MENU = registerMenuType(IronCompressorBlockMenu::new, "iron_compressor_block_menu");

    //Golden Compressor
    public static final RegistryObject<GoldenCompressorBlock> GOLDEN_COMPRESSOR = BLOCKS.register("golden_compressor", () -> new GoldenCompressorBlock(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<BlockEntityType<GoldenCompressorBlockEntity>> GOLDEN_COMPRESSOR_BLOCK_ENTITY = BLOCK_ENTITIES.register("golden_compressor_block_entity", () -> BlockEntityType.Builder.of(GoldenCompressorBlockEntity::new, GOLDEN_COMPRESSOR.get()).build(null));
    public static final RegistryObject<MenuType<GoldenCompressorBlockMenu>> GOLDEN_COMPRESSOR_BLOCK_MENU = registerMenuType(GoldenCompressorBlockMenu::new, "golden_compressor_block_menu");

    //Diamond Compressor
    public static final RegistryObject<DiamondCompressorBlock> DIAMOND_COMPRESSOR = BLOCKS.register("diamond_compressor", () -> new DiamondCompressorBlock(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<BlockEntityType<DiamondCompressorBlockEntity>> DIAMOND_COMPRESSOR_BLOCK_ENTITY = BLOCK_ENTITIES.register("diamond_compressor_block_entity", () -> BlockEntityType.Builder.of(DiamondCompressorBlockEntity::new, DIAMOND_COMPRESSOR.get()).build(null));
    public static final RegistryObject<MenuType<DiamondCompressorBlockMenu>> DIAMOND_COMPRESSOR_BLOCK_MENU = registerMenuType(DiamondCompressorBlockMenu::new, "diamond_compressor_block_menu");

    //Netherite Compressor
    public static final RegistryObject<NetheriteCompressorBlock> NETHERITE_COMPRESSOR = BLOCKS.register("netherite_compressor", () -> new NetheriteCompressorBlock(INGOT_BLOCK_PROPERTIES));
    public static final RegistryObject<BlockEntityType<NetheriteCompressorBlockEntity>> NETHERITE_COMPRESSOR_BLOCK_ENTITY = BLOCK_ENTITIES.register("netherite_compressor_block_entity", () -> BlockEntityType.Builder.of(NetheriteCompressorBlockEntity::new, NETHERITE_COMPRESSOR.get()).build(null));
    public static final RegistryObject<MenuType<NetheriteCompressorBlockMenu>> NETHERITE_COMPRESSOR_BLOCK_MENU = registerMenuType(NetheriteCompressorBlockMenu::new, "netherite_compressor_block_menu");

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name)
    {
        return CONTAINERS.register(name, () -> IForgeMenuType.create(factory));
    }

    private static Boolean never(BlockState state, BlockGetter level, BlockPos pos, EntityType<?> entityType)
    {
        return false;
    }

    private static boolean never(BlockState state, BlockGetter level, BlockPos pos)
    {
        return false;
    }
}
