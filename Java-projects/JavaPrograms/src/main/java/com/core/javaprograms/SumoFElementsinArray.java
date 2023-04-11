package com.core.javaprograms;

public class SumoFElementsinArray {
	public static void main(String[] args) {
		int[] a= {4,5,6,7,3,2,4,6};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
