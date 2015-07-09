/**
 * Created by Aaron on 7/4/2015.
 */
package com.totallyserious.cram;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Player {
    private Sprite sprite;
    private Texture player_img;
    private SpriteBatch batch;
    private float speed;
    private float direction;
    private boolean isMoving;
    private boolean isAlive;
    private int width;
    private int height;
    private int x;
    private int y;

    public Player() {
        width = 32;
        height = 32;
        speed = 1;
        direction = 0;
        player_img = new Texture(Gdx.files.internal("Player.png"));
        sprite = new Sprite(player_img);
        sprite.setBounds(0, 0, width, height);
        batch = new SpriteBatch();
        x = 0;
        y = 0;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getDirection() {
        return direction;
    }

    public void setDirection(float direction) {
        this.direction = direction;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setIsMoving(boolean isMoving) {
        this.isMoving = isMoving;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    //***********************************************
    //USE THIS AS TEMPLATE FOR DRAWING - THIS WORKS!!
    //***********************************************
    public void drawSprite(Batch batch){
        sprite.draw(batch);
    }
}