package dev.michaeltross.bamboostorage.blocks.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BambooBundleBlock extends RotatedPillarBlock {
    protected static final VoxelShape Y_AXIS_AABB = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
    protected static final VoxelShape Z_AXIS_AABB = Block.box(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 16.0D);
    protected static final VoxelShape X_AXIS_AABB = Block.box(0.0D, 4.0D, 4.0D, 16.0D, 12.0D, 12.0D);

    public BambooBundleBlock() {
        super(Properties.of(Material.WOOD)
                .strength(1.0f, 2.0f)
                .sound(SoundType.BAMBOO)
        );
    }
    
    public VoxelShape getShape(BlockState p_154346_, BlockGetter p_154347_, BlockPos p_154348_, CollisionContext p_154349_) {
        switch(p_154346_.getValue(AXIS)) {
        case X:
        default:
           return X_AXIS_AABB;
        case Z:
           return Z_AXIS_AABB;
        case Y:
           return Y_AXIS_AABB;
        }
     }

}
