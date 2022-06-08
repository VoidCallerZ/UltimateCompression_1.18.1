//package com.VoidCallerZ.uc.items.arrows;
//
//import com.VoidCallerZ.uc.setup.UcRecipeSerializer;
//import com.VoidCallerZ.uc.setup.registration.ItemRegistration;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.inventory.CraftingContainer;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.item.alchemy.PotionUtils;
//import net.minecraft.world.item.crafting.CustomRecipe;
//import net.minecraft.world.item.crafting.RecipeSerializer;
//import net.minecraft.world.item.crafting.SimpleRecipeSerializer;
//import net.minecraft.world.level.Level;
//
//public class UcTippedArrowRecipe extends CustomRecipe
//{
//    public UcTippedArrowRecipe(ResourceLocation resLoc) { super(resLoc); }
//
//    public boolean matches(CraftingContainer inv, Level level)
//    {
//        if (inv.getWidth() == 3 && inv.getHeight() == 3)
//        {
//            for (int i = 0; i < inv.getWidth(); i++)
//            {
//                for (int j = 0; j < inv.getHeight(); j++)
//                {
//                    ItemStack itemStack = inv.getItem(i + j * inv.getWidth());
//                    if (itemStack.isEmpty()) { return false; }
//                    if (i == 1 && j == 1)
//                    {
//                        if (!itemStack.is(Items.LINGERING_POTION)) { return false; }
//                    }
//                    else if (!itemStack.is(ItemRegistration.COMPRESSED_ARROW.get())) { return false; }
//                }
//            }
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }
//
//    public ItemStack assemble(CraftingContainer inv)
//    {
//        ItemStack itemStack = inv.getItem(1 + inv.getWidth());
//        if (!itemStack.is(Items.LINGERING_POTION)) { return ItemStack.EMPTY; }
//        else
//        {
//            ItemStack itemStack1 = new ItemStack(ItemRegistration.COMPRESSED_TIPPED_ARROW.get(), 8);
//            PotionUtils.setPotion(itemStack1, PotionUtils.getPotion(itemStack));
//            PotionUtils.setCustomEffects(itemStack1, PotionUtils.getCustomEffects(itemStack));
//            return itemStack1;
//        }
//    }
//
//    public boolean canCraftInDimensions(int width, int height) { return width >= 2 && height >= 2; }
//
//    public SimpleRecipeSerializer<?> getSerializer() { return UcRecipeSerializer.COMPRESSED_TIPPED_ARROW; }
//}
