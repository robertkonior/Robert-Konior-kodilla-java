package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskFactoryTestSuite {

    TaskFactory taskFactory;

    @Before
    public void before(){
        taskFactory = new TaskFactory();
    }

    @Test
    public void testFactoryShopping(){
        //Given - @before
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Bonus market",shoppingTask.getTaskName());
    }

    @Test
    public void testExecutingShoppingTask(){
        //Given -@before
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving(){
        //Given -@before
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("ride",drivingTask.getTaskName());
    }

    @Test
    public void testExecutingDrivingTask(){
        //Given -@before
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask(){
        //Given -@before
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("paint",paintingTask.getTaskName());
    }

    @Test
    public void testExecutingPaintingTask(){
        //Given -@before
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //Then
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }
}
