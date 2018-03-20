package com.kodilla.goodPatterns.challenges.users;

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                '}';
    }
}
