package com.ibs.features.java8.lambda;

public class LambdRules {
    public static void main(String[] args) {
        Welcome welcome = null;
        welcome = () -> {
            System.out.println("Hello");
        };
        welcome.doSomething0();
        welcome.sayHai();
        Welcome.doProcess();
        //basic lamba rules: if function has only one one of body :we can remove { }

        welcome = () -> System.out.println("Hello");
        welcome.sayHai();
    }

}
