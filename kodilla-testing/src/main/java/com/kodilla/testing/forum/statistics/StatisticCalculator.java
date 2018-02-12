package com.kodilla.testing.forum.statistics;

public class StatisticCalculator {
    int users;
    int posts;
    int comments;
    double averagePostToUsers;
    double averageComentsToUsers;
    double averageComentsToPosts;

    public double calculateAdvStatistics(){
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.comentsCount();
        if(users != null){
            averagePostToUsers = posts / users;
            averageComentsToUsers = comments / users;
        }
        if (posts != null){
            averageComentsToPosts = comments / posts;
        }

        return 0;
    }
}
