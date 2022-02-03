package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.ArmorRegistration;
import com.VoidCallerZ.uc.setup.Registration;
import com.VoidCallerZ.uc.setup.ToolRegistration;
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
        //Ores
        withExistingParent(Registration.COMPRESSED_IRON_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_iron_ore"));
        withExistingParent(Registration.COMPRESSED_GOLD_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_gold_ore"));
        withExistingParent(Registration.COMPRESSED_DIAMOND_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_diamond_ore"));
        withExistingParent(Registration.COMPRESSED_COPPER_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_copper_ore"));
        withExistingParent(Registration.COMPRESSED_COAL_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_coal_ore"));
        withExistingParent(Registration.COMPRESSED_EMERALD_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_emerald_ore"));
        withExistingParent(Registration.COMPRESSED_LAPIS_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_lapis_ore"));
        withExistingParent(Registration.COMPRESSED_REDSTONE_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_redstone_ore"));

        //Deepslate Ores
        withExistingParent(Registration.COMPRESSED_DEEPSLATE_IRON_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_deepslate_iron_ore"));
        withExistingParent(Registration.COMPRESSED_DEEPSLATE_GOLD_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_deepslate_gold_ore"));
        withExistingParent(Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_deepslate_diamond_ore"));
        withExistingParent(Registration.COMPRESSED_DEEPSLATE_COPPER_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_deepslate_copper_ore"));
        withExistingParent(Registration.COMPRESSED_DEEPSLATE_COAL_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_deepslate_coal_ore"));
        withExistingParent(Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_deepslate_emerald_ore"));
        withExistingParent(Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_deepslate_lapis_ore"));
        withExistingParent(Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_deepslate_redstone_ore"));

        //Blocks
        withExistingParent(Registration.COMPRESSED_IRON_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_iron_block"));
        withExistingParent(Registration.COMPRESSED_GOLD_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_gold_block"));
        withExistingParent(Registration.COMPRESSED_DIAMOND_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_diamond_block"));
        withExistingParent(Registration.COMPRESSED_COPPER_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_copper_block"));
        withExistingParent(Registration.COMPRESSED_COAL_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_coal_block"));
        withExistingParent(Registration.COMPRESSED_EMERALD_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_emerald_block"));
        withExistingParent(Registration.COMPRESSED_LAPIS_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_lapis_block"));
        withExistingParent(Registration.COMPRESSED_REDSTONE_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_redstone_block"));
        withExistingParent(Registration.COMPRESSED_NETHERITE_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_netherite_block"));

        //Raw Blocks
        withExistingParent(Registration.COMPRESSED_RAW_IRON_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_raw_iron_block"));
        withExistingParent(Registration.COMPRESSED_RAW_GOLD_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_raw_gold_block"));
        withExistingParent(Registration.COMPRESSED_RAW_COPPER_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_raw_copper_block"));

        //Basic Blocks
        withExistingParent(Registration.COMPRESSED_ANDESITE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_andesite"));
        withExistingParent(Registration.COMPRESSED_CALCITE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_calcite"));
        withExistingParent(Registration.COMPRESSED_COBBLED_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_cobbled_deepslate"));
        withExistingParent(Registration.COMPRESSED_COBBLESTONE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_cobblestone"));
        withExistingParent(Registration.COMPRESSED_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_deepslate"));
        withExistingParent(Registration.COMPRESSED_DIORITE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_diorite"));
        withExistingParent(Registration.COMPRESSED_DIRT_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_dirt"));
        withExistingParent(Registration.COMPRESSED_GRANITE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_granite"));
        withExistingParent(Registration.COMPRESSED_GRAVEL_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_gravel"));
        withExistingParent(Registration.COMPRESSED_NETHERRACK_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_netherrack"));
        withExistingParent(Registration.COMPRESSED_RED_SAND_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_red_sand"));
        withExistingParent(Registration.COMPRESSED_SAND_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_sand"));
        withExistingParent(Registration.COMPRESSED_STONE_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_stone"));
        withExistingParent(Registration.COMPRESSED_TUFF_ITEM.get().getRegistryName().getPath(), modLoc("block/compressed_tuff"));

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

        singleTexture(Registration.COMPRESSED_COAL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/materials/compressed_coal"));
        singleTexture(Registration.COMPRESSED_EMERALD_GEM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/materials/compressed_emerald"));
        singleTexture(Registration.COMPRESSED_LAPIS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/materials/compressed_lapis_lazuli"));
        singleTexture(Registration.COMPRESSED_REDSTONE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/materials/compressed_redstone"));
        singleTexture(Registration.COMPRESSED_NETHERITE_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/materials/compressed_netherite_ingot"));

        //TOOLS
        //Pickaxes
        singleTexture(ToolRegistration.COMPRESSED_WOODEN_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_wooden_pickaxe"));
        singleTexture(ToolRegistration.COMPRESSED_STONE_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_stone_pickaxe"));
        singleTexture(ToolRegistration.COMPRESSED_IRON_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_iron_pickaxe"));
        singleTexture(ToolRegistration.COMPRESSED_GOLD_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_golden_pickaxe"));
        singleTexture(ToolRegistration.COMPRESSED_DIAMOND_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_diamond_pickaxe"));
        singleTexture(ToolRegistration.COMPRESSED_NETHERITE_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_netherite_pickaxe"));
        //Axes
        singleTexture(ToolRegistration.COMPRESSED_WOODEN_AXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_wooden_axe"));
        singleTexture(ToolRegistration.COMPRESSED_STONE_AXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_stone_axe"));
        singleTexture(ToolRegistration.COMPRESSED_IRON_AXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_iron_axe"));
        singleTexture(ToolRegistration.COMPRESSED_GOLD_AXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_golden_axe"));
        singleTexture(ToolRegistration.COMPRESSED_DIAMOND_AXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_diamond_axe"));
        singleTexture(ToolRegistration.COMPRESSED_NETHERITE_AXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_netherite_axe"));
        //Shovels
        singleTexture(ToolRegistration.COMPRESSED_WOODEN_SHOVEL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_wooden_shovel"));
        singleTexture(ToolRegistration.COMPRESSED_STONE_SHOVEL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_stone_shovel"));
        singleTexture(ToolRegistration.COMPRESSED_IRON_SHOVEL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_iron_shovel"));
        singleTexture(ToolRegistration.COMPRESSED_GOLD_SHOVEL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_golden_shovel"));
        singleTexture(ToolRegistration.COMPRESSED_DIAMOND_SHOVEL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_diamond_shovel"));
        singleTexture(ToolRegistration.COMPRESSED_NETHERITE_SHOVEL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_netherite_shovel"));
        //Swords
        singleTexture(ToolRegistration.COMPRESSED_WOODEN_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_wooden_sword"));
        singleTexture(ToolRegistration.COMPRESSED_STONE_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_stone_sword"));
        singleTexture(ToolRegistration.COMPRESSED_IRON_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_iron_sword"));
        singleTexture(ToolRegistration.COMPRESSED_GOLD_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_golden_sword"));
        singleTexture(ToolRegistration.COMPRESSED_DIAMOND_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_diamond_sword"));
        singleTexture(ToolRegistration.COMPRESSED_NETHERITE_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_netherite_sword"));
        //Hoes
        singleTexture(ToolRegistration.COMPRESSED_WOODEN_HOE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_wooden_hoe"));
        singleTexture(ToolRegistration.COMPRESSED_STONE_HOE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_stone_hoe"));
        singleTexture(ToolRegistration.COMPRESSED_IRON_HOE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_iron_hoe"));
        singleTexture(ToolRegistration.COMPRESSED_GOLD_HOE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_golden_hoe"));
        singleTexture(ToolRegistration.COMPRESSED_DIAMOND_HOE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_diamond_hoe"));
        singleTexture(ToolRegistration.COMPRESSED_NETHERITE_HOE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/tools/compressed_netherite_hoe"));

        //ARMOR
        //Iron Armor
        singleTexture(ArmorRegistration.COMPRESSED_IRON_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/armor/compressed_iron_helmet"));
        singleTexture(ArmorRegistration.COMPRESSED_IRON_CHESTPLATE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/armor/compressed_iron_chestplate"));
        singleTexture(ArmorRegistration.COMPRESSED_IRON_LEGGINGS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/armor/compressed_iron_leggings"));
        singleTexture(ArmorRegistration.COMPRESSED_IRON_BOOTS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/compressed/armor/compressed_iron_boots"));
    }
}
