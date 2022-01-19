package dev.michaeltross.bamboostorage.items;

import java.util.function.Supplier;

import dev.michaeltross.bamboostorage.BambooStorage;
import dev.michaeltross.bamboostorage.blocks.BambooStorageBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BambooStorageItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BambooStorage.MOD_ID);
    
    private static RegistryObject<Item> blockItem(String id, Supplier<Block> b) {
        return ITEMS.register(id, () -> new BlockItem(b.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    }
    
    public static final RegistryObject<Item> BAMBOO_BUNDLE = blockItem("bamboo_bundle", BambooStorageBlocks.BAMBOO_BUNDLE);
    public static final RegistryObject<Item> BAMBOO_CUBE = blockItem("bamboo_cube", BambooStorageBlocks.BAMBOO_CUBE);
    
}
