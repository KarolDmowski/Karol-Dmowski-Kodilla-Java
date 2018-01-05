package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1,"n1", 'M', LocalDate.of(1999,2,1), 4));
        usersList.add(new ForumUser(2,"n2", 'M', LocalDate.of(1990,2,1), 0));
        usersList.add(new ForumUser(3,"n3", 'F', LocalDate.of(2009,2,1), 1));
        usersList.add(new ForumUser(4,"n4", 'M', LocalDate.of(1909,2,1), 4));
        usersList.add(new ForumUser(5,"n5", 'M', LocalDate.of(1999,2,1), 30));
        usersList.add(new ForumUser(6,"n6", 'F', LocalDate.of(1997,2,1), 17));
        usersList.add(new ForumUser(7,"n7", 'F', LocalDate.of(2003,2,1), 40));
        usersList.add(new ForumUser(8,"n8", 'F', LocalDate.of(1999,2,1), 0));
        usersList.add(new ForumUser(9,"n9", 'M', LocalDate.of(1959,2,1), 4));
        usersList.add(new ForumUser(10,"n10", 'M', LocalDate.of(1998,2,1), 0));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(usersList);
    }

}
