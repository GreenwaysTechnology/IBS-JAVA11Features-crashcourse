package com.ibs.features.java11.stringapis;

import java.util.List;
import java.util.stream.Collectors;

public class NewStringApis {
    public static void main(String[] args) {
        //String multi String
        String multiString = "Oracle helps \n \n developers \n to build java apps";
        List<String> strings = multiString.lines().filter(line -> !line.isBlank()).map(String::strip).collect(Collectors.toList());
        System.out.println(strings);
    }
}
