package com.VoidCallerZ.uc.items.tools;

import com.VoidCallerZ.uc.setup.registration.ToolRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class UcPickaxeItem extends PickaxeItem
{
    public UcPickaxeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties)
    {
        super(pTier, pAttackDamageModifier, (-4 + pAttackSpeedModifier), pProperties);
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected)
    {
        if (pEntity instanceof Player)
        {
            Player player = (Player) pEntity;
            if (pIsSelected)
            {
                if (pStack.getItem() == ToolRegistration.COMPRESSED_WOODEN_PICKAXE.get() || pStack.getItem() == ToolRegistration.COMPRESSED_STONE_PICKAXE.get())
                {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1, 0));
                }
                else if (pStack.getItem() == ToolRegistration.COMPRESSED_IRON_PICKAXE.get() || pStack.getItem() == ToolRegistration.COMPRESSED_DIAMOND_PICKAXE.get())
                {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1, 1));
                }
                else if (pStack.getItem() == ToolRegistration.COMPRESSED_GOLD_PICKAXE.get())
                {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1, 2));
                }
                else if (pStack.getItem() == ToolRegistration.COMPRESSED_NETHERITE_PICKAXE.get())
                {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1, 1));
                }
            }
        }
    }

    @Override
    public boolean mineBlock(ItemStack pStack, Level pLevel, BlockState pState, BlockPos pPos, LivingEntity pEntityLiving)
    {
        pStack.hurtAndBreak(1, pEntityLiving, (breakConsumer) -> breakConsumer.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        if (pStack.getItem() == ToolRegistration.COMPRESSED_IRON_PICKAXE.get() ||
        pStack.getItem() == ToolRegistration.COMPRESSED_GOLD_PICKAXE.get() ||
        pStack.getItem() == ToolRegistration.COMPRESSED_DIAMOND_PICKAXE.get())
        {
            if (new Random().nextFloat() > 0.5f)
            {
                pStack.hurtAndBreak(2, pEntityLiving, (breakConsumer) -> breakConsumer.broadcastBreakEvent(EquipmentSlot.MAINHAND));
            }
        }
        return true;
    }
}
