package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.DirectionRandomizable;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Catchable;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.GameObjects;

public class Friend extends GameObjects implements Catchable, DirectionRandomizable {
    private boolean caught;

    @Override
    public boolean isCaught() {
        return caught;
    }

    public void setCaught(boolean caught) {
        this.caught = caught;
    }

    @Override
    public void chooseDirection() {
        
    }
}
