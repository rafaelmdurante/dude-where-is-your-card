package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Catchable;

public class CodeCadet extends Person implements Catchable {

    // Game Objects Attributes: position, grid | Methods: getPosition, setGrid
    // Person Attributes: speed,  currentDirection,  picture | Methods: move

    // CodeCadet Attributes
    private boolean drunk;
    private boolean caught;
    private int movementCounter;

    // Constructor

    // Methods
    public void setDrunk(boolean value) {
        drunk = value;
    }

    public boolean isDrunk() {
        return drunk;
    }

    public int getMovementCounter() {
        return movementCounter;
    }

    /**
     * Used to reset movement counter to become sober again whenever needed
     */
    public void resetMovementCounter() {
        movementCounter = 0;
    }

    // Catchable methods
    @Override
    public boolean isCaught() {
        return caught;
    }

    @Override
    public void setCaught() {
        caught = true:
    }
}
