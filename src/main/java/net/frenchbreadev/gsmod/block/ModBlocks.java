package net.frenchbreadev.gsmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.frenchbreadev.gsmod.GsMod;
import net.frenchbreadev.gsmod.item.ModItemGroup3;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block GILDSTONE_BLOCK = registerBlock("gildstone_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));

    public static final Block VIBRIAN_SILK_BLOCK = registerBlock("vibrian_silk_block",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(1.5f).requiresTool()));


    public static final Block END_GILDSTONE_ORE = registerBlock("end_gildstone_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()));

    public static final Block SEMI_PETRIFIED_GILDSTONE = registerBlock("semi_petrified_gildstone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()));

    public static final Block HALF_PETRIFIED_GILDSTONE = registerBlock("half_petrified_gildstone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()));

    public static final Block FULLY_PETRIFIED_GILDSTONE = registerBlock("fully_petrified_gildstone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()));

    public static final Block IMPEURIDIUM_ORE = registerBlock("impeuridium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()));

    public static final Block DEEPSLATE_IMPEURIDIUM_ORE = registerBlock("deepslate_impeuridium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.2f).requiresTool()));

    public static final Block COMPRESSED_IMPEURIDIUM_BLOCK = registerBlock("compressed_impeuridium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.4f).requiresTool()));

    public static final Block ACTIVATED_FULLY_PETRIFIED_GILDSTONE = registerBlock("activated_fully_petrified_gildstone",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.4f).requiresTool()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
    return Registry.register(Registry.BLOCK, new Identifier(GsMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(GsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup3.GILDEDBB)));
    }

    public static void registerModBlocks() {
        GsMod.LOGGER.debug("Registering ModBlocks for " + GsMod.MOD_ID);
    }
}
