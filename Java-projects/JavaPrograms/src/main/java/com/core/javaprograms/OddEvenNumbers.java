package com.core.javaprograms;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int num=234567898;
        int even_num=0;
        int odd_num=0;

        while(num>0) {
        	int rem=num%10;
        	if(rem%2==0) {
        		even_num++;
        	}else {
        		odd_num++;
        	}
        	
        	num=num/10;
        }
        System.out.println(even_num);
        System.out.println(odd_num);

    }
}
