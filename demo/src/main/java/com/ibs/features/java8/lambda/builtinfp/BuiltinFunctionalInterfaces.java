package com.ibs.features.java8.lambda.builtinfp;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltinFunctionalInterfaces {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());
        Predicate<Integer> predicate = number -> number > 10;
        System.out.println(predicate.test(100));
        System.out.println(predicate.test(1));

        Function<String, String> function = input -> input;
        System.out.println(function.apply("Hello"));


        //Bi -two
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println(biPredicate.test(10,20));
    }
}
