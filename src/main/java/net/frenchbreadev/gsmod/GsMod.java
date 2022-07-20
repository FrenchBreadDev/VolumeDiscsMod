package net.frenchbreadev.gsmod;

import net.fabricmc.api.ModInitializer;
import net.frenchbreadev.gsmod.block.ModBlocks;
import net.frenchbreadev.gsmod.enchantment.ModEnchantments;
import net.frenchbreadev.gsmod.item.ModItems;
import net.frenchbreadev.gsmod.util.ModLootTableModifiers;
import net.frenchbreadev.gsmod.world.feauture.ModConfiguredFeatures;
import net.frenchbreadev.gsmod.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GsMod implements ModInitializer {
	public static final String MOD_ID = "gsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModWorldGen.generateModWorldGen();
		ModEnchantments.registerModEnchantments();
		ModLootTableModifiers.modifyLootTables();
	}
}
