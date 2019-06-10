package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Direction;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.DirectionRandomizable;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;

public class Guard extends Person implements DirectionRandomizable {

    private Position target;

    public void setTarget(Position target) {
        this.target = target;
    }

    public Guard(Grid grid, String picName, int speed) {
        super(grid, picName, speed);
    }

    @Override
    public void move() {
        
    }

    @Override
    public void chooseDirection() {

    }
}
