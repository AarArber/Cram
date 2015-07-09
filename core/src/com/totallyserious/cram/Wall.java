package com.totallyserious.cram;

/**
 * Created by Aaron on 7/8/2015.
 */
public class Wall {
    private int x;
    private int y;
    private int direction;
    private int speed;
    private boolean isJumping;

    public Wall(){

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isJumping() {
        return isJumping;
    }

    public void setIsJumping(boolean isJumping) {
        this.isJumping = isJumping;
    }

    public void move(){

    }

    public void jump(){

    }
}
