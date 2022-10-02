package com.VoidCallerZ.uc.dataGen.providers;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.ConsumeItemTrigger;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

public abstract class BaseAdvancementProvider extends AdvancementProvider
{
    public BaseAdvancementProvider(DataGenerator generatorIn, ExistingFileHelper fileHelperIn)
    {
        super(generatorIn, fileHelperIn);
    }

    protected void BasicEatenAdvancement(RegistryObject<Item> item, String title, String description, FrameType frameType,
                                         String criterionName, int amountOfExp, Advancement parent, Consumer<Advancement> consumer)
    {
        Advancement.Builder.advancement().display(item.get().getDefaultInstance(),
                        new TextComponent(title),
                        new TextComponent(description),
                        new ResourceLocation("textures/gui/advancements/backgrounds/adventure.png"),
                        frameType,
                        true,
                        true,
                        true)
                .requirements(RequirementsStrategy.OR)
                .addCriterion(criterionName, ConsumeItemTrigger.TriggerInstance.usedItem(item.get()))
                .rewards(AdvancementRewards.Builder.experience(amountOfExp))
                .parent(parent)
                .save(consumer, "uc_consumption_advancements_" + item.get());
    }

    protected void BasicGatheredAdvancement(RegistryObject<Item> item, String title, String description, FrameType frameType,
                                         String criterionName, int amountOfExp, Advancement parent, Consumer<Advancement> consumer)
    {
        Advancement.Builder.advancement().display(item.get().getDefaultInstance(),
                        new TextComponent(title),
                        new TextComponent(description),
                        new ResourceLocation("textures/gui/advancements/backgrounds/adventure.png"),
                        frameType,
                        true,
                        true,
                        true)
                .requirements(RequirementsStrategy.OR)
                .addCriterion(criterionName, InventoryChangeTrigger.TriggerInstance.hasItems(item.get()))
                .rewards(AdvancementRewards.Builder.experience(amountOfExp))
                .parent(parent)
                .save(consumer, "uc_gathering_advancements_" + item.get());
    }

    protected void HoeItemGatheredAdvancement(RegistryObject<HoeItem> item, String title, String description, FrameType frameType,
                                              String criterionName, int amountOfExp, Advancement parent, Consumer<Advancement> consumer)
    {
        Advancement.Builder.advancement().display(item.get().getDefaultInstance(),
                        new TextComponent(title),
                        new TextComponent(description),
                        new ResourceLocation("textures/gui/advancements/backgrounds/adventure.png"),
                        frameType,
                        true,
                        true,
                        true)
                .requirements(RequirementsStrategy.OR)
                .addCriterion(criterionName, InventoryChangeTrigger.TriggerInstance.hasItems(item.get()))
                .rewards(AdvancementRewards.Builder.experience(amountOfExp))
                .parent(parent)
                .save(consumer, "uc_gathering_advancements_" + item.get());
    }
}
