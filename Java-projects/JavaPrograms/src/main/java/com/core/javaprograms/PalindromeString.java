package com.core.javaprograms;

public class PalindromeString {
    public static void main(String[] args) {
       String a="yeeyy";
       String rev="";
       int len=a.length();
        for (int i = len-1; i >=0; i--) {
            rev=rev+a.charAt(i);
        }
        if(a.equalsIgnoreCase(rev)){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given string is not palindrome");

        }
    }
}
