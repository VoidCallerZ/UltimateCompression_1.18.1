package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ucBlockTags extends BlockTagsProvider
{
    public ucBlockTags(DataGenerator generator, ExistingFileHelper helper)
    {
        super(generator, UltimateCompression.MODID, helper);
    }

    @Override
    protected void addTags()
    {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.COMPRESSED_IRON_ORE.get());
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(Registration.COMPRESSED_IRON_ORE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.COMPRESSED_IRON_ORE.get());

        tag(Registration.COMPRESSED_ORE)
                .add(Registration.COMPRESSED_IRON_ORE.get());
    }

    @Override
    public String getName() {return "UC Tags";}
}
