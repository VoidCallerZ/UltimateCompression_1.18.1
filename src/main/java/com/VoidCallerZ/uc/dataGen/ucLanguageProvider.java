package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.VoidCallerZ.uc.setup.ModSetup.TAB_NAME;

public class ucLanguageProvider extends LanguageProvider
{
    public ucLanguageProvider(DataGenerator gen, String locale) { super(gen, UltimateCompression.MODID, locale); }

    @Override
    protected void  addTranslations()
    {
        add("itemGroup." + TAB_NAME, "UltimateCompression");

        add(Registration.COMPRESSED_IRON_ORE.get(), "Compressed Iron Ore");

        add(Registration.COMPRESSED_RAW_IRON.get(), "Compressed Raw Iron");
        add(Registration.COMPRESSED_IRON_INGOT.get(), "Compressed Iron Ingot");
    }
}
