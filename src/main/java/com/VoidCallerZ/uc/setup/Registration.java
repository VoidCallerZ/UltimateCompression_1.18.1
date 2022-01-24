package com.VoidCallerZ.uc.setup;

import com.VoidCallerZ.uc.UltimateCompression;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class Registration
{
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    public static final BlockBehaviour.Properties ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(1f);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    public static final RegistryObject<Block> COMPRESSED_IRON_ORE = BLOCKS.register("compressed_iron_ore", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_IRON_ORE_ITEM = fromBlock(COMPRESSED_IRON_ORE);

    public static final RegistryObject<Item> COMPRESSED_RAW_IRON = ITEMS.register("compressed_raw_iron", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_IRON_INGOT = ITEMS.register("compressed_iron_ingot", () -> new Item(ITEM_PROPERTIES));

    public static final Tags.IOptionalNamedTag<Block> COMPRESSED_ORE = BlockTags.createOptional(new ResourceLocation(UltimateCompression.MODID, "compressed_ore"));
    public static final Tags.IOptionalNamedTag<Item> COMPRESSED_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(UltimateCompression.MODID, "compressed_ore"));

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block)
    {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
