package com.VoidCallerZ.uc.dataGen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
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

    protected void compressedPillarBlock(RotatedPillarBlock block, ResourceLocation resLoc)
    {
        axisBlock(block, models().cubeColumn(block.getRegistryName().getPath(), resLoc, extend(resLoc, "_top")), models().cubeColumnHorizontal(block.getRegistryName().getPath() + "_horizontal", resLoc, extend(resLoc, "_top")));
    }

    private ResourceLocation extend(ResourceLocation rl, String suffix) {
        return new ResourceLocation(rl.getNamespace(), rl.getPath() + suffix);
    }
}
