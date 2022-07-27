package net.frenchbreadev.irldisc;

import net.fabricmc.api.ModInitializer;
import net.frenchbreadev.irldisc.item.ModItems;
import net.frenchbreadev.irldisc.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class IrlDisc implements ModInitializer {
    public static final String MOD_ID = "irldisc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModLootTableModifiers.modifyLootTables();
    }
}
