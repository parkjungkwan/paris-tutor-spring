package com.joeunseo.hotel.lambda;

public class MyLambda {

    @FunctionalInterface interface MyFunction{
        int execute(String arg);
    }
    @FunctionalInterface interface MyConsumer{
        void execute(String arg);
    }
    @FunctionalInterface interface MySupplier{
        int execute();
    }
    @FunctionalInterface interface MyPredicate{
        boolean execute(String arg);
    }
    @FunctionalInterface interface MyInterface{
        String myMothod();
    }
    @FunctionalInterface interface MyUnaryOp{
        int operator(Integer arg);
    }
    @FunctionalInterface interface MathOperation{
        int execute(int a, int b, int c);
    }
    
}
