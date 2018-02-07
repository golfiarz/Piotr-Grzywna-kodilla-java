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
    public void testAddFigure(){
        //Given
        Shape circle = new Circle("Circle", 5);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapes().size());

    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle("Circle", 5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(0,shapeCollector.getShapes().size());
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape circle = new Circle("Circle", 5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shapeCollector.getShapes().get(0), shapeCollector.getFigure(0));
    }
}
