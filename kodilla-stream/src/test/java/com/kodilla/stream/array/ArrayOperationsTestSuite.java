package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


import java.util.Random;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {


    private int[] getTestArray(int size, int range) {
        int[] numbers = new int[size];
        Random generator = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(range);
        }
        return numbers;
    }

    private double getExpectedAverage(int[] numbers) {
        double n = 0;
        for (int i = 0; i < numbers.length; i++) {
            n += numbers[i];
        }
        return n / numbers.length;
    }

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers =getTestArray(20,10);

        //When
        double expectedAverage = getExpectedAverage(numbers);
        double testedAverage = getAverage(numbers);


        //Then
        Assert.assertEquals(expectedAverage, testedAverage, 0);
    }

}
