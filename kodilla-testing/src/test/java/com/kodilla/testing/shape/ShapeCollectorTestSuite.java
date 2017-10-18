package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
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
    public void testAddFigure(){
        Shape circle0 = new Circle();
        testFigure.addFigure(circle0);
        Assert.assertEquals(circle0.getClass().getName() , testFigure.showFigures());
    }

    @Test
    public void testRemoveNotExistingFigure(){
        Shape circle0 = new Circle();
        boolean result = testFigure.removeFigure(circle0);
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure(){
        Shape circle0 = new Circle();
        testFigure.addFigure(circle0);
        boolean result = testFigure.removeFigure(circle0);
        Assert.assertTrue(result);
    }
}
