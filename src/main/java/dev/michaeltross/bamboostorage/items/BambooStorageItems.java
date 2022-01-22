package dev.michaeltross.bamboostorage.items;

import java.util.function.Supplier;

import dev.michaeltross.bamboostorage.BambooStorage;
import dev.michaeltross.bamboostorage.blocks.BambooStorageBlocks;
import dev.michaeltross.bamboostorage.items.item.FuelBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BambooStorageItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            BambooStorage.MOD_ID);

    private static RegistryObject<Item> fuelBlockItem(String id, Supplier<Block> b, int n) {
        return ITEMS.register(id,
                () -> new FuelBlockItem(b.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), n));
    }

    public static final RegistryObject<Item> BAMBOO_BUNDLE = fuelBlockItem("bamboo_bundle",
            BambooStorageBlocks.BAMBOO_BUNDLE, 200);
    public static final RegistryObject<Item> BAMBOO_CUBE = fuelBlockItem("bamboo_cube",
            BambooStorageBlocks.BAMBOO_CUBE, 800);

}
