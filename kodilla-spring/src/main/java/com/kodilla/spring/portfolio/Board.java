package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class Board {
    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;
    @Autowired
    @Qualifier("inProgressList")
    private TaskList inProgressList;
    @Autowired
    @Qualifier("doneList")
    private TaskList doneList;

    /*@Autowired
    @Qualifier("toDoList")
    public void setToDoList(TaskList toDoList) {
        this.toDoList = toDoList;
    }
    @Autowired
    @Qualifier("inProgressList")
    public void setInProgressList(TaskList inProgressList) {
        this.inProgressList = inProgressList;
    }

    @Autowired
    @Qualifier("doneList")
    public void setDoneList(TaskList doneList) {
        this.doneList = doneList;
    }*/

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
