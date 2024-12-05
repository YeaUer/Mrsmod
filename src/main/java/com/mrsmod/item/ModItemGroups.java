package com.mrsmod.item;

import com.mrsmod.MrsMod;
import com.mrsmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//    public static final RegistryKey<ItemGroup> MRS_GROUP = register("mrs_group");
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MrsMod.MOD_ID, id));
//    }
//    public static void registerModItemGroups() {
//        Registry.register(Registries.ITEM_GROUP, MRS_GROUP,
//                ItemGroup.create(ItemGroup.Row.TOP, 7)
//                        .displayName(Text.translatable("itemGroup.mrs_group"))
//                        .icon(() -> new ItemStack(ModItems.RESONANCE_SOLSTICE))
//                        .entries((displayContext, entries) -> {
//                            entries.add(ModItems.RESONANCE_SOLSTICE);
//                        }).build());
//        MrsMod.LOGGER.info("Registering Item Groups");
//    }
    public static final ItemGroup MRS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(MrsMod.MOD_ID, "mrs_group"),
        ItemGroup.create(null,-1).displayName(Text.translatable("item.mrsmod.itemgroup.mrs_group"))
                .icon(() -> new ItemStack(ModItems.RESONANCE_SOLSTICE))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.RESONANCE_SOLSTICE);

                    entries.add(ModItems.WAWAYU_ALLIANCE_BADGE);
                    entries.add(ModItems.TIEMENG_COIN);
                    entries.add(ModItems.SSR);
                    entries.add(ModItems.SR);

                    entries.add(ModBlocks.EXCHANGE_BLOCK);

                    entries.add(ModBlocks.NEBULA_MINE);
                    entries.add(ModBlocks.DEEPSLATE_NEBULA_MINE);
                    entries.add(ModItems.NEBULA_FRAGMENT);
                }).build());
    public static void registerModItemGroups() {
        MrsMod.LOGGER.info("Registering Item Group");
    }
}
