package com.java8Features.FunctionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo<T>{

//    public void accept(T t) {
//        System.out.println("Hello "+t);
//    }

    public static void main(String[] args) {
//        Consumer cd = (t) -> System.out.println(t +" "+t.getClass());
//        cd.accept("Sumit");
//
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//        list.stream().forEach(cd);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.stream().forEach(t-> System.out.println(t));
    }


}
