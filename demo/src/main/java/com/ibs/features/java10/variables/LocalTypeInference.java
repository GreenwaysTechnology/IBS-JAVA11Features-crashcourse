package com.ibs.features.java10.variables;

import java.util.Arrays;
import java.util.List;

public class LocalTypeInference {
    public static void main(String[] args) {
        //Local type inference variable:
        var i = 10; //looks like dynamic typed language
        System.out.println(i * 10);
        var name = "Subramanian";
        System.out.println(name);
        var list  = Arrays.asList("111","222");
        System.out.println(list);

    }
}
