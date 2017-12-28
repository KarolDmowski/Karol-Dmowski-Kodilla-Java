package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public abstract class ShapeCollectorTestSuite {
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
        //Given == Arrange
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(1, 2);
        //Then == Assert
        shapeCollector.addFigure(triangle);
        //When == Add
        assertEquals(1, shapeCollector.getShapeArrayList().size());
    }

    //dla przecwiczenia
    @Test
    public void testRemoveFigureNotExisting() {
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
        //Given == Arrange
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);
        //When == Add
        boolean result = shapeCollector.removeFigure(circle);
        //Then == Assert
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getShapeArrayList().size());
    }
    @Test
    public void  testGetFigure() {
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
        //Given == Arrange
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(2);
        shapeCollector.addFigure(square);
        Triangle triangle = new Triangle(2,4);
        shapeCollector.addFigure(triangle);
        Circle circle = new Circle(1);
        shapeCollector.addFigure(circle);
        ArrayList<Shape> figureList = shapeCollector.getShapeArrayList();
        //When == Add
        ArrayList<Shape> shownFigureList = shapeCollector.showFigures();
        //Then == Assert
        Assert.assertEquals(figureList,shownFigureList);
    }
}
