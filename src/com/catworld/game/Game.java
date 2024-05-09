package com.catworld.game;

import com.catworld.engine.*;
import com.jme3.math.*;


public class Game extends BaseGame {
	Mesh mesh;
	
	public Game(GameApplication app) {
		super(app);
		
	}
	
	void setupCam() {
		app.getFlyCam().setDragToRotate(true);
		app.getFlyCam().setMoveSpeed(6);
		app.getFlyCam().setRotationSpeed(2);
		app.getFlyCam().setEnabled(true);
	}
	
	@Override
	public void start() {
		
		super.start();
		
		setupCam();
				
		SkyLight light = new SkyLight(this, Vector3f.ZERO);
		
		mesh = new Mesh("/Models/box.fbx", "/Textures/white.png", this, Vector3f.ZERO);
	}
	
	@Override
	public void update() {
		mesh.update();
	}

}
