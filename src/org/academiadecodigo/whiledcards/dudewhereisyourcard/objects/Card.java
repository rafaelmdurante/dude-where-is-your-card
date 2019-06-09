package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.*;

public class Card extends GameObjects implements Catchable {

    // Attributes from SuperClass
    private Position position;
    private Grid grid;
    // Card attributes
    private boolean caught;
    
    // Methods from SuperClass
    public Position getPosition() {
        return position;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    // Methods from Interface
    public boolean isCaught() {
        return caught;
    }

    public void setCaught() {
        caught = true;
    }
}
