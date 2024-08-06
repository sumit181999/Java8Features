package com.java8Features.streamsQuestions;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// sorting even and odd number using stream partitioningBy method
public class Example1 {

    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> map = listOfInteger.stream().collect(Collectors.partitioningBy(i->i%2==0));
        Set<Map.Entry<Boolean,List<Integer>>> entrySet = map.entrySet();
        for(Map.Entry<Boolean,List<Integer>> entry : entrySet){
            if(entry.getKey()){
                System.out.print("Even Numbers");
            }else{
                System.out.print("Odd Numbers");
            }
            System.out.println("");
            List<Integer> list = entry.getValue();
            for(Integer i : list){
                System.out.print(i+" ");
            }
            System.out.println("");
        }

//        using streams
        System.out.println("");
        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey()+" "+entry.getValue());
        });
        //        if you want more control over key value then above methods are preferred.
       //        basically you will use entrySet() when you most often want to use stream api as shown above.
        System.out.println("");
        map.forEach((key,value)-> System.out.println(key+" "+value));
    }

}


