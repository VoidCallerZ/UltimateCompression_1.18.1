package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
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
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(compressedItem, decompAmountItem)
                .requires(compressedBlock)
                .unlockedBy("has_" + compressedItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(compressedBlock))
                .save(consumer);
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
                    .save(consumer);
        }
        else if (tool == ToolType.AXE)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern(" xx")
                    .pattern(" sx")
                    .pattern(" s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        }
        else if (tool == ToolType.SHOVEL)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern(" x ")
                    .pattern(" s ")
                    .pattern(" s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        }
        else if (tool == ToolType.SWORD)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern(" x ")
                    .pattern(" x ")
                    .pattern(" s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        }
        else
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern(" xx")
                    .pattern(" s ")
                    .pattern(" s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + toolItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        }
    }

    protected void CompressedArmorRecipleBuilder(Item armorItem, Item material, BodyPart part, Consumer<FinishedRecipe> consumer)
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
        }
        else if (part == BodyPart.CHEST)
        {
            ShapedRecipeBuilder.shaped(armorItem)
                    .pattern("x x")
                    .pattern("xxx")
                    .pattern("xxx")
                    .define('x', material)
                    .group("uc")
                    .unlockedBy("has_" + armorItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        }
        else if (part == BodyPart.LEGS)
        {
            ShapedRecipeBuilder.shaped(armorItem)
                    .pattern("xxx")
                    .pattern("x x")
                    .pattern("x x")
                    .define('x', material)
                    .group("uc")
                    .unlockedBy("has_" + armorItem.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        }
        else
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
}
