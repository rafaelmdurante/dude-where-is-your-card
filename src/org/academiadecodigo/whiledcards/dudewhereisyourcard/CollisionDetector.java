package org.academiadecodigo.whiledcards.dudewhereisyourcard;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.GameObject;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;

public class CollisionDetector {

    private GameObject[] gameObjects;

    public CollisionDetector(GameObject[] gameObjects) {
        this.gameObjects = objects;
    }

    public boolean isUnSafe(Position pos) {

        for (GameObject o : gameObjects) {

            if (o.getPosition()!= pos && o.getPosition().equals(pos)) {
                return true;
            }

        }

        return false;

    }

    /**
     * Checks for collisions with specific gameObject
     * Requires iterating the array once
     * @param
     */
    public void check(GameObject gameObject) {

        for (GameObject ig : gameObjects) {

            // No point in checking collisions with self
            if (ig == gameObject) {
                continue;
            }

            if (ig.getPosition().equals(gameObject.getPosition())) {
                ig.collide();
                gameObject.collide();
            }
        }

    }
}
