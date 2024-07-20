package com.java8Features.streamsQuestions;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// find frequency of each character in a string using Java 8 streams
public class Example3 {

    public static void main(String[] args) {

        String str = "Java concept of the day";
//        here we have use groupingBy method
// str.chars() This method returns an IntStream of the character codes (ASCII values) of the string str.
//.mapToObj(c -> (char) c) The mapToObj method converts each integer in the IntStream (character code) to its corresponding Character object.
//The lambda expression c -> (char) c casts each integer (character code) to a char, and mapToObj wraps it into a Character object, resulting in a Stream<Character>.
//.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//The collect method is used to accumulate the elements of the stream into a collection.
//Collectors.groupingBy(Function.identity(), Collectors.counting()) is a collector that groups the elements
// of the stream by their values and counts the number of occurrences of each element.
        Map<Character,Long> map = str.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        str.chars().forEach(ch -> System.out.println(ch));
        System.out.println(map);
        System.out.println("------------");
        for (Map.Entry<Character, Long> characterLongEntry : map.entrySet()) {
            System.out.print(characterLongEntry.getKey() + "=" + characterLongEntry.getValue() + "  ");
        }
        System.out.println("");
        System.out.println("------------");
        map.entrySet().forEach(characterLongEntry -> System.out.print(characterLongEntry.getKey()+"="+characterLongEntry.getValue()+"  "));

        System.out.println("");
        System.out.println("------------");
        map.forEach((key,value)-> System.out.print(key+"="+value+"  "));

    }
}
