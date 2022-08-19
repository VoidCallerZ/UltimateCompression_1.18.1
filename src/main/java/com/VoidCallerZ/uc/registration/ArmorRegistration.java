package com.VoidCallerZ.uc.registration;

import com.VoidCallerZ.uc.items.UcArmorItem;
import com.VoidCallerZ.uc.items.UcArmorMaterial;
import com.VoidCallerZ.uc.items.UcDyeableArmorItem;
import com.VoidCallerZ.uc.setup.ModSetup;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class ArmorRegistration
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final Item.Properties ARMOR_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    //Leather
    public static final RegistryObject<UcDyeableArmorItem> COMPRESSED_LEATHER_HELMET = ITEMS.register("compressed_leather_helmet",
            () -> new UcDyeableArmorItem(UcArmorMaterial.COMPRESSED_LEATHER, EquipmentSlot.HEAD, ARMOR_PROPERTIES.durability(55 * 9)));
    public static final RegistryObject<UcDyeableArmorItem> COMPRESSED_LEATHER_CHESTPLATE = ITEMS.register("compressed_leather_chestplate",
            () -> new UcDyeableArmorItem(UcArmorMaterial.COMPRESSED_LEATHER, EquipmentSlot.CHEST, ARMOR_PROPERTIES.durability(80 * 9)));
    public static final RegistryObject<UcDyeableArmorItem> COMPRESSED_LEATHER_LEGGINGS = ITEMS.register("compressed_leather_leggings",
            () -> new UcDyeableArmorItem(UcArmorMaterial.COMPRESSED_LEATHER, EquipmentSlot.LEGS, ARMOR_PROPERTIES.durability(75 * 9)));
    public static final RegistryObject<UcDyeableArmorItem> COMPRESSED_LEATHER_BOOTS = ITEMS.register("compressed_leather_boots",
            () -> new UcDyeableArmorItem(UcArmorMaterial.COMPRESSED_LEATHER, EquipmentSlot.FEET, ARMOR_PROPERTIES.durability(65 * 9)));

    //Iron
    public static final RegistryObject<ArmorItem> COMPRESSED_IRON_HELMET = ITEMS.register("compressed_iron_helmet",
            () -> new UcArmorItem(UcArmorMaterial.COMPRESSED_IRON, EquipmentSlot.HEAD, ARMOR_PROPERTIES.durability(165 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_IRON_CHESTPLATE = ITEMS.register("compressed_iron_chestplate",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_IRON, EquipmentSlot.CHEST, ARMOR_PROPERTIES.durability(240 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_IRON_LEGGINGS = ITEMS.register("compressed_iron_leggings",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_IRON, EquipmentSlot.LEGS, ARMOR_PROPERTIES.durability(225 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_IRON_BOOTS = ITEMS.register("compressed_iron_boots",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_IRON, EquipmentSlot.FEET, ARMOR_PROPERTIES.durability(195 * 9)));

    //Gold
    public static final RegistryObject<ArmorItem> COMPRESSED_GOLD_HELMET = ITEMS.register("compressed_gold_helmet",
            () -> new UcArmorItem(UcArmorMaterial.COMPRESSED_GOLD, EquipmentSlot.HEAD, ARMOR_PROPERTIES.durability(77 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_GOLD_CHESTPLATE = ITEMS.register("compressed_gold_chestplate",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_GOLD, EquipmentSlot.CHEST, ARMOR_PROPERTIES.durability(112 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_GOLD_LEGGINGS = ITEMS.register("compressed_gold_leggings",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_GOLD, EquipmentSlot.LEGS, ARMOR_PROPERTIES.durability(105 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_GOLD_BOOTS = ITEMS.register("compressed_gold_boots",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_GOLD, EquipmentSlot.FEET, ARMOR_PROPERTIES.durability(91 * 9)));

    //Diamond
    public static final RegistryObject<ArmorItem> COMPRESSED_DIAMOND_HELMET = ITEMS.register("compressed_diamond_helmet",
            () -> new UcArmorItem(UcArmorMaterial.COMPRESSED_DIAMOND, EquipmentSlot.HEAD, ARMOR_PROPERTIES.durability(363 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_DIAMOND_CHESTPLATE = ITEMS.register("compressed_diamond_chestplate",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_DIAMOND, EquipmentSlot.CHEST, ARMOR_PROPERTIES.durability(528 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_DIAMOND_LEGGINGS = ITEMS.register("compressed_diamond_leggings",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_DIAMOND, EquipmentSlot.LEGS, ARMOR_PROPERTIES.durability(495 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_DIAMOND_BOOTS = ITEMS.register("compressed_diamond_boots",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_DIAMOND, EquipmentSlot.FEET, ARMOR_PROPERTIES.durability(429 * 9)));

    //Netherite
    public static final RegistryObject<ArmorItem> COMPRESSED_NETHERITE_HELMET = ITEMS.register("compressed_netherite_helmet",
            () -> new UcArmorItem(UcArmorMaterial.COMPRESSED_NETHERITE, EquipmentSlot.HEAD, ARMOR_PROPERTIES.durability(407 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_NETHERITE_CHESTPLATE = ITEMS.register("compressed_netherite_chestplate",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_NETHERITE, EquipmentSlot.CHEST, ARMOR_PROPERTIES.durability(592 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_NETHERITE_LEGGINGS = ITEMS.register("compressed_netherite_leggings",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_NETHERITE, EquipmentSlot.LEGS, ARMOR_PROPERTIES.durability(555 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_NETHERITE_BOOTS = ITEMS.register("compressed_netherite_boots",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_NETHERITE, EquipmentSlot.FEET, ARMOR_PROPERTIES.durability(481 * 9)));
}
