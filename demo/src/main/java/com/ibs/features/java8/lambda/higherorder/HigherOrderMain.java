package com.ibs.features.java8.lambda.higherorder;

public class HigherOrderMain {
    public static void main(String[] args) {
        //old style
        Hello hello = new Hello();
        //passing function as parameter
        hello.sayHello(new Greeter() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello");
            }
        });
        //lambda
        hello.sayHello((String name) -> {
            System.out.println("Hello");
        });
        hello.sayHello((String name) -> System.out.println("Hello"));
        //type inference : if args variable are single then we can remove ()
        hello.sayHello(name -> System.out.println("Hello"));

    }
}
