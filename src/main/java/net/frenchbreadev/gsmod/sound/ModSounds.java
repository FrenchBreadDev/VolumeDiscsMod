package net.frenchbreadev.gsmod.sound;

import net.frenchbreadev.gsmod.GsMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static SoundEvent GRADIENT_MUSIC_DISC = registerSoundEvent("gradient_music_disc");
    public static SoundEvent GILDED_MUSIC_DISC = registerSoundEvent("gilded_music_disc");
    public static SoundEvent MUSIC_DISC_X = registerSoundEvent("music_disc_x");
    public static SoundEvent ONE_RN_DISC = registerSoundEvent("one_rn_disc");
    public static SoundEvent MUSIC_DISC_BAD_DREAM = registerSoundEvent("music_disc_bad_dream");
    public static SoundEvent MUSIC_DISC_DECISIONS = registerSoundEvent("music_disc_decisions");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(GsMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
