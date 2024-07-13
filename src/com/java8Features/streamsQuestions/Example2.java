package com.java8Features.streamsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// remove duplicate elements from a list using Java 8 streams
public class Example2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "c#", "python", "python", "java","c#");
        List<String> distinctValue = list.stream().distinct().collect(Collectors.toList());
        distinctValue.stream().forEach(System.out::println); //here we are using method reference
//        it is same as distinctValue.stream().forEach(item-> System.out.print(item+" "));
//        In the context of forEach, item represents each element in the stream.
//        The forEach method iterates over each element in the stream and passes it to the lambda expression.
//        The forEach method takes a Consumer, which here is defined by the lambda expression item -> System.out.print(item + " ").
//        For each element in the stream:
//        The current element is assigned to item.
//        The System.out.print(item + " ") statement is executed, printing the element followed by a space.
    }
}
