package com.naveen.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.naveen.learnspringframework.game.GameRunner;
import com.naveen.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.naveen.learnspringframework.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(GamingAppLauncherApplication.class)){
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
	}
}
 