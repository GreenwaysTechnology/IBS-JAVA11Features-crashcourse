package com.ibs.features.java10.immutablecollection;

import java.util.Optional;

public class OptionalAdvanced {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(100);
        System.out.println(optional.get());
        System.out.println(optional.orElse(1));
        String str = null;
        //System.out.println(str.length());
        Optional<String> checkNull = Optional.ofNullable(str);
//        System.out.println(checkNull.orElse("oops"));
      //  System.out.println(checkNull.orElseThrow(RuntimeException::new));

        Optional<Integer> myInteger = Optional.empty();
        System.out.println(myInteger.orElse(0));
        System.out.println(myInteger.orElseThrow(ArithmeticException::new));


    }
}
