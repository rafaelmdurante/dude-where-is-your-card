package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;

public abstract class GameObjects {

    private Position position;
    private Grid grid;


    public Position getPosition(){
        return position;
    }


    /** constructor
     */
    public GameObjects(Grid grid, String picName){
        this.grid = grid;
        position = new Position(grid, picName);
    }

    public Grid getGrid() {
        return grid;
    }

}
