package com.mod3hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Mod3Week2Hw1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Mod3Week2Hw1Application.class, args);
		
		
		
		Runner bob = context.getBean(Runner.class);
		bob.setName("Bob");
		bob.setAge(34);
		bob.setFinishTime(82.5);
		bob.show();
		
		
		Runner john = context.getBean(Runner.class);
		john.setName("John");
		john.setAge(42);
		john.setFinishTime(96.4);
		john.show();
	
		
	
		
	}
	
	
	

}
