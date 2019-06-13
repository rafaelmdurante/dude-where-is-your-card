package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characters.CodeCadet;

public class Score {

    private String msg;
    private Grid grid;
    private int beer = 0;
    private int card = 0;
    private boolean cadetDrunk = false;

    Text scoreText;


    public Score(){


        scoreText = new Text(60, 20, printScore());
        scoreText.setColor(Color.BLACK);
        scoreText.draw();
        scoreText.grow(50, 10);
        scoreText.setText(printScore());


    }

    public void update(int beer, int card, boolean cadetDrunk){
       setBeer(beer);
       setCadetDrunk(cadetDrunk);
       setCard(card);
       scoreText.setText(printScore());
    }

    public String printScore(){

        return "Cards: " + getCard() + "  ||  " + "Beers: " + getBeer() + "  ||  " + "Drunk Mode: " + getDrunkMode();


    }

    public String getDrunkMode(){

        if(cadetDrunk){
            return " I'M SO WASTED! WOOHOOO ";

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
