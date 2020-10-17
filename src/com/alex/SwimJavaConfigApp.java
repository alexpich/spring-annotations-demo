package com.alex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigApp {

	public static void main(String[] args) {
		
		// Read Spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class); 
		
		// Get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// Call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// Call our new swim coach methods ... has the props value injected	
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("email: " + theCoach.getTeam());
		
		// Close the context
		context.close();

	}

}
