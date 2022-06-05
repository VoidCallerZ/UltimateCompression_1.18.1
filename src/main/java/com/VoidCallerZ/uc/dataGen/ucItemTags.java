package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.registration.ItemRegistration;
import com.VoidCallerZ.uc.setup.registration.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ucItemTags extends ItemTagsProvider
{
    public ucItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper)
    {
        super(generator, blockTags, UltimateCompression.MODID, helper);
    }

    @Override
    protected void addTags()
    {
        tag(Tags.Items.ORES)
                .add(Registration.COMPRESSED_IRON_ORE_ITEM.get())
                .add(Registration.COMPRESSED_GOLD_ORE_ITEM.get())
                .add(Registration.COMPRESSED_DIAMOND_ORE_ITEM.get())
                .add(Registration.COMPRESSED_COPPER_ORE_ITEM.get())
                .add(Registration.COMPRESSED_COAL_ORE_ITEM.get())
                .add(Registration.COMPRESSED_EMERALD_ORE_ITEM.get())
                .add(Registration.COMPRESSED_LAPIS_ORE_ITEM.get())
                .add(Registration.COMPRESSED_REDSTONE_ORE_ITEM.get())
                .add(Registration.COMPRESSED_DEEPSLATE_IRON_ORE_ITEM.get())
                .add(Registration.COMPRESSED_DEEPSLATE_GOLD_ORE_ITEM.get())
                .add(Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE_ITEM.get())
                .add(Registration.COMPRESSED_DEEPSLATE_COPPER_ORE_ITEM.get())
                .add(Registration.COMPRESSED_DEEPSLATE_COAL_ORE_ITEM.get())
                .add(Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE_ITEM.get())
                .add(Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE_ITEM.get())
                .add(Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE_ITEM.get())
                .add(Registration.COMPRESSED_NETHER_GOLD_ORE_ITEM.get())
                .add(Registration.COMPRESSED_NETHER_QUARTZ_ORE_ITEM.get());

        tag(Tags.Items.INGOTS)
                .add(Registration.COMPRESSED_IRON_INGOT.get())
                .add(Registration.COMPRESSED_GOLD_INGOT.get())
                .add(Registration.COMPRESSED_COPPER_INGOT.get())
                .add(Registration.COMPRESSED_NETHERITE_INGOT.get());
        tag(Tags.Items.GEMS)
                .add(Registration.COMPRESSED_DIAMOND_GEM.get())
                .add(Registration.COMPRESSED_EMERALD_GEM.get());

        tag(ItemTags.ARROWS)
                .add(ItemRegistration.COMPRESSED_ARROW.get())
                .add(ItemRegistration.COMPRESSED_SPECTRAL_ARROW.get())
                .add(ItemRegistration.COMPRESSED_TIPPED_ARROW.get());

//        tag(Registration.COMPRESSOR_VALID_ITEMS)
//                .add(Items.IRON_INGOT)
//                .add(Items.GOLD_INGOT)
//                .add(Items.DIAMOND)
//                .add(Items.COPPER_INGOT)
//                .add(Items.COAL)
//                .add(Items.EMERALD)
//                .add(Items.LAPIS_LAZULI)
//                .add(Items.REDSTONE)
//                .add(Items.NETHERITE_INGOT)
//                .add(Items.IRON_BLOCK)
//                .add(Items.GOLD_BLOCK)
//                .add(Items.DIAMOND_BLOCK)
//                .add(Items.COPPER_BLOCK)
//                .add(Items.COAL_BLOCK)
//                .add(Items.EMERALD_BLOCK)
//                .add(Items.LAPIS_BLOCK)
//                .add(Items.REDSTONE_BLOCK)
//                .add(Items.NETHERITE_BLOCK);

        tag(Registration.COMPRESSED_PLANKS_FOR_TOOLS)
                .add(Registration.COMPRESSED_ACACIA_PLANKS_ITEM.get())
                .add(Registration.COMPRESSED_BIRCH_PLANKS_ITEM.get())
                .add(Registration.COMPRESSED_DARK_OAK_PLANKS_ITEM.get())
                .add(Registration.COMPRESSED_JUNGLE_PLANKS_ITEM.get())
                .add(Registration.COMPRESSED_OAK_PLANKS_ITEM.get())
                .add(Registration.COMPRESSED_SPRUCE_PLANKS_ITEM.get())
                .add(Registration.COMPRESSED_CRIMSON_PLANKS_ITEM.get())
                .add(Registration.COMPRESSED_WARPED_PLANKS_ITEM.get());

        /*tag(Registration.COMPRESSED_ORE_ITEM)
                .add(Registration.COMPRESSED_IRON_ORE_ITEM.get())
                .add(Registration.COMPRESSED_GOLD_ORE_ITEM.get())
                .add(Registration.COMPRESSED_DIAMOND_ORE_ITEM.get());*/
    }

    @Override
    public String getName()
    {
        return "UC Tags";
    }
}
