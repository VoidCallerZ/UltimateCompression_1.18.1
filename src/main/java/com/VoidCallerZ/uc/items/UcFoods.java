package com.VoidCallerZ.uc.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class UcFoods
{
    //Hunger = nutrition()
    //Saturation = (nutrition() / saturationMod()) * 2

    public static final FoodProperties COMPRESSED_APPLE = new FoodProperties.Builder().nutrition(8).saturationMod(0.9f).build();
    public static final FoodProperties COMPRESSED_BAKED_POTATO = new FoodProperties.Builder().nutrition(10).saturationMod(1.8f).build();
    public static final FoodProperties COMPRESSED_BEEF = new FoodProperties.Builder().nutrition(4).saturationMod(0.4f).build();
    public static final FoodProperties COMPRESSED_BEETROOT = new FoodProperties.Builder().nutrition(2).saturationMod(1.2f).build();
    public static final FoodProperties COMPRESSED_BEETROOT_SOUP = stew(12).build();
    public static final FoodProperties COMPRESSED_BREAD = new FoodProperties.Builder().nutrition(10).saturationMod(1.8f).build();
    public static final FoodProperties COMPRESSED_CARROT = new FoodProperties.Builder().nutrition(6).saturationMod(1.8f).build();
    public static final FoodProperties COMPRESSED_CHICKEN = new FoodProperties.Builder().nutrition(4).saturationMod(0.9f).effect(new MobEffectInstance(MobEffects.HUNGER, 1800, 2), 0.3f).meat().build();
    public static final FoodProperties COMPRESSED_COD = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties COMPRESSED_COOKED_BEEF = new FoodProperties.Builder().nutrition(16).saturationMod(2.4f).build();
    public static final FoodProperties COMPRESSED_COOKED_CHICKEN = new FoodProperties.Builder().nutrition(12).saturationMod(1.8f).build();
    public static final FoodProperties COMPRESSED_COOKED_COD = new FoodProperties.Builder().nutrition(10).saturationMod(1.8f).build();
    public static final FoodProperties COMPRESSED_COOKED_MUTTON = new FoodProperties.Builder().nutrition(12).saturationMod(2.4f).build();
    public static final FoodProperties COMPRESSED_COOKED_PORKCHOP = new FoodProperties.Builder().nutrition(16).saturationMod(2.4f).build();
    public static final FoodProperties COMPRESSED_COOKED_RABBIT = new FoodProperties.Builder().nutrition(10).saturationMod(1.8f).build();
    public static final FoodProperties COMPRESSED_COOKED_SALMON = new FoodProperties.Builder().nutrition(12).saturationMod(2.4f).build();
    public static final FoodProperties COMPRESSED_COOKIE = new FoodProperties.Builder().nutrition(4).saturationMod(0.4f).build();
    public static final FoodProperties COMPRESSED_DRIED_KELP = new FoodProperties.Builder().nutrition(2).saturationMod(0.9f).build();
    public static final FoodProperties COMPRESSED_GLOW_BERRIES = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties COMPRESSED_GOLDEN_APPLE = new FoodProperties.Builder().nutrition(8).saturationMod(3.6f).effect(new MobEffectInstance(MobEffects.REGENERATION, 300, 2), 1.0f).effect(new MobEffectInstance(MobEffects.ABSORPTION, 7200, 2), 1.0f).alwaysEat().build();
    public static final FoodProperties COMPRESSED_ENCHANTED_GOLDEN_APPLE = new FoodProperties.Builder().nutrition(8).saturationMod(3.6f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 3), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 18000, 2), 1.0F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 18000, 2), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 7200, 5), 1.0F).alwaysEat().build();
    public static final FoodProperties COMPRESSED_MELON_SLICE = new FoodProperties.Builder().nutrition(4).saturationMod(0.9f).build();
    public static final FoodProperties COMPRESSED_MUSHROOM_STEW = stew(6).build();
    public static final FoodProperties COMPRESSED_MUTTON = new FoodProperties.Builder().nutrition(4).saturationMod(0.9f).build();
    public static final FoodProperties COMPRESSED_POISONOUS_POTATO = new FoodProperties.Builder().nutrition(4).saturationMod(0.9f).effect(new MobEffectInstance(MobEffects.POISON, 300, 2), 0.6F).build();
    public static final FoodProperties COMPRESSED_PORKCHOP = new FoodProperties.Builder().nutrition(6).saturationMod(0.9f).build();
    public static final FoodProperties COMPRESSED_POTATO = new FoodProperties.Builder().nutrition(2).saturationMod(0.9f).build();
    public static final FoodProperties COMPRESSED_PUFFERFISH = new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).effect(new MobEffectInstance(MobEffects.POISON, 3600, 2), 1.0F).effect(new MobEffectInstance(MobEffects.HUNGER, 900, 4), 1.0F).effect(new MobEffectInstance(MobEffects.CONFUSION, 900, 2), 1.0F).effect(new MobEffectInstance(MobEffects.BLINDNESS, 200, 5), 1.0F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 900, 2), 1.0F).build();
    public static final FoodProperties COMPRESSED_PUMPKIN_PIE = new FoodProperties.Builder().nutrition(16).saturationMod(0.9f).build();
    public static final FoodProperties COMPRESSED_RABBIT = new FoodProperties.Builder().nutrition(6).saturationMod(0.9f).build();
    public static final FoodProperties COMPRESSED_RABBIT_STEW = stew(10).build();
    public static final FoodProperties COMPRESSED_ROTTEN_FLESH = new FoodProperties.Builder().nutrition(8).saturationMod(0.3f).effect(new MobEffectInstance(MobEffects.HUNGER, 1800, 2), 1F).meat().build();
    public static final FoodProperties COMPRESSED_SALMON = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties COMPRESSED_SPIDER_EYE = new FoodProperties.Builder().nutrition(4).saturationMod(2.4f).effect(new MobEffectInstance(MobEffects.POISON, 300, 2), 1.0F).build();
    public static final FoodProperties COMPRESSED_SWEET_BERRIES = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties COMPRESSED_TROPICAL_FISH = new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build();

    private static FoodProperties.Builder stew(int nutrition)
    {
        return (new FoodProperties.Builder().nutrition(nutrition).saturationMod(1.8f));
    }
}
