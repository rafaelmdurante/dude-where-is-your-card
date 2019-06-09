package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects;

public class Beer extends GameObjects implements Catchable{
    private boolean caught;

    public boolean isCaught(){
        return caught;
    }

    public void setCaught(){

        caught = !caught;
    }

}
