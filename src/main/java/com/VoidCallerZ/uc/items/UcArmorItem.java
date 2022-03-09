package com.VoidCallerZ.uc.items;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;

public class UcArmorItem extends ArmorItem
{
    private static final Map<ArmorMaterial, MobEffectInstance> COMPRESSED_IRON_ARMOR_MAP = (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
            .put(UcArmorMaterial.COMPRESSED_IRON, new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0)).build();
    private static final Map<ArmorMaterial, MobEffectInstance> COMPRESSED_GOLD_ARMOR_MAP = (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
            .put(UcArmorMaterial.COMPRESSED_GOLD, new MobEffectInstance(MobEffects.ABSORPTION, 200, 0)).build();
    private static final Map<ArmorMaterial, MobEffectInstance> COMPRESSED_DIAMOND_ARMOR_MAP = (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
            .put(UcArmorMaterial.COMPRESSED_DIAMOND, new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0)).build();
    private static final Map<ArmorMaterial, MobEffectInstance> COMPRESSED_NETHERITE_ARMOR_MAP = (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
            .put(UcArmorMaterial.COMPRESSED_NETHERITE, new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 0)).build();

    public UcArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings)
    {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player)
    {
        if (!world.isClientSide())
        {
            if (hasFullSuitOfArmorOn(player))
            {
                if(stack.getItem().toString().contains("compressed_iron_"))
                {
                    evaluateArmorEffects(player, COMPRESSED_IRON_ARMOR_MAP);
                }
                else if (stack.getItem().toString().contains("compressed_gold_"))
                {
                    evaluateArmorEffects(player, COMPRESSED_GOLD_ARMOR_MAP);
                }
                else if (stack.getItem().toString().contains("compressed_diamond_"))
                {
                    evaluateArmorEffects(player, COMPRESSED_DIAMOND_ARMOR_MAP);
                }
                else if (stack.getItem().toString().contains("compressed_netherite_"))
                {
                    evaluateArmorEffects(player, COMPRESSED_NETHERITE_ARMOR_MAP);
                }
            }
        }
    }

    private void evaluateArmorEffects(Player player, Map<ArmorMaterial, MobEffectInstance> map)
    {
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : map.entrySet())
        {
            ArmorMaterial armorMaterial = entry.getKey();
            MobEffectInstance mobEffectInstance = entry.getValue();
            if (hasCorrectArmorOn(armorMaterial, player))
            {
                addStatusEffectForMaterial(player, armorMaterial, mobEffectInstance);
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial, MobEffectInstance mapStatusEffect)
    {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if (hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect)
        {
            player.addEffect(new MobEffectInstance(mapStatusEffect.getEffect(), mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier(),
                    false, false));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player)
    {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack chestplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !chestplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player)
    {
        ArmorItem boots = ((ArmorItem) player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem) player.getInventory().getArmor(1).getItem());
        ArmorItem chestplate = ((ArmorItem) player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem) player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && chestplate.getMaterial() == material && leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}
