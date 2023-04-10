package com.core.javaprograms;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNumberFromList {
    public static void main(String[] args) {
        List<Integer>  integers= Arrays.asList(2,5,7,9,8,10,15,49,25,98,32);
        for (Integer integer :integers) {
             if(integer%2==0){
                 System.out.println(integer);
             }
        }
    }
}
