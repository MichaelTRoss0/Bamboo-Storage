package dev.michaeltross.bamboostorage.blocks.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BambooBundleBlock extends Block {
    protected static final VoxelShape SHAPE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public BambooBundleBlock() {
        super(Properties.of(Material.WOOD)
                .strength(1.0f, 2.0f)
                .sound(SoundType.BAMBOO)
        );
    }
    
    public VoxelShape getShape() {
        return SHAPE;
     }

}
