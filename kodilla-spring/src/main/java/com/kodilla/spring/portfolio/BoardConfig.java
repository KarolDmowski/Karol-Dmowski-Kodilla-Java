package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.AlwaysTrueCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList taskList;

    @Bean
    public Board getBoard(){
        return new Board();
    }

    @Bean(name = "toDoList")
    public TaskList addTaskToToDoList(Board board){
        TaskList toDoList = new TaskList();
        board.setToDoList(toDoList);
        return toDoList;
    }

    @Bean(name = "doneList")
    @Conditional(AlwaysTrueCondition.class)
    public TaskList addTaskToDoneList(Board board){
        TaskList doneList = new TaskList();
        board.setDoneList(doneList);
        return doneList;
    }

    @Bean(name = "inProgressList")
    @Conditional(AlwaysTrueCondition.class)
    public TaskList addTaskToInProgressList(Board board){
        TaskList inProgressList = new TaskList();
        board.setInProgressList(inProgressList);
        return inProgressList;
    }


}
