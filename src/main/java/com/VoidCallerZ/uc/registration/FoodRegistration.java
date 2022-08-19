package com.VoidCallerZ.uc.registration;

import com.VoidCallerZ.uc.items.UcFoods;
import com.VoidCallerZ.uc.setup.ModSetup;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class FoodRegistration
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    public static final Item.Properties FOOD_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_FOOD_COMPRESSION_TAB);

    public static final RegistryObject<Item> COMPRESSED_APPLE = ITEMS.register("compressed_apple",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_APPLE)));
    public static final RegistryObject<Item> COMPRESSED_BAKED_POTATO = ITEMS.register("compressed_baked_potato",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_BAKED_POTATO)));
    public static final RegistryObject<Item> COMPRESSED_BEEF = ITEMS.register("compressed_beef",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_BEEF)));
    public static final RegistryObject<Item> COMPRESSED_BEETROOT = ITEMS.register("compressed_beetroot",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_BEETROOT)));
    public static final RegistryObject<Item> COMPRESSED_BEETROOT_SOUP = ITEMS.register("compressed_beetroot_soup",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_BEETROOT_SOUP)));
    public static final RegistryObject<Item> COMPRESSED_BREAD = ITEMS.register("compressed_bread",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_BREAD)));
    public static final RegistryObject<Item> COMPRESSED_CARROT = ITEMS.register("compressed_carrot",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_CARROT)));
    public static final RegistryObject<Item> COMPRESSED_CHICKEN = ITEMS.register("compressed_chicken",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_CHICKEN)));
    public static final RegistryObject<Item> COMPRESSED_COD = ITEMS.register("compressed_cod",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_COD)));
    public static final RegistryObject<Item> COMPRESSED_COOKED_BEEF = ITEMS.register("compressed_cooked_beef",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_COOKED_BEEF)));
    public static final RegistryObject<Item> COMPRESSED_COOKED_CHICKEN = ITEMS.register("compressed_cooked_chicken",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_COOKED_CHICKEN)));
    public static final RegistryObject<Item> COMPRESSED_COOKED_COD = ITEMS.register("compressed_cooked_cod",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_COOKED_COD)));
    public static final RegistryObject<Item> COMPRESSED_COOKED_MUTTON = ITEMS.register("compressed_cooked_mutton",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_COOKED_MUTTON)));
    public static final RegistryObject<Item> COMPRESSED_COOKED_PORKCHOP = ITEMS.register("compressed_cooked_porkchop",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_COOKED_PORKCHOP)));
    public static final RegistryObject<Item> COMPRESSED_COOKED_RABBIT= ITEMS.register("compressed_cooked_rabbit",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_COOKED_RABBIT)));
    public static final RegistryObject<Item> COMPRESSED_COOKED_SALMON = ITEMS.register("compressed_cooked_salmon",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_COOKED_SALMON)));
    public static final RegistryObject<Item> COMPRESSED_COOKIE = ITEMS.register("compressed_cookie",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_COOKIE)));
    public static final RegistryObject<Item> COMPRESSED_DRIED_KELP = ITEMS.register("compressed_dried_kelp",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_DRIED_KELP)));
    public static final RegistryObject<Item> COMPRESSED_GLOW_BERRIES = ITEMS.register("compressed_glow_berries",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_GLOW_BERRIES)));
    public static final RegistryObject<Item> COMPRESSED_GOLDEN_APPLE = ITEMS.register("compressed_golden_apple",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_GOLDEN_APPLE)));
    public static final RegistryObject<Item> COMPRESSED_ENCHANTED_GOLDEN_APPLE = ITEMS.register("compressed_enchanted_golden_apple",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_ENCHANTED_GOLDEN_APPLE)));
    public static final RegistryObject<Item> COMPRESSED_MELON_SLICE = ITEMS.register("compressed_melon_slice",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_MELON_SLICE)));
    public static final RegistryObject<Item> COMPRESSED_MUSHROOM_STEW = ITEMS.register("compressed_mushroom_stew",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_MUSHROOM_STEW)));
    public static final RegistryObject<Item> COMPRESSED_MUTTON = ITEMS.register("compressed_mutton",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_MUTTON)));
    public static final RegistryObject<Item> COMPRESSED_POISONOUS_POTATO = ITEMS.register("compressed_poisonous_potato",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_POISONOUS_POTATO)));
    public static final RegistryObject<Item> COMPRESSED_PORKCHOP = ITEMS.register("compressed_porkchop",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_PORKCHOP)));
    public static final RegistryObject<Item> COMPRESSED_POTATO = ITEMS.register("compressed_potato",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_POTATO)));
    public static final RegistryObject<Item> COMPRESSED_PUFFERFISH = ITEMS.register("compressed_pufferfish",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_PUFFERFISH)));
    public static final RegistryObject<Item> COMPRESSED_PUMPKIN_PIE = ITEMS.register("compressed_pumpkin_pie",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_PUMPKIN_PIE)));
    public static final RegistryObject<Item> COMPRESSED_RABBIT = ITEMS.register("compressed_rabbit",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_RABBIT)));
    public static final RegistryObject<Item> COMPRESSED_RABBIT_STEW = ITEMS.register("compressed_rabbit_stew",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_RABBIT_STEW)));
    public static final RegistryObject<Item> COMPRESSED_ROTTEN_FLESH = ITEMS.register("compressed_rotten_flesh",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_ROTTEN_FLESH)));
    public static final RegistryObject<Item> COMPRESSED_SALMON = ITEMS.register("compressed_salmon",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_SALMON)));
    public static final RegistryObject<Item> COMPRESSED_SPIDER_EYE = ITEMS.register("compressed_spider_eye",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_SPIDER_EYE)));
    public static final RegistryObject<Item> COMPRESSED_SWEET_BERRIES = ITEMS.register("compressed_sweet_berries",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_SWEET_BERRIES)));
    public static final RegistryObject<Item> COMPRESSED_TROPICAL_FISH = ITEMS.register("compressed_tropical_fish",
            () -> new Item(FOOD_PROPERTIES.food(UcFoods.COMPRESSED_TROPICAL_FISH)));
}
