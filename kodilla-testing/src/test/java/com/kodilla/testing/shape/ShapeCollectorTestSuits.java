package com.kodilla.testing.shape;

import org.junit.Test;

public class ShapeCollectorTestSuits {

    @Test
    public void testProcess(){
        Shape circle = new Circle();

        ShapeCollector shapeCollector = new ShapeCollector(circle);

        shapeCollector.addFigure();


    }
}
