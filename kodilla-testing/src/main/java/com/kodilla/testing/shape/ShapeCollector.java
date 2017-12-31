package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeCollector {
    private ArrayList<Shape> shapeArrayList;

    public ShapeCollector() {
        this.shapeArrayList = new ArrayList<Shape>();
    }

    public ArrayList<Shape> getShapeArrayList() {
        return shapeArrayList;
    }

    public void addFigure(Shape shape) {
        this.getShapeArrayList().add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (this.getShapeArrayList().contains(shape)) {
            this.getShapeArrayList().remove(shape);
            result = true;
        }
        return result;
    }

    ;

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < getShapeArrayList().size()) {
            shape = getShapeArrayList().get(n);
        }
        return shape;
    }

    ;

    public void showFigures() {
        Iterator<Shape> iteratorArrayList = getShapeArrayList().iterator();
        while (iteratorArrayList.hasNext()) {
            Shape currentShape = iteratorArrayList.next();
            System.out.print("Name: " + currentShape.getShapeName() + ", field: " + currentShape.getField() + "\n");
        }
    }
}
