package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name;
    private int value;

    public Triangle(String name, int value){
        this.name = name;
        this.value = value;
    }

    public String getShapeName() {
        return name;
    }

    public int getField() {
        return value;
    }

    public String toString(){
        return name + value;
    }
}
