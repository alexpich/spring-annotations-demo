package com.alex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {

	public static void main(String[] args) {
		
		// Read Spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class); 
		
		// Get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
//		Coach testCoach = context.getBean("testCoach", Coach.class);
		
		// Call method on the bean
		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(testCoach.getDailyWorkout());
		
		// Call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close();

	}

}
