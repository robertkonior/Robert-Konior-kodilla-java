package com.kodilla.testing.calculator;

public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args){
        Calculator operation = new Calculator();
        int result = operation.add(4,5);
        int result1 =operation.substract(3,7);
        System.out.println(result);
        System.out.println(result1);
    }
}