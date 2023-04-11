package com.core.javaprograms;

public class FactorialNumber {
	public static void main(String[] args) {
		int a=5;
		long factorial=1;
		for(int i=1;i<=a;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}
