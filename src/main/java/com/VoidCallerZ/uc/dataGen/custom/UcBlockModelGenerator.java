package com.VoidCallerZ.uc.dataGen.custom;

import com.VoidCallerZ.uc.registration.BlockRegistration;
import com.VoidCallerZ.uc.registration.ItemRegistration;
import com.google.gson.JsonElement;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.blockstates.*;
import net.minecraft.data.models.model.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class UcBlockModelGenerator extends BlockModelGenerators
{
    final Consumer<BlockStateGenerator> blockStateOutput;
    final BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput;

    public UcBlockModelGenerator(Consumer<BlockStateGenerator> pBlockStateOutput, BiConsumer<ResourceLocation, Supplier<JsonElement>> pModelOutput, Consumer<Item> pSkippedAutoModelsOutput)
    {
        super(pBlockStateOutput, pModelOutput, pSkippedAutoModelsOutput);
        this.blockStateOutput = pBlockStateOutput;
        this.modelOutput = pModelOutput;
    }

    private void createCompressedSculkCatalyst()
    {
        Block catalystBlock = BlockRegistration.COMPRESSED_SCULK_CATALYST.get();
        ResourceLocation resourceLocation = TextureMapping.getBlockTexture(catalystBlock, "_bottom");
        TextureMapping textureMapping = (new TextureMapping()).put(TextureSlot.BOTTOM, resourceLocation).put(TextureSlot.TOP, TextureMapping.getBlockTexture(catalystBlock, "_top")).put(TextureSlot.SIDE, TextureMapping.getBlockTexture(catalystBlock, "_side"));
        TextureMapping textureMapping1 = (new TextureMapping()).put(TextureSlot.BOTTOM, resourceLocation).put(TextureSlot.TOP, TextureMapping.getBlockTexture(catalystBlock, "_top_bloom")).put(TextureSlot.SIDE, TextureMapping.getBlockTexture(catalystBlock, "_side_bloom"));
        ResourceLocation resourceLocation1 = ModelTemplates.CUBE_BOTTOM_TOP.createWithSuffix(catalystBlock, "", textureMapping, this.modelOutput);
        ResourceLocation resourceLocation2 = ModelTemplates.CUBE_BOTTOM_TOP.createWithSuffix(catalystBlock, "_bloom", textureMapping1, this.modelOutput);
        this.blockStateOutput.accept(MultiVariantGenerator.multiVariant(catalystBlock).with(PropertyDispatch.property(BlockStateProperties.BLOOM).generate((multiVariant) -> Variant.variant().with(VariantProperties.MODEL, multiVariant ? resourceLocation2 : resourceLocation1))));
        this.delegateItemModel(ItemRegistration.COMPRESSED_SCULK_CATALYST.get(), resourceLocation1);
    }

    private void delegateItemModel(Item item, ResourceLocation delegateModelLocation)
    {
        this.modelOutput.accept(ModelLocationUtils.getModelLocation(item), new DelegatedModel(delegateModelLocation));
    }

    @Override
    public void run()
    {
        this.createCompressedSculkCatalyst();
    }

}
