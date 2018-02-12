package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticCalculator {
    public int users;
    public int posts;
    public int comments;
    public double averagePostToUsers;
    public double averageComentsToUsers;
    public double averageComentsToPosts;

    public void calculateAdvStatistics(Statistics statistics){
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.comentsCount();
        if(users != 0){
            averagePostToUsers = posts / (double)users;
            averageComentsToUsers = comments / (double)users;
        }
        if (posts != 0){
            averageComentsToPosts = comments / (double)posts;
        }
    }
}
