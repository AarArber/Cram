package com.totallyserious.cram;

/**
 * Created by Aaron on 7/8/2015.
 */
public class Bullet {
    private int size;
    private int speed;
    private boolean isMoving;
    //Not sure what this type will be
    //private Color color;
    private int x;
    private int y;
    private boolean isAlive;

    public Bullet(){

    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
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

   /* public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }*/

    public boolean isMoving() {
        return isMoving;
    }

    public void setIsMoving(boolean isMoving) {
        this.isMoving = isMoving;
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

    public void fire(){

    }

    public void move(){

    }
}
