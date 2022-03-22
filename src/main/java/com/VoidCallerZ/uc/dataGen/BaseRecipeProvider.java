package com.VoidCallerZ.uc.dataGen;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

public abstract class BaseRecipeProvider extends RecipeProvider
{
    public enum BodyPart
    {
        HEAD,
        CHEST,
        LEGS,
        FEET
    }

    public enum ToolType
    {
        PICKAXE,
        AXE,
        SHOVEL,
        SWORD,
        HOE
    }

    public BaseRecipeProvider(DataGenerator pGenerator)
    {
        super(pGenerator);
    }

    protected void CompressorDecompressorRecipeBuilder(Block compressedBlock, Item compressedItem, int decompAmountItem, Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped((compressedBlock))
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', compressedItem)
                .group("uc")
                .unlockedBy("has_" + compressedBlock.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(compressedItem))
                .save(consumer, "uc_" + compressedBlock.getRegistryName());

        ShapelessRecipeBuilder.shapeless(compressedItem, decompAmountItem)
                .requires(compressedBlock)
                .group("uc")
                .unlockedBy("has_" + compressedItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(compressedBlock))
                .save(consumer, "uc_" + compressedItem.getRegistryName());
    }

    protected void BasicDecompressorRecipeBuilder(Item result, int amount, Item requirement, Consumer<FinishedRecipe> consumer)
    {
        ShapelessRecipeBuilder.shapeless(result, amount)
                .requires(requirement)
                .group("uc")
                .unlockedBy("uncompress_has_" + requirement, InventoryChangeTrigger.TriggerInstance.hasItems(requirement))
                .save(consumer);
    }

    protected void MaterialCompressionRecipeBuilder(Item compressedItem, Item uncompressedItem, int decompAmountItem, Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(compressedItem)
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', uncompressedItem)
                .group("uc")
                .unlockedBy("has_" + uncompressedItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(uncompressedItem))
                .save(consumer, "uc_material_" + compressedItem.getRegistryName());

        ShapelessRecipeBuilder.shapeless(uncompressedItem, decompAmountItem)
                .requires(compressedItem)
                .group("uc")
                .unlockedBy("has_" + compressedItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(compressedItem))
                .save(consumer, "uc_material_" + uncompressedItem.getRegistryName());
    }

    protected void CompressedWoodenToolRecipeBuilder(Item toolItem, TagKey material, ToolType tool, Consumer<FinishedRecipe> consumer)
    {
        if (tool == ToolType.PICKAXE)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xxx")
                    .pattern(" s ")
                    .pattern(" s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, toolItem.getRegistryName());
        } else if (tool == ToolType.AXE)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern("sx")
                    .pattern("s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, toolItem.getRegistryName());
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern("xs")
                    .pattern(" s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, toolItem.getRegistryName() + "_alt");
        } else if (tool == ToolType.SHOVEL)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("x")
                    .pattern("s")
                    .pattern("s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, toolItem.getRegistryName());
        } else if (tool == ToolType.SWORD)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("x")
                    .pattern("x")
                    .pattern("s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, toolItem.getRegistryName());
        } else
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern("s ")
                    .pattern("s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, toolItem.getRegistryName());
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern(" s")
                    .pattern(" s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, toolItem.getRegistryName() + "_alt");
        }
    }

    protected void CompressedToolRecipeBuilder(Item toolItem, Item material, ToolType tool, Consumer<FinishedRecipe> consumer)
    {
        if (tool == ToolType.PICKAXE)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xxx")
                    .pattern(" s ")
                    .pattern(" s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, toolItem.getRegistryName());
        } else if (tool == ToolType.AXE)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern("sx")
                    .pattern("s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, toolItem.getRegistryName());
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern("xs")
                    .pattern(" s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, toolItem.getRegistryName() + "_alt");
        } else if (tool == ToolType.SHOVEL)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("x")
                    .pattern("s")
                    .pattern("s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, toolItem.getRegistryName());
        } else if (tool == ToolType.SWORD)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("x")
                    .pattern("x")
                    .pattern("s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, toolItem.getRegistryName());
        } else
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern("s ")
                    .pattern("s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, toolItem.getRegistryName());
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern(" s")
                    .pattern(" s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, toolItem.getRegistryName() + "_alt");
        }
    }

    protected void CompressedArmorRecipeBuilder(Item armorItem, Item material, BodyPart part, Consumer<FinishedRecipe> consumer)
    {
        if (part == BodyPart.HEAD)
        {
            ShapedRecipeBuilder.shaped(armorItem)
                    .pattern("xxx")
                    .pattern("x x")
                    .define('x', material)
                    .group("uc")
                    .unlockedBy("has_" + armorItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        } else if (part == BodyPart.CHEST)
        {
            ShapedRecipeBuilder.shaped(armorItem)
                    .pattern("x x")
                    .pattern("xxx")
                    .pattern("xxx")
                    .define('x', material)
                    .group("uc")
                    .unlockedBy("has_" + armorItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        } else if (part == BodyPart.LEGS)
        {
            ShapedRecipeBuilder.shaped(armorItem)
                    .pattern("xxx")
                    .pattern("x x")
                    .pattern("x x")
                    .define('x', material)
                    .group("uc")
                    .unlockedBy("has_" + armorItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        } else
        {
            ShapedRecipeBuilder.shaped(armorItem)
                    .pattern("x x")
                    .pattern("x x")
                    .define('x', material)
                    .group("uc")
                    .unlockedBy("has_" + armorItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        }
    }

    protected void BasicFoodRecipeBuilder(Item foodItem, Item input, Consumer<FinishedRecipe> consumer)
    {
        ShapelessRecipeBuilder.shapeless(foodItem)
                .requires(input, 4)
                .group("uc")
                .unlockedBy("has_" + input.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(consumer);
    }

    protected void StewFoodRecipeBuilder(Item result, Item input, Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(result)
                .pattern("x x")
                .pattern(" x ")
                .define('x', input)
                .group("uc")
                .unlockedBy("has_" + input.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(consumer);
    }

    protected void CookingFoodRecipeBuilder(Item foodItem, Item input, Consumer<FinishedRecipe> consumer)
    {
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(input), foodItem, 0.35f, 100, SimpleCookingSerializer.SMELTING_RECIPE)
                .group("uc")
                .unlockedBy("has_" + input, InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(consumer);
    }
}
