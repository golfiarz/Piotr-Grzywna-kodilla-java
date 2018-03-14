package com.kodilla.goodPatterns.challenges;

public class User {
    private String name;
    private String sureName;

    public User(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }
}
