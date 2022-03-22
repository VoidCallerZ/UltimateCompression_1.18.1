package com.VoidCallerZ.uc.items.tools;

import com.VoidCallerZ.uc.setup.registration.ToolRegistration;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

import java.util.Random;

public class UcHoeItem extends HoeItem
{
    public UcHoeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties)
    {
        super(pTier, pAttackDamageModifier, (-4 + pAttackSpeedModifier), pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand)
    {
        ItemStack itemStack = pPlayer.getItemInHand(pUsedHand);
        float randomValue = new Random().nextFloat() > 0.66f ? Math.round(itemStack.getMaxDamage() * 0.05f) : 0;
        int currentFoodLevel = pPlayer.getFoodData().getFoodLevel();
        if (currentFoodLevel < 20)
        {
            if (itemStack.getItem() == ToolRegistration.COMPRESSED_WOODEN_HOE.get() || itemStack.getItem() == ToolRegistration.COMPRESSED_STONE_HOE.get())
            {
                //10 Uses = 10 Food
                pPlayer.getFoodData().setFoodLevel(currentFoodLevel + 1);
                itemStack.hurtAndBreak(Math.round(itemStack.getMaxDamage() * 0.1f + randomValue), pPlayer, (breakConsumer) -> breakConsumer.broadcastBreakEvent(pUsedHand));
            }
            if (itemStack.getItem() == ToolRegistration.COMPRESSED_IRON_HOE.get() || itemStack.getItem() == ToolRegistration.COMPRESSED_DIAMOND_HOE.get())
            {
                //20 Uses = 40 Food
                pPlayer.getFoodData().setFoodLevel(currentFoodLevel + 2);
                itemStack.hurtAndBreak(Math.round(itemStack.getMaxDamage() * 0.05f + randomValue), pPlayer, (breakConsumer) -> breakConsumer.broadcastBreakEvent(pUsedHand));
            }
            if (itemStack.getItem() == ToolRegistration.COMPRESSED_GOLD_HOE.get())
            {
                //20 Uses = 80 Food
                pPlayer.getFoodData().setFoodLevel(currentFoodLevel + 4);
                itemStack.hurtAndBreak(Math.round(itemStack.getMaxDamage() * 0.05f + randomValue), pPlayer, (breakConsumer) -> breakConsumer.broadcastBreakEvent(pUsedHand));
            }
            if (itemStack.getItem() == ToolRegistration.COMPRESSED_NETHERITE_HOE.get())
            {
                //100 Uses = 400 Food
                pPlayer.getFoodData().setFoodLevel(currentFoodLevel + 4);
                itemStack.hurtAndBreak(Math.round(itemStack.getMaxDamage() * 0.01f + randomValue), pPlayer, (breakConsumer) -> breakConsumer.broadcastBreakEvent(pUsedHand));
            }
        }

        return InteractionResultHolder.pass(pPlayer.getItemInHand(pUsedHand));
    }
}
