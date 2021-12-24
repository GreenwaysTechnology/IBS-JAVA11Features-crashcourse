package com.ibs.features.java8.lambda;

public class MainLambda {
    public static void main(String[] args) {
        Greeter greeter = null;
        greeter = new GreeterImpl();
        System.out.println(greeter.sayGreet());

        //via inner classes we can reduce extra classes : annonmous inner class
        greeter = new Greeter() {
            @Override
            public String sayGreet() {
                return "Hai";
            }
        };
        System.out.println(greeter.sayGreet());
        //functional concept : foucus only logic not infra code
        greeter =  () -> {
              return "Hai";
        };
        System.out.println(greeter.sayGreet());


    }
}
