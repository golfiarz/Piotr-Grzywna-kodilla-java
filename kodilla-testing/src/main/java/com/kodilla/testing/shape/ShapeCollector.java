package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape) {
       this.shape.toString() ;
       shapes.add(shape);
    }
}
