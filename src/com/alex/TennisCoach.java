package com.alex;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	// Field Injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//	Define a default constructor
	public TennisCoach() {
		System.out.println("TennisCoach >> inside default constructor.");
	}

	// Define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach >> inside doMyStartupStuff.");
	}
	
	// Define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach >> inside doMyCleanupStuff.");
	}
	
	
	/*
	// Define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> inside setFortuneService method.");
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	// Method injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> inside doSomeCrazyStuff method.");
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
