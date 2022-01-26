package com.VoidCallerZ.uc.dataGen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public abstract class BaseBlockStateProvider extends BlockStateProvider {
    public BaseBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper)
    {
        super(gen, modid, exFileHelper);
    }

    protected void singleTextureBlock(Block block, String modelName, String textureName)
    {
        ModelFile model = models().cubeAll(modelName, modLoc(textureName));
        simpleBlock(block, model);
    }
}
