package com.kodilla.testing.statistics.mock;

import com.kodilla.testing.forum.statistics.StatisticCalculator;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @Test
    public void testPost0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNumber = new ArrayList<String>();
        usersNumber.add("Jan");

        when(statisticsMock.usersNames()).thenReturn(usersNumber);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.comentsCount()).thenReturn(4);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticCalculator.averagePostToUsers,0);
        Assert.assertEquals(4, statisticCalculator.averageComentsToUsers,0);
        Assert.assertEquals(0,statisticCalculator.averageComentsToPosts,0);
    }

    @Test
    public void testPosts1000AndComment0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNumber = new ArrayList<String>();
        usersNumber.add("Jan");

        when(statisticsMock.usersNames()).thenReturn(usersNumber);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.comentsCount()).thenReturn(0);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, statisticCalculator.averagePostToUsers,0);
        Assert.assertEquals(0, statisticCalculator.averageComentsToUsers,0);
        Assert.assertEquals(0,statisticCalculator.averageComentsToPosts,0);
    }

    @Test
    public void testPostsMoreThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNumber = new ArrayList<String>();
        usersNumber.add("Jan");

        when(statisticsMock.usersNames()).thenReturn(usersNumber);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.comentsCount()).thenReturn(50);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, statisticCalculator.averagePostToUsers,0);
        Assert.assertEquals(50, statisticCalculator.averageComentsToUsers,0);
        Assert.assertEquals(0.5,statisticCalculator.averageComentsToPosts,0);
    }

    @Test
    public void testPostsLessThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNumber = new ArrayList<String>();
        usersNumber.add("Jan");

        when(statisticsMock.usersNames()).thenReturn(usersNumber);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.comentsCount()).thenReturn(100);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(50, statisticCalculator.averagePostToUsers,0);
        Assert.assertEquals(100, statisticCalculator.averageComentsToUsers,0);
        Assert.assertEquals(2,statisticCalculator.averageComentsToPosts,0);
    }

    @Test
    public void testUsers0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNumber = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(usersNumber);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.comentsCount()).thenReturn(75);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticCalculator.averagePostToUsers,0);
        Assert.assertEquals(0, statisticCalculator.averageComentsToUsers,0);
        Assert.assertEquals(1.5,statisticCalculator.averageComentsToPosts,0);
    }

    @Test
    public void testUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNumber = new ArrayList<String>();
        for(int i=0; i<100; i++) {
            usersNumber.add("Jan");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNumber);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.comentsCount()).thenReturn(20);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.5, statisticCalculator.averagePostToUsers,0);
        Assert.assertEquals(0.2, statisticCalculator.averageComentsToUsers,0);
        Assert.assertEquals(0.4,statisticCalculator.averageComentsToPosts,0);
    }
}
