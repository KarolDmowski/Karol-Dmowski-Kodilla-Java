package com.kodilla.testing.forum.statistics;

public class ForumStat  {
    private Statistics statistics;
    private int userCount;
    private int postCount;
    private int commentCount;
    private double postToUserAvg;
    private double commentToUserAvg;
    private double commentToPostAvg;

    public ForumStat(Statistics statistics) {
        this.statistics = statistics;
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

    public ForumStat calculateAdvStatistics(Statistics statistics){
        if (statistics.usersNames().size() == 0){
            System.out.println("Data Error with none users of Forum and existing posts or comments");
            return this;
        }
        if (statistics.postsCount() == 0 && statistics.commentsCount() > 0){
            System.out.println("Data Error with none posts and existing comments");
            return this;
        }
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        postToUserAvg = postCount/userCount;
        commentToUserAvg = commentCount/userCount;
        if(postCount != 0){
            commentToPostAvg = commentCount/postCount;
        }
        return this;
    }

    public void showStatistics(){
    System.out.println("Number of users: " + statistics.usersNames().size()
            + "; Number of posts: " + statistics.postsCount()
            + "; Number of comments: " + statistics.commentsCount()
            + "\nRatio post to user: " + getPostToUserAvg()
            + "; Ratio comment to user: " + getCommentToUserAvg()
            + "; Ratio comment to post: " + getCommentToPostAvg());
    }
}
