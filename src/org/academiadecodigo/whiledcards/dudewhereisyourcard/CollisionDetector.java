package org.academiadecodigo.whiledcards.dudewhereisyourcard;

import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.GameObjects;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Position;

public class CollisionDetector {

    private GameObjects[] gameObjects;

    public CollisionDetector(GameObjects[] objects) {
        this.gameObjects = objects;
    }

    public boolean isUnSafe(Position pos) {

        for (GameObjects o : gameObjects) {

            if (o.getPosition()!= pos && o.getPosition().equals(pos)) {
                return true;
            }

        }

        return false;

    }

    /**
     * Checks for collisions with specific car
     * Requires iterating the array once
     * @param car
     */
    public void check(GameObjects gameObjects) {

        for (Car ic : cars) {

            // No point in checking collisions with self
            if (ic == car) {
                continue;
            }

            if (ic.getPos().equals(car.getPos())) {
                ic.crash();
                car.crash();
            }
        }

    }
}
