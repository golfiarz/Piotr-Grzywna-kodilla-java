package com.kodilla.kodillaspring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ForumUserTestSuite {
    @Test
    public void testGetUsernme(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String name = forumUser.getUsername();
        //Then
        Assert.assertEquals("John Smith", name);
    }
}
