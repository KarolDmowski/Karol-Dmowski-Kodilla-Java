package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suit: end");
    }

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testCaseUsername() {
        //Given == Arrange
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When == Act
        String result = simpleUser.getUsername();
        System.out.println("Testing " + result);
        //Then == Assert
        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealName() {
        //Given == Arrange
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When == Act
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then == Assert
        Assert.assertEquals("John Smith", result);
    }
}
