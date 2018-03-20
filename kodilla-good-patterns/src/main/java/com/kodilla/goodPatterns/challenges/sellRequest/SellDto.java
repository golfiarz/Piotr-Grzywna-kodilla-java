package com.kodilla.goodPatterns.challenges.sellRequest;


import com.kodilla.goodPatterns.challenges.users.User;

public class SellDto {
    public User user;
    /**
    public Producer producer;
     */
    public boolean isSold;

    public SellDto(User user, boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

}




