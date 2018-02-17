package com.kodilla.patterns.strategy.social;

public abstract class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String shareMedia() {
        return socialPublisher.share();
    }

    public void setShareStrategy(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
