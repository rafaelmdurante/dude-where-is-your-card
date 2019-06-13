package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characters.CodeCadet;

public class Score {

    private String msg;
    private Grid grid;
    private int beer;
    private int card;
    private boolean cadetDrunk;


    public Score(Grid grid,String msg){
        this.grid = grid;
        this.msg = msg;

    }

    public void update(int beer, int card, boolean cadetDrunk){
       setBeer(beer);
       setCadetDrunk(cadetDrunk);
       setCard(card);

    }

    public String printScore(){

        return "Cards: " + getCard() + "  ||  " + "Beers: " + getBeer() + "  ||  " + "Drunk Mode: " + getDrunkMode();


    }

    public String getDrunkMode(){

        if(cadetDrunk){
            return " IM SO WASTED! WOOHOOO ";

        } else {

            return " OFF ";
        }


    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public void setCadetDrunk(boolean cadetDrunk) {
        this.cadetDrunk = cadetDrunk;
    }

    public int getBeer() {
        return beer;
    }

    public int getCard() {
        return card;
    }

    public boolean isCadetDrunk() {
        return cadetDrunk;
    }
}
