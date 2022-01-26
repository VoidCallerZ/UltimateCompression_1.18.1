package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ucBlockStates extends BaseBlockStateProvider {
    public ucBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, UltimateCompression.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        registerPowergen();

        singleTextureBlock(Registration.COMPRESSED_IRON_ORE.get(), "compressed_iron_ore", "block/compressed/ores/compressed_iron_ore");
        singleTextureBlock(Registration.COMPRESSED_GOLD_ORE.get(), "compressed_gold_ore", "block/compressed/ores/compressed_gold_ore");
        singleTextureBlock(Registration.COMPRESSED_DIAMOND_ORE.get(), "compressed_diamond_ore", "block/compressed/ores/compressed_diamond_ore");
        singleTextureBlock(Registration.COMPRESSED_COPPER_ORE.get(), "compressed_copper_ore", "block/compressed/ores/compressed_copper_ore");

        singleTextureBlock(Registration.COMPRESSED_IRON_BLOCK.get(), "compressed_iron_block", "block/compressed/materials/compressed_iron_block");
        singleTextureBlock(Registration.COMPRESSED_GOLD_BLOCK.get(), "compressed_gold_block", "block/compressed/materials/compressed_gold_block");
        singleTextureBlock(Registration.COMPRESSED_DIAMOND_BLOCK.get(), "compressed_diamond_block", "block/compressed/materials/compressed_diamond_block");
        singleTextureBlock(Registration.COMPRESSED_COPPER_BLOCK.get(), "compressed_copper_block", "block/compressed/materials/compressed_copper_block");

        singleTextureBlock(Registration.COMPRESSED_RAW_IRON_BLOCK.get(), "compressed_raw_iron_block", "block/compressed/materials/compressed_raw_iron_block");
        singleTextureBlock(Registration.COMPRESSED_RAW_GOLD_BLOCK.get(), "compressed_raw_gold_block", "block/compressed/materials/compressed_raw_gold_block");
        singleTextureBlock(Registration.COMPRESSED_RAW_COPPER_BLOCK.get(), "compressed_raw_copper_block", "block/compressed/materials/compressed_raw_copper_block");
    }

    private void registerPowergen() {
        BlockModelBuilder frame = models().getBuilder("block/powergen/main");
        frame.parent(models().getExistingFile(mcLoc("cube")));

        floatingCube(frame, 0f, 0f, 0f, 1f, 16f, 1f);
        floatingCube(frame, 15f, 0f, 0f, 16f, 16f, 1f);
        floatingCube(frame, 0f, 0f, 15f, 1f, 16f, 16f);
        floatingCube(frame, 15f, 0f, 15f, 16f, 16f, 16f);

        floatingCube(frame, 1f, 0f, 0f, 15f, 1f, 1f);
        floatingCube(frame, 1f, 15f, 0f, 15f, 16f, 1f);
        floatingCube(frame, 1f, 0f, 15f, 15f, 1f, 16f);
        floatingCube(frame, 1f, 15f, 15f, 15f, 16f, 16f);

        floatingCube(frame, 0f, 0f, 1f, 1f, 1f, 15f);
        floatingCube(frame, 15f, 0f, 1f, 16f, 1f, 15f);
        floatingCube(frame, 0f, 15f, 1f, 1f, 16f, 15f);
        floatingCube(frame, 15f, 15f, 1f, 16f, 16f, 15f);

        floatingCube(frame, 1f, 1f, 1f, 15f, 15f, 15f);

        frame.texture("window", modLoc("block/powergen_window"));
        frame.texture("particle", modLoc("block/powergen_off"));

        createPowergenModel(Registration.ULTIMATE_POWERGEN.get(), frame);
    }

    private void floatingCube(BlockModelBuilder builder, float fx, float fy, float fz, float tx, float ty, float tz) {
        builder.element().from(fx, fy, fz).to(tx, ty, tz).allFaces((direction, faceBuilder) -> faceBuilder.texture("#window")).end();
    }

    private void createPowergenModel(Block block, BlockModelBuilder frame) {
        BlockModelBuilder singleOff = models().getBuilder("block/powergen/singleoff")
                .element().from(3, 3, 3).to(13, 13, 13).face(Direction.DOWN).texture("#single").end().end()
                .texture("single", modLoc("block/powergen_off"));
        BlockModelBuilder singleOn = models().getBuilder("block/powergen/singleon")
                .element().from(3, 3, 3).to(13, 13, 13).face(Direction.DOWN).texture("#single").end().end()
                .texture("single", modLoc("block/powergen_on"));

        MultiPartBlockStateBuilder bld = getMultipartBuilder(block);

        bld.part().modelFile(frame).addModel();

        BlockModelBuilder[] models = new BlockModelBuilder[]{singleOff, singleOn};
        for (int i = 0; i < 2; i++) {
            boolean powered = i == 1;
            bld.part().modelFile(models[i]).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationX(180).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationX(90).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationX(270).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationY(90).rotationX(90).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationY(270).rotationX(90).addModel().condition(BlockStateProperties.POWERED, powered);
        }
    }
}
