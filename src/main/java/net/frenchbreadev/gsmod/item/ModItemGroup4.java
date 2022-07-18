package net.frenchbreadev.gsmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.frenchbreadev.gsmod.GsMod;
import net.frenchbreadev.gsmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup4 {
    public static final ItemGroup GILDEDTO = FabricItemGroupBuilder.build(
            new Identifier(GsMod.MOD_ID, "gildedto"), () -> new ItemStack(ModItems.GILDSTONE_AXE));
}

