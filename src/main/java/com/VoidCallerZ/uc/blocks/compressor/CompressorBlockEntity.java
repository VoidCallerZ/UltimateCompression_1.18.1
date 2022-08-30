package com.VoidCallerZ.uc.blocks.compressor;

import com.VoidCallerZ.uc.recipe.CompressorItemRecipe;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.Optional;

public abstract class CompressorBlockEntity extends BlockEntity implements MenuProvider
{
    /**
     * Creating all the necessary ItemHandlers for our BlockEntity
     */
    public final ItemStackHandler inputItemHandler = new ItemStackHandler(1)
    {
        @Override
        protected void onContentsChanged(int slot)
        {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack)
        {
            if (stack.is(BlockRegistration.COMPRESSOR_VALID_ITEMS))
            {
                return true;
            }
            return false;
        }
    };

    public final ItemStackHandler outputItemHandler = new ItemStackHandler(1)
    {
        @Override
        protected void onContentsChanged(int slot)
        {
            setChanged();
        }
    };

    public final IItemHandler combinedItemHandler = new CombinedInvWrapper(inputItemHandler, outputItemHandler)
    {
        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack)
        {
            if (slot == 0 && stack.is(BlockRegistration.COMPRESSOR_VALID_ITEMS))
            {
                return true;
            }
            return false;
        }
    };

    private LazyOptional<IItemHandler> lazyInputItemHandler = LazyOptional.empty();
    private LazyOptional<IItemHandler> lazyOutputItemHandler = LazyOptional.empty();
    private LazyOptional<IItemHandler> lazyCombinedItemHandler = LazyOptional.empty();


    protected final ContainerData data;
    protected NonNullList<ItemStack> items = NonNullList.withSize(3, ItemStack.EMPTY);
    private String name;
    public int progress;
    public int maxProgress;
    public int litTime;
    private BlockEntityType<?> block;

    public CompressorBlockEntity(BlockEntityType<?> block, BlockPos worldPosition, BlockState blockState, int maxProgress, String name)
    {
        super(block, worldPosition, blockState);
        this.data = new ContainerData()
        {
            @Override
            public int get(int index)
            {
                switch (index)
                {
                    case 0: return CompressorBlockEntity.this.progress;
                    case 1: return CompressorBlockEntity.this.maxProgress;
                    case 2: return CompressorBlockEntity.this.litTime;
                    default: return 0;
                }
            }

            @Override
            public void set(int index, int value)
            {
                switch (index)
                {
                    case 0: CompressorBlockEntity.this.progress = value; break;
                    case 1: CompressorBlockEntity.this.maxProgress = value; break;
                    case 2: CompressorBlockEntity.this.litTime = value; break;
                }
            }

            @Override
            public int getCount()
            {
                return 2;
            }
        };
        this.name = name;
        this.maxProgress = maxProgress;
        this.block = block;
    }

    @Override
    public Component getDisplayName()
    {
        return Component.literal(name);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side)
    {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
        {
            if (side == null)
            {
                return lazyCombinedItemHandler.cast();
            }
            else if (side == Direction.DOWN)
            {
                return lazyOutputItemHandler.cast();
            }
            else
            {
                if (isBlock(BlockRegistration.IRON_COMPRESSOR.get()))
                {
                    if (side == Direction.UP)
                        return lazyInputItemHandler.cast();
                }
                else
                {
                    if (side == Direction.UP || side == Direction.SOUTH || side == Direction.WEST || side == Direction.EAST)
                        return lazyInputItemHandler.cast();
                }
            }
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad()
    {
        super.onLoad();
        lazyInputItemHandler = LazyOptional.of(() -> inputItemHandler);
        lazyOutputItemHandler = LazyOptional.of(() -> outputItemHandler);
        lazyCombinedItemHandler = LazyOptional.of(() -> combinedItemHandler);
    }

    @Override
    public void invalidateCaps()
    {
        super.invalidateCaps();
        lazyInputItemHandler.invalidate();
        lazyOutputItemHandler.invalidate();
        lazyCombinedItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag tag)
    {
        tag.put("inventory", inputItemHandler.serializeNBT());
        tag.putInt("compressor.progress", progress);
        tag.putInt("BurnTime", litTime);
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag tag)
    {
        super.load(tag);
        inputItemHandler.deserializeNBT(tag.getCompound("inventory"));
        progress = tag.getInt("compressor.progress");
        litTime = tag.getInt("BurnTime");
    }

    public void drops()
    {
        SimpleContainer inventory = new SimpleContainer(combinedItemHandler.getSlots());
        for (int i = 0; i < combinedItemHandler.getSlots(); i++)
        {
            inventory.setItem(i, combinedItemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public void resetProgress()
    {
        this.progress = 0;
        this.litTime = 0;
    }

    public static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output)
    {
        return inventory.getItem(1).getItem() == output.getItem() || inventory.getItem(1).isEmpty();
    }

    public static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory)
    {
        return inventory.getItem(1).getMaxStackSize() > inventory.getItem(1).getCount();
    }

    public static boolean hasEnoughItemsToCompress(ItemStackHandler handler)
    {
        if (!handler.getStackInSlot(0).isEmpty())
        {
            if (handler.getStackInSlot(0).getCount() >= 9)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean hasRecipe(CompressorBlockEntity entity)
    {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.combinedItemHandler.getSlots());
        for (int i = 0; i < entity.combinedItemHandler.getSlots(); i++)
        {
            inventory.setItem(i, entity.combinedItemHandler.getStackInSlot(i));
        }
        Optional<CompressorItemRecipe> match = level.getRecipeManager().getRecipeFor(CompressorItemRecipe.Type.INSTANCE, inventory, level);
        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory) && canInsertItemIntoOutputSlot(inventory, match.get().getResultItem());
    }

    public static boolean hasCorrectAmountOfInputItems(CompressorBlockEntity entity)
    {
        return entity.inputItemHandler.getStackInSlot(0).getCount() >= 9;
    }

    public static void craftItem(CompressorBlockEntity entity)
    {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.inputItemHandler.getSlots());
        for (int i = 0; i < entity.inputItemHandler.getSlots(); i++)
        {
            inventory.setItem(i, entity.inputItemHandler.getStackInSlot(i));
        }
        Optional<CompressorItemRecipe> match = level.getRecipeManager().getRecipeFor(CompressorItemRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent())
        {
            entity.inputItemHandler.extractItem(0, 9, false);
            entity.outputItemHandler.setStackInSlot(0, new ItemStack(match.get().getResultItem().getItem(), entity.outputItemHandler.getStackInSlot(0).getCount() + match.get().getResultItem().getCount()));

            entity.resetProgress();
        }
    }

    private boolean isBlock(Block compressorBlock)
    {
        return block.getBlockEntity(level, getBlockPos()).getBlockState().getBlock() == compressorBlock;
    }
}
