package com.VoidCallerZ.uc.setup.registration;

import com.VoidCallerZ.uc.items.arrows.UcArrowItem;
import com.VoidCallerZ.uc.items.arrows.UcSpectralArrowItem;
import com.VoidCallerZ.uc.setup.ModSetup;
import com.VoidCallerZ.uc.world.entity.projectile.CompressedArrow;
import com.VoidCallerZ.uc.world.entity.projectile.CompressedSpectralArrow;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class ItemRegistration
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        ENTITIES.register(bus);
    }

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_COMPRESSION_TAB);

    public static final RegistryObject<Item> COMPRESSED_FLINT = ITEMS.register("compressed_flint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LEATHER = ITEMS.register("compressed_leather", () -> new Item(ITEM_PROPERTIES));

    //Arrows
    //Basic
    public static final RegistryObject<Item> COMPRESSED_ARROW = ITEMS.register("compressed_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
    public static final RegistryObject<EntityType<CompressedArrow>> COMPRESSED_ARROW_ENTITY = ENTITIES.register("compressed_arrow_entity", () ->
            EntityType.Builder.<CompressedArrow>of(CompressedArrow::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(new ResourceLocation(MODID, "compressed_arrow_entity").toString()));

    //Spectral
    public static final RegistryObject<Item> COMPRESSED_SPECTRAL_ARROW = ITEMS.register("compressed_spectral_arrow", () -> new UcSpectralArrowItem(ITEM_PROPERTIES, 1.5f));
    public static final RegistryObject<EntityType<CompressedSpectralArrow>> COMPRESSED_SPECTRAL_ARROW_ENTITY = ENTITIES.register("compressed_spectral_arrow_entity", () ->
            EntityType.Builder.<CompressedSpectralArrow>of(CompressedSpectralArrow::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(new ResourceLocation(MODID, "compressed_spectral_arrow_entity").toString()));

    //Nether Items
    public static final RegistryObject<Item> COMPRESSED_QUARTZ = ITEMS.register("compressed_quartz", () -> new Item(ITEM_PROPERTIES));

    public static final RegistryObject<Item> COMPRESSED_STICK = ITEMS.register("compressed_stick", () -> new Item(ITEM_PROPERTIES));
}