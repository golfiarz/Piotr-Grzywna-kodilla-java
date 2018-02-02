package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Circle;

public class ShapeCollectorTestSuits {

    @Test
    public void testProcess(){
        //Given
        Shape circle = new Circle("Circle", 5);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1,shapeCollector.getShapes);

    }
}
