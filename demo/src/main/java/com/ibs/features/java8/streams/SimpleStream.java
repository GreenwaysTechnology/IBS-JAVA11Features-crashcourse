package com.ibs.features.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStream {
    public static void main(String[] args) {
        //Create List and convert into stream.
        List<String> stringList = Arrays.asList("a", "b", "c", "", "d", "e", "abc", "", "");
        //i need to findout list of strings without empty.
       // stringList.stream().filter(string -> !string.isEmpty()).forEach(s -> System.out.println(s));
        stringList.stream().filter(string -> !string.isEmpty()).forEach(System.out::println);
        List<String> filterList=stringList.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filterList);

    }
}
