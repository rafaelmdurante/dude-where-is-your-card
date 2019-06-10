package org.academiadecodigo.whiledcards.dudewhereisyourcard;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Beer;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.GameObject;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres.*;


public class Test {
    public static void main(String[] args) throws InterruptedException {

        Grid grid = new Grid(25,15);
        grid.init();

        Beer beer = new Beer(grid, "beer2.png");
        CodeCadet cadet = new CodeCadet(grid,"red.png",1);

        Friend friend = new Friend(grid, "green.png", 1);
        Guard guard = new Guard(grid, "pink.png",2);
        guard.setTarget(friend.getPosition());

        GameObject[] g = {guard, beer, cadet};

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
