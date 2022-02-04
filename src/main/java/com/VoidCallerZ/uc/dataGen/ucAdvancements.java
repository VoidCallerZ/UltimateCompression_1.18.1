package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.setup.FoodRegistration;
import net.minecraft.advancements.*;
import net.minecraft.advancements.critereon.ConsumeItemTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.network.chat.TextComponent;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Consumer;

public class ucAdvancements extends AdvancementProvider
{
    public ucAdvancements(DataGenerator generatorIn, ExistingFileHelper fileHelperIn)
    {
        super(generatorIn, fileHelperIn);
    }

    @Override
    protected void registerAdvancements(Consumer<Advancement> consumer, ExistingFileHelper fileHelper)
    {
        Advancement.Builder.advancement().display(new DisplayInfo(FoodRegistration.COMPRESSED_PUFFERFISH.get().getDefaultInstance(),
                new TextComponent("Deadly Consumption"),
                new TextComponent("You just ate a compressed pufferfish and are now suffering from the consequences"),
                null,
                FrameType.CHALLENGE,
                true,
                true,
                true))
                .requirements(RequirementsStrategy.OR).addCriterion("eaten_compressed_pufferfish", ConsumeItemTrigger.TriggerInstance.usedItem(FoodRegistration.COMPRESSED_PUFFERFISH.get()))
                .rewards(AdvancementRewards.Builder.experience(200))
                .save(consumer, "consome_compressed_pufferfish");

        Advancement.Builder.advancement().display(new DisplayInfo(FoodRegistration.COMPRESSED_ROTTEN_FLESH.get().getDefaultInstance(),
                        new TextComponent("Desperate Measures"),
                        new TextComponent("When a single rotten flesh isn't enough to feed a family"),
                        null,
                        FrameType.GOAL,
                        true,
                        true,
                        true))
                .requirements(RequirementsStrategy.OR).addCriterion("eaten_compressed_rotten_flesh", ConsumeItemTrigger.TriggerInstance.usedItem(FoodRegistration.COMPRESSED_ROTTEN_FLESH.get()))
                .rewards(AdvancementRewards.Builder.experience(25))
                .save(consumer, "consome_compressed_rotten_flesh");
    }
}
