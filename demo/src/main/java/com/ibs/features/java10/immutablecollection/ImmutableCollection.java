package com.ibs.features.java10.immutablecollection;

import java.util.Arrays;
import java.util.List;

public class ImmutableCollection {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3);
        System.out.println(integers);
        List<Integer> integers1 = List.copyOf(integers);
        System.out.println(integers == integers1);
    }
}
