package com.ibs.features.java8.optionals;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String str = null;
        //System.out.println(str.length());
        Optional<String> checkNull = Optional.ofNullable(str);
        //System.out.println(checkNull.get());
        System.out.println(checkNull.orElse("oops"));

        String myName = "Subrmanian";
        Optional<String> myNameNull = Optional.ofNullable(myName);
        System.out.println(myNameNull.orElse("oops"));

    }
}
