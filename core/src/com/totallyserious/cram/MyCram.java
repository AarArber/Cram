package com.totallyserious.cram;

import com.badlogic.gdx.Game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.totallyserious.cram.screens.Splash;


public class MyCram extends Game {

	public static final String TITLE="Game Project";
	public static final int WIDTH=480,HEIGHT=800; // used later to set window size
	private SpriteBatch batch;
    private Player player;
//	private Sprite sprite;
//	private Texture player_img;

	@Override
	public void create() {
		//setScreen(new Splash());
		batch = new SpriteBatch();
        player = new Player();
		/*player_img = new Texture(Gdx.files.internal("Player.png"));
		sprite = new Sprite(player_img);
		//sprite.setBounds(0, 0, wi, height);*/
	}
	@Override
	public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//sprite.draw(batch);
		player.drawSprite(batch);

		batch.end();
	}
}
