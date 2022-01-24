package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ucBlockStates extends BlockStateProvider
{
    public ucBlockStates(DataGenerator gen, ExistingFileHelper helper) {super(gen, UltimateCompression.MODID, helper);}

    @Override
    protected void registerStatesAndModels()
    {
        simpleBlock(Registration.COMPRESSED_IRON_ORE.get());
    }
}
