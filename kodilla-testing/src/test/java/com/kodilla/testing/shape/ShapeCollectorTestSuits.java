package com.kodilla.testing.shape;

import org.junit.Test;

public class ShapeCollectorTestSuits {

    @Test
    public void testProcess(){
        Shape circle = new Circle("Circle", 5);

        ShapeCollector shapeCollector = new ShapeCollector(circle);

        shapeCollector.addFigure();


    }
}
