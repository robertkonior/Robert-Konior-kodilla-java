package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    final String taskName;
    final String color;
    final String whatToPaint;
    private boolean done = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
