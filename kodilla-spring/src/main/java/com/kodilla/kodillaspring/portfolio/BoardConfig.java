package com.kodilla.kodillaspring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.*;

@Configuration
public class BoardConfig {
    @Autowired
    Board board;

    @Bean
    public Board getBoard(){
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }
    @Bean
    @Scope("prototype")
    public TaskList getToDoList(){
        return new TaskList(new ArrayList<>());
    }

    @Bean
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean
    @Scope("prototype")
    public TaskList getDoneList(){
        return new TaskList(new ArrayList());
    }
}
