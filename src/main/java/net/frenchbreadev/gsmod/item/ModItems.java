package net.frenchbreadev.gsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.frenchbreadev.gsmod.GsMod;
import net.frenchbreadev.gsmod.item.custom.*;
import net.frenchbreadev.gsmod.sound.ModSounds;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DAMAGED_GILDSTONE_BLADE = registerItem("damaged_gildstone_blade",
            new ModWeaknessSwordItem(ModToolMaterials.GILDSTONE, 5, 1f,
                    new FabricItemSettings().group(ModItemGroup.GILDEDCOM)));
    public static final Item RAW_GILDSTONE = registerItem("raw_gildstone",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC)));
    public static final Item GILDSTONE_INGOT = registerItem("gildstone_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC)));
    public static final Item REFORGED_GILDSTONE_BLADE = registerItem("reforged_gildstone_blade",
            new ModWitheringSwordItem((ToolMaterial) ModToolMaterials.GILDSTONE, (int) 10.5, 2f,
                    (Item.Settings) new FabricItemSettings().group(ModItemGroup.GILDEDCOM)));
    public static final Item BLADE_SHARD = registerItem("blade_shard",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC)));
    public static final Item GILDED_BLACKSTONE_STICK = registerItem("gilded_blackstone_stick",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC)));
    public static final Item GILDSTONE_HELMET = registerItem("gildstone_helmet",
            new ModArmorItem(ModArmorMaterials.GILDSTONE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.GILDEDCOM)));
    public static final Item GILDSTONE_CHESTPLATE = registerItem("gildstone_chestplate",
            new ModArmorItem2(ModArmorMaterials.GILDSTONE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.GILDEDCOM)));
    public static final Item GILDSTONE_LEGGINGS = registerItem("gildstone_leggings",
            new ModArmorItem(ModArmorMaterials.GILDSTONE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.GILDEDCOM)));
    public static final Item GILDSTONE_BOOTS = registerItem("gildstone_boots",
            new ModArmorItem2(ModArmorMaterials.GILDSTONE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.GILDEDCOM)));
    public static final Item GRADIENT_MUSIC_DISC = registerItem("gradient_music_disc",
            new ModMusicDiscItem(7, ModSounds.GRADIENT_MUSIC_DISC,
                    new FabricItemSettings().group(ModItemGroup2.GILDEDMISC).maxCount(1)));

    public static final Item GILDED_MUSIC_DISC = registerItem("gilded_music_disc",
            new ModMusicDiscItem(7, ModSounds.GILDED_MUSIC_DISC,
                    new FabricItemSettings().group(ModItemGroup2.GILDEDMISC).maxCount(1)));

    public static final Item MUSIC_DISC_X = registerItem("music_disc_x",
            new ModMusicDiscItem(7, ModSounds.MUSIC_DISC_X,
                    new FabricItemSettings().group(ModItemGroup2.GILDEDMISC).maxCount(1)));

    public static final Item ONE_RN_DISC = registerItem("one_rn_disc",
            new ModMusicDiscItem(7, ModSounds.ONE_RN_DISC,
                    new FabricItemSettings().group(ModItemGroup2.GILDEDMISC).maxCount(1)));

    public static final Item MUSIC_DISC_BAD_DREAM = registerItem("music_disc_bad_dream",
            new ModMusicDiscItem(7, ModSounds.MUSIC_DISC_BAD_DREAM,
                    new FabricItemSettings().group(ModItemGroup2.GILDEDMISC).maxCount(1)));

    public static final Item NETHERITE_DIAMOND_INFUSED_GILDSTONE_SCRAP = registerItem("netherite_diamond_infused_gildstone_scrap",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC)));

    public static final Item NETHERITE_DIAMOND_AND_GILDSTONE_CHUNK = registerItem("netherite_diamond_and_gildstone_chunk",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC)));

    public static final Item GILDSTONE_AXE = registerItem("gildstone_axe",
            new ModAxeItem(ModToolMaterials.GILDSTONE, 10f, 0f,
                    new FabricItemSettings().group(ModItemGroup4.GILDEDTO)));

    public static final Item GILDSTONE_HOE = registerItem("gildstone_hoe",
            new ModHoeItem(ModToolMaterials.GILDSTONE, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup4.GILDEDTO)));

    public static final Item GILDSTONE_SHOVEL = registerItem("gildstone_shovel",
            new ShovelItem(ModToolMaterials.GILDSTONE, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup4.GILDEDTO)));

    public static final Item GILDSTONE_PICKAXE = registerItem("gildstone_pickaxe",
            new ModPickaxeItem(ModToolMaterials.GILDSTONE, 0, 2f,
                    new FabricItemSettings().group(ModItemGroup4.GILDEDTO)));

    public static final Item GILDSTONE_BOW = registerItem("gildstone_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.GILDEDCOM).maxDamage(3980)));

    public static final Item VIBRIAN_SILK_STRING = registerItem("vibrian_silk_string",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC)));

    public static final Item MUSIC_DISC_DECISIONS = registerItem("music_disc_decisions",
            new ModMusicDiscItem(7, ModSounds.MUSIC_DISC_DECISIONS,
                    new FabricItemSettings().group(ModItemGroup2.GILDEDMISC).maxCount(1)));

    public static final Item MUSIC_DISC_BLUE_TO_BLUE = registerItem("music_disc_blue_to_blue",
            new ModMusicDiscItem(7, ModSounds.MUSIC_DISC_BLUE_TO_BLUE,
                    new FabricItemSettings().group(ModItemGroup2.GILDEDMISC).maxCount(1)));

    public static final Item SECRET_SAUL = registerItem("secret_saul",
            new ModMusicDiscItem(7, ModSounds.SECRET_SAUL,
                    new FabricItemSettings().maxCount(1)));


    public static final Item LIQUID_VIBRIAN_SILK_STRING = registerItem("liquid_vibrian_silk_string",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC)));

    public static final Item VIBRIAN_ACID = registerItem("vibrian_acid",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC).maxCount(1)));

    public static final Item RAW_IMPEURIDIUM = registerItem("raw_impeuridium",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC)));

    public static final Item COMPRESSED_IMPEURIDIUM = registerItem("compressed_impeuridium",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC)));


    public static final Item COMPRESSED_IMPEURIDIUM_CHESTPLATE = registerItem("compressed_impeuridium_chestplate",
            new ModArmorItem3(ModArmorMaterials2.COMPRESSED_IMPEURIDIUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.GILDEDCOM)));

    public static final Item COMPRESSED_IMPEURIDIUM_LEGGINGS = registerItem("compressed_impeuridium_leggings",
            new ModArmorItem3(ModArmorMaterials2.COMPRESSED_IMPEURIDIUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.GILDEDCOM)));

    public static final Item COMPRESSED_IMPEURIDIUM_HELMET = registerItem("compressed_impeuridium_helmet",
            new ModArmorItem4(ModArmorMaterials2.COMPRESSED_IMPEURIDIUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.GILDEDCOM)));

    public static final Item COMPRESSED_IMPEURIDIUM_BOOTS = registerItem("compressed_impeuridium_boots",
            new ModArmorItem4(ModArmorMaterials2.COMPRESSED_IMPEURIDIUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.GILDEDCOM)));

    public static final Item COMPRESSED_IMPEURIDIUM_BLADE_HILT = registerItem("compressed_impeuridium_blade_hilt",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC)));

    public static final Item COMPRESSED_IMPEURIDIUM_BLADE_PIECE = registerItem("compressed_impeuridium_blade_piece",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC)));

    public static final Item COMPRESSED_IMPEURIDIUM_BLADE = registerItem("compressed_impeuridium_blade",
            new ModPoisonSwordItem((ToolMaterial) ModToolMaterials2.COMPRESSED_IMPEURIDIUM, (int) 8.5, 1f,
                    (Item.Settings) new FabricItemSettings().group(ModItemGroup.GILDEDCOM)));

    public static final Item  COMPRESSED_IMPEURIDIUM_PICKAXE = registerItem("compressed_impeuridium_pickaxe",
            new ModPickaxeItem(ModToolMaterials2.COMPRESSED_IMPEURIDIUM, 4, 3.5f,
                    new FabricItemSettings().group(ModItemGroup4.GILDEDTO)));

    public static final Item  COMPRESSED_IMPEURIDIUM_HOE = registerItem("compressed_impeuridium_hoe",
            new ModHoeItem(ModToolMaterials2.COMPRESSED_IMPEURIDIUM, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup4.GILDEDTO)));

    public static final Item  COMPRESSED_IMPEURIDIUM_SHOVEL = registerItem("compressed_impeuridium_shovel",
            new ShovelItem(ModToolMaterials2.COMPRESSED_IMPEURIDIUM, 0, 2f,
                    new FabricItemSettings().group(ModItemGroup4.GILDEDTO)));

    public static final Item  COMPRESSED_IMPEURIDIUM_AXE = registerItem("compressed_impeuridium_axe",
            new ModAxeItem(ModToolMaterials2.COMPRESSED_IMPEURIDIUM, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup4.GILDEDTO)));

    public static final Item ETERNAL_STAFF = registerItem("eternal_staff",
            new Item(new FabricItemSettings().group(ModItemGroup2.GILDEDMISC).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GsMod.LOGGER.debug("Registering Mod Items For " + GsMod.MOD_ID);
    }
}
