package com.core.javaprograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int a=8887;
        int revnum=0;

        while (a!=0){
            revnum=revnum*10+a%10;
            a=a/10;
        }
//        StringBuffer stringBuffer=new StringBuffer(String.valueOf(a));
//        System.out.println(stringBuffer.reverse());
    }
}
