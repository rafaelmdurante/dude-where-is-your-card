package org.academiadecodigo.whiledcards.dudewhereisyourcard;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.*;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characters.*;
import org.w3c.dom.Text;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Grid grid = new Grid(25,15);
        grid.init();
        Picture background = new Picture(10, 40, "background.png");
        background.draw();

        Audio.runAudio();
        Score score = new Score();

        CodeCadet cadet = new CodeCadet(grid,"codecadet.png",1);

        Friend friend = new Friend(grid, "friend.png", 1);

        Guard guard = new Guard(grid, "guard.png",1);
        guard.setTarget(friend.getPosition());

        Beer beer = new Beer(grid,"beer.png");

        Card card = new Card(grid, "card.png");

        GameObject[] g = {cadet, card, beer, friend, guard};
        //GameObject[] g = {guard, beer, cadet};
        cadet.move();
        MoveManager detector = new MoveManager(g);

        while(!guard.isCaughtCadet()) {
            Thread.sleep(300);
            detector.manage();
            friend.move();
            guard.move();
            cadet.capture();
            score.update( beer.getScore(),card.getScore(),cadet.isDrunk());
            score.printScore();
        }

        System.out.println("Game Over!");
        GameOver gameOver = new GameOver(grid, "gameover.png");


    }

}
