package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.*;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddpost(){
        //Given == Arrange
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        //When == Add
        forumUser.addPost("mrsmith","Hello every one,this is my first contribution here!");
        //Then == Assert
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }
    @Test
    public void testAddComment() {
        //Given == Arrange
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");

        //When == Add
        forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");

        //Then == Assert
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }
    @Test
    public void testGetPost() {
        //Given == Arrange
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When == Add
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //Then == Assert
        Assert.assertEquals(thePost, retrievedPost);
    }
    @Test
    public void testGetComment() {
        //Given == Arrange
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());
        //When == Add
        ForumComment retrievedComment = forumUser.getComment(0);
        //Then == Assert
        Assert.assertEquals(theComment, retrievedComment);
    }
    @Test
    public void testRemovePostNotExisting() {
        //Given == Arrange
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        //When == Add
        boolean result = forumUser.removePost(thePost);
        //Then == Assert
        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveCommentNotExisting() {
        //Given == Arrange
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
        //When == Add
        boolean result = forumUser.removeComment(theComment);
        //Then == Assert
        Assert.assertFalse(result);
    }
    @Test
    public void testRemovePost() {
        //Given == Arrange
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When == Add
        boolean result = forumUser.removePost(thePost);

        //Then == Assert
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }
    @Test
    public void testRemoveComment() {
        //Given == Arrenge
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());
        //When == Add
        boolean result = forumUser.removeComment(theComment);
        //Then ==Assert
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }

}
