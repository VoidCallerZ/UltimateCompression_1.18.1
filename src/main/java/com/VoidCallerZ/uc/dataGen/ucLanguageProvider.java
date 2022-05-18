package com.something.modname.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;


public class Test extends LanguageProvider {
    public Test(DataGenerator gen, String locale) {
        super(gen, FIRSTJAVA.MODID, locale);
    }

    //This is basically where all the blocks will go
    ArrayList<RegistryObject<Block>> Stuff = new ArrayList<>();

    @Override
    protected void addTranslations() {
        // Make an autoname thing

        //This is basically where you can rename things when you dont like the default look
        // in the first you basically put the name of the block and in the second you put how you want to name that block in game

        String[] Rename = {"", ""};

        String[] EMPTY = {"empty"};

        for (int i = 0; i < Stuff.size(); i++) {
            add(Stuff.get(i).get(), loop(Stuff.get(i).get().getRegistryName().getPath(), EMPTY));
        }


    }

    static String loop (String Category, String[] Renames) {
        for (int i = 0; i < Renames.length; i = i + 2) {
            if (Category.equals(Renames[i])) {
                return Renames[i + 1];
            }
        }
        return Rename(Category);
    }

    static String Rename (String Default_name) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Default_name.length(); i++) {
            if (i == 0) {
                result.append(Default_name.substring(i, i + 1).toUpperCase());
            } else if (Default_name.substring(i, i + 1).equals("_")) {
                result.append(" ");
            } else {
                result.append(Default_name.substring(i, i + 1));
            }
        }
        return result.toString();
    }
}
