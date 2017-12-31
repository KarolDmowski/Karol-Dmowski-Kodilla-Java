package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

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
    }

    @Test
    public void testAddFigure() {
        System.out.println("testAddFigure");
        //Given == Arrange
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(1, 2);
        //Then == Assert
        shapeCollector.addFigure(triangle);
        //When == Add
        Assert.assertEquals(1, shapeCollector.getShapeArrayList().size());
    }

    //dla przecwiczenia
    @Test
    public void testRemoveFigureNotExisting() {
        System.out.println("testRemoveFigureNotExisting");
        //Given == Arrange
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        //When == Add
        boolean result = shapeCollector.removeFigure(circle);
        //Then == Assert
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        System.out.println("testRemoveFigure");
        //Given == Arrange
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);
        //When == Add
        boolean result = shapeCollector.removeFigure(circle);
        //Then == Assert
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapeArrayList().size());
    }

    @Test
    public void testGetFigure() {
        System.out.println("testGetFigure");
        //Given == Arrange
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(2);
        shapeCollector.addFigure(square);
        //When == Add
        Shape retrieveSquare = shapeCollector.getFigure(0);
        //Then == Assert
        Assert.assertEquals(square, retrieveSquare);
    }

    @Test
    public void testShowFigures() {
        System.out.println("testShowFigures");
        //Given == Arrange
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(2);
        shapeCollector.addFigure(square);
        //When == Add
        shapeCollector.showFigures();
        Shape retriveShape = shapeCollector.getFigure(0);

        //Then == Assert
        Assert.assertEquals(square, retriveShape);
    }
}
