package com.VoidCallerZ.uc.blocks.compressor.iron;

import com.VoidCallerZ.uc.blocks.compressor.CompressorBlockMenu;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.level.block.entity.BlockEntity;

public class IronCompressorBlockMenu extends CompressorBlockMenu
{
    public IronCompressorBlockMenu(int containerId, Inventory inventory, BlockEntity entity)
    {
        super(BlockRegistration.IRON_COMPRESSOR_BLOCK_MENU.get(), containerId, inventory, entity);
    }
}
