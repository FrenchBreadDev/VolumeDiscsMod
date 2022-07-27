package net.frenchbreadev.irldisc.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.frenchbreadev.irldisc.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier JUNGLE_TEMPLE_ID
            = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier SIMPLE_DUNGEON_ID
            = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier BURIED_TREASURE_ID
            = new Identifier("minecraft", "chests/buried_treasure");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
                    if(SIMPLE_DUNGEON_ID.equals(id)) {
                        LootPool.Builder poolBuilder = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.12f)) // Drops 100% of the time
                                .with(ItemEntry.builder(ModItems.MUSIC_DISC_BLUE_TO_BLUE))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                        tableBuilder.pool(poolBuilder.build());
                }
                {
                    if(SIMPLE_DUNGEON_ID.equals(id)) {
                        LootPool.Builder poolBuilder = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 100% of the time
                                .with(ItemEntry.builder(ModItems.MUSIC_DISC_DECISIONS))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                        tableBuilder.pool(poolBuilder.build());
                    }
                if(SIMPLE_DUNGEON_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 100% of the time
                            .with(ItemEntry.builder(ModItems.MUSIC_DISC_X))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(SIMPLE_DUNGEON_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.11f)) // Drops 100% of the time
                            .with(ItemEntry.builder(ModItems.MUSIC_DISC_BAD_DREAM))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(SIMPLE_DUNGEON_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.13f)) // Drops 100% of the time
                            .with(ItemEntry.builder(ModItems.GRADIENT_MUSIC_DISC))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(SIMPLE_DUNGEON_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.12f)) // Drops 100% of the time
                            .with(ItemEntry.builder(ModItems.GILDED_MUSIC_DISC))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(SIMPLE_DUNGEON_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 100% of the time
                            .with(ItemEntry.builder(ModItems.ONE_RN_DISC))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(BURIED_TREASURE_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 100% of the time
                            .with(ItemEntry.builder(ModItems.SECRET_SAUL))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                    tableBuilder.pool(poolBuilder.build());

                }
                if(SIMPLE_DUNGEON_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 100% of the time
                            .with(ItemEntry.builder(ModItems.MUSIC_DISC_LABYRINTH))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
            }
        });
    }
}