package com.core.javaprograms;

public class GivenNumberPrimeOrNot {
	public static void main(String[] args) {
		int a=4;
		int count=0;
		if(a>1) {
			for(int i=1;i<=a;i++) {
				if(a%i==0) 
					count++;
			}
			if(count==2) {
					System.out.println("Given number is prime number");

			}else {
				System.out.println("Given number is not a prime number");

			}
			
		}else {
			System.out.println("Given number is prime number");
		}
	}

}
