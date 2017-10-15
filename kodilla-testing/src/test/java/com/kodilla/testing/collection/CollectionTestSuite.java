package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before(){
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
        OddNumbersExterminator emptyList = new OddNumbersExterminator();
        List<Integer> testList = new ArrayList<>();
        List<Integer> result = emptyList.exterminate((ArrayList<Integer>) testList);
        int resultSize = result.size();
        Assert.assertEquals(0, resultSize);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator evenList = new OddNumbersExterminator();
        Random generator = new Random();
        List<Integer> randomNumbers = new ArrayList<>();

        for(int n = 0; n < 10 ;n++) {
            randomNumbers.add(generator.nextInt(10));
        }

        List<Integer> result = evenList.exterminate((ArrayList<Integer>) randomNumbers);
        System.out.println("Testing list with " + result.size() + " elements");

        for (Integer n:result) {
            Assert.assertTrue(n % 2 == 0) ;

            }
        }

    }

