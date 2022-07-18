package net.frenchbreadev.gsmod.world.feauture;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> END_GILDSTONE_ORE_PLACED = PlacedFeatures.register("end_gildstone_ore_placed",
            ModConfiguredFeatures.END_GILDSTONE_ORE, ModOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> VIBRIAN_SILK_BLOCK_PLACED = PlacedFeatures.register("vibrian_silk_block_placed",
            ModConfiguredFeatures.VIBRIAN_SILK_BLOCK, ModOreFeatures.modifiersWithCount(5,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(16))));



}
