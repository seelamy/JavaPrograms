package com.core.javaprograms;

public class FindAnElementInArrayLinearSearch {
	public static void main(String[] args) {
		int[] a= {10,30,40,50,60,100};
		int search_element=40;
		for(int i=0;i<a.length;i++) {
			if(search_element==a[i]) {
				System.out.println(search_element+" Element is present");
				break;
			}
			
		}
	}

}
