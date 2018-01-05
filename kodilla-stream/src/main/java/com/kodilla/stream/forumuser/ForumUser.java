package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int forumUserID;
    private final String forumUserName;
    private final char forumUserGender;
    private final LocalDate forumUserBirthDate;
    private final int getForumUserPosts;

    public ForumUser(final int forumUserID, final String forumUserName, final char forumUserGender,
                     final LocalDate forumUserBirthDate, final int getForumUserPosts) {
        this.forumUserID = forumUserID;
        this.forumUserName = forumUserName;
        this.forumUserGender = forumUserGender;
        this.forumUserBirthDate = forumUserBirthDate;
        this.getForumUserPosts = getForumUserPosts;
    }

    public int getForumUserID() {
        return forumUserID;
    }

    public String getForumUserName() {
        return forumUserName;
    }

    public char getForumUserGender() {
        return forumUserGender;
    }

    public LocalDate getForumUserBirthDate() {
        return forumUserBirthDate;
    }

    public int getGetForumUserPosts() {
        return getForumUserPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "forumUserID=" + forumUserID +
                ", forumUserName='" + forumUserName + '\'' +
                ", forumUserGender=" + forumUserGender +
                ", forumUserBirthDate=" + forumUserBirthDate +
                ", getForumUserPosts=" + getForumUserPosts +
                '}';
    }
}
