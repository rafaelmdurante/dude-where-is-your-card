package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Direction;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.DirectionRandomizable;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Catchable;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.GameObjects;

public class Friend extends Person implements Catchable, DirectionRandomizable {

    private boolean caught;
    private Direction currentDirection;
    private int directionChangeLevel = 6;


    public Friend(Grid grid, String picName, int speed) {
        super(grid, picName, speed);
        currentDirection = Direction.values()[(int) (Math.random() * Direction.values().length)];
    }

    @Override
    public Direction chooseDirection() {

        Direction newDirection = currentDirection;

        // Randomly change directions sometimes
        if (Math.random() > ((double) directionChangeLevel) / 10) {
            newDirection = Direction.values()[(int) (Math.random() * Direction.values().length)];
        }

        return newDirection;

    }

    @Override
    public void move() {
        super.walk(chooseDirection(), getSpeed());
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
