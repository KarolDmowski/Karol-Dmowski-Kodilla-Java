package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.tasklistdao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Task lists creation";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("ToDo", DESCRIPTION);
        //When
        taskListDao.save(taskList);
        //Then
        String listName = taskList.getListName();
        Assert.assertEquals("ToDo", listName);

        //Cleanup
        int id = taskList.getId();
        taskListDao.delete(id);
    }
}
