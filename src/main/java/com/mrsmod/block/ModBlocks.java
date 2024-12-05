package com.mrsmod.block;

import com.mrsmod.MrsMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //交易所职业方块
    public static final Block EXCHANGE_BLOCK = register("exchange_block", new Block(AbstractBlock.Settings.create().strength(3.0f, 3.0f)));
    //星云矿
    public static final Block NEBULA_MINE = register("nebula_mine", new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    //深层星云矿
    public static final Block DEEPSLATE_NEBULA_MINE = register("deepslate_nebula_mine", new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));

    public static void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MrsMod.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MrsMod.MOD_ID, id), block);
    }

    public static void registerModBlocks() {
        MrsMod.LOGGER.info("Registering Blocks");
    }
}
