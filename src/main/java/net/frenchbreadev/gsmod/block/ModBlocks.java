package net.frenchbreadev.gsmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.frenchbreadev.gsmod.GsMod;
import net.frenchbreadev.gsmod.item.ModItemGroup3;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block GILDSTONE_BLOCK = registerBlock("gildstone_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup3.GILDEDBB);

    public static final Block VIBRIAN_SILK_BLOCK = registerBlock("vibrian_silk_block",
        new Block(FabricBlockSettings.of(Material.WOOL).strength(1f).requiresTool()), ModItemGroup3.GILDEDBB);


    public static final Block END_GILDSTONE_ORE = registerBlock("end_gildstone_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()), ModItemGroup3.GILDEDBB);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
    return Registry.register(Registry.BLOCK, new Identifier(GsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(GsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        GsMod.LOGGER.debug("Registering ModBlocks for " + GsMod.MOD_ID);
    }
}
