package com.VoidCallerZ.uc.dataGen.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
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

    public ItemModelBuilder leatherArmorItem(Item item, String texture0, String texture1)
    {
        return getBuilder(item.toString())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", modLoc(texture0))
                .texture("layer1", modLoc(texture1));
    }

    public void withExistingParent(Item item)
    {
        withExistingParent(item.toString(), modLoc("block/" + trim(item.getDescriptionId())));
    }

    private String trim(String string)
    {
        string = string.substring(9);
        return string;
    }
}
