package com.core.javaprograms;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int a=345566;
        //String s=String.valueOf(a);
        int count =0;
        while (a>0){
            a=a/10;
            count++;
        }
       System.out.println(count);
    }
}
