package com.java8Features.FunctionalDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Traditional Approach
//public class FunctionDemo implements Function <String,Integer>{
//    @Override
//    public Integer apply(String str) {
//        return str.length();
//    }
//
//    public static void main(String[] args) {
//        Function function = new FunctionDemo();
//        System.out.println(function.apply("Hello World"));
//    }
//}

public class FunctionDemo {
    public static void main(String[] args) {

//        using method reference
        Function<String,Integer> function = String::length;
//        using lambda
        Function<String,Integer> function1 = (String str)->str.length();
        System.out.println(function.apply("Hello World"));
        System.out.println(function1.apply("Sumit"));

        System.out.println("--------------");
//    here map is using Function interface internally.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().map(n->n.length()).forEach(len-> System.out.print(len+" "));
        System.out.println("");
//        using method reference
        System.out.println("--------------");
        names.stream().map(String::length).forEach(System.out::println);

//        now looking another example which also using Function Interface internally.
//        The collect method can take a Collector that may internally use functions to transform or
//        accumulate stream elements.
        Map<Integer,List<String>> map = names.stream().collect(Collectors.groupingBy(str->str.length()));
        System.out.println(map);
    }
}
