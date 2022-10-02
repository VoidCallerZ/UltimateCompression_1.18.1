package com.VoidCallerZ.uc.blocks.compressor.gold;

import com.VoidCallerZ.uc.blocks.compressor.CompressorBlockMenu;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.level.block.entity.BlockEntity;

public class GoldenCompressorBlockMenu extends CompressorBlockMenu
{
    public GoldenCompressorBlockMenu(int containerId, Inventory inventory, BlockEntity entity)
    {
        super(BlockRegistration.GOLDEN_COMPRESSOR_BLOCK_MENU.get(), containerId, inventory, entity);
    }
}
