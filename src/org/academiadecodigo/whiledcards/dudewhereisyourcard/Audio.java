package org.academiadecodigo.whiledcards.dudewhereisyourcard;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

public class Audio {

    public void runAudio() {
        try {
            ClassLoader classLoader = Audio.class.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("background-song.wav");

                Clip clip = AudioSystem.getClip();
                AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(inputStream));
                clip.open(ais);
                clip.start();
        } catch (Exception ex) {
            System.out.println("NOT");
        }
    }

}
