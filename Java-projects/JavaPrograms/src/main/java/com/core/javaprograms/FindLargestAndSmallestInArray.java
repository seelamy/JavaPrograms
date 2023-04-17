package com.core.javaprograms;

public class FindLargestAndSmallestInArray {
 
	public static void main(String[] args) {
		int[] a= {3,45,2,5,6,42,455};
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		
		}
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);

		System.out.println(max);
	}
	
}
