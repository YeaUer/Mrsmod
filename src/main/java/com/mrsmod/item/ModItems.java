package com.mrsmod.item;

import com.mrsmod.MrsMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    //我的雷斯物品栏
    public static final Item MRS_GROUP = registerItems("mrs_group", new Item(new Item.Settings()));

    //雷索纳斯
    public static final Item RESONANCE_SOLSTICE = registerItems("resonance_solstice", new Item(new Item.Settings()));

    //娃娃鱼同盟徽章
    public static final Item WAWAYU_ALLIANCE_BADGE = registerItems("wawayu_alliance_badge", new Item(new Item.Settings()));
    //铁盟币
    public static final Item TIEMENG_COIN = registerItems("tiemeng_coin", new Item(new Item.Settings()));
    //特殊武器改造特许
    public static final Item SSR = registerItems("ssr", new Item(new Item.Settings()));
    //一般武器改造凭证
    public static final Item SR = registerItems("sr", new Item(new Item.Settings()));

    //星云碎片
    public static final Item NEBULA_FRAGMENT = registerItems("nebula_fragment", new Item(new Item.Settings()));


    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MrsMod.MOD_ID, id), item);
    }

    //原版材料物品栏
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
//        fabricItemGroupEntries.add(RESONANCE_SOLSTICE);
//        fabricItemGroupEntries.add(WAWAYU_ALLIANCE_BADGE);
//        fabricItemGroupEntries.add(MRS_GROUP);
//        fabricItemGroupEntries.add(TIEMENG_COIN);
//        fabricItemGroupEntries.add(SSR);
//        fabricItemGroupEntries.add(SR);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
        MrsMod.LOGGER.info("Registering Items");
    }
}
