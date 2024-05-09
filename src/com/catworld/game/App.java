package com.catworld.game;

import com.catworld.engine.GameApplication;

public class App {
	
    public static void main(String[] args) {
    	GameApplication app = new GameApplication("Cat Island", 1080, 720);
    	
    	Game game = new Game(app);
    	app.setGame(game);
    	
    	app.start();
    }

}