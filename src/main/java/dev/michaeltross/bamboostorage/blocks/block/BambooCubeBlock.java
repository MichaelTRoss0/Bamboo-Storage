package dev.michaeltross.bamboostorage.blocks.block;

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

}
