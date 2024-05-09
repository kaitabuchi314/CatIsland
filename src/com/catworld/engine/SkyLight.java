package com.catworld.engine;

import com.jme3.light.AmbientLight;
import com.jme3.light.DirectionalLight;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

public class SkyLight extends Entity {
	DirectionalLight dir;
	AmbientLight sun;
	public SkyLight(BaseGame game, Vector3f position) {
		super(game, position);
		
		dir = new DirectionalLight();
		dir.setDirection(new Vector3f(-.2f, -.2f, -.2f));
		dir.setColor(ColorRGBA.White);
		game.rootNode.addLight(dir);
		
		sun = new AmbientLight();
		sun.setColor(ColorRGBA.White.mult(0.4f));
		game.rootNode.addLight(sun);
	}

	public SkyLight(BaseGame game, Vector3f position, Vector3f scale, Vector3f rotation) {
		super(game, position, scale, rotation);
		dir = new DirectionalLight();
		dir.setDirection(new Vector3f(-.2f, -.2f, -.2f));
		dir.setColor(ColorRGBA.White);
		game.rootNode.addLight(dir);
		
		sun = new AmbientLight();
		sun.setColor(ColorRGBA.White.mult(0.4f));
		game.rootNode.addLight(sun);
	}
	
	public void start() {
		
	}
	
	public void update() {
		
	}
}
