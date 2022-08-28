package com.VoidCallerZ.uc.dataGen.providers;

import com.VoidCallerZ.uc.blocks.compressor.iron.IronCompressorBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Function;

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

    protected void singleTextureBlockWithRenderType(Block block, String modelName, String textureName, String renderType)
    {
        ModelFile model = models().cubeAll(modelName, modLoc(textureName)).renderType(renderType);
        simpleBlock(block, model);
    }

    protected void compressedPillarBlock(RotatedPillarBlock block, ResourceLocation resLoc)
    {
        axisBlock(block, models().cubeColumn(ForgeRegistries.BLOCKS.getKey(block).getPath(), resLoc, extend(resLoc, "_top")), models().cubeColumnHorizontal(ForgeRegistries.BLOCKS.getKey(block).getPath() + "_horizontal", resLoc, extend(resLoc, "_top")));
    }

    protected void paneBlockWithRenderType(Block block, String modelName, String textureName, String renderType)
    {
        paneBlockWithRenderType((IronBarsBlock) block, modelName, modLoc(textureName), extend(modLoc(textureName), "_pane_top"), renderType);
    }

    protected void compressorBlockWithLitState(Block block, ModelFile off, ModelFile on)
    {
        getVariantBuilder(block).forAllStates(state ->
                ConfiguredModel.builder()
                        .modelFile(state.getValue(IronCompressorBlock.LIT) == true ? on : off)
                        .rotationY((int) state.getValue(IronCompressorBlock.FACING).toYRot())
                        .build());
    }

    private ResourceLocation extend(ResourceLocation rl, String suffix) {
        return new ResourceLocation(rl.getNamespace(), rl.getPath() + suffix);
    }
}
