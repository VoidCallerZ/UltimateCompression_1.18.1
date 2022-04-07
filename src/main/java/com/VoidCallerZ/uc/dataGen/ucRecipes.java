package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.items.arrows.UcTippedArrowRecipe;
import com.VoidCallerZ.uc.setup.UcRecipeSerializer;
import com.VoidCallerZ.uc.setup.registration.*;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SimpleRecipeSerializer;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.RegistryEvent;

import java.util.function.Consumer;

public class ucRecipes extends BaseRecipeProvider
{
    public ucRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(Registration.ULTIMATE_POWERGEN.get())
                .pattern("iii")
                .pattern("iri")
                .pattern("iii")
                .define('i', Registration.COMPRESSED_IRON_INGOT.get())
                .define('r', Tags.Items.STORAGE_BLOCKS_REDSTONE)
                .group("uc")
                .unlockedBy("compressed_iron_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COMPRESSED_IRON_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Registration.COMPRESSOR.get())
                .pattern("iii")
                .pattern("dgd")
                .pattern("iii")
                .define('i', Registration.COMPRESSED_IRON_INGOT.get())
                .define('d', Items.DIAMOND)
                .define('g', Registration.COMPRESSED_GOLD_BLOCK.get())
                .group("uc")
                .unlockedBy("compressed_gold_iron_ingot_diamond", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COMPRESSED_GOLD_INGOT.get(),
                        Registration.COMPRESSED_IRON_INGOT.get(),
                        Items.DIAMOND))
                .save(consumer);

