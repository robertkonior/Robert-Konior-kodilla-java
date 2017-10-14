package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator operation = new Calculator();
        int result1 = operation.add(3,2);
        int result2 = operation.substract(7,2);

        if (result1 == 5){
            System.out.println("test1 OK");
        } else {
            System.out.println("Error!");
        }

        if (result2 == 5){
            System.out.println("test2 OK");
        } else {
            System.out.println("Error!");
        }

    }
}