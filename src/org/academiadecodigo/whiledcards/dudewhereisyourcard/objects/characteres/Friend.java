package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Direction;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.DirectionRandomizable;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Catchable;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.GameObjects;

public class Friend extends Person implements Catchable, DirectionRandomizable {
    private boolean caught;


    public Friend(Grid grid, String picName, int speed) {
        super(grid, picName, speed);
    }

    @Override
    public void chooseDirection() {
        
    }

    @Override
    public void move() {

    }


    @Override
    public boolean isCaught() {
        return caught;
    }

    @Override
    public void setCaught() {
        this.caught = !caught;
    }
}
