package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.dataGen.providers.BaseAdvancementProvider;
import com.VoidCallerZ.uc.registration.FoodRegistration;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import com.VoidCallerZ.uc.registration.ItemRegistration;
import com.VoidCallerZ.uc.registration.ToolRegistration;
import net.minecraft.advancements.*;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Consumer;

public class ucAdvancements extends BaseAdvancementProvider
{
    public ucAdvancements(DataGenerator generatorIn, ExistingFileHelper fileHelperIn)
    {
        super(generatorIn, fileHelperIn);
    }

    @Override
    protected void registerAdvancements(Consumer<Advancement> consumer, ExistingFileHelper fileHelper)
    {
        Advancement mainAdvancement = Advancement.Builder.advancement().display(BlockRegistration.UC_ICON.get().getDefaultInstance(),
                        Component.literal("Welcome to Ultimate Compression"),
                        Component.literal("This is the beginning of your Ultimate Compression adventure!"),
                        new ResourceLocation("textures/gui/advancements/backgrounds/adventure.png"),
                        FrameType.TASK,
                        true, true, false)
                .requirements(RequirementsStrategy.OR)
                .addCriterion("mined_compressed_iron_ore", InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistration.COMPRESSED_IRON_ORE.get()))
                .addCriterion("mined_compressed_gold_ore", InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistration.COMPRESSED_GOLD_ORE.get()))
                .addCriterion("mined_compressed_diamond_ore", InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistration.COMPRESSED_DIAMOND_ORE.get()))
                .rewards(AdvancementRewards.Builder.recipe(BlockRegistration.IRON_COMPRESSOR.getId()))
                .save(consumer, "mined_compressed_ore");

        BasicEatenAdvancement(FoodRegistration.COMPRESSED_PUFFERFISH, "Deadly Consumption",
                "You just ate a compressed pufferfish and are now suffering from the consequences",
                FrameType.CHALLENGE, "eaten_compressed_pufferfish", 200, mainAdvancement, consumer);

        BasicEatenAdvancement(FoodRegistration.COMPRESSED_ROTTEN_FLESH, "Desperate Measures",
                "When a single rotten flesh isn't enough to feed a family",
                FrameType.GOAL, "eaten_compressed_rotten_flesh", 25, mainAdvancement, consumer);

        BasicGatheredAdvancement(ItemRegistration.COMPRESSED_NETHERITE_INGOT, "Getting Rich",
                "A compressed piece of netherite? You didn't have anything else to do?",
                FrameType.GOAL, "gathered_compressed_netherite_ingot", 100, mainAdvancement, consumer);

        BasicGatheredAdvancement(BlockRegistration.COMPRESSED_NETHERITE_BLOCK_ITEM, "Richness Overload",
                "Bored? Dumb? Or just too rich for words?",
                FrameType.CHALLENGE, "gathered_compressed_netherite_block", 500, mainAdvancement, consumer);

        HoeItemGatheredAdvancement(ToolRegistration.COMPRESSED_NETHERITE_HOE, "Next Level Dedication",
                "Use 18 netherite ingots to create a compressed netherite hoe, and then return reevaluating your life choices",
                FrameType.CHALLENGE, "gathered_compressed_netherite_hoe", 200, mainAdvancement, consumer);
    }
}
