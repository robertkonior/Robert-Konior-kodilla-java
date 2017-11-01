package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;
import java.util.Random;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public  void testGetAverage(){
        //Given
        int[] numbers = new int [20] ;

        Random generator = new Random();

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = generator.nextInt(50);
        }
        double n = 0 ;
        for (int i=0; i < numbers.length; i++) {
            n += numbers[i];
            System.out.println("Array element no[" + i + "] = " + numbers[i]);

        }

        //When
        OptionalDouble testedAverage = getAverage(numbers);
        double expectedAverage = n / numbers.length;

        //Then
        Assert.assertEquals(expectedAverage,testedAverage);




    }
}
