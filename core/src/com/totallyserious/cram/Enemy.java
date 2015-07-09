package com.totallyserious.cram;

/**
 * Created by Aaron on 7/8/2015.
 */
public class Enemy {
    private int size;
    private int speed;
    private int x;
    private int y;
   //not sure what color type will be yet
   // private Color color;
    private boolean isMoving;
    private boolean isAlive;

    public Enemy(){

    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setIsMoving(boolean isMoving) {
        this.isMoving = isMoving;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void move(){

    }
}
