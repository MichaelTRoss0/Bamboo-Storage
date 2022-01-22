package dev.michaeltross.bamboostorage.items.item;

import javax.annotation.Nullable;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class FuelBlockItem extends BlockItem {
    private final int fuelTime;

    public FuelBlockItem(Block block, Properties properties, int ticks) {
        super(block, properties);
        this.fuelTime = ticks;
    }

    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.fuelTime;
    }

}
