package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.setup.registration.ItemRegistration;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class BaseItemModelProvider extends ItemModelProvider
{
    public BaseItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    public void singleTextureGenerated(Item item, String textureLocation)
    {
        singleTexture(ForgeRegistries.ITEMS.getKey(item).getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc(textureLocation));
    }

    public void singleTextureHandheld(Item item, String textureLocation)
    {
        singleTexture(ForgeRegistries.ITEMS.getKey(item).getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc(textureLocation));
    }
}
