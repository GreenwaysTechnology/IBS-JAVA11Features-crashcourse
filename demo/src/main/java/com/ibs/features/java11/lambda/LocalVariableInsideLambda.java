package com.ibs.features.java11.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVariableInsideLambda {
    public static void main(String[] args) {
        List<String> mylists = Arrays.asList("Java 8", "Java 11");
        String result = mylists.stream().map((var x) -> x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(result);
    }
}
