package com.naveen.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naveen.learnspringframework.game.GameRunner;
import com.naveen.learnspringframework.game.GamingConsole;
import com.naveen.learnspringframework.game.MarioGame;
import com.naveen.learnspringframework.game.PacmanGame;
import com.naveen.learnspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
	}
}
 