package org.academiadecodigo.whiledcards.dudewhereisyourcard;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres.CodeCadet;

public class Test {
    public static void main(String[] args) {

        Grid grid = new Grid(35,35);
        grid.init();

        Position pos = new Position(grid, "beer2.png");
        pos.choosePicture();
        pos.show();
        CodeCadet cadet = new CodeCadet(grid,"beer2.png",1);
        cadet.move();
    }
}
