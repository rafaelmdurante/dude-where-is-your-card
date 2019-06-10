package org.academiadecodigo.whiledcards.dudewhereisyourcard.gfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.*;

public class Position {
    private int col;
    private int row;
    private Grid grid;
    private Picture picture;
    private String picName;

    public Position(Grid grid, String picName) {
        this.grid = grid;
        this.picName = picName;
        col = (int) (Math.random() * grid.getCols());
        row = (int) (Math.random() * grid.getRows());
    }

     public Position(int col, int row, Grid grid, String picName) {
        this.picName = picName;
        this.grid = grid;
        this.col = col;
        this.row = row;
    }

    public void show() {
        picture.draw();
    }

    public void hide() {
        picture.delete();
    }

    public void choosePicture() {
        int column = grid.colToX(col);
        int rows = grid.rowToY(row);
        picture = new Picture(column, rows, picName);
    }

    public void moveInDirection(Direction direction, int distance) {

        switch (direction) {

            case UP:
                moveUp(distance);
                break;

            case DOWN:
                moveDown(distance);
                break;

            case LEFT:
                moveLeft(distance);
                break;

            case RIGHT:
                moveRight(distance);
                break;

        }
    }

    public void moveUp(int distance) {

        setPosition


    }


    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }
}
