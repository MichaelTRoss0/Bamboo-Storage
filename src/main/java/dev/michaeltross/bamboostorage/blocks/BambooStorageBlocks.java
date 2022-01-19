package dev.michaeltross.bamboostorage.blocks;

import dev.michaeltross.bamboostorage.BambooStorage;
import dev.michaeltross.bamboostorage.blocks.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BambooStorageBlocks {
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BambooStorage.MOD_ID);
    
    public static final RegistryObject<Block> BAMBOO_BUNDLE = BLOCKS.register("bamboo_bundle", BambooBundleBlock::new);
    public static final RegistryObject<Block> BAMBOO_CUBE = BLOCKS.register("bamboo_cube", BambooCubeBlock::new);
    
}
