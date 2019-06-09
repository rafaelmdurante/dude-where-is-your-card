package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;

public abstract class GameObjects {

    private Position position;
    private Grid grid;


    public Position getPosition(){
        return position;
    }


    /** receives a grid as argument so all objects use this grid
     *
     * @param grid
     */
    public void setGrid(Grid grid){
        this.grid = grid;
    }


}
