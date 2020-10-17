package com.alex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeApp {

	public static void main(String[] args) {
		
		// Read the spring java config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeConfig.class);
		
		// Retrieve beans from the container		
		Coach theCoach = context.getBean("practiceCoach", Coach.class);
		
		// Call methods on the bean	
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
		

	}

}
