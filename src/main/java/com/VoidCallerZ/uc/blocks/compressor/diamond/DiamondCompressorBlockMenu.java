package com.VoidCallerZ.uc.blocks.compressor.diamond;

import com.VoidCallerZ.uc.blocks.compressor.CompressorBlockMenu;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.level.block.entity.BlockEntity;

public class DiamondCompressorBlockMenu extends CompressorBlockMenu
{
    public DiamondCompressorBlockMenu(int containerId, Inventory inventory, BlockEntity entity)
    {
        super(BlockRegistration.DIAMOND_COMPRESSOR_BLOCK_MENU.get(), containerId, inventory, entity);
    }
}
