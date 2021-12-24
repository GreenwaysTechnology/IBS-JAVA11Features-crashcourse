package com.ibs.features.java9.methods;

public class PrivateMethodsMain {
    public static void main(String[] args) {
        Greeter greeter = ()-> "Do Stuff";
        System.out.println(greeter.sayGreet());
        System.out.println(greeter.doStuff());
        System.out.println(Greeter.sayHi());
    }
}
