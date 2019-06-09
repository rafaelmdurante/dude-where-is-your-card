package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Direction;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.DirectionRandomizable;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;

public class Guard extends Person implements DirectionRandomizable {

    private Position target;

    public void setTarget(Position target) {
        this.target = target;
    }

    @Override
    public void move(Direction direction) {
        
    }
}
