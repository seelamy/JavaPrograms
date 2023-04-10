package com.core.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintNumbers {

    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        strings.add("Akash");
        strings.add("Baba");
        strings.add("Sam");
        strings.add("Ahaul");
        strings.add("ADeee");
        Long count=strings.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(count);
       List<String> list1= Arrays.asList("Sam","Ram","Pam");
       List<String> list2=Arrays.asList("DDDE","DSFD","SDF");
        //boolean bp=Stream.concat(list1.stream(),list2.stream()).anyMatch(s->s.equalsIgnoreCase("Sam"));
        //List<String> list=Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
       // System.out.println(list.get(0));
        List<Integer> list=Arrays.asList(1,4,7,2,8,7,2,6,5,8,1,10);
        list.stream().distinct().forEach(s->System.out.println(s));
       List<Integer> lists= list.stream().sorted().distinct().sorted().collect(Collectors.toList());

    }

}
