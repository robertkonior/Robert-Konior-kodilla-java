package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TaskQueue implements Observable {

    private final List<Observer> observers;
    private final String studentName;
    private final Queue<Task> taskToCheck ;

    public TaskQueue(String studentName) {
        observers = new ArrayList<>();
        taskToCheck = new ArrayDeque<>();
        this.studentName = studentName;
    }

    public  void addTask(Task task) {
        taskToCheck.offer(task);
        notifyObservers();
    }

    public void checkTask() {
        taskToCheck.poll();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }

    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    public String getStudentName() {
        return studentName;
    }

    public Queue<Task> getTaskToCheck() {
        return taskToCheck;
    }
}
