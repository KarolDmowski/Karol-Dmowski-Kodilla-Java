package com.kodilla.testing.forum.statistics;

public class ForumStat  {
    Statistics statistics;
    private int userCount;
    private int postCount;
    private int comentCount;
    private double postToUserAvg;
    private double comentToUserAvg;
    private double komentToPostAvg;

    public ForumStat(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getComentCount() {
        return comentCount;
    }

    public double getPostToUserAvg() {
        return postToUserAvg;
    }

    public double getComentToUserAvg() {
        return comentToUserAvg;
    }

    public double getKomentToPostAvg() {
        return komentToPostAvg;
    }

    public ForumStat calculateAdvStatistics(Statistics statistics){
        return this;
    }

    public void ShowStatistics(){

    }
}
