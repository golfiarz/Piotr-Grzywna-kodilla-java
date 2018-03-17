package com.kodilla.goodPatterns.challenges.sellRequest;

import com.kodilla.goodPatterns.challenges.users.Producer;
import com.kodilla.goodPatterns.challenges.users.User;

public class SellDto {
    public User user;
    public Producer producer;
    public boolean isSold;

    public SellDto(User user, Producer producer, boolean isSold) {
        this.user = user;
        this.producer = producer;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isSold() {
        return isSold;
    }
}