        //Compression & decompression of most blocks
        //Material Blocks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_IRON_BLOCK.get(),
                Registration.COMPRESSED_IRON_INGOT.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_GOLD_BLOCK.get(),
                Registration.COMPRESSED_GOLD_INGOT.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DIAMOND_BLOCK.get(),
                Registration.COMPRESSED_DIAMOND_GEM.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_COPPER_BLOCK.get(),
                Registration.COMPRESSED_COPPER_INGOT.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_COAL_BLOCK.get(),
                Registration.COMPRESSED_COAL.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_EMERALD_BLOCK.get(),
                Registration.COMPRESSED_EMERALD_GEM.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_LAPIS_BLOCK.get(),
                Registration.COMPRESSED_LAPIS.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_REDSTONE_BLOCK.get(),
                Registration.COMPRESSED_REDSTONE.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_NETHERITE_BLOCK.get(),
                Registration.COMPRESSED_NETHERITE_INGOT.get(), 9, consumer);

        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_IRON_INGOT.get(), Items.IRON_INGOT, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_GOLD_INGOT.get(), Items.GOLD_INGOT, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_DIAMOND_GEM.get(), Items.DIAMOND, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_COPPER_INGOT.get(), Items.COPPER_INGOT, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_COAL.get(), Items.COAL, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_EMERALD_GEM.get(), Items.EMERALD, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_LAPIS.get(), Items.LAPIS_LAZULI, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_REDSTONE.get(), Items.REDSTONE, 9, consumer);
        MaterialCompressionRecipeBuilder(Registration.COMPRESSED_NETHERITE_INGOT.get(), Items.NETHERITE_INGOT, 9, consumer);

        FourItemMaterialCompressionRecipeBuilder(Registration.COMPRESSED_NETHER_QUARTZ_BLOCK.get(), ItemRegistration.COMPRESSED_QUARTZ.get(), 4, consumer);

        //Raw Blocks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RAW_IRON_BLOCK.get(),
                Registration.COMPRESSED_RAW_IRON.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RAW_GOLD_BLOCK.get(),
                Registration.COMPRESSED_RAW_GOLD.get(), 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RAW_COPPER_BLOCK.get(),
                Registration.COMPRESSED_RAW_COPPER.get(), 9, consumer);

        //Basic Blocks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_ANDESITE.get(),
                Items.ANDESITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CALCITE.get(),
                Items.CALCITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_COBBLED_DEEPSLATE.get(),
                Items.COBBLED_DEEPSLATE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_COBBLESTONE.get(),
                Items.COBBLESTONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DEEPSLATE.get(),
                Items.DEEPSLATE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DIORITE.get(),
                Items.DIORITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DIRT.get(),
                Items.DIRT, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_GRANITE.get(),
                Items.GRANITE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_GRAVEL.get(),
                Items.GRAVEL, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_NETHERRACK.get(),
                Items.NETHERRACK, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_RED_SAND.get(),
                Items.RED_SAND, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SAND.get(),
                Items.SAND, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_STONE.get(),
                Items.STONE, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_TUFF.get(),
                Items.TUFF, 9, consumer);

        //Nether Blocks

        //Logs & Planks
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_ACACIA_LOG.get(),
                Items.ACACIA_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_ACACIA_PLANKS.get(),
                Items.ACACIA_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_BIRCH_LOG.get(),
                Items.BIRCH_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_BIRCH_PLANKS.get(),
                Items.BIRCH_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DARK_OAK_LOG.get(),
                Items.DARK_OAK_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_DARK_OAK_PLANKS.get(),
                Items.DARK_OAK_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_JUNGLE_LOG.get(),
                Items.JUNGLE_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_JUNGLE_PLANKS.get(),
                Items.JUNGLE_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_OAK_LOG.get(),
                Items.OAK_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_OAK_PLANKS.get(),
                Items.OAK_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SPRUCE_LOG.get(),
                Items.SPRUCE_LOG, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_SPRUCE_PLANKS.get(),
                Items.SPRUCE_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CRIMSON_STEM.get(),
                Items.CRIMSON_STEM, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_CRIMSON_PLANKS.get(),
                Items.CRIMSON_PLANKS, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_WARPED_STEM.get(),
                Items.WARPED_STEM, 9, consumer);
        CompressorDecompressorRecipeBuilder(Registration.COMPRESSED_WARPED_PLANKS.get(),
                Items.WARPED_PLANKS, 9, consumer);

        //Compressed Iron Ingot
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_IRON_ORE.get()), Registration.COMPRESSED_IRON_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.COMPRESSED_IRON_ORE.get()))
                .save(consumer, "compressed_iron_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_RAW_IRON.get()), Registration.COMPRESSED_IRON_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.COMPRESSED_RAW_IRON.get()))
                .save(consumer, "compressed_iron_ingot2");

        //Compressed Gold Ingot
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_GOLD_ORE.get()), Registration.COMPRESSED_GOLD_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.COMPRESSED_GOLD_ORE.get()))
                .save(consumer, "compressed_gold_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_RAW_GOLD.get()), Registration.COMPRESSED_GOLD_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.COMPRESSED_RAW_GOLD.get()))
                .save(consumer, "compressed_gold_ingot2");

        //Compressed Diamond
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_DIAMOND_ORE.get()), Registration.COMPRESSED_DIAMOND_GEM.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.COMPRESSED_DIAMOND_ORE.get()))
                .save(consumer, "compressed_diamond_gem");

        //Compressed Copper Ingot
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_COPPER_ORE.get()), Registration.COMPRESSED_COPPER_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.COMPRESSED_COPPER_ORE.get()))
                .save(consumer, "compressed_copper_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.COMPRESSED_RAW_COPPER.get()), Registration.COMPRESSED_COPPER_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.COMPRESSED_RAW_COPPER.get()))
                .save(consumer, "compressed_copper_ingot2");

        //TOOLS
        //Pickaxes
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_PICKAXE.get(), Registration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_PICKAXE.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_PICKAXE.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_PICKAXE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_PICKAXE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.PICKAXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_PICKAXE.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.PICKAXE, consumer);
        //Axes
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_AXE.get(), Registration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_AXE.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_AXE.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_AXE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_AXE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.AXE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_AXE.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.AXE, consumer);
        //Shovels
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_SHOVEL.get(), Registration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_SHOVEL.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_SHOVEL.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_SHOVEL.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_SHOVEL.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.SHOVEL, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_SHOVEL.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.SHOVEL, consumer);
        //Swords
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_SWORD.get(), Registration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_SWORD.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_SWORD.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_SWORD.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_SWORD.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.SWORD, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_SWORD.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.SWORD, consumer);
        //Hoes
        CompressedWoodenToolRecipeBuilder(ToolRegistration.COMPRESSED_WOODEN_HOE.get(), Registration.COMPRESSED_PLANKS_FOR_TOOLS, ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_STONE_HOE.get(), Registration.COMPRESSED_COBBLESTONE_ITEM.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_IRON_HOE.get(), Registration.COMPRESSED_IRON_INGOT.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_GOLD_HOE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_DIAMOND_HOE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), ToolType.HOE, consumer);
        CompressedToolRecipeBuilder(ToolRegistration.COMPRESSED_NETHERITE_HOE.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), ToolType.HOE, consumer);

        //ARMOR
        //Iron
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_HELMET.get(), Registration.COMPRESSED_IRON_INGOT.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_CHESTPLATE.get(), Registration.COMPRESSED_IRON_INGOT.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_LEGGINGS.get(), Registration.COMPRESSED_IRON_INGOT.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_IRON_BOOTS.get(), Registration.COMPRESSED_IRON_INGOT.get(), BodyPart.FEET, consumer);
        //Iron
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_HELMET.get(), Registration.COMPRESSED_GOLD_INGOT.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_CHESTPLATE.get(), Registration.COMPRESSED_GOLD_INGOT.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_LEGGINGS.get(), Registration.COMPRESSED_GOLD_INGOT.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_GOLD_BOOTS.get(), Registration.COMPRESSED_GOLD_INGOT.get(), BodyPart.FEET, consumer);
        //Iron
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_DIAMOND_HELMET.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_DIAMOND_CHESTPLATE.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_DIAMOND_LEGGINGS.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_DIAMOND_BOOTS.get(), Registration.COMPRESSED_DIAMOND_GEM.get(), BodyPart.FEET, consumer);
        //Iron
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_NETHERITE_HELMET.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.HEAD, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_NETHERITE_CHESTPLATE.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.CHEST, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_NETHERITE_LEGGINGS.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.LEGS, consumer);
        CompressedArmorRecipeBuilder(ArmorRegistration.COMPRESSED_NETHERITE_BOOTS.get(), Registration.COMPRESSED_NETHERITE_INGOT.get(), BodyPart.FEET, consumer);

        //FOOD
        //Basic (Raw) Food
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_APPLE.get(), Items.APPLE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_BEEF.get(), Items.BEEF, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_BEETROOT.get(), Items.BEETROOT, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_BREAD.get(), Items.BREAD, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_CARROT.get(), Items.CARROT, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_CHICKEN.get(), Items.CHICKEN, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_COD.get(), Items.COD, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKIE.get(), Items.COOKIE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_DRIED_KELP.get(), Items.DRIED_KELP, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_GLOW_BERRIES.get(), Items.GLOW_BERRIES, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_GOLDEN_APPLE.get(), Items.GOLDEN_APPLE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_ENCHANTED_GOLDEN_APPLE.get(), Items.ENCHANTED_GOLDEN_APPLE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_MELON_SLICE.get(), Items.MELON_SLICE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_MUTTON.get(), Items.MUTTON, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_POISONOUS_POTATO.get(), Items.POISONOUS_POTATO, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_PORKCHOP.get(), Items.PORKCHOP, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_POTATO.get(), Items.POTATO, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_PUFFERFISH.get(), Items.PUFFERFISH, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_PUMPKIN_PIE.get(), Items.PUMPKIN_PIE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_RABBIT.get(), Items.RABBIT, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_ROTTEN_FLESH.get(), Items.ROTTEN_FLESH, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_SALMON.get(), Items.SALMON, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_SPIDER_EYE.get(), Items.SPIDER_EYE, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_SWEET_BERRIES.get(), Items.SWEET_BERRIES, consumer);
        BasicFoodRecipeBuilder(FoodRegistration.COMPRESSED_TROPICAL_FISH.get(), Items.TROPICAL_FISH, consumer);
        //Stew Food
        StewFoodRecipeBuilder(FoodRegistration.COMPRESSED_BEETROOT_SOUP.get(), Items.BEETROOT_SOUP, consumer);
        StewFoodRecipeBuilder(FoodRegistration.COMPRESSED_MUSHROOM_STEW.get(), Items.MUSHROOM_STEW, consumer);
        StewFoodRecipeBuilder(FoodRegistration.COMPRESSED_RABBIT_STEW.get(), Items.RABBIT_STEW, consumer);
        //Cooking Food
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_BAKED_POTATO.get(), FoodRegistration.COMPRESSED_POTATO.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_BEEF.get(), FoodRegistration.COMPRESSED_BEEF.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_CHICKEN.get(), FoodRegistration.COMPRESSED_CHICKEN.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_COD.get(), FoodRegistration.COMPRESSED_COD.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_MUTTON.get(), FoodRegistration.COMPRESSED_MUTTON.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_PORKCHOP.get(), FoodRegistration.COMPRESSED_PORKCHOP.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_RABBIT.get(), FoodRegistration.COMPRESSED_RABBIT.get(), consumer);
        CookingFoodRecipeBuilder(FoodRegistration.COMPRESSED_COOKED_SALMON.get(), FoodRegistration.COMPRESSED_SALMON.get(), consumer);

        //Single Items
        MaterialCompressionRecipeBuilder(ItemRegistration.COMPRESSED_FLINT.get(), Items.FLINT, 9, consumer);

        //Arrows
        ShapedRecipeBuilder.shaped(ItemRegistration.COMPRESSED_ARROW.get(), 4)
                .pattern("x")
                .pattern("s")
                .pattern("f")
                .define('x', ItemRegistration.COMPRESSED_FLINT.get())
                .define('s', Items.STICK)
                .define('f', Items.FEATHER)
                .group("uc")
                .unlockedBy("has_" + ItemRegistration.COMPRESSED_FLINT.get().getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COMPRESSED_FLINT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ItemRegistration.COMPRESSED_SPECTRAL_ARROW.get(), 2)
                .pattern(" x ")
                .pattern("xax")
                .pattern(" x ")
                .define('x', Items.GLOWSTONE_DUST)
                .define('a', ItemRegistration.COMPRESSED_ARROW.get())
                .group("uc")
                .unlockedBy("has_" + ItemRegistration.COMPRESSED_ARROW.get().getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COMPRESSED_ARROW.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistration.COMPRESSED_TIPPED_ARROW.get(), 8)
                .pattern("xxx")
                .pattern("xpx")
                .pattern("xxx")
                .define('x', ItemRegistration.COMPRESSED_ARROW.get())
                .define('p', Items.LINGERING_POTION)
                .group("uc")
                .unlockedBy("has_" + Items.LINGERING_POTION.getRegistryName(), InventoryChangeTrigger.TriggerInstance.hasItems(Items.LINGERING_POTION))
                .save(consumer);

//        UcTippedArrowRecipe ucTippedArrowRecipe = new UcTippedArrowRecipe(new ResourceLocation("item/generated"));
//        SpecialRecipeBuilder.special(ucTippedArrowRecipe.getSerializer()).save(consumer, "compressed_tipped_arrow");

        //SpecialRecipeBuilder.special(UcRecipeSerializer.COMPRESSED_TIPPED_ARROW).save(consumer, "compressed_tipped_arrow");
    }
}
