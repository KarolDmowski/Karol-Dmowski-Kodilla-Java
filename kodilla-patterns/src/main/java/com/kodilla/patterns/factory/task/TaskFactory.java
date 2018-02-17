package com.kodilla.patterns.factory.task;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "ShoppingTask";
    public static final String PAINTINGTASK = "PaintingList";
    public static final String DRIVINGTASK = "DrivingList";

    public final Task makeTask(final String taskClass){
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Buy a car", "Tesla", 1);
            case PAINTINGTASK :
                return new PaintingTask("Paint house", "white", "Walls");
            case DRIVINGTASK:
                return new DrivingTask("Drive kids to school", "Elementary", "Tesla" );
            default:
                return null;
        }
    }
}
