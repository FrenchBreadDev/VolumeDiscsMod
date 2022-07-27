package net.frenchbreadev.irldisc.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.frenchbreadev.irldisc.IrlDisc;
import net.frenchbreadev.irldisc.item.custom.ModMusicDiscItem;
import net.frenchbreadev.irldisc.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item GRADIENT_MUSIC_DISC = registerItem("gradient_music_disc",
            new ModMusicDiscItem(7, ModSounds.GRADIENT_MUSIC_DISC,
                    new FabricItemSettings().group(ModItemGroup.MODDISCS).maxCount(1)));

    public static final Item GILDED_MUSIC_DISC = registerItem("gilded_music_disc",
            new ModMusicDiscItem(7, ModSounds.GILDED_MUSIC_DISC,
                    new FabricItemSettings().group(ModItemGroup.MODDISCS).maxCount(1)));

    public static final Item MUSIC_DISC_X = registerItem("music_disc_x",
            new ModMusicDiscItem(7, ModSounds.MUSIC_DISC_X,
                    new FabricItemSettings().group(ModItemGroup.MODDISCS).maxCount(1)));

    public static final Item ONE_RN_DISC = registerItem("one_rn_disc",
            new ModMusicDiscItem(7, ModSounds.ONE_RN_DISC,
                    new FabricItemSettings().group(ModItemGroup.MODDISCS).maxCount(1)));

    public static final Item MUSIC_DISC_BAD_DREAM = registerItem("music_disc_bad_dream",
            new ModMusicDiscItem(7, ModSounds.MUSIC_DISC_BAD_DREAM,
                    new FabricItemSettings().group(ModItemGroup.MODDISCS).maxCount(1)));

    public static final Item MUSIC_DISC_DECISIONS = registerItem("music_disc_decisions",
            new ModMusicDiscItem(7, ModSounds.MUSIC_DISC_DECISIONS,
                    new FabricItemSettings().group(ModItemGroup.MODDISCS).maxCount(1)));

    public static final Item MUSIC_DISC_BLUE_TO_BLUE = registerItem("music_disc_blue_to_blue",
            new ModMusicDiscItem(7, ModSounds.MUSIC_DISC_BLUE_TO_BLUE,
                    new FabricItemSettings().group(ModItemGroup.MODDISCS).maxCount(1)));

    public static final Item SECRET_SAUL = registerItem("secret_saul",
            new ModMusicDiscItem(7, ModSounds.SECRET_SAUL,
                    new FabricItemSettings().maxCount(1)));

    public static final Item MUSIC_DISC_LABYRINTH = registerItem("music_disc_labyrinth",
            new ModMusicDiscItem(7, ModSounds.MUSIC_DISC_LABYRINTH,
                    new FabricItemSettings().group(ModItemGroup.MODDISCS).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(IrlDisc.MOD_ID, name), item);
    }

    public static void registerModItems() {
        IrlDisc.LOGGER.debug("Registering Mod Items For " + IrlDisc.MOD_ID);
    }
}
