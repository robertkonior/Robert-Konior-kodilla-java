package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final double quantity;
    private boolean done = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        done = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return done;
    }
}
