package org.example.staticFinal;

public class Calculator {
    private static int value;
    private static int value1;

    public static int add(int a, int b){
        return a + b;
    }

    public static int substract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }
}
