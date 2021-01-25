package com.d3rpym00.blockCompression.registry;

import com.d3rpym00.blockCompression.blockCompression;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    // Block Items
    public static final BlockItem COMPRESSED_DIRT = new BlockItem(ModBlocks.COMPRESSED_DIRT, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_COBBLESTONE = new BlockItem(ModBlocks.COMPRESSED_COBBLESTONE, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_GRAVEL = new BlockItem(ModBlocks.COMPRESSED_GRAVEL, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_SAND = new BlockItem(ModBlocks.COMPRESSED_SAND, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_DIORITE = new BlockItem(ModBlocks.COMPRESSED_DIORITE, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_ANDESITE = new BlockItem(ModBlocks.COMPRESSED_ANDESITE, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_GRANITE = new BlockItem(ModBlocks.COMPRESSED_GRANITE, new Item.Settings().group(blockCompression.ITEM_GROUP));
    
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_dirt"), COMPRESSED_DIRT);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_cobblestone"), COMPRESSED_COBBLESTONE);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_gravel"), COMPRESSED_GRAVEL);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_sand"), COMPRESSED_SAND);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_diorite"), COMPRESSED_DIORITE);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_andesite"), COMPRESSED_ANDESITE);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_granite"), COMPRESSED_GRANITE);
    }
}
