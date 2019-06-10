package org.academiadecodigo.whiledcards.dudewhereisyourcard;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Beer;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Card;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.GameObject;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres.CodeCadet;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres.Friend;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres.Guard;

public class CollisionDetector {
    /*
    private GameObject[] gameObjects;
    private Position cadetPosition;

    public CollisionDetector(GameObject[] gameObjects) {
        this.gameObjects = gameObjects;
    }

    public void isUnSafe() {

        for (GameObject o : gameObjects) {

            if (o instanceof CodeCadet) {
                cadetPosition = o.getPosition();
                checkCadet(o);

            }else if(o instanceof Guard) {
                checkGuard(o);
            }else{
                continue;
            }

        }


    }

    /**
     * Checks for collisions with specific gameObject
     * Requires iterating the array once
     * @param
     */
    /*

    private void checkGuard(GameObject guard) {
        for (GameObject ig: gameObjects) {

            if (ig instanceof Friend){
                System.out.println("friend");
                if(ig.getPosition().getRow() == guard.getPosition().getRow() &&
                        ig.getPosition().getCol() == guard.getPosition().getCol()){
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
                if(ig.getPosition().getRow() == gameObject.getPosition().getRow() &&
                ig.getPosition().getCol() == gameObject.getPosition().getCol()) {
                    System.out.println("DRUNK");
                    ((Beer) ig).setCaught(); // Cast to Beer
                    ((CodeCadet) gameObject).setDrunk(true); //Cast to CodeCadet
                }
            }

            //Checks card
            if (ig instanceof Card){
                if(ig.getPosition().getRow() == gameObject.getPosition().getRow() &&
                        ig.getPosition().getCol() == gameObject.getPosition().getCol()) {
                    System.out.println("CARD");
                }
            }

            //Checks guard
            if(ig instanceof Guard){
                if(ig.getPosition().getRow() == gameObject.getPosition().getRow() &&
                        ig.getPosition().getCol() == gameObject.getPosition().getCol()) {
                    System.out.println("GUARD");
                }
            }
        }

    }
    */




}
