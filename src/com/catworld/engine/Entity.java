package com.catworld.engine;

import com.jme3.math.Vector3f;

public class Entity {
	public Vector3f position;
	public Vector3f scale;
	public Vector3f rotation;
	public BaseGame game;
	
	public Entity(BaseGame game, Vector3f position) {
		this.position = position;
		this.game = game;
	}

	public Entity(BaseGame game, Vector3f position, Vector3f scale, Vector3f rotation) {
		this.position = position;
		this.scale = scale;
		this.rotation = rotation;
		this.game = game;
	}
	
	public void start() {
		
	}
	
	public void update() {
		
	}
}

