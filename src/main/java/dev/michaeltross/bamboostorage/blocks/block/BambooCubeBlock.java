package dev.michaeltross.bamboostorage.blocks.block;

import javax.annotation.Nullable;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BambooCubeBlock extends RotatedPillarBlock {

    public BambooCubeBlock() {
        super(Properties.of(Material.WOOD)
                .strength(2.0f, 3.0f)
                .sound(SoundType.BAMBOO)
        );
    }
    
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 800;
    }

}
