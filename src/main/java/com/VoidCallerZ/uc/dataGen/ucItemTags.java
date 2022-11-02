package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import com.VoidCallerZ.uc.registration.ItemRegistration;
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
                .add(ItemRegistration.COMPRESSED_IRON_ORE.get())
                .add(ItemRegistration.COMPRESSED_GOLD_ORE.get())
                .add(ItemRegistration.COMPRESSED_DIAMOND_ORE.get())
                .add(ItemRegistration.COMPRESSED_COPPER_ORE.get())
                .add(ItemRegistration.COMPRESSED_COAL_ORE.get())
                .add(ItemRegistration.COMPRESSED_EMERALD_ORE.get())
                .add(ItemRegistration.COMPRESSED_LAPIS_ORE.get())
                .add(ItemRegistration.COMPRESSED_REDSTONE_ORE.get())
                .add(ItemRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get())
                .add(ItemRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get())
                .add(ItemRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get())
                .add(ItemRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get())
                .add(ItemRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get())
                .add(ItemRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get())
                .add(ItemRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get())
                .add(ItemRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get())
                .add(ItemRegistration.COMPRESSED_NETHER_GOLD_ORE.get())
                .add(ItemRegistration.COMPRESSED_NETHER_QUARTZ_ORE.get())
                .add(ItemRegistration.COMPRESSED_ANCIENT_DEBRIS.get());

        tag(Tags.Items.INGOTS)
                .add(ItemRegistration.COMPRESSED_IRON_INGOT.get())
                .add(ItemRegistration.COMPRESSED_GOLD_INGOT.get())
                .add(ItemRegistration.COMPRESSED_COPPER_INGOT.get())
                .add(ItemRegistration.COMPRESSED_NETHERITE_INGOT.get());
        tag(Tags.Items.GEMS)
                .add(ItemRegistration.COMPRESSED_DIAMOND_GEM.get())
                .add(ItemRegistration.COMPRESSED_EMERALD_GEM.get());

        tag(ItemTags.ARROWS)
                .add(ItemRegistration.COMPRESSED_ARROW.get())
                .add(ItemRegistration.COMPRESSED_SPECTRAL_ARROW.get())
                .add(ItemRegistration.COMPRESSED_TIPPED_ARROW.get());

        tag(BlockRegistration.COMPRESSOR_VALID_ITEMS)
                .add(Items.IRON_INGOT)
                .add(Items.GOLD_INGOT)
                .add(Items.DIAMOND)
                .add(Items.COPPER_INGOT)
                .add(Items.COAL)
                .add(Items.EMERALD)
                .add(Items.LAPIS_LAZULI)
                .add(Items.REDSTONE)
                .add(Items.NETHERITE_INGOT);

        tag(BlockRegistration.COMPRESSED_PLANKS_FOR_TOOLS)
                .add(ItemRegistration.COMPRESSED_ACACIA_PLANKS.get())
                .add(ItemRegistration.COMPRESSED_BIRCH_PLANKS.get())
                .add(ItemRegistration.COMPRESSED_DARK_OAK_PLANKS.get())
                .add(ItemRegistration.COMPRESSED_JUNGLE_PLANKS.get())
                .add(ItemRegistration.COMPRESSED_OAK_PLANKS.get())
                .add(ItemRegistration.COMPRESSED_SPRUCE_PLANKS.get())
                .add(ItemRegistration.COMPRESSED_CRIMSON_PLANKS.get())
                .add(ItemRegistration.COMPRESSED_WARPED_PLANKS.get());

        /*tag(Registration.COMPRESSED_ORE)
                .add(Registration.COMPRESSED_IRON_ORE.get())
                .add(Registration.COMPRESSED_GOLD_ORE.get())
                .add(Registration.COMPRESSED_DIAMOND_ORE.get());*/
    }

    @Override
    public String getName()
    {
        return "UC Tags";
    }
}
