package com.VoidCallerZ.uc.world.entity.projectile;

import com.VoidCallerZ.uc.setup.registration.ItemRegistration;
import com.google.common.collect.Sets;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Collection;
import java.util.Set;

public class CompressedArrow extends AbstractArrow
{
    private static final int EXPOSED_POTION_DECAY_TIME = 600;
    private static final int NO_EFFECT_COLOR = -1;
    private static final EntityDataAccessor<Integer> ID_EFFECT_COLOR = SynchedEntityData.defineId(CompressedArrow.class, EntityDataSerializers.INT);
    private static final byte EVENT_POTION_PUFF = 0;
    private Potion potion = Potions.EMPTY;
    private final Set<MobEffectInstance> effects = Sets.newHashSet();
    private boolean fixedColor;

    public CompressedArrow(EntityType<? extends CompressedArrow> entityType, Level level)
    {
        super(entityType, level);
    }

    public CompressedArrow(Level level, double x, double y, double z)
    {
        super(ItemRegistration.COMPRESSED_ARROW_ENTITY.get(), x, y, z, level);
    }

    public CompressedArrow(Level level, LivingEntity entity)
    {
        super(ItemRegistration.COMPRESSED_ARROW_ENTITY.get(), entity, level);
    }

//    public void setEffectsFromItem(ItemStack stack)
//    {
//        if (stack.is(ItemRegistration.COMPRESSED_TIPPED_ARROW.get()))
//        {
//            this.potion = PotionUtils.getPotion(stack);
//            Collection<MobEffectInstance> collection = PotionUtils.getCustomEffects(stack);
//            if (!collection.isEmpty())
//            {
//                for (MobEffectInstance mobEffectInstance : collection)
//                {
//                    this.effects.add(new MobEffectInstance(mobEffectInstance));
//                }
//            }
//            int i = getCustomColor(stack);
//            if (i == -1)
//            {
//                this.updateColor();
//            }
//            else
//            {
//                this.setFixedColor(i);
//            }
//        }
//        else if (stack.is(ItemRegistration.COMPRESSED_ARROW.get()))
//        {
//            this.potion = Potions.EMPTY;
//            this.effects.clear();
//            this.entityData.set(ID_EFFECT_COLOR, -1);
//        }
//    }

    public static int getCustomColor(ItemStack stack)
    {
        CompoundTag compoundTag = stack.getTag();
        return compoundTag != null && compoundTag.contains("CustomPotionColor", 99) ? compoundTag.getInt("CustomPotionColor") : -1;
    }

    private void updateColor()
    {
        this.fixedColor = false;
        if (this.potion == Potions.EMPTY && this.effects.isEmpty())
        {
            this.entityData.set(ID_EFFECT_COLOR, -1);
        }
        else
        {
            this.entityData.set(ID_EFFECT_COLOR, PotionUtils.getColor(PotionUtils.getAllEffects(this.potion, this.effects)));
        }
    }

    public void addEffect(MobEffectInstance effect)
    {
        this.effects.add(effect);
        this.getEntityData().set(ID_EFFECT_COLOR, PotionUtils.getColor(PotionUtils.getAllEffects(this.potion, this.effects)));
    }

    protected void defineSynchedData()
    {
        super.defineSynchedData();
        this.entityData.define(ID_EFFECT_COLOR, -1);
    }

    public void tick()
    {
        super.tick();
        if (this.level.isClientSide)
        {
            if (this.inGround)
            {
                if (this.inGroundTime % 5 == 0)
                {
                    this.makeParticle(1);
                }
                else
                {
                    this.makeParticle(2);
                }
            }
            else if (this.inGround && this.inGroundTime != 0 && !this.effects.isEmpty() && this.inGroundTime >= 600)
            {
                this.level.broadcastEntityEvent(this, (byte)0);
                this.potion = Potions.EMPTY;
                this.effects.clear();
                this.entityData.set(ID_EFFECT_COLOR, -1);
            }
        }
    }

