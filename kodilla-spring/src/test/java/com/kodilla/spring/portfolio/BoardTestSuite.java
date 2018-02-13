package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        String doneListTask = "Done task";
        String toDoListTask = "To do Task";
        String inProgressTask = "In progress Task";
        //When
        board.getToDoList().getTasks().add(toDoListTask);
        board.getInProgressList().getTasks().add(inProgressTask);
        board.getDoneList().getTasks().add(doneListTask);
        System.out.println(board.getToDoList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
        //Then
        Assert.assertEquals("To do Task", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("In progress Task", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Done task", board.getDoneList().getTasks().get(0));
    }
}
