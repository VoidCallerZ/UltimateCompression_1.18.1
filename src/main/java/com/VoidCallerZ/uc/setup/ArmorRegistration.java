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
}
