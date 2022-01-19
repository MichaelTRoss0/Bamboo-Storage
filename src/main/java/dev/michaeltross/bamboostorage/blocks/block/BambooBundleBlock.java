package dev.michaeltross.bamboostorage.blocks.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BambooBundleBlock extends Block {

    public BambooBundleBlock() {
        super(Properties.of(Material.WOOD)
                .strength(1.0f, 2.0f)
                .sound(SoundType.BAMBOO)
        );
    }

}
