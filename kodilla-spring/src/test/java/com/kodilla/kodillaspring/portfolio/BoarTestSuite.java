package com.kodilla.kodillaspring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoarTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.addTask("zadanie to do");
        String taskToDo = board.toDoList.getTasks().get(0);

        board.inProgressList.addTask("zadanie in progress");
        String taskInProgress = board.inProgressList.getTasks().get(0);

        board.doneList.addTask("zadanie done");
        String taskDone = board.doneList.getTasks().get(0);
        //Then
        Assert.assertEquals("zadanie to do", taskToDo);
        Assert.assertEquals("zadanie in progress", taskInProgress);
        Assert.assertEquals("zadanie done", taskDone);

    }


}
