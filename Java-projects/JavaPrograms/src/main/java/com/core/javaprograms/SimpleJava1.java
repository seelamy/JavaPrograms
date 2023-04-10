package com.core.javaprograms;

public class SimpleJava1 {
    public static void main(String[] args) {
        String s="Yellareddy";
        String rev="";
       char[] array= s.toCharArray();
       for (int i=array.length-1;i>=0;i--){
           rev+=array[i];
       }
       System.out.println(rev);
    }


}