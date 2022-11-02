package com.VoidCallerZ.uc.dataGen.providers;

import com.VoidCallerZ.uc.blocks.compressor.diamond.DiamondCompressorBlock;
import com.VoidCallerZ.uc.blocks.compressor.gold.GoldenCompressorBlock;
import com.VoidCallerZ.uc.blocks.compressor.iron.IronCompressorBlock;
import com.VoidCallerZ.uc.blocks.compressor.netherite.NetheriteCompressorBlock;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraftforge.client.model.generators.ModelProvider.BLOCK_FOLDER;

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

    protected void singleTextureBlock(Block block, String textureName)
    {
        ModelFile model = models().cubeAll(trim(block.getDescriptionId()), modLoc(textureName));
        simpleBlock(block, model);
    }

    protected void singleTextureBlockWithRenderType(Block block, String modelName, String textureName, String renderType)
    {
        ModelFile model = models().cubeAll(modelName, modLoc(textureName)).renderType(renderType);
        simpleBlock(block, model);
    }

    protected void singleTextureBlockWithRenderTypeAndBlockColors(Block block, String modelName, String textureName, String renderType)
    {
        ModelFile model = models().singleTexture(modelName, mcLoc(BLOCK_FOLDER + "/leaves"), "all", modLoc(textureName)).renderType(renderType);
        simpleBlock(block, model);
    }

    protected void grassTextureBlock(Block block, String textureName)
    {
        ResourceLocation TOP = modLoc("block/compressed/nether/" + textureName);
        ResourceLocation SIDE = modLoc("block/compressed/nether/" + textureName + "_side");
        ResourceLocation BOTTOM = modLoc("block/compressed/nether/compressed_netherrack");

        ModelFile model = models().cube(textureName, BOTTOM, TOP, SIDE, SIDE, SIDE, SIDE);

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
        if (block == BlockRegistration.IRON_COMPRESSOR.get())
        {
            getVariantBuilder(block).forAllStates(state ->
                    ConfiguredModel.builder()
                            .modelFile(state.getValue(IronCompressorBlock.LIT) == true ? on : off)
                            .rotationY((int) state.getValue(IronCompressorBlock.FACING).toYRot())
                            .build());
        }
        else if (block == BlockRegistration.GOLDEN_COMPRESSOR.get())
        {
            getVariantBuilder(block).forAllStates(state ->
                    ConfiguredModel.builder()
                            .modelFile(state.getValue(GoldenCompressorBlock.LIT) == true ? on : off)
                            .rotationY((int) state.getValue(GoldenCompressorBlock.FACING).toYRot())
                            .build());
        }
        else if (block == BlockRegistration.DIAMOND_COMPRESSOR.get())
        {
            getVariantBuilder(block).forAllStates(state ->
                    ConfiguredModel.builder()
                            .modelFile(state.getValue(DiamondCompressorBlock.LIT) == true ? on : off)
                            .rotationY((int) state.getValue(DiamondCompressorBlock.FACING).toYRot())
                            .build());
        }
        else
        {
            getVariantBuilder(block).forAllStates(state ->
                    ConfiguredModel.builder()
                            .modelFile(state.getValue(NetheriteCompressorBlock.LIT) == true ? on : off)
                            .rotationY((int) state.getValue(NetheriteCompressorBlock.FACING).toYRot())
                            .build());
        }
    }

    private ResourceLocation extend(ResourceLocation rl, String suffix) {
        return new ResourceLocation(rl.getNamespace(), rl.getPath() + suffix);
    }

    private String trim(String string)
    {
        string = string.substring(9);
        return string;
    }
}
