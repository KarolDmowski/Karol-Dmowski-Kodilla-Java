package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    /*@Autowired
    @Qualifier("toDoList")
    TaskList taskList;
*/
    /*@Bean
    public Board getBoard(){
        return new Board();
    }*/

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList addTaskToToDoList(Board board){
        TaskList toDoList = new TaskList();
       // board.setToDoList(toDoList);
        return toDoList;
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    @Conditional(AlwaysTrueCondition.class)
    public TaskList addTaskToDoneList(Board board){
        TaskList doneList = new TaskList();
        //board.setDoneList(doneList);
        return doneList;
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    @Conditional(AlwaysTrueCondition.class)
    public TaskList addTaskToInProgressList(Board board){
        TaskList inProgressList = new TaskList();
        //board.setInProgressList(inProgressList);
        return inProgressList;
    }


}
