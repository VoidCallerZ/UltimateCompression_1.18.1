package com.VoidCallerZ.uc.setup;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class ToolRegistration
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    public static final Item.Properties WOODEN_TOOL_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(60 * 9);
    public static final Item.Properties STONE_TOOL_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(132 * 9);
    public static final Item.Properties IRON_TOOL_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(251 * 9);
    public static final Item.Properties GOLD_TOOL_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(33 * 9);
    public static final Item.Properties DIAMOND_TOOL_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(1562 * 9);
    public static final Item.Properties NETHERITE_TOOL_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(2032 * 9);

    //Tools
    //Pickaxes
    public static final RegistryObject<PickaxeItem> COMPRESSED_WOODEN_PICKAXE = ITEMS.register("compressed_wooden_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 2, -2.8f, WOODEN_TOOL_PROPERTIES));
    public static final RegistryObject<PickaxeItem> COMPRESSED_STONE_PICKAXE = ITEMS.register("compressed_stone_pickaxe",
            () -> new PickaxeItem(Tiers.STONE, 3, -2.8f, STONE_TOOL_PROPERTIES));
    public static final RegistryObject<PickaxeItem> COMPRESSED_IRON_PICKAXE = ITEMS.register("compressed_iron_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 4, -2.8f, IRON_TOOL_PROPERTIES));
    public static final RegistryObject<PickaxeItem> COMPRESSED_GOLD_PICKAXE = ITEMS.register("compressed_gold_pickaxe",
            () -> new PickaxeItem(Tiers.GOLD, 2, -2.8f, GOLD_TOOL_PROPERTIES));
    public static final RegistryObject<PickaxeItem> COMPRESSED_DIAMOND_PICKAXE = ITEMS.register("compressed_diamond_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 5, -2.8f, DIAMOND_TOOL_PROPERTIES));
    public static final RegistryObject<PickaxeItem> COMPRESSED_NETHERITE_PICKAXE = ITEMS.register("compressed_netherite_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, 6, -2.8f, NETHERITE_TOOL_PROPERTIES));
    //Axes
    public static final RegistryObject<AxeItem> COMPRESSED_WOODEN_AXE = ITEMS.register("compressed_wooden_axe",
            () -> new AxeItem(Tiers.WOOD, 2, -2.8f, WOODEN_TOOL_PROPERTIES));
    public static final RegistryObject<AxeItem> COMPRESSED_STONE_AXE = ITEMS.register("compressed_stone_axe",
            () -> new AxeItem(Tiers.STONE, 3, -2.8f, STONE_TOOL_PROPERTIES));
    public static final RegistryObject<AxeItem> COMPRESSED_IRON_AXE = ITEMS.register("compressed_iron_axe",
            () -> new AxeItem(Tiers.IRON, 4, -2.8f, IRON_TOOL_PROPERTIES));
    public static final RegistryObject<AxeItem> COMPRESSED_GOLD_AXE = ITEMS.register("compressed_gold_axe",
            () -> new AxeItem(Tiers.GOLD, 2, -2.8f, GOLD_TOOL_PROPERTIES));
    public static final RegistryObject<AxeItem> COMPRESSED_DIAMOND_AXE = ITEMS.register("compressed_diamond_axe",
            () -> new AxeItem(Tiers.DIAMOND, 5, -2.8f, DIAMOND_TOOL_PROPERTIES));
    public static final RegistryObject<AxeItem> COMPRESSED_NETHERITE_AXE = ITEMS.register("compressed_netherite_axe",
            () -> new AxeItem(Tiers.NETHERITE, 6, -2.8f, NETHERITE_TOOL_PROPERTIES));
    //Shovels
    public static final RegistryObject<ShovelItem> COMPRESSED_WOODEN_SHOVEL = ITEMS.register("compressed_wooden_shovel",
            () -> new ShovelItem(Tiers.WOOD, 2, -2.8f, WOODEN_TOOL_PROPERTIES));
    public static final RegistryObject<ShovelItem> COMPRESSED_STONE_SHOVEL = ITEMS.register("compressed_stone_shovel",
            () -> new ShovelItem(Tiers.STONE, 3, -2.8f, STONE_TOOL_PROPERTIES));
    public static final RegistryObject<ShovelItem> COMPRESSED_IRON_SHOVEL = ITEMS.register("compressed_iron_shovel",
            () -> new ShovelItem(Tiers.IRON, 4, -2.8f, IRON_TOOL_PROPERTIES));
    public static final RegistryObject<ShovelItem> COMPRESSED_GOLD_SHOVEL = ITEMS.register("compressed_gold_shovel",
            () -> new ShovelItem(Tiers.GOLD, 2, -2.8f, GOLD_TOOL_PROPERTIES));
    public static final RegistryObject<ShovelItem> COMPRESSED_DIAMOND_SHOVEL = ITEMS.register("compressed_diamond_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 5, -2.8f, DIAMOND_TOOL_PROPERTIES));
    public static final RegistryObject<ShovelItem> COMPRESSED_NETHERITE_SHOVEL = ITEMS.register("compressed_netherite_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, 6, -2.8f, NETHERITE_TOOL_PROPERTIES));
    //Swords
    public static final RegistryObject<SwordItem> COMPRESSED_WOODEN_SWORD = ITEMS.register("compressed_wooden_sword",
            () -> new SwordItem(Tiers.WOOD, 2, -2.8f, WOODEN_TOOL_PROPERTIES));
    public static final RegistryObject<SwordItem> COMPRESSED_STONE_SWORD = ITEMS.register("compressed_stone_sword",
            () -> new SwordItem(Tiers.STONE, 3, -2.8f, STONE_TOOL_PROPERTIES));
    public static final RegistryObject<SwordItem> COMPRESSED_IRON_SWORD = ITEMS.register("compressed_iron_sword",
            () -> new SwordItem(Tiers.IRON, 4, -2.8f, IRON_TOOL_PROPERTIES));
    public static final RegistryObject<SwordItem> COMPRESSED_GOLD_SWORD = ITEMS.register("compressed_gold_sword",
            () -> new SwordItem(Tiers.GOLD, 2, -2.8f, GOLD_TOOL_PROPERTIES));
    public static final RegistryObject<SwordItem> COMPRESSED_DIAMOND_SWORD = ITEMS.register("compressed_diamond_sword",
            () -> new SwordItem(Tiers.DIAMOND, 5, -2.8f, DIAMOND_TOOL_PROPERTIES));
    public static final RegistryObject<SwordItem> COMPRESSED_NETHERITE_SWORD = ITEMS.register("compressed_netherite_sword",
            () -> new SwordItem(Tiers.NETHERITE, 6, -2.8f, NETHERITE_TOOL_PROPERTIES));
    //Hoes
    public static final RegistryObject<HoeItem> COMPRESSED_WOODEN_HOE = ITEMS.register("compressed_wooden_hoe",
            () -> new HoeItem(Tiers.WOOD, 2, -2.8f, WOODEN_TOOL_PROPERTIES));
    public static final RegistryObject<HoeItem> COMPRESSED_STONE_HOE = ITEMS.register("compressed_stone_hoe",
            () -> new HoeItem(Tiers.STONE, 3, -2.8f, STONE_TOOL_PROPERTIES));
    public static final RegistryObject<HoeItem> COMPRESSED_IRON_HOE = ITEMS.register("compressed_iron_hoe",
            () -> new HoeItem(Tiers.IRON, 4, -2.8f, IRON_TOOL_PROPERTIES));
    public static final RegistryObject<HoeItem> COMPRESSED_GOLD_HOE = ITEMS.register("compressed_gold_hoe",
            () -> new HoeItem(Tiers.GOLD, 2, -2.8f, GOLD_TOOL_PROPERTIES));
    public static final RegistryObject<HoeItem> COMPRESSED_DIAMOND_HOE= ITEMS.register("compressed_diamond_hoe",
            () -> new HoeItem(Tiers.DIAMOND, 5, -2.8f, DIAMOND_TOOL_PROPERTIES));
    public static final RegistryObject<HoeItem> COMPRESSED_NETHERITE_HOE = ITEMS.register("compressed_netherite_hoe",
            () -> new HoeItem(Tiers.NETHERITE, 6, -2.8f, NETHERITE_TOOL_PROPERTIES));
}
