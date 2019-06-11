package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.*;

public class Card extends GameObject implements Catchable {

    // Attributes from SuperClass
    private Position position;
    private Grid grid;
    // Card attributes
    private boolean caught;


    /**
     * constructor
     *
     * @param grid
     */
    public Card(Grid grid, String picName) {
        super(grid, picName);
    }


    // Methods from SuperClass
    public Position getPosition() {
        return position;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    // Methods from Interface

    @Override
    public void capture(){}

    @Override
    public boolean isCaught() {
        return caught;
    }

    @Override
    public void setCaught() {
        caught = true;
    }


}
