package com.catworld.game;

import com.catworld.engine.BaseGame;
import com.catworld.engine.GameApplication;
import com.jme3.asset.AssetManager;
import com.jme3.light.AmbientLight;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;

public class Game extends BaseGame {

	
	public Game(GameApplication app) {
		super(app);
		
	}
	
	void setupCam() {
		
	}
	
	@Override
	public void start() {
		
		super.start();
		
		
		app.getFlyCam().setDragToRotate(true);
		app.getFlyCam().setMoveSpeed(6);
		app.getFlyCam().setRotationSpeed(2);
		app.getFlyCam().setEnabled(true);
				
		DirectionalLight dir = new DirectionalLight();
		dir.setDirection(new Vector3f(-.2f, -.2f, -.2f));
		dir.setColor(ColorRGBA.White);
		rootNode.addLight(dir);
		
		AmbientLight sun = new AmbientLight();
		sun.setColor(ColorRGBA.White.mult(0.4f));
		rootNode.addLight(sun);
		
		
		Spatial mesh = assetManager.loadModel("/Models/box.fbx");

		Material mat = new Material(assetManager, "Common/MatDefs/Light/Lighting.j3md");
        mat.setColor("Diffuse", new ColorRGBA(255, 0, 0, 0));
		
        mesh.setMaterial(mat);
        
        rootNode.attachChild(mesh);
	}
	
	@Override
	public void update() {
		
	}

}
