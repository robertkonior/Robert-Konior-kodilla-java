package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "prepare soup";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME, "steps how doing soup");
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1,readTaskLists.size());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.delete(String.valueOf(id));
    }
}
