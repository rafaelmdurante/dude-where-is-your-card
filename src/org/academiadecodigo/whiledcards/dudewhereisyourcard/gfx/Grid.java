package org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    /**
     * properties
     */
    private Rectangle rectangle;
    private int cols;
    private int rows;
    private int cellSize = 20;
    private static final int PADDING = 10;

    /**
     * constructor
     */
    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    /**
     * instantiate rectangle
     * and the properties
     */
    public void init() {
        rectangle = new Rectangle(PADDING, PADDING, cols * cellSize, rows * cellSize);
        rectangle.draw();
    }

    /**
     * return random position
     */
    public Position makeGridPosition() {
        return new Position(this);
    }

    /**
     * return position
     */
    public Position makeGridPosition(int cols, int rows) {
        return new Position(cols, rows, this);
    }

    /**
     * convert rows into pixels
     *
     * @param rows
     * @return
     */
    public int rowToY(int rows) {
        return cellSize * rows + PADDING;
    }

    /**
     * convert cols into pixels
     *
     * @param cols
     * @return
     */
    public int colToX(int cols) {
        return cellSize * cols + PADDING;
    }

    public int getWidth() {
        return rectangle.getWidth();
    }

    public int getHeight() {
        return rectangle.getHeight();
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int getX() {
        return rectangle.getX();
    }

    public int getY() {
        return rectangle.getY();
    }

    public int getCellSize() {
        return cellSize;
    }
}
