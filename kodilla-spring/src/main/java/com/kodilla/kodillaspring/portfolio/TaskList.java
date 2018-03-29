package com.kodilla.kodillaspring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String task){
        tasks.add(task);
    }


}