    private void makeParticle(int particleCount)
    {
        int i = this.getColor();
        if (i != -1 && particleCount > 0)
        {
            double d0 = (double)(i >> 16 & 255) / 255.0D;
            double d1 = (double)(i >> 8 & 255) / 255.0D;
            double d2 = (double)(i >> 0 & 255) / 255.0D;

            for (int j = 0; j < particleCount; j++)
            {
                this.level.addParticle(ParticleTypes.ENTITY_EFFECT, this.getRandomX(0.5D), this.getRandomY(), this.getRandomZ(0.5D), d0, d1, d2);
            }
        }
    }

    public int getColor()
    {
        return this.entityData.get(ID_EFFECT_COLOR);
    }

    private void setFixedColor(int value)
    {
        this.fixedColor = true;
        this.entityData.set(ID_EFFECT_COLOR, value);
    }

    public void addAdditionalSaveData(CompoundTag compoundTag)
    {
        super.addAdditionalSaveData(compoundTag);
        if (this.potion != Potions.EMPTY)
        {
            compoundTag.putString("Potion", ForgeRegistries.POTIONS.getKey(this.potion).toString());
        }
        if (this.fixedColor)
        {
            compoundTag.putInt("Color", this.getColor());
        }
        if (!this.effects.isEmpty())
        {
            ListTag listTag = new ListTag();
            for (MobEffectInstance mobEffectInstance : this.effects)
            {
                listTag.add(mobEffectInstance.save(new CompoundTag()));
            }

            compoundTag.put("CustomPotionEffects", listTag);
        }
    }

    public void readAdditionalSaveData(CompoundTag compoundTag)
    {
        super.readAdditionalSaveData(compoundTag);
        if (compoundTag.contains("Potion", 8))
        {
            this.potion = PotionUtils.getPotion(compoundTag);
        }
        for (MobEffectInstance mobEffectInstance : PotionUtils.getCustomEffects(compoundTag))
        {
            this.addEffect(mobEffectInstance);
        }
        if (compoundTag.contains("Color", 99))
        {
            this.setFixedColor(compoundTag.getInt("Color"));
        }
        else
        {
            this.updateColor();
        }
    }

    protected void doPostHurtEffects(LivingEntity pLiving)
    {
        super.doPostHurtEffects(pLiving);
        Entity entity = this.getEffectSource();

        for (MobEffectInstance mobEffectInstance : this.potion.getEffects())
        {
            pLiving.addEffect(new MobEffectInstance(mobEffectInstance.getEffect(), Math.max(mobEffectInstance.getDuration() / 8, 1), mobEffectInstance.getAmplifier(), mobEffectInstance.isAmbient(), mobEffectInstance.isVisible()), entity);
        }

        if (!this.effects.isEmpty())
        {
            for (MobEffectInstance mobEffectInstance1 : this.effects)
            {
                pLiving.addEffect(mobEffectInstance1, entity);
            }
        }

        //pLiving.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1));
    }

    @Override
    public ItemStack getPickupItem()
    {
        if (this.effects.isEmpty() && this.potion == Potions.EMPTY)
        {
            return new ItemStack(ItemRegistration.COMPRESSED_ARROW.get());
        }
//        else
//        {
//            ItemStack itemStack = new ItemStack(ItemRegistration.COMPRESSED_TIPPED_ARROW.get());
//            PotionUtils.setPotion(itemStack, this.potion);
//            PotionUtils.setCustomEffects(itemStack, this.effects);
//            if (this.fixedColor)
//            {
//                itemStack.getOrCreateTag().putInt("CustomPotionColor", this.getColor());
//            }
//
//            return itemStack;
//        }
        return ItemStack.EMPTY;
    }

    public void handleEntityEvent(byte id)
    {
        if (id == 0)
        {
            int i = this.getColor();
            if (i != -1)
            {
                double d0 = (double)(i >> 16 & 255) / 255.0D;
                double d1 = (double)(i >> 8 & 255) / 255.0D;
                double d2 = (double)(i >> 0 & 255) / 255.0D;

                for (int j = 0; j < 20; j++)
                {
                    this.level.addParticle(ParticleTypes.ENTITY_EFFECT, this.getRandomX(0.5D), this.getRandomY(), this.getRandomZ(0.5D), d0, d1, d2);
                }
            }
            else
            {
                super.handleEntityEvent(id);
            }
        }
    }
}
