package com.core.javaprograms;

public class SumofDigitsInNumber {
	public static void main(String[] args) {
		int a=49958585;
		int b=0;
		while(a>0) {
			b=b+a%10;
			a=a/10;
		}
		System.out.println(b);
	}

}
