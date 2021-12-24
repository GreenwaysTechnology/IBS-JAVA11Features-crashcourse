package com.ibs.features.java9.methods;

public interface Greeter {
    String doStuff();

    //all methods by default is public
    default String sayGreet() {
        return sayHello();
    }
    static String sayHi(){
        return saySomething();
    }

    private static String saySomething() {
        return "Something";
    }

    private String sayHello() {
        return "Hello,I am priviate";
    }
}
