package com.naveen.learnspringframework;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.naveen.learnspringframework.game.GameRunner;
import com.naveen.learnspringframework.game.PacmanGame;



public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		
		var game = new PacmanGame(); //1: Object Creation
		
		var gameRunner = new GameRunner(game);
			//2: OBJECT CRETION + Wiring of Dependencies
			// Game is a Dependency of GameRunner.
		gameRunner.run();
	}

	
}
 