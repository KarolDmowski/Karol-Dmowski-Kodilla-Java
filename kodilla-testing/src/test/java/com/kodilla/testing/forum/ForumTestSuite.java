package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {
    @Test
    public void  testCaseUsername(){
        //Given == Arrange
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        //When == Act
        String result = simpleUser.getUsername();
        //Then == Assert
        Assert.assertEquals("theForumUser",result);
    }
}
