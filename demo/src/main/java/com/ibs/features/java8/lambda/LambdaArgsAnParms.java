package com.ibs.features.java8.lambda;

public class LambdaArgsAnParms {
    public static void main(String[] args) {
        Add adder = null;
        adder = (int a, int b) -> {
            return a + b;
        };
        System.out.println(adder.add(10, 10));
        //if no more body only return type :remove {} and return
        adder = (int a, int b) -> a + b;
        System.out.println(adder.add(10, 10));

        //type inference ;args type need not mention; it is understood by befault
        adder = (a, b) -> a + b;
        System.out.println(adder.add(10, 10));


    }
}
