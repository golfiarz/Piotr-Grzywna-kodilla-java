package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void logLogger(){
        Logger.getInstance().log("User");
    }


    @Test
    public void testGetLastLog(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Logined: " + lastLog);
        //Then
        Assert.assertEquals("User", lastLog);

    }
}
