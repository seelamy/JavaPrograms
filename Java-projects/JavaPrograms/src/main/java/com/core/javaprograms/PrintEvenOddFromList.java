package com.core.javaprograms;

public class PrintEvenOddFromList {
	public static void main(String[] args) {
		int[] a= {4,3,5,6,7,2,8};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0){
				System.out.println(a[i]+" Is even number");
			}else {
				System.out.println(a[i]+" Is Odd number");

			}
		}
	}

}
