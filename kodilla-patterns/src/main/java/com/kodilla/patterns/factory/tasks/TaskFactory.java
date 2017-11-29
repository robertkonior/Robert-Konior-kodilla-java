package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "Shopping Task";
    public static final String DRIVINGTASK = "Driving Task";
    public static final String PAINTINGTASK = "Painting Task";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Bonus market", "fish", 2.0);
            case DRIVINGTASK:
                return new DrivingTask("ride", "river", "teleport");
            case PAINTINGTASK:
                return new PaintingTask("paint", "white", "wall");
            default:
                return null;
        }
    }
}
