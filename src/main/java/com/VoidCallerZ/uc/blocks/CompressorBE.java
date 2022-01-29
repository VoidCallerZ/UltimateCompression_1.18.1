package com.VoidCallerZ.uc.blocks;

import com.VoidCallerZ.uc.setup.Registration;
import com.VoidCallerZ.uc.varia.CustomEnergyStorage;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class CompressorBE extends BlockEntity
{
    private static int INGOTS_PER_BLOCK = 9;
    public static final int ENERGY_CAPACITY = 100000;
    public static final int ENERGY_RECEIVE = 1000;
    public static final int ENERGY_COMPRESS = 500;

    private final ItemStackHandler itemHandler = createHandler();
    private final LazyOptional<IItemHandler> handler = LazyOptional.of(() -> itemHandler);
    private final ItemStackHandler outputItemHandler = createOutputHandler();
    private final LazyOptional<IItemHandler> outputHandler = LazyOptional.of(() -> outputItemHandler);

    private final CustomEnergyStorage energy = createEnergyStorage();
    private final LazyOptional<IEnergyStorage> energyHandler = LazyOptional.of(() -> energy);

    private int compressingCounter = 0;

    public CompressorBE(BlockPos pos, BlockState state)
    {
        super(Registration.COMPRESSOR_BE.get(), pos, state);
    }

    @Override
    public void setRemoved()
    {
        super.setRemoved();
        handler.invalidate();
        energyHandler.invalidate();
    }

    public void tickServer()
    {
        ItemStack stack = itemHandler.getStackInSlot(0);
        if(stack.getCount() >= INGOTS_PER_BLOCK)
        {
            itemHandler.extractItem(0, 9, false);
            setChanged();
            compressBlocks();
        }
    }

    private void compressBlocks()
    {
        if(energy.getEnergyStored() >= ENERGY_COMPRESS)
        {
            //outputItemHandler.insertItem(0, Registration.COMPRESSED_IRON_INGOT.get().getDefaultInstance(), false);
            ItemEntity entityitem = new ItemEntity(level, worldPosition.getX(), worldPosition.getY() + 0.5, worldPosition.getZ(), Registration.COMPRESSED_IRON_INGOT.get().getDefaultInstance());
            entityitem.setPickUpDelay(40);
            entityitem.setDeltaMovement(entityitem.getDeltaMovement().multiply(0, 1, 0));
            level.addFreshEntity(entityitem);
            setChanged();
        }
    }

    private ItemStackHandler createHandler()
    {
        return new ItemStackHandler(2) {

            @Override
            protected void onContentsChanged(int slot) {
                // To make sure the TE persists when the chunk is saved later we need to
                // mark it dirty every time the item handler changes
                setChanged();
            }

            @Override
            public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
                if (slot == 0)
                {
                    return stack.getItem() == Items.IRON_INGOT;
                }
                return false;
            }

            @Nonnull
            @Override
            public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
                if (stack.getItem() != Items.IRON_INGOT) {
                    return stack;
                }
                return super.insertItem(slot, stack, simulate);
            }
        };
    }

    private ItemStackHandler createOutputHandler()
    {
        return new ItemStackHandler(1)
        {
            @Override
            protected void onContentsChanged(int slot)
            {
                setChanged();
            }
        };
    }

    private CustomEnergyStorage createEnergyStorage()
    {
        return new CustomEnergyStorage(ENERGY_CAPACITY, ENERGY_RECEIVE)
        {
            @Override
            protected void onEnergyChanged()
            {
                setChanged();
            }
        };
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        tag.put("Inventory", itemHandler.serializeNBT());
        tag.put("Energy", energy.serializeNBT());
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        if (tag.contains("Inventory")) {
            itemHandler.deserializeNBT(tag.getCompound("Inventory"));
        }
        if (tag.contains("Energy")) {
            energy.deserializeNBT(tag.get("Energy"));
        }
        super.load(tag);
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side)
    {
        if(cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
        {
            return handler.cast();
        }
        if(cap == CapabilityEnergy.ENERGY)
        {
            return energyHandler.cast();
        }
        return super.getCapability(cap, side);
    }
}
