package com.catworld.engine;

import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;

public class Mesh extends Entity {

	public Spatial s;
	
	public Mesh(String path, String texturePath, BaseGame game, Vector3f position) {
		super(game, position);
		s = game.assetManager.loadModel(path);
		Material mat = new Material(game.assetManager, "Common/MatDefs/Light/Lighting.j3md");
        mat.setTexture("DiffuseMap", game.assetManager.loadTexture(texturePath));
		
        s.setMaterial(mat);
        
        game.rootNode.attachChild(s);
	}
	
	public Mesh(String path, String texturePath, BaseGame game, Vector3f position, Vector3f scale, Vector3f rotation) {
		super(game, position, scale, rotation);
		
		s = game.assetManager.loadModel(path);
		Material mat = new Material(game.assetManager, "Common/MatDefs/Light/Lighting.j3md");
        mat.setTexture("DiffuseMap", game.assetManager.loadTexture(texturePath));
		
        s.setMaterial(mat);
        
        game.rootNode.attachChild(s);

	}
	
	@Override
	public void start() {
		
	}
	
	@Override
	public void update() {
		
	}
}
