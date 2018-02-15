package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private TaskQueue taskQueue;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println("Student " + taskQueue.getStudentName() + " have to " + taskQueue.getTaskToCheck().size() + " tasks to check");
    }

}
