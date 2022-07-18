package net.frenchbreadev.gsmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.frenchbreadev.gsmod.GsMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup2 {
    public static final ItemGroup GILDEDMISC = FabricItemGroupBuilder.build(
            new Identifier(GsMod.MOD_ID, "gildedmisc"), () -> new ItemStack(ModItems.GILDSTONE_INGOT));
}

