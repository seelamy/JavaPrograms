package com.core.javaprograms;

import java.util.Arrays;

public class CheckTwoArraysEqualOrNot {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5};
		//System.out.println(Arrays.equals(a, b));
		
		boolean status=true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					status=false;
					break;
				}
			}
			
		}else {
			status=false;
		}
		
		System.out.println(status);
	}

}
