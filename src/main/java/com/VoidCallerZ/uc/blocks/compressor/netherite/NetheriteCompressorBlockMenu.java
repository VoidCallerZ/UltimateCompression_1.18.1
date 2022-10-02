package com.VoidCallerZ.uc.blocks.compressor.netherite;

import com.VoidCallerZ.uc.blocks.compressor.CompressorBlockMenu;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.level.block.entity.BlockEntity;

public class NetheriteCompressorBlockMenu extends CompressorBlockMenu
{
    public NetheriteCompressorBlockMenu(int containerId, Inventory inventory, BlockEntity entity)
    {
        super(BlockRegistration.NETHERITE_COMPRESSOR_BLOCK_MENU.get(), containerId, inventory, entity);
    }
}
