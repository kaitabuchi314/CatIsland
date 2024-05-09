package com.catworld.engine;

import com.jme3.asset.AssetManager;
import com.jme3.renderer.Camera;
import com.jme3.scene.Node;

public class BaseGame {
	
	public Camera cam;
	public Node rootNode;
	public AssetManager assetManager;
	public GameApplication app;
	
	public BaseGame(GameApplication app) {
		this.rootNode = app.getRootNode();
		this.app = app;
	}
	
	public void start() {
		this.cam = app.getCamera();
		this.assetManager = app.getAssetManager();
	}
	public void update() {};
	
}
