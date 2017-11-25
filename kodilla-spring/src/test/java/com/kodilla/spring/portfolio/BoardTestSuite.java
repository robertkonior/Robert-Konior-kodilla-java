package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getToDoList().addTask("task");
        board.getInProgressList().addTask("task");
        board.getDoneList().addTask("task");
        //When
        int toDoListSize = board.getToDoList().getTasks().size();
        int InProgressListSize = board.getInProgressList().getTasks().size();
        int doneListSize = board.getDoneList().getTasks().size();
        //Then
        Assert.assertEquals(1,toDoListSize);
        Assert.assertEquals(1,InProgressListSize);
        Assert.assertEquals(1,doneListSize);
    }
}
