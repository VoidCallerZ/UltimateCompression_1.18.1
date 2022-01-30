package com.VoidCallerZ.uc.blocks;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.List;

public class CompressorBlock extends Block implements EntityBlock
{
    public static final String MESSAGE_COMPRESSOR = "message.compressor";
    public static final String SCREEN_MESSAGE_COMPRESSOR = "screen.message.compressor";

    public static final VoxelShape SHAPE_NORTH = Shapes.block();
    public static final VoxelShape SHAPE_SOUTH = Shapes.block();
    public static final VoxelShape SHAPE_WEST = Shapes.block();
    public static final VoxelShape SHAPE_EAST = Shapes.block();

    public CompressorBlock()
    {
        super(Properties.of(Material.METAL)
                .sound(SoundType.METAL)
                .strength(2f)
                .noOcclusion());
    }

    @Override
    public void appendHoverText(ItemStack stack, @javax.annotation.Nullable BlockGetter reader, List<Component> list, TooltipFlag flags)
    {
        list.add(new TranslatableComponent(MESSAGE_COMPRESSOR).withStyle(ChatFormatting.BLUE));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context)
    {
        return switch (state.getValue(BlockStateProperties.HORIZONTAL_FACING))
                {
                    case DOWN, UP, NORTH -> SHAPE_NORTH;
                    case SOUTH -> SHAPE_SOUTH;
                    case WEST -> SHAPE_WEST;
                    case EAST -> SHAPE_EAST;
                };
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state)
    {
        return new CompressorBE(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type)
    {
        if (!level.isClientSide)
        {
            return (lvl, pos, stt, te) ->
            {
                if (te instanceof CompressorBE compressor) compressor.tickServer();
            };
        }
        return null;
    }

    @SuppressWarnings("deprecation")
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult trace)
    {
        if(!level.isClientSide)
        {
            BlockEntity be = level.getBlockEntity(pos);
            if (be instanceof CompressorBE)
            {
                MenuProvider containerProvider = new MenuProvider()
                {
                    @Override
                    public Component getDisplayName()
                    {
                        return new TranslatableComponent(SCREEN_MESSAGE_COMPRESSOR);
                    }

                    @Override
                    public AbstractContainerMenu createMenu(int windowId, Inventory playerInventory, Player playerEntity)
                    {
                        return new CompressorContainer(windowId, pos, playerInventory, playerEntity);
                    }
                };
                NetworkHooks.openGui((ServerPlayer) player, containerProvider, be.getBlockPos());
            }
            else
            {
                throw new IllegalStateException("Our named container provider is missing!");
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(BlockStateProperties.POWERED, BlockStateProperties.HORIZONTAL_FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        Direction direction = context.getHorizontalDirection().getOpposite();
        return this.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, direction);
    }
}
