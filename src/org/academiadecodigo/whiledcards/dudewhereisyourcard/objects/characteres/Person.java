package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Direction;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.GameObjects;

public abstract class Person extends GameObjects {

    private int speed;
    private Direction currentDirection;


    /** constructor
     *
     * @param grid
     */
    public Person(Grid grid) {
        super(grid);
    }

    public abstract void move(Direction direction);
}
