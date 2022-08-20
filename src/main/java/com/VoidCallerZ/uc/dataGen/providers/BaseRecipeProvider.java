package com.VoidCallerZ.uc.dataGen.providers;

import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.client.tutorial.FindTreeTutorialStepInstance;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public abstract class BaseRecipeProvider extends RecipeProvider implements IConditionBuilder
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

    public enum ColorBlockType
    {
        WOOL,
        CONCRETE,
        CONCRETE_POWDER,
        TERRACOTTA
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
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(compressedItem), InventoryChangeTrigger.TriggerInstance.hasItems(compressedItem))
                .save(consumer, ForgeRegistries.BLOCKS.getKey(compressedBlock) + "_uc1");

        ShapelessRecipeBuilder.shapeless(compressedItem, decompAmountItem)
                .requires(compressedBlock)
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.BLOCKS.getKey(compressedBlock), InventoryChangeTrigger.TriggerInstance.hasItems(compressedBlock))
                .save(consumer, ForgeRegistries.ITEMS.getKey(compressedItem) + "_uc1");
    }

    protected void StainedGlassRecipeBuilder(Block compressedBlock, Item unCompressedBlock, Item dye, Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(compressedBlock)
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', unCompressedBlock)
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(unCompressedBlock), InventoryChangeTrigger.TriggerInstance.hasItems(unCompressedBlock))
                .save(consumer, ForgeRegistries.BLOCKS.getKey(compressedBlock) + "_ucglass");

        ShapelessRecipeBuilder.shapeless(unCompressedBlock, 9)
                .requires(compressedBlock)
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.BLOCKS.getKey(compressedBlock), InventoryChangeTrigger.TriggerInstance.hasItems(compressedBlock))
                .save(consumer);

        ShapedRecipeBuilder.shaped(compressedBlock, 8)
                .pattern("xxx")
                .pattern("x#x")
                .pattern("xxx")
                .define('#', dye)
                .define('x', compressedBlock)
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(dye), InventoryChangeTrigger.TriggerInstance.hasItems(dye))
                .save(consumer);
    }

    protected void CompressedWoolRecipeBuilder(Block compressedBlock, Item compressedItem, ColorBlockType blockType, Item colorItem, Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(compressedBlock)
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', compressedItem)
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.BLOCKS.getKey(compressedBlock), InventoryChangeTrigger.TriggerInstance.hasItems(compressedItem))
                .save(consumer, ForgeRegistries.BLOCKS.getKey(compressedBlock) + "_uc2");

        if (blockType == ColorBlockType.WOOL)
        {
            ShapelessRecipeBuilder.shapeless(compressedBlock, 1)
                    .requires(BlockRegistration.COMPRESSED_WHITE_WOOL.get())
                    .requires(colorItem)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.BLOCKS.getKey(compressedBlock), InventoryChangeTrigger.TriggerInstance.hasItems(compressedBlock))
                    .save(consumer, ForgeRegistries.BLOCKS.getKey(compressedBlock) + "_uc2_alt");
        }
        else if (blockType == ColorBlockType.CONCRETE)
        {
            ShapelessRecipeBuilder.shapeless(compressedBlock, 1)
                    .requires(BlockRegistration.COMPRESSED_WHITE_CONCRETE.get())
                    .requires(colorItem)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.BLOCKS.getKey(compressedBlock), InventoryChangeTrigger.TriggerInstance.hasItems(compressedBlock))
                    .save(consumer, ForgeRegistries.BLOCKS.getKey(compressedBlock) + "_uc2_alt");
        }
        else if (blockType == ColorBlockType.CONCRETE_POWDER)
        {
            ShapelessRecipeBuilder.shapeless(compressedBlock, 1)
                    .requires(BlockRegistration.COMPRESSED_WHITE_CONCRETE_POWDER.get())
                    .requires(colorItem)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.BLOCKS.getKey(compressedBlock), InventoryChangeTrigger.TriggerInstance.hasItems(compressedBlock))
                    .save(consumer, ForgeRegistries.BLOCKS.getKey(compressedBlock) + "_uc2_alt");
        }

        ShapelessRecipeBuilder.shapeless(compressedItem, 9)
                .requires(compressedBlock)
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(compressedItem), InventoryChangeTrigger.TriggerInstance.hasItems(compressedItem))
                .save(consumer, ForgeRegistries.ITEMS.getKey(compressedItem) + "_uc2");
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
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(compressedItem), InventoryChangeTrigger.TriggerInstance.hasItems(uncompressedItem))
                .save(consumer, ForgeRegistries.ITEMS.getKey(compressedItem) + "_uc3");

        ShapelessRecipeBuilder.shapeless(uncompressedItem, decompAmountItem)
                .requires(compressedItem)
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(compressedItem), InventoryChangeTrigger.TriggerInstance.hasItems(compressedItem))
                .save(consumer, ForgeRegistries.ITEMS.getKey(uncompressedItem) + "_uc3");
    }

    protected void FourItemMaterialCompressionRecipeBuilder(Block compressedItem, Item uncompressedItem, int decompAmountItem, Consumer<FinishedRecipe> consumer)
    {
        ShapelessRecipeBuilder.shapeless(compressedItem, 1)
                .requires(uncompressedItem, 4)
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(uncompressedItem), InventoryChangeTrigger.TriggerInstance.hasItems(compressedItem))
                .save(consumer, ForgeRegistries.BLOCKS.getKey(compressedItem) + "_uc4");

        ShapelessRecipeBuilder.shapeless(uncompressedItem, decompAmountItem)
                .requires(compressedItem)
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(uncompressedItem), InventoryChangeTrigger.TriggerInstance.hasItems(compressedItem))
                .save(consumer, ForgeRegistries.ITEMS.getKey(uncompressedItem) + "_uc4");
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
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem));
        } else if (tool == ToolType.AXE)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern("sx")
                    .pattern("s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem));
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern("xs")
                    .pattern(" s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem) + "_alt");
        } else if (tool == ToolType.SHOVEL)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("x")
                    .pattern("s")
                    .pattern("s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem));
        } else if (tool == ToolType.SWORD)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("x")
                    .pattern("x")
                    .pattern("s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem));
        } else
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern("s ")
                    .pattern("s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem));
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern(" s")
                    .pattern(" s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem) + "_alt");
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
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem));
        } else if (tool == ToolType.AXE)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern("sx")
                    .pattern("s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem));
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern("xs")
                    .pattern(" s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem) + "_alt");
        } else if (tool == ToolType.SHOVEL)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("x")
                    .pattern("s")
                    .pattern("s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem));
        } else if (tool == ToolType.SWORD)
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("x")
                    .pattern("x")
                    .pattern("s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem));
        } else
        {
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern("s ")
                    .pattern("s ")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem));
            ShapedRecipeBuilder.shaped(toolItem)
                    .pattern("xx")
                    .pattern(" s")
                    .pattern(" s")
                    .define('x', material)
                    .define('s', Items.STICK)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(toolItem), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer, ForgeRegistries.ITEMS.getKey(toolItem) + "_alt");
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
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(armorItem), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        } else if (part == BodyPart.CHEST)
        {
            ShapedRecipeBuilder.shaped(armorItem)
                    .pattern("x x")
                    .pattern("xxx")
                    .pattern("xxx")
                    .define('x', material)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(armorItem), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        } else if (part == BodyPart.LEGS)
        {
            ShapedRecipeBuilder.shaped(armorItem)
                    .pattern("xxx")
                    .pattern("x x")
                    .pattern("x x")
                    .define('x', material)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(armorItem), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        } else
        {
            ShapedRecipeBuilder.shaped(armorItem)
                    .pattern("x x")
                    .pattern("x x")
                    .define('x', material)
                    .group("uc")
                    .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(armorItem), InventoryChangeTrigger.TriggerInstance.hasItems(material))
                    .save(consumer);
        }
    }

    protected void BasicFoodRecipeBuilder(Item foodItem, Item input, Consumer<FinishedRecipe> consumer)
    {
        ShapelessRecipeBuilder.shapeless(foodItem)
                .requires(input, 4)
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(input), InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(consumer);
    }

    protected void StewFoodRecipeBuilder(Item result, Item input, Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(result)
                .pattern("x x")
                .pattern(" x ")
                .define('x', input)
                .group("uc")
                .unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(input), InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(consumer);
    }

    protected void CookingFoodRecipeBuilder(Item foodItem, Item input, Consumer<FinishedRecipe> consumer)
    {
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(input), foodItem, 0.35f, 100, SimpleCookingSerializer.SMELTING_RECIPE)
                .group("uc")
                .unlockedBy("has_" + input, InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(consumer);
    }

    protected void BlockSmeltingRecipeBuilder(Block input, Item output, float exp, int cookingTime, Consumer<FinishedRecipe> consumer)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), output, exp, cookingTime).unlockedBy("has_smelting_", has(input)).group("uc").save(consumer, ForgeRegistries.BLOCKS.getKey(input) + "_smelting");
    }

    protected void BlockSmeltingRecipeBuilder(Block input, Item alternateInput, Item output, float exp, int cookingTime, Consumer<FinishedRecipe> consumer)
    {
        BlockSmeltingRecipeBuilder(input, output, exp, cookingTime, consumer);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(alternateInput), output, exp, cookingTime).unlockedBy("has_smelting_", has(alternateInput)).group("uc").save(consumer, ForgeRegistries.ITEMS.getKey(alternateInput) + "_smelting");
    }

    protected void BlockBlastingRecipeBuilder(Block input, Item output, float exp, int cookingTime, Consumer<FinishedRecipe> consumer)
    {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(input), output, exp, cookingTime).unlockedBy("has_blasting_", has(input)).group("uc").save(consumer, ForgeRegistries.BLOCKS.getKey(input) + "_blasting");
    }

    protected void BlockBlastingRecipeBuilder(Block input, Item alternateInput, Item output, float exp, int cookingTime, Consumer<FinishedRecipe> consumer)
    {
        BlockBlastingRecipeBuilder(input, output, exp, cookingTime, consumer);
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(alternateInput), output, exp, cookingTime).unlockedBy("has_blasting_", has(alternateInput)).group("uc").save(consumer, ForgeRegistries.ITEMS.getKey(alternateInput) + "_blasting");
    }
}
