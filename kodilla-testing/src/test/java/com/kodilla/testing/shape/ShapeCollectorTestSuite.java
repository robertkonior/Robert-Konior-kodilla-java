package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Shape;
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
        // when
        int before = testFigure.getFigureListSize();
        testFigure.addFigure(circle0);
        int after = testFigure.getFigureListSize();
        // then
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
        // when
        testFigure.addFigure(circle0);
        int before = testFigure.getFigureListSize();
        boolean result = testFigure.removeFigure(circle0);
        int after = testFigure.getFigureListSize();
        // then
        Assert.assertTrue(result && before > after);
    }


}
