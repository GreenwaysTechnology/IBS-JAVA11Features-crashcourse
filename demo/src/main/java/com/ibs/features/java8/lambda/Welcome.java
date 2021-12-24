package com.ibs.features.java8.lambda;

@FunctionalInterface
public interface Welcome {
    void sayHai();
//    void sayHello();
    default void  doSomething0( ){
        System.out.println("do something -0 ");
    }
    //static methods
    static void doProcess(){
        System.out.println("Do Process");
    }
}
