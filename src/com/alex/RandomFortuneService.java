package com.alex;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create an array of strings
	private String[] data = {"beware of the worf", "blach", "hahaha"};
	
	// Random generator
	private Random rand = new Random(); 
	
	@Override
	public String getFortune() {
		return data[rand.nextInt(data.length)];
	}

}
