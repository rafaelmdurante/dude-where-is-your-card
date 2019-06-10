package org.academiadecodigo.whiledcards.dudewhereisyourcard;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres.*;


public class Test {
    public static void main(String[] args) throws InterruptedException {

        Grid grid = new Grid(25,15);
        grid.init();

        Position pos = new Position(grid, "beer2.png");
        pos.choosePicture();
        pos.show();
        CodeCadet cadet = new CodeCadet(grid,"red.png",1);
        cadet.move();

        Friend friend = new Friend(grid, "green.png", 1);
        Guard guard = new Guard(grid, "pink.png",2);
        guard.setTarget(friend.getPosition());
        while(true) {
            Thread.sleep(150);
            friend.move();
            guard.move();
        }



    }
}
