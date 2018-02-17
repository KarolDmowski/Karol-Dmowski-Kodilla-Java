package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.task.Task;
import com.kodilla.patterns.factory.task.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask (TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("Drive kids to school",drivingTask.getTaskName());
        Assert.assertTrue("true", drivingTask.isTaskExecuted());


    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Paint house", paintingTask.getTaskName());
        Assert.assertTrue("True", paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Buy a car", shoppingTask.getTaskName());
        Assert.assertFalse("False", shoppingTask.isTaskExecuted());
    }
}
