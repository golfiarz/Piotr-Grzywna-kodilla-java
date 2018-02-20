package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idNumber;
    private final String nick;
    private final char sex;
    private final LocalDate born;
    private final int posts;

    public ForumUser(int idNumber, String nick, char sex, LocalDate born, int posts) {
        this.idNumber = idNumber;
        this.nick = nick;
        this.sex = sex;
        this.born = born;
        this.posts = posts;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getNick() {
        return nick;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBorn() {
        return born;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", nick='" + nick + '\'' +
                ", sex=" + sex +
                ", born=" + born +
                ", posts=" + posts +
                '}';
    }
}
