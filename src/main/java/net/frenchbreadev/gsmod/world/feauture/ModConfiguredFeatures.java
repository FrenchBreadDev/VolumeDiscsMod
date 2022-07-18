package net.frenchbreadev.gsmod.world.feauture;

import net.frenchbreadev.gsmod.GsMod;
import net.frenchbreadev.gsmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {


    public static final List<OreFeatureConfig.Target> END_GILDSTONE_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.END_GILDSTONE_ORE.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_GILDSTONE_ORE =
            ConfiguredFeatures.register("end_gildstone_ore",Feature.ORE,
                    new OreFeatureConfig(END_GILDSTONE_ORES, 3));

    public static final List<OreFeatureConfig.Target> OVERWORLD_GILDSTONE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.VIBRIAN_SILK_BLOCK.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> VIBRIAN_SILK_BLOCK =
            ConfiguredFeatures.register("vibrian_silk_block",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_GILDSTONE_ORES, 4));



    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + GsMod.MOD_ID);
    }
}
