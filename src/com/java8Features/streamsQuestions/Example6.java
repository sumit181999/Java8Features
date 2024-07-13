package com.java8Features.streamsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter
public class Example6 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("sumit","dfdg","dgdfg","fdvfd");
        String str = list.stream().collect(Collectors.joining(", ","[","]"));
        System.out.println(str);
    }
}
