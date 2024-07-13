package com.java8Features.streamsQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Example8 {

    public static void main(String[] args) {
        //Given a list of integers, find maximum and minimum of those numbers
        System.out.println("Given a list of integers, find maximum and minimum of those numbers");
        List<Integer> list = Arrays.asList(12,54,233,65,323,564,325);
        int mx = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max element"+mx);
        int mn = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(mn);

//        merge two unsorted arrays into single sorted array using Java 8 streams
        System.out.println("merge two unsorted arrays into single sorted array using Java 8 streams");
        int arr1[] = new int[]{2,3,4,56,7,88};
        int arr2[]=new int[]{34,465,2,3,565};
        int arr3[]= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
        System.out.println(arr3);

//     merge two unsorted arrays into single sorted array without duplicates
        System.out.println("merge two unsorted arrays into single sorted array without duplicates");
        int arr4[]=IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().distinct().toArray();
        System.out.println(arr4);

//     get three maximum numbers and three minimum numbers from the given list of integers
        System.out.println("minimum and maximum 3 numbers");
//        maximum
        list.stream().sorted().limit(3).forEach(System.out::println);
//        minimum
        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

//    list of strings, sort them according to increasing order of their length
        System.out.println("list of strings, sort them according to increasing order of their length");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted(Comparator.comparing(s -> s.length())).forEach(System.out::println);

//        find common elements between two arrays
        System.out.println("find common elements between two arrays");
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.stream().filter(item2->list2.contains(item2)).forEach(System.out::println);
//     list1.stream().filter(list2::contains).forEach(System.out::println);  same as above

//        Given a list of strings, find out those strings which start with a number
        System.out.println("Given a list of strings, find out those strings which start with a number");
        List<String> listOfStrings1 = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfStrings1.stream().filter(s -> Character.isDigit(s.charAt(0))).forEach(System.out::println);

//        extract duplicate elements from an array
        System.out.println("extract duplicate elements from an array");
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> duplicateElements = listOfIntegers.stream().filter(integer -> !set1.add(integer)).collect(Collectors.toSet());
        duplicateElements.forEach(System.out::println);

//        Print duplicate characters in a string
        System.out.println("Print duplicate characters in a string");
        String input = "Java concept of the day".replaceAll("\\s","").toLowerCase();
        Set<Character> set2 = new HashSet<>();
        input.chars().mapToObj(c->(char)c).filter(chr-> !set2.add(chr)).forEach(s -> System.out.print(s+" "));
//    str.chars(): Returns an IntStream of Unicode code points for the string input.
//    mapToObj(c -> (char) c): Converts each integer code point to a char object, resulting in a Stream<Character>.
//    that' why we don't have to use the stream() after the map.
    }
}
