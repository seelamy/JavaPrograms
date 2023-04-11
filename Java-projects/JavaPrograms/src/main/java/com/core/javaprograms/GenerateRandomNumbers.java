package com.core.javaprograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbers {
	public static void main(String[] args) {
		//Using Random class
		Random random=new Random();
		System.out.println(random.nextInt(100));
		
		System.out.println(random.nextDouble());
		
		// Using Math class
		System.out.println(Math.random());
		
		//Using Apache Commons Lang 
		System.out.println(RandomStringUtils.randomAlphabetic(4));
		System.out.println(RandomStringUtils.randomNumeric(3, 10));

	}

}
