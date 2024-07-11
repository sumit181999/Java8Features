package com.java8Features.streamsQuestions;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// sorting even and odd number using stream partitioningBy method
public class Example1 {

    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> map = listOfInteger.stream().collect(Collectors.partitioningBy(i->i%2==0));
        Set<Map.Entry<Boolean,List<Integer>>> entrySet = map.entrySet();
        for(Map.Entry<Boolean,List<Integer>> entry : entrySet){
            if(entry.getKey()){
                System.out.println("Even Numbers");
            }else{
                System.out.println("Odd Numbers");
            }
            List<Integer> list = entry.getValue();
            for(Integer i : list){
                System.out.println(i);
            }
        }
    }

}


