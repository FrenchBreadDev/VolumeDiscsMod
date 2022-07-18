package net.frenchbreadev.gsmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.frenchbreadev.gsmod.GsMod;
import net.frenchbreadev.gsmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup3 {
    public static final ItemGroup GILDEDBB = FabricItemGroupBuilder.build(
            new Identifier(GsMod.MOD_ID, "gildedbb"), () -> new ItemStack(ModBlocks.GILDSTONE_BLOCK));
}

