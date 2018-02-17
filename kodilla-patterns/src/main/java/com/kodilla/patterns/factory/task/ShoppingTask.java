package com.kodilla.patterns.factory.task;

public class ShoppingTask implements Task {
    private String taskName;
    private boolean isExecuted = false;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean executeTask() {
        isExecuted = true;
        return isExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
