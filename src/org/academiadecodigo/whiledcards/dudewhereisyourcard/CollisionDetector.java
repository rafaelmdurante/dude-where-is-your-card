package org.academiadecodigo.whiledcards.dudewhereisyourcard;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Beer;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.GameObject;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres.CodeCadet;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres.Friend;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres.Guard;

public class CollisionDetector {
    /*
    private GameObject[] gameObjects;

    public CollisionDetector(GameObject[] gameObjects) {
        this.gameObjects = gameObjects;
    }

    public void isUnSafe() {

        for (GameObject o : gameObjects) {

            if (o instanceof CodeCadet) {
                checkCadet(o);
            }

        }


    }

    /**
     * Checks for collisions with specific gameObject
     * Requires iterating the array once
     * @param
     */
    /*
    public void checkCadet(GameObject gameObject) {
        for (GameObject ig : gameObjects) {
            // No point in checking collisions with self
            if (ig instanceof Friend || ig instanceof CodeCadet) {
                continue;
            }



            //Checks beer
            if (ig instanceof Beer) {
                if(ig.getPosition().getRow() == gameObject.getPosition().getRow() &&
                ig.getPosition().getCol() == gameObject.getPosition().getCol()) {
                    System.out.println("MORE DRUNK");
                    ((Beer) ig).setCaught();
                    CodeCadet cadet = (CodeCadet) gameObject;
                    cadet.setDrunk(true);
                }
            }

            //Checks card
            
        }

    }
    */
}
