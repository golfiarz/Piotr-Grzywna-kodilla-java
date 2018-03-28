package com.kodilla.kodillaspring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double result = calculator.add(6,3);
        //Then
        Assert.assertEquals(9, result, 0 );
    }

    @Test
    public void testSub() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double result = calculator.sub(6,3);
        //Then
        Assert.assertEquals(3,result,0);
    }

    @Test
    public void testMul() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double result = calculator.mul(6,3);
        //Then
        Assert.assertEquals(18,result,0);
    }

    @Test
    public void testDiv() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double result = calculator.div(6,3);
        //Then
        Assert.assertEquals(2,result,0);
    }


}
