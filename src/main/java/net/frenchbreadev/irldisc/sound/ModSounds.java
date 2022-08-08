package net.frenchbreadev.irldisc.sound;

import net.frenchbreadev.irldisc.IrlDisc;
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
    public static SoundEvent MUSIC_DISC_BLUE_TO_BLUE = registerSoundEvent("music_disc_blue_to_blue");
    public static SoundEvent SECRET_SAUL = registerSoundEvent("secret_saul");
    public static SoundEvent MUSIC_DISC_LABYRINTH = registerSoundEvent("music_disc_labyrinth");
    public static SoundEvent MUSIC_DISC_WISH = registerSoundEvent("music_disc_wish");
    public static SoundEvent MUSIC_DISC_SPIN_ETERNALLY = registerSoundEvent("music_disc_spin_eternally");
    public static SoundEvent MUSIC_DISC_STRANGE_LOVE = registerSoundEvent("music_disc_strange_love");
    public static SoundEvent MUSIC_DISC_THE_ONLY_THING_I_KNOW_FOR_REAL = registerSoundEvent("music_disc_the_only_thing_i_know_for_real");
    public static SoundEvent MUSIC_DISC_All_THE_STARS = registerSoundEvent("music_disc_all_the_stars");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(IrlDisc.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
