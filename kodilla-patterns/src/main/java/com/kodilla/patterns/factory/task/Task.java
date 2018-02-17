package com.kodilla.patterns.factory.task;

public interface Task {
    boolean executeTask();

    String getTaskName();

    boolean isTaskExecuted();
}
