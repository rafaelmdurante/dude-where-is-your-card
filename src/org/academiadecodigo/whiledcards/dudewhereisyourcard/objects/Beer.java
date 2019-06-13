package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;

public class Beer extends GameObject /*implements Catchable*/ {

    private boolean caught;
    private boolean full;
    private int score;

    /**
     * constructor
     *
     * @param grid
     */
    public Beer(Grid grid, String picName) {
        super(grid, picName);
        getPosition().hide();
    }

    public void refill(){
        getPosition().choosePicture();
        getPosition().show();
    }
    //@Override
    public void capture() {
        score++;
        setCaught(true);
        getPosition().hide();
        getPosition().setNewPosition();
    }

    //@Override
    public boolean isCaught() {
        return caught;
    }
    //@Override
    public void setCaught(boolean value) {

        caught = value;
    }

    public boolean getFull(){
        return full;
    }

    public void setFull(boolean value){
        full = value;
    }

    public int getScore() {
        return score;
    }
}
