package com.example.ludwig.Boston70libGDXGame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class MyGdxGame extends ApplicationAdapter {
    private SpriteBatch batch;
    private BitmapFont font;
    private Texture img;
    private TextureAtlas ninjaAtlas;
    private Animation animation;
    private float timePassed = 0;
    private Sprite sprite;



	
	@Override
	public void create () {
        batch = new SpriteBatch();
        ninjaAtlas = new TextureAtlas(Gdx.files.internal("ninja.atlas"));
        animation = new Animation(1/10f, ninjaAtlas.getRegions());

	}

    @Override
    public void dispose() {
        batch.dispose();
       ninjaAtlas.dispose();


    }

    @Override
	public void render () {

        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        timePassed += Gdx.graphics.getDeltaTime();
        batch.draw(animation.getKeyFrame(timePassed, true), 100, 300);
        batch.end();


	}
}
