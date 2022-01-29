package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ucItemModels extends ItemModelProvider
{
    public ucItemModels(DataGenerator generator, ExistingFileHelper helper)
    {
        super(generator, UltimateCompression.MODID, helper);
    }

    @Override
    protected void registerModels()
    {
        withExistingParent(Registration.COMPRESSED_IRON_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_iron_ore"));
        withExistingParent(Registration.COMPRESSED_GOLD_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_gold_ore"));
        withExistingParent(Registration.COMPRESSED_DIAMOND_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_diamond_ore"));
        withExistingParent(Registration.COMPRESSED_COPPER_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_copper_ore"));

        withExistingParent(Registration.COMPRESSED_IRON_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_iron_block"));
        withExistingParent(Registration.COMPRESSED_GOLD_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_gold_block"));
        withExistingParent(Registration.COMPRESSED_DIAMOND_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_diamond_block"));
        withExistingParent(Registration.COMPRESSED_COPPER_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_copper_block"));

        withExistingParent(Registration.COMPRESSED_RAW_IRON_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_raw_iron_block"));
        withExistingParent(Registration.COMPRESSED_RAW_GOLD_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_raw_gold_block"));
        withExistingParent(Registration.COMPRESSED_RAW_COPPER_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_raw_copper_block"));

        //Logs & Planks
        withExistingParent(Registration.COMPRESSED_ACACIA_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_acacia_log"));
        withExistingParent(Registration.COMPRESSED_ACACIA_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_acacia_planks"));
        withExistingParent(Registration.COMPRESSED_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_birch_log"));
        withExistingParent(Registration.COMPRESSED_BIRCH_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_birch_planks"));
        withExistingParent(Registration.COMPRESSED_DARK_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_dark_oak_log"));
        withExistingParent(Registration.COMPRESSED_DARK_OAK_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_dark_oak_planks"));
        withExistingParent(Registration.COMPRESSED_JUNGLE_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_jungle_log"));
        withExistingParent(Registration.COMPRESSED_JUNGLE_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_jungle_planks"));
        withExistingParent(Registration.COMPRESSED_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_oak_log"));
        withExistingParent(Registration.COMPRESSED_OAK_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_oak_planks"));
        withExistingParent(Registration.COMPRESSED_SPRUCE_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_spruce_log"));
        withExistingParent(Registration.COMPRESSED_SPRUCE_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_spruce_planks"));
        withExistingParent(Registration.COMPRESSED_SPRUCE_CRIMSON_STEM_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_crimson_stem"));
        withExistingParent(Registration.COMPRESSED_CRIMSON_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_crimson_planks"));
        withExistingParent(Registration.COMPRESSED_WARPED_STEM_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_warped_stem"));
        withExistingParent(Registration.COMPRESSED_WARPED_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_warped_planks"));

        withExistingParent(Registration.ULTIMATE_POWERGEN_ITEM.get().getRegistryName().getPath(), modLoc("block/powergen/main"));
        withExistingParent(Registration.COMPRESSOR_ITEM.get().getRegistryName().getPath(), modLoc("block/compressor"));

        singleTexture(Registration.COMPRESSED_RAW_IRON.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/materials/compressed_raw_iron"));
        singleTexture(Registration.COMPRESSED_IRON_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/materials/compressed_iron_ingot"));
        singleTexture(Registration.COMPRESSED_RAW_GOLD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/materials/compressed_raw_gold"));
        singleTexture(Registration.COMPRESSED_GOLD_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/materials/compressed_gold_ingot"));
        singleTexture(Registration.COMPRESSED_DIAMOND_GEM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/materials/compressed_diamond"));
        singleTexture(Registration.COMPRESSED_RAW_COPPER.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/materials/compressed_raw_copper"));
        singleTexture(Registration.COMPRESSED_COPPER_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/materials/compressed_copper_ingot"));
    }
}
