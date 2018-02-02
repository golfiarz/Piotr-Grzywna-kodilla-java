package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
       Shape shape = new Shape() {
           @Override
           public String getShapeName() {
               return null;
           }

           @Override
           public int getField() {
               return 0;
           }
       }
       shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
    }

    public ArrayList<Shape> getFigure(int n){
        ArrayList<Shape> shapes = null;
        if (n >= 0 && n < shapes.size()) {
            shape = shapes.get(n);
        }
        return shape;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
