package org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.characteres;

import org.academiadecodigo.simplegraphics.keyboard.*;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Direction;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx.Grid;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Beer;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.Catchable;
import org.academiadecodigo.whiledcards.dudewhereisyourcard.objects.GameObject;

public class CodeCadet extends Person implements Catchable, KeyboardHandler {

    // Game Objects Attributes: position, grid | Methods: getPosition, setGrid
    // Person Attributes: speed,  currentDirection,  picture | Methods: move

    // CodeCadet Attributes

    private boolean drunk;
    private boolean caught;
    private int movementCounter = -1;
    private Direction[] array = {Direction.LEFT, Direction.RIGHT, Direction.UP, Direction.UP};

    // Constructor
    public CodeCadet(Grid grid, String picName, int speed) {
        super(grid, picName, speed);
    }

    // Methods
    public void setDrunk() {
        drunk = !drunk;
    }

    public boolean isDrunk() {
        return drunk;
    }

    public int getMovementCounter() {
        return movementCounter;
    }

    /**
     * Used to reset movement counter to become sober again whenever needed
     */
    public void resetMovementCounter() {
        movementCounter = 0;
    }

    @Override
    public void capture() {
    }


    private Direction keyRandomizer() {
        int num = (int) Math.random() * array.length;
        Direction temp = array[num];
        if (array[num] == null) {
            temp = keyRandomizer();
        }
        array[num] = null;


        return temp;
    }


    @Override
    public void move() {
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent eventLeft = new KeyboardEvent();
        eventLeft.setKey(KeyboardEvent.KEY_LEFT);
        eventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventLeft);

        KeyboardEvent eventRight = new KeyboardEvent();
        eventRight.setKey(KeyboardEvent.KEY_RIGHT);
        eventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventRight);

        KeyboardEvent eventUp = new KeyboardEvent();
        eventUp.setKey(KeyboardEvent.KEY_UP);
        eventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventUp);

        KeyboardEvent eventDown = new KeyboardEvent();
        eventDown.setKey(KeyboardEvent.KEY_DOWN);
        eventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventDown);


    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(movementCounter == 15){
            setDrunk();
            movementCounter = -1;
        }
        if (!isDrunk() && movementCounter == -1) {
            if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
                super.walk(Direction.LEFT, super.getSpeed());
            }

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
                super.walk(Direction.RIGHT, super.getSpeed());

            }

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
                super.walk(Direction.UP, super.getSpeed());

            }

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
                super.walk(Direction.DOWN, super.getSpeed());

            }
        }else{
            movementCounter++;
            if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
                super.walk(keyRandomizer(), super.getSpeed());
            }

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
                super.walk(keyRandomizer(), super.getSpeed());

            }

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
                super.walk(keyRandomizer(), super.getSpeed());

            }

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
                super.walk(keyRandomizer(), super.getSpeed());
        }

    }}

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


    // Catchable methods
    @Override
    public boolean isCaught() {
        return caught;
    }

    @Override
    public void setCaught() {
        caught = true;
    }
}
