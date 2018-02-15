package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TaskQueueTestSuite {

    @Test
    public void testCheckingTask() {
        //Given
        Task firstTask = new Task("Interface", "Write interface");
        Task secondTask = new Task("Refactor", "Refactor this class");
        Task thirdTask = new Task("Find", "Find errors");

        Mentor john = new Mentor("John");
        Mentor tom = new Mentor("Tom");

        TaskQueue gonzo = new TaskQueue("Gonzo");
        TaskQueue bart = new TaskQueue("Bart");
        //When
        gonzo.registerObserver(john);
        gonzo.registerObserver(tom);
        gonzo.addTask(firstTask);
        gonzo.addTask(secondTask);
        gonzo.addTask(thirdTask);
        gonzo.checkTask();
        System.out.println();
        bart.registerObserver(john);
        bart.addTask(firstTask);
        bart.addTask(secondTask);
        bart.checkTask();
        bart.checkTask();
        //Then
        Assert.assertEquals(2, gonzo.getTaskToCheck().size());
        Assert.assertEquals(0,bart.getTaskToCheck().size());
    }
}
