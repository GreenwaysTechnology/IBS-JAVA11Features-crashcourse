package com.ibs.features.java11.collections;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        Integer[] integers = integerList.toArray(Integer[]::new);
        System.out.println(integers.length);
    }
}
