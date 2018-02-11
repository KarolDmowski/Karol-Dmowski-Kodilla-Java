package com.kodilla.spring.Forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username;

    public ForumUser() {
        this.username = "Jhon Smith";
    }

    public String getUsername() {
        return username;
    }
}
