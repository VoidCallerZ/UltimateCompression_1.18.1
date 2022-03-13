package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.items.tools.*;
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
            () -> new UcPickaxeItem(Tiers.WOOD, 3, 1.1f, WOODEN_TOOL_PROPERTIES));
    public static final RegistryObject<PickaxeItem> COMPRESSED_STONE_PICKAXE = ITEMS.register("compressed_stone_pickaxe",
            () -> new UcPickaxeItem(Tiers.STONE, 4, 1.1f, STONE_TOOL_PROPERTIES));
    public static final RegistryObject<PickaxeItem> COMPRESSED_IRON_PICKAXE = ITEMS.register("compressed_iron_pickaxe",
            () -> new UcPickaxeItem(Tiers.IRON, 5, 1.1f, IRON_TOOL_PROPERTIES));
    public static final RegistryObject<PickaxeItem> COMPRESSED_GOLD_PICKAXE = ITEMS.register("compressed_gold_pickaxe",
            () -> new UcPickaxeItem(Tiers.GOLD, 3, 1.1f, GOLD_TOOL_PROPERTIES));
    public static final RegistryObject<PickaxeItem> COMPRESSED_DIAMOND_PICKAXE = ITEMS.register("compressed_diamond_pickaxe",
            () -> new UcPickaxeItem(Tiers.DIAMOND, 6, 1.1f, DIAMOND_TOOL_PROPERTIES));
    public static final RegistryObject<PickaxeItem> COMPRESSED_NETHERITE_PICKAXE = ITEMS.register("compressed_netherite_pickaxe",
            () -> new UcPickaxeItem(Tiers.NETHERITE, 7, 1.1f, NETHERITE_TOOL_PROPERTIES));
    //Axes
    public static final RegistryObject<AxeItem> COMPRESSED_WOODEN_AXE = ITEMS.register("compressed_wooden_axe",
            () -> new UcAxeItem(Tiers.WOOD, 5, 0.7f, WOODEN_TOOL_PROPERTIES));
    public static final RegistryObject<AxeItem> COMPRESSED_STONE_AXE = ITEMS.register("compressed_stone_axe",
            () -> new UcAxeItem(Tiers.STONE, 6, 0.7f, STONE_TOOL_PROPERTIES));
    public static final RegistryObject<AxeItem> COMPRESSED_IRON_AXE = ITEMS.register("compressed_iron_axe",
            () -> new UcAxeItem(Tiers.IRON, 7, 0.8f, IRON_TOOL_PROPERTIES));
    public static final RegistryObject<AxeItem> COMPRESSED_GOLD_AXE = ITEMS.register("compressed_gold_axe",
            () -> new UcAxeItem(Tiers.GOLD, 8, 0.9f, GOLD_TOOL_PROPERTIES));
    public static final RegistryObject<AxeItem> COMPRESSED_DIAMOND_AXE = ITEMS.register("compressed_diamond_axe",
            () -> new UcAxeItem(Tiers.DIAMOND, 9, 0.9f, DIAMOND_TOOL_PROPERTIES));
    public static final RegistryObject<AxeItem> COMPRESSED_NETHERITE_AXE = ITEMS.register("compressed_netherite_axe",
            () -> new UcAxeItem(Tiers.NETHERITE, 6, 0.9f, NETHERITE_TOOL_PROPERTIES));
    //Shovels
    public static final RegistryObject<ShovelItem> COMPRESSED_WOODEN_SHOVEL = ITEMS.register("compressed_wooden_shovel",
            () -> new UcShovelItem(Tiers.WOOD, 3, 0.9f, WOODEN_TOOL_PROPERTIES));
    public static final RegistryObject<ShovelItem> COMPRESSED_STONE_SHOVEL = ITEMS.register("compressed_stone_shovel",
            () -> new UcShovelItem(Tiers.STONE, 4, 0.9f, STONE_TOOL_PROPERTIES));
    public static final RegistryObject<ShovelItem> COMPRESSED_IRON_SHOVEL = ITEMS.register("compressed_iron_shovel",
            () -> new UcShovelItem(Tiers.IRON, 5, 0.9f, IRON_TOOL_PROPERTIES));
    public static final RegistryObject<ShovelItem> COMPRESSED_GOLD_SHOVEL = ITEMS.register("compressed_gold_shovel",
            () -> new UcShovelItem(Tiers.GOLD, 3, 0.9f, GOLD_TOOL_PROPERTIES));
    public static final RegistryObject<ShovelItem> COMPRESSED_DIAMOND_SHOVEL = ITEMS.register("compressed_diamond_shovel",
            () -> new UcShovelItem(Tiers.DIAMOND, 6, 0.9f, DIAMOND_TOOL_PROPERTIES));
    public static final RegistryObject<ShovelItem> COMPRESSED_NETHERITE_SHOVEL = ITEMS.register("compressed_netherite_shovel",
            () -> new UcShovelItem(Tiers.NETHERITE, 7, 0.9f, NETHERITE_TOOL_PROPERTIES));
    //Swords
    public static final RegistryObject<SwordItem> COMPRESSED_WOODEN_SWORD = ITEMS.register("compressed_wooden_sword",
            () -> new UcSwordItem(Tiers.WOOD, 5, 1.5f, WOODEN_TOOL_PROPERTIES));
    public static final RegistryObject<SwordItem> COMPRESSED_STONE_SWORD = ITEMS.register("compressed_stone_sword",
            () -> new UcSwordItem(Tiers.STONE, 6, 1.5f, STONE_TOOL_PROPERTIES));
    public static final RegistryObject<SwordItem> COMPRESSED_IRON_SWORD = ITEMS.register("compressed_iron_sword",
            () -> new UcSwordItem(Tiers.IRON, 7, 1.5f, IRON_TOOL_PROPERTIES));
    public static final RegistryObject<SwordItem> COMPRESSED_GOLD_SWORD = ITEMS.register("compressed_gold_sword",
            () -> new UcSwordItem(Tiers.GOLD, 5, 1.5f, GOLD_TOOL_PROPERTIES));
    public static final RegistryObject<SwordItem> COMPRESSED_DIAMOND_SWORD = ITEMS.register("compressed_diamond_sword",
            () -> new UcSwordItem(Tiers.DIAMOND, 8, 1.5f, DIAMOND_TOOL_PROPERTIES));
    public static final RegistryObject<SwordItem> COMPRESSED_NETHERITE_SWORD = ITEMS.register("compressed_netherite_sword",
            () -> new UcSwordItem(Tiers.NETHERITE, 9, 1.5f, NETHERITE_TOOL_PROPERTIES));
    //Hoes
    public static final RegistryObject<HoeItem> COMPRESSED_WOODEN_HOE = ITEMS.register("compressed_wooden_hoe",
            () -> new UcHoeItem(Tiers.WOOD, 2, 0.9f, WOODEN_TOOL_PROPERTIES));
    public static final RegistryObject<HoeItem> COMPRESSED_STONE_HOE = ITEMS.register("compressed_stone_hoe",
            () -> new UcHoeItem(Tiers.STONE, 3, 1.9f, STONE_TOOL_PROPERTIES));
    public static final RegistryObject<HoeItem> COMPRESSED_IRON_HOE = ITEMS.register("compressed_iron_hoe",
            () -> new UcHoeItem(Tiers.IRON, 4, 2.9f, IRON_TOOL_PROPERTIES));
    public static final RegistryObject<HoeItem> COMPRESSED_GOLD_HOE = ITEMS.register("compressed_gold_hoe",
            () -> new UcHoeItem(Tiers.GOLD, 2, 0.9f, GOLD_TOOL_PROPERTIES));
    public static final RegistryObject<HoeItem> COMPRESSED_DIAMOND_HOE= ITEMS.register("compressed_diamond_hoe",
            () -> new UcHoeItem(Tiers.DIAMOND, 5, 3.9f, DIAMOND_TOOL_PROPERTIES));
    public static final RegistryObject<HoeItem> COMPRESSED_NETHERITE_HOE = ITEMS.register("compressed_netherite_hoe",
            () -> new UcHoeItem(Tiers.NETHERITE, 5, 3.9f, NETHERITE_TOOL_PROPERTIES));
}
