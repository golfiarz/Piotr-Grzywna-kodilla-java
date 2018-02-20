package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(12345, "Max", 'M', LocalDate.of(1986,1,1), 0));
        forumUsersList.add(new ForumUser(23456, "Min", 'M', LocalDate.of(2000,1,1), 2));
        forumUsersList.add(new ForumUser(34567, "Del", 'F', LocalDate.of(1900,1,1), 2));
        forumUsersList.add(new ForumUser(45678,"Ka",'F',LocalDate.of(1991,1,1),3));
        forumUsersList.add(new ForumUser(56789,"Ro",'M',LocalDate.of(1992,1,1),3));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUsersList);
    }

}
