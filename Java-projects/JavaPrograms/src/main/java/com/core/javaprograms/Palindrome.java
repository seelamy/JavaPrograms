package com.core.javaprograms;

public class Palindrome {
    public static void main(String[] args) {
        int a=454;
        int b=a;
        int revnum=0;

        while (a!=0){
            revnum=revnum*10+a%10;
            a=a/10;
        }
        if(revnum==b){
            System.out.println("Given number is palindrome");
        }else {
            System.out.println("Given number is not palindrome");

        }
    }
}
