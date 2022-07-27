package net.frenchbreadev.irldisc.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.frenchbreadev.irldisc.IrlDisc;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MODDISCS = FabricItemGroupBuilder.build(
            new Identifier(IrlDisc.MOD_ID, "mod_discs"), () -> new ItemStack(ModItems.GRADIENT_MUSIC_DISC));
    }
