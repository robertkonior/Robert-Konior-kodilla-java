package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {
    OddNumbersExterminator elementList;

    @Before
    public void before(){
        elementList = new OddNumbersExterminator();
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        System.out.println("Testing empty list");
        List<Integer> testList = new ArrayList<>();
        List<Integer> result = elementList.exterminate(testList);
        int resultSize = result.size();
        Assert.assertEquals(0, resultSize);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        Random generator = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        for(int n = 0; n < 10 ;n++) {
            randomNumbers.add(generator.nextInt(10));
        }
        List<Integer> result = elementList.exterminate(randomNumbers);
        System.out.println("Testing list with " + result.size() + " elements");

        for (Integer n:result) {
            Assert.assertTrue(n % 2 == 0) ;

            }
        }

    }

