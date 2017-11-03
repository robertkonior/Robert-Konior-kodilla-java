package com.kodilla.exception.challenge;

public class FirstChallenge {

        public double divide(double a, double b) throws ArithmeticException {

            if(b == 0){
                throw new ArithmeticException();

            }
            return a / b;

        }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;
        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("This is exception :  " + e);
        } finally {
            System.out.println("Result "  + result);
        }
    }
}