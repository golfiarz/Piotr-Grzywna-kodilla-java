package com.kodilla.kodillaspring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier
    TaskList taskList;

    @Bean
    public Board getBoard(){
        return new Board(taskList, taskList, taskList);
    }
    @Bean
    @Scope
    public TaskList getToDoList(){
        return new TaskList();
    }

    @Bean
    @Scope
    public TaskList getInProgressList(){
        return new TaskList();
    }

    @Bean
    @Scope
    public TaskList getDoneList(){
        return new TaskList();
    }
}
