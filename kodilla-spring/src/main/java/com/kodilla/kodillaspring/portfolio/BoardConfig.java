package com.kodilla.kodillaspring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.*;

@Configuration
public class BoardConfig {

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList getToDoList(){ return new TaskList(); }

    @Bean(name = "progress")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList getDoneList(){
        return new TaskList();
    }


    @Autowired
    @Qualifier(value = "toDo")
    TaskList todoList;

    @Autowired
    @Qualifier(value = "progress")
    TaskList inProgress;

    @Autowired
    @Qualifier(value = "done")
    TaskList doneList;


    @Bean
    public Board getBoard(){
        return new Board(todoList, inProgress, doneList);
    }
}
