package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;

public class Beer extends GameObject implements Catchable {

    private boolean caught;

    /**
     * constructor
     *
     * @param grid
     */
    public Beer(Grid grid, String picName) {
        super(grid, picName);
    }

    @Override
    public void capture(){}

    @Override
    public boolean isCaught() {
        return caught;
    }
    @Override
    public void setCaught() {

        caught = !caught;
    }
}
