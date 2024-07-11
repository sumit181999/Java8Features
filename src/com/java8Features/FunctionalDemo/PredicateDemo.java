package com.java8Features.FunctionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo{

//    @Override
//    public boolean test(Integer integer) {
//        if(integer%2==z){
//            return true;
//        }else{
//            return false;
//        }
//    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = (t) -> t%2==0;
        System.out.println(predicate.test(10));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream().filter(predicate).forEach(t-> System.out.println(t));
    }
}
