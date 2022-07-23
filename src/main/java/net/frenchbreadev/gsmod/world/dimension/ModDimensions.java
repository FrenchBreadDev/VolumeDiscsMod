package net.frenchbreadev.gsmod.world.dimension;

import net.frenchbreadev.gsmod.GsMod;
import net.frenchbreadev.gsmod.block.ModBlocks;
import net.frenchbreadev.gsmod.item.ModItems;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> ETERNAL_MESA_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(GsMod.MOD_ID, "eternal_mesa"));
    public static final RegistryKey<DimensionType> ETERNAL_MESA_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            ETERNAL_MESA_DIMENSION_KEY.getValue());


    public static void register() {
        GsMod.LOGGER.debug("Registering ModDimensions for " + GsMod.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.ACTIVATED_FULLY_PETRIFIED_GILDSTONE)
                .destDimID(ETERNAL_MESA_DIMENSION_KEY.getValue())
                .tintColor(28, 205, 232)
                .lightWithItem(ModItems.ETERNAL_STAFF)
                .onlyLightInOverworld()
                .flatPortal()
                .forcedSize(3, 3)
                .registerPortal();
    }
}
