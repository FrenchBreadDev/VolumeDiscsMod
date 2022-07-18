package net.frenchbreadev.gsmod;

import net.fabricmc.api.ClientModInitializer;
import net.frenchbreadev.gsmod.item.util.ModModelPredicateProvider;

public class GsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModModelPredicateProvider.registerModModels();

    }
}
