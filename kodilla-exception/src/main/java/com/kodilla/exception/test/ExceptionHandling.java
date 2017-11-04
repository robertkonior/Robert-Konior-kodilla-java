package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(0.8,3.0));
        } catch (Exception e){
            System.out.println(" for this values we have  exception :) ");
        } finally {
            System.out.println("Process was handled");
        }

    }
}
