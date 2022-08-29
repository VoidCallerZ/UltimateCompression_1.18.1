package com.VoidCallerZ.uc.blocks.compressor.test;

import com.VoidCallerZ.uc.blocks.compressor.CompressorBlockMenu;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.level.block.entity.BlockEntity;

public class TestCompressorBlockMenu extends CompressorBlockMenu
{
    public TestCompressorBlockMenu(int containerId, Inventory inventory, BlockEntity entity)
    {
        super(BlockRegistration.TEST_COMPRESSOR_BLOCK_MENU.get(), containerId, inventory, entity);
    }
}
