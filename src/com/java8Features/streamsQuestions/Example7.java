package com.java8Features.streamsQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//given list of integers, print the numbers which are multiples of 5
public class Example7 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,54,233,65,323,564,325);
        list.stream().filter(i -> i%5==0).forEach(System.out::println);
    }
}
