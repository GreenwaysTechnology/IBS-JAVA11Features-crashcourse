package com.ibs.features.java8.lambda.higherorder;

public class Hello {
    //Higher order function
    public void sayHello(Greeter greeter){
        greeter.sayHello("Hello");
    }
}
