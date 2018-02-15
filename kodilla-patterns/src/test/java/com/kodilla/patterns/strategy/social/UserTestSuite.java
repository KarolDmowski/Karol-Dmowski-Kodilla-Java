package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User millennium = new Millenials("Millenium");
        User y = new YGeneration("Y");
        User z = new ZGeneration("Z");
        //When
        String millenniumSharesOn = millennium.shareMedia();
        System.out.println(millenniumSharesOn);
        String ySharesOn = y.shareMedia();
        System.out.println(ySharesOn);
        String zSharesOn = z.shareMedia();
        System.out.println(zSharesOn);
        //Then
        Assert.assertEquals("Snapchat Oww snap!", millenniumSharesOn);
        Assert.assertEquals("Facebook post", ySharesOn);
        Assert.assertEquals("Twitter tweet", zSharesOn);
    }

    @Test
    public void  testIndividualSharingStrategy(){
        //Given
        User user = new Millenials("M");
        //When
        String millennialsShareOn = user.shareMedia();
        System.out.println(millennialsShareOn);
        user.setShareStrategy(new TwitterPublisher());
        millennialsShareOn = user.shareMedia();
        System.out.println(millennialsShareOn);
        //Then
        Assert.assertEquals("Twitter tweet",millennialsShareOn);
    }
}
