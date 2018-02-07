package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
       shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
       return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
