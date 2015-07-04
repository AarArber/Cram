package com.totallyserious.cram;

import com.badlogic.gdx.Game;
import com.totallyserious.cram.screens.Splash;

public class MyCram extends Game {

	public static final String TITLE="Game Project";
	public static final int WIDTH=480,HEIGHT=800; // used later to set window size

	@Override
	public void create() {
		setScreen(new Splash());
	}
	/*@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}*/
}
