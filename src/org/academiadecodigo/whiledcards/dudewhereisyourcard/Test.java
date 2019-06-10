package org.academiadecodigo.whiledcards.dudewhereisyourcard;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Beer;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.GameObject;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres.*;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.Audio;

import javax.sound.sampled.*;
import java.io.File;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Grid grid = new Grid(25,15);
        grid.init();
        Picture background = new Picture(10, 10, "background1000x600.png");
        background.draw();

        Audio.runAudio();

        CodeCadet cadet = new CodeCadet(grid,"codecadet.png",1);
        cadet.move();

        Friend friend = new Friend(grid, "friend.png", 1);
        Guard guard = new Guard(grid, "guard.png",2);
        guard.setTarget(friend.getPosition());

        Beer beer = new Beer(grid,"beer.png");

        GameObject[] g = {guard, beer, cadet, friend};

        CollisionDetector detector = new CollisionDetector(g);
        cadet.move();

        while(true) {
            Thread.sleep(150);


            detector.isUnSafe();
            friend.move();
            guard.move();
        }

    }

}
