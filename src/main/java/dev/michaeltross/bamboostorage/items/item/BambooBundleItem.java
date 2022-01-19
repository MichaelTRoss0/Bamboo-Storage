package dev.michaeltross.bamboostorage.items.item;

import javax.annotation.Nullable;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class BambooBundleItem extends Item {

    public BambooBundleItem(Properties properties) {
        super(properties);
    }
    
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 200;
    }

}
