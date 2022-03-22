package com.VoidCallerZ.uc.setup.registration;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.items.UcArrowItem;
import com.VoidCallerZ.uc.items.UcSpectralArrowItem;
import com.VoidCallerZ.uc.items.tools.UcTippedArrowItem;
import com.VoidCallerZ.uc.setup.ModSetup;
import com.VoidCallerZ.uc.world.entity.projectile.CompressedArrow;
import com.VoidCallerZ.uc.world.entity.projectile.CompressedSpectralArrow;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class ItemRegistration
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, UltimateCompression.MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        ENTITIES.register(bus);
    }

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_COMPRESSION_TAB);

    public static final RegistryObject<Item> COMPRESSED_FLINT = ITEMS.register("compressed_flint", () -> new Item(ITEM_PROPERTIES));

    //Arrows
    //Basic
    public static final RegistryObject<Item> COMPRESSED_ARROW = ITEMS.register("compressed_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
    public static final RegistryObject<EntityType<CompressedArrow>> COMPRESSED_ARROW_ENTITY = ENTITIES.register("compressed_arrow_entity", () ->
            EntityType.Builder.<CompressedArrow>of(CompressedArrow::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(new ResourceLocation(UltimateCompression.MODID, "compressed_arrow_entity").toString()));

    //Spectral
    public static final RegistryObject<Item> COMPRESSED_SPECTRAL_ARROW = ITEMS.register("compressed_spectral_arrow", () -> new UcSpectralArrowItem(ITEM_PROPERTIES, 1.5f));
    public static final RegistryObject<EntityType<CompressedSpectralArrow>> COMPRESSED_SPECTRAL_ARROW_ENTITY = ENTITIES.register("compressed_spectral_arrow_entity", () ->
            EntityType.Builder.<CompressedSpectralArrow>of(CompressedSpectralArrow::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(new ResourceLocation(MODID, "compressed_spectral_arrow_entity").toString()));

    //Fire Resistance
    //public static final RegistryObject<UcTippedArrowItem> COMPRESSED_FIRE_RESISTANCE_ARROW = ITEMS.register("compressed_fire_resistance_arrow", () -> new UcTippedArrowItem(ITEM_PROPERTIES, 1.5f));

//    //Harming
//    public static final RegistryObject<UcArrowItem> COMPRESSED_HARMING_ARROW = ITEMS.register("compressed_harming_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Healing
//    public static final RegistryObject<UcArrowItem> COMPRESSED_HEALING_ARROW = ITEMS.register("compressed_healing_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Invisibility
//    public static final RegistryObject<UcArrowItem> COMPRESSED_INVISIBILITY_ARROW = ITEMS.register("compressed_invisibility_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Leaping
//    public static final RegistryObject<UcArrowItem> COMPRESSED_LEAPING_ARROW = ITEMS.register("compressed_leaping_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Slow Falling
//    public static final RegistryObject<UcArrowItem> COMPRESSED_SLOW_FALLING_ARROW = ITEMS.register("compressed_slow_falling_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Night Vision
//    public static final RegistryObject<UcArrowItem> COMPRESSED_NIGHT_VISION_ARROW = ITEMS.register("compressed_night_vision_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Poison
//    public static final RegistryObject<UcArrowItem> COMPRESSED_POISON_ARROW = ITEMS.register("compressed_poison_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Regeneration
//    public static final RegistryObject<UcArrowItem> COMPRESSED_REGENERATION_ARROW = ITEMS.register("compressed_regeneration_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Slowness
//    public static final RegistryObject<UcArrowItem> COMPRESSED_SLOWNESS_ARROW = ITEMS.register("compressed_slowness_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Strength
//    public static final RegistryObject<UcArrowItem> COMPRESSED_STRENGTH_ARROW = ITEMS.register("compressed_strength_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Swiftness
//    public static final RegistryObject<UcArrowItem> COMPRESSED_SWIFTNESS_ARROW = ITEMS.register("compressed_swiftness_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Turtle Master
//    public static final RegistryObject<UcArrowItem> COMPRESSED_TURTLE_MASTER_ARROW = ITEMS.register("compressed_turtle_master_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Water Breathing
//    public static final RegistryObject<UcArrowItem> COMPRESSED_WATER_BREATHING_ARROW = ITEMS.register("compressed_water_breathing_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
//
//    //Weakness
//    public static final RegistryObject<UcArrowItem> COMPRESSED_WEAKNESS_ARROW = ITEMS.register("compressed_weakness_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
}
