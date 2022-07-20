package net.frenchbreadev.gsmod.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.frenchbreadev.gsmod.enchantment.PoisonAspectEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
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


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(JUNGLE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(Item.byRawId(Enchantment.byRawId(PoisonAspectEnchantment))))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                tableBuilder.pool(poolBuilder.build());

            }
        });
    }
}