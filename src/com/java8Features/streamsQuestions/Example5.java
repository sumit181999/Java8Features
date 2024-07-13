package com.java8Features.streamsQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//sort the given list of decimals in reverse order
public class Example5 {

    public static void main(String[] args) {
        List<Float> list = Arrays.asList(12.53f,32.12f,10.9f,4.3f);
        list.stream().sorted(Comparator.reverseOrder()).forEach(item-> System.out.print(item+" "));
    }
}
