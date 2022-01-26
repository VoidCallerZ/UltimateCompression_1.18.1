package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.security.PermissionCollection;

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
                .add(Registration.COMPRESSED_DIAMOND_ORE_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(Registration.COMPRESSED_IRON_INGOT.get())
                .add(Registration.COMPRESSED_GOLD_INGOT.get())
                .add(Registration.COMPRESSED_COPPER_INGOT.get());
        tag(Tags.Items.GEMS)
                .add(Registration.COMPRESSED_DIAMOND_GEM.get());

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
