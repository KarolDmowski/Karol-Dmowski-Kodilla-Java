package com.kodilla.spring.intro.Shape;

public class Drawer {
    final private Shape shape;

    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public String doDrawing() {
        return shape.draw();
    }
}
