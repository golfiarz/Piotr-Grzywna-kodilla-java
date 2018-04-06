package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPING = "SHOPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPING:
                return new ShoppingTask("Shoping", "tomato", 2.0);
            case PAINTING:
                return new PaintingTask("Painting", "Black", "Picture");
            case  DRIVING:
                return new DrivingTask("Driving", "far away", "car");
                default:
                    return null;
        }
    }
}

