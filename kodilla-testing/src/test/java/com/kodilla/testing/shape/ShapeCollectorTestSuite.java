package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    ShapeCollector testFigure;


    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        testFigure = new ShapeCollector();
    }

    @Test
    public void testAddFigureToList(){
        // given
        Shape circle0 = new Circle(2);
        int before = testFigure.getFigureListSize();
        // when
        testFigure.addFigure(circle0);
        // then
        int after = testFigure.getFigureListSize();
        Assert.assertTrue(after > before);
    }

    @Test
    public void testGetFigure(){
        // given
        Shape circle0 = new Circle(2);
        // when
        testFigure.addFigure(circle0);
        // then
        Assert.assertEquals(circle0 , testFigure.getFigure(0));
    }

    @Test
    public void testGetFigureByBadIndex(){
        //given
        Shape circle0 = new Circle(2);
        // when
        testFigure.addFigure(circle0);
        //then
        Assert.assertNull(testFigure.getFigure(-1));
    }

    @Test
    public void testRemoveNotExistingFigure(){
        // given
        Shape circle0 = new Circle(2);
        // when
        boolean result = testFigure.removeFigure(circle0);
        // then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure(){
        // given
        Shape circle0 = new Circle(2);
        testFigure.addFigure(circle0);
        int before = testFigure.getFigureListSize();
        //when
        boolean result = testFigure.removeFigure(circle0);
        // then
        int after = testFigure.getFigureListSize();
        Assert.assertTrue(result && before > after);
    }


}
