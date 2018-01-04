package com.kodilla.testing.forum.statistics;

public class ForumStat {
    private int userCount;
    private int postCount;
    private int commentCount;
    private double postToUserAvg;
    private double commentToUserAvg;
    private double commentToPostAvg;

    public ForumStat(Statistics statistics) {
        if ((statistics.usersNames().size() == 0)
                || (statistics.postsCount() == 0 && statistics.commentsCount() > 0)) {
            System.out.println("Forum Data Error. 0 users of Forum, or 0 post and any comments");
        } else {
            userCount = statistics.usersNames().size();
            postCount = statistics.postsCount();
            commentCount = statistics.commentsCount();
            postToUserAvg = postCount / userCount;
            commentToUserAvg = commentCount / userCount;
            if (postCount != 0) {
                commentToPostAvg = commentCount / postCount;
            }
        }
    }
    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getPostToUserAvg() {
        return postToUserAvg;
    }

    public double getCommentToUserAvg() {
        return commentToUserAvg;
    }

    public double getCommentToPostAvg() {
        return commentToPostAvg;
    }

    public void showStatistics() {
        System.out.println("Users# " + getUserCount()
                + "; Posts# " + getPostCount()
                + "; Comments# " + getCommentCount()
                + "\nPost to user# " + getPostToUserAvg()
                + "; Comment to user# " + getCommentToUserAvg()
                + "; Comment to post# " + getCommentToPostAvg());
    }
}
