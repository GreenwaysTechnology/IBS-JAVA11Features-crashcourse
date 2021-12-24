package com.ibs.features.java11.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateMethods {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("java", "\n \n", "J2ee");
        List<String> strings = stringList.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
        System.out.println(strings);
    }
}
