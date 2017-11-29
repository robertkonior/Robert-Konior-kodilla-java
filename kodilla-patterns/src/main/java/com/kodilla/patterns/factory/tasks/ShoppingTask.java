package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {

    }

    @Override
    public String getTaskName() {
        return null;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
