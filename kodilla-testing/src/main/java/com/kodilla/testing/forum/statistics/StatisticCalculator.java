package com.kodilla.testing.forum.statistics;

public class StatisticCalculator {
    int users;
    int posts;
    int comments;
    double averagePostToUsers;
    double averageComentsToUsers;
    double averageComentsToPosts;

    public double calculateAdvStatistics(Statistics statistics){
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.comentsCount();
        if(users != 0){
            averagePostToUsers = posts / users;
            averageComentsToUsers = comments / users;
        }
        if (posts != 0){
            averageComentsToPosts = comments / posts;
        }

        return 0;
    }
}
