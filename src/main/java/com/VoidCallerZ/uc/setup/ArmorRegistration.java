package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.items.UcArmorMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class ArmorRegistration
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    //Iron
    public static final RegistryObject<ArmorItem> COMPRESSED_IRON_HELMET = ITEMS.register("compressed_iron_helmet",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_IRON,
                    EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(165 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_IRON_CHESTPLATE = ITEMS.register("compressed_iron_chestplate",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_IRON,
                    EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(240 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_IRON_LEGGINGS = ITEMS.register("compressed_iron_leggings",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_IRON,
                    EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(225 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_IRON_BOOTS = ITEMS.register("compressed_iron_boots",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_IRON,
                    EquipmentSlot.FEET,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(195 * 9)));

    //Gold
    public static final RegistryObject<ArmorItem> COMPRESSED_GOLD_HELMET = ITEMS.register("compressed_gold_helmet",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_GOLD,
                    EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(77 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_GOLD_CHESTPLATE = ITEMS.register("compressed_gold_chestplate",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_GOLD,
                    EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(112 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_GOLD_LEGGINGS = ITEMS.register("compressed_gold_leggings",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_GOLD,
                    EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(105 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_GOLD_BOOTS = ITEMS.register("compressed_gold_boots",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_GOLD,
                    EquipmentSlot.FEET,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(91 * 9)));

    //Diamond
    public static final RegistryObject<ArmorItem> COMPRESSED_DIAMOND_HELMET = ITEMS.register("compressed_diamond_helmet",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_DIAMOND,
                    EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(363 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_DIAMOND_CHESTPLATE = ITEMS.register("compressed_diamond_chestplate",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_DIAMOND,
                    EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(528 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_DIAMOND_LEGGINGS = ITEMS.register("compressed_diamond_leggings",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_DIAMOND,
                    EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(495 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_DIAMOND_BOOTS = ITEMS.register("compressed_diamond_boots",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_DIAMOND,
                    EquipmentSlot.FEET,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(429 * 9)));

    //Netherite
    public static final RegistryObject<ArmorItem> COMPRESSED_NETHERITE_HELMET = ITEMS.register("compressed_netherite_helmet",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_NETHERITE,
                    EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(407 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_NETHERITE_CHESTPLATE = ITEMS.register("compressed_netherite_chestplate",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_NETHERITE,
                    EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(592 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_NETHERITE_LEGGINGS = ITEMS.register("compressed_netherite_leggings",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_NETHERITE,
                    EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(555 * 9)));
    public static final RegistryObject<ArmorItem> COMPRESSED_NETHERITE_BOOTS = ITEMS.register("compressed_netherite_boots",
            () -> new ArmorItem(UcArmorMaterial.COMPRESSED_NETHERITE,
                    EquipmentSlot.FEET,
                    new Item.Properties().tab(ModSetup.ULTIMATE_TOOL_COMPRESSION_TAB).durability(481 * 9)));
}
