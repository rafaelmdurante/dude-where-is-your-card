package org.academiadecodigo.whiledcards.dudewhereisyourcard;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Beer;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Card;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.GameObject;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characters.CodeCadet;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characters.Friend;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characters.Guard;

public class MoveManager {
    private GameObject[] gameObjects;
    private Position cadetPosition;
    private int cadetMoves;
    private Position friendPosition;

    public MoveManager(GameObject[] gameObjects) {
        this.gameObjects = gameObjects;
    }

    public void manage() {

        for (GameObject o : gameObjects) {

            if (o instanceof CodeCadet) {
                cadetPosition = o.getPosition();
                cadetMoves=cadetMoves + ((CodeCadet) o).sendmove();
                checkCadet(o);

            } else if (o instanceof Guard) {
                checkGuard(o);
            }else if(o instanceof Beer){
                if(cadetMoves==100){
                    ((Beer) o).refill();
                    ((Beer) o).setCaught(false);
                    cadetMoves=0;
                }
            }else if(o instanceof Friend){
                friendPosition = o.getPosition();
            }
        }


    }


    /**
     * Checks for collisions with specific gameObject
     * Requires iterating the array once
     *
     * @param
     */

    private void checkGuard(GameObject guard) {
        for (GameObject ig : gameObjects) {

            if (ig instanceof Friend) {
                System.out.println("friend");
                if (ig.getPosition().getRow() == guard.getPosition().getRow() &&
                        ig.getPosition().getCol() == guard.getPosition().getCol()) {
                    ((Guard) guard).setTarget(cadetPosition);
                    System.out.println("caught friend");
                }
            }
        }
    }

    private void checkCadet(GameObject gameObject) {
        for (GameObject ig : gameObjects) {
            // No point in checking collisions with self and friend
            if (ig instanceof Friend || ig instanceof CodeCadet) {
                continue;
            }


            //Checks beer
            if (ig instanceof Beer) {
                Beer beer = (Beer) ig;
                if (ig.getPosition().getRow() == gameObject.getPosition().getRow() &&
                        ig.getPosition().getCol() == gameObject.getPosition().getCol() && !beer.isCaught()) {
                    System.out.println("DRUNK");
                    beer.capture();
                    ((CodeCadet) gameObject).setDrunk(); //Cast to CodeCadet
                }
            }

            //Checks card
            if (ig instanceof Card) {
                Card card = (Card) ig;
                if (ig.getPosition().getRow() == gameObject.getPosition().getRow() &&
                        ig.getPosition().getCol() == gameObject.getPosition().getCol() && !card.isCaught()) {
                    System.out.println("CARD");
                    card.capture();
                    /**
                     *  NEED TO ADD SCORE LOGIC
                     */

                }
            }

            //Checks guard
            if (ig instanceof Guard) {
                if (ig.getPosition().getRow() == gameObject.getPosition().getRow() &&
                        ig.getPosition().getCol() == gameObject.getPosition().getCol()) {
                    System.out.println("GUARD");
                    // Set caught cadet - important to check if game ends
                    ((Guard) ig).setCaughtCadet(true);
                    // hide all objects from the array of objects
                    for (GameObject go : gameObjects) {
                        go.getPosition().hide();
                    }
                }
            }

        }

    }

}
