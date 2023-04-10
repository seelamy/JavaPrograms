package com.core.javaprograms;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Yella";
        String rev = "";
//       int len=s.length();
//       for(int i=len-1;i>=0;i--){
//           rev=rev+s.charAt(i);
//       }
//        System.out.println(rev);
//    }
        char[] chars=s.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            rev=rev+chars[i];
        }
        System.out.println(rev);
    }
}
