package com.kodilla.testing.Statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.ForumStat;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class ForumStatTestSuite {
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Lets start all tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests ended");
    }

    @Test
    public void testCalculateForumWithNonePostsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        int numberOfUsers =1;
        for(int i = 0; i < numberOfUsers; i++){
            userNames.add("User" + i);
        }
        int post = 0;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        //When
        int quantityOfPosts = forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        //Then
        Assert.assertEquals(0,quantityOfPosts);
    }

    @Test
    public void testCalculateForumWith1000PostsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        int numberOfUsers =1;
        for(int i = 0; i < numberOfUsers; i++){
            userNames.add("User" + i);
        }
        int post = 1000;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        //When
        int quantityOfPosts = forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        //Then
        Assert.assertEquals(1000,quantityOfPosts);
    }
    @Test
    public void testCalculateForumWithNoneCommentsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        int numberOfUsers =1;
        for(int i = 0; i < numberOfUsers; i++){
            userNames.add("User" + i);
        }
        int post = 1;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        //When
        int quantityOfComments = forumStat.calculateAdvStatistics(statisticsMock).getComentCount();
        //Then
        Assert.assertEquals(0,quantityOfComments);
    }

    @Test
    public void testCalculateForumWithLessCommentsThenPostsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        int numberOfUsers =1;
        for(int i = 0; i < numberOfUsers; i++){
            userNames.add("User" + i);
        }
        int post = 2;
        int comment =1;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        //When
        int ratioOfCommentsToPosts = forumStat.calculateAdvStatistics(statisticsMock).getComentCount()
                / forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        //Then
        Assert.assertEquals(2/1,ratioOfCommentsToPosts);
    }

    @Test
    public void testCalculateForumWithMoreCommentsThenPostsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        int numberOfUsers =1;
        for(int i = 0; i < numberOfUsers; i++){
            userNames.add("User" + i);
        }
        int post = 1;
        int comment =2;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        //When
        int ratioOfCommentsToPosts = forumStat.calculateAdvStatistics(statisticsMock).getComentCount()
                / forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        //Then
        Assert.assertEquals(1/2,ratioOfCommentsToPosts);
    }

    @Test
    public void testCalculateForumWithNoneUsersWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        int numberOfUsers =0;
        for(int i = 0; i < numberOfUsers; i++){
            userNames.add("User" + i);
        }
        int post = 0;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        //When
        int quantityOfUsers = forumStat.calculateAdvStatistics(statisticsMock).getUserCount();
        //Then
        Assert.assertEquals(0,quantityOfUsers);
    }

    @Test
    public void testCalculateForumWith100UsersWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        int numberOfUsers =1000;
        for(int i = 0; i < numberOfUsers; i++){
            userNames.add("User" + i);
        }
        int post = 0;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        //When
        int quantityOfUsers = forumStat.calculateAdvStatistics(statisticsMock).getUserCount();
        //Then
        Assert.assertEquals(1000,quantityOfUsers);
    }
}
