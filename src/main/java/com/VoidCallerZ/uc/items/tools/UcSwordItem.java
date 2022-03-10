package com.VoidCallerZ.uc.items.tools;

import com.VoidCallerZ.uc.setup.ToolRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class UcSwordItem extends SwordItem
{
    public UcSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties)
    {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected)
    {
        if (pEntity instanceof Player)
        {
            Player player = (Player) pEntity;
            if (pIsSelected)
            {
                if (pStack.getItem() == ToolRegistration.COMPRESSED_WOODEN_SWORD.get() || pStack.getItem() == ToolRegistration.COMPRESSED_STONE_SWORD.get())
                {
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 0));
                }
                else if (pStack.getItem() == ToolRegistration.COMPRESSED_IRON_SWORD.get() || pStack.getItem() == ToolRegistration.COMPRESSED_DIAMOND_SWORD.get())
                {
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 1));
                }
                else if (pStack.getItem() == ToolRegistration.COMPRESSED_GOLD_SWORD.get())
                {
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 1));
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1, 1));
                }
                else if (pStack.getItem() == ToolRegistration.COMPRESSED_NETHERITE_SWORD.get())
                {
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 2));
                }
            }
        }
    }

    @Override
    public boolean mineBlock(ItemStack pStack, Level pLevel, BlockState pState, BlockPos pPos, LivingEntity pEntityLiving)
    {
        pStack.hurtAndBreak(2, pEntityLiving, (breakConsumer) -> breakConsumer.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        return true;
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker)
    {
        pStack.hurtAndBreak(1, pAttacker, (breakConsumer) -> breakConsumer.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        if (pStack.getItem() == ToolRegistration.COMPRESSED_IRON_SWORD.get() ||
                pStack.getItem() == ToolRegistration.COMPRESSED_DIAMOND_SWORD.get() ||
                pStack.getItem() == ToolRegistration.COMPRESSED_GOLD_SWORD.get() ||
                pStack.getItem() == ToolRegistration.COMPRESSED_DIAMOND_SWORD.get())
        {
            if (new Random().nextFloat() > 0.5f)
            {
                pStack.hurtAndBreak(2, pAttacker, (breakConsumer) -> breakConsumer.broadcastBreakEvent(EquipmentSlot.MAINHAND));
            }
        }
        return true;
    }
}
