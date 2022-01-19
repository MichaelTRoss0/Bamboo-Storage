package dev.michaeltross.bamboostorage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.michaeltross.bamboostorage.blocks.BambooStorageBlocks;
import dev.michaeltross.bamboostorage.items.BambooStorageItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BambooStorage.MOD_ID)
public class BambooStorage {
    public static final String MOD_ID = "bamboostorage";
    public static final Logger LOGGER = LogManager.getLogger("Bamboo Storage");
    
    public static BambooStorage instance;
    
    public BambooStorage() {
        BambooStorageBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BambooStorageItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
