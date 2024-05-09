package com.catworld.engine;

import com.jme3.app.SimpleApplication;
import com.jme3.input.FlyByCamera;
import com.jme3.system.AppSettings;

public class GameApplication extends SimpleApplication {

	BaseGame game;
	
	public GameApplication(String windowName, int width, int height) {
		
		super();
        settings = new AppSettings(true);
        settings.setTitle(windowName);
        settings.setResolution(width, height);
        settings.setWindowSize(width, height);
        settings.setResizable(true);
        settings.setFrameRate(165);
        
	}
	
	public FlyByCamera getFlyCam() {
		return flyCam;
	}
	public void setGame(BaseGame game) {
		this.game = game;
	}
	
	@Override
	public void simpleInitApp() {
		
		flyCam.setEnabled(false);
		game.start();
        
	}
	
	@Override
	public void simpleUpdate(float tpf) {
		
		game.update();
		
	}


}
