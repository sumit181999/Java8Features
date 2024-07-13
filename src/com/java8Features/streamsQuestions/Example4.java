package com.java8Features.streamsQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//find frequency of each element in an array or a list
public class Example4 {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("pen","eraser","pencil","sharpner","pen","eraser");
        Map<String,Long> map = stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().forEach(item->{
            System.out.println(item.getKey()+" "+item.getValue());
        });
    }
}
