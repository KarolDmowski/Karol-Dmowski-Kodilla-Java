package com.kodilla.testing.Statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.ForumStat;
import org.junit.*;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class ForumStatTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Lets start all tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests ended");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Test #" + testCounter);
    }

    @Test
    public void testCalculateForumWithNonePostsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        int numberOfUsers =1;
        for(int i = 0; i < numberOfUsers; i++){
            userNames.add("User" + 1 + i);
        }
        int post = 0;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
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
            userNames.add("User" + 1 + i);
        }
        int post = 1000;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
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
            userNames.add("User" + 1 + i);
        }
        int post = 1;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
        //When
        int quantityOfComments = forumStat.calculateAdvStatistics(statisticsMock).getCommentCount();
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
            userNames.add("User" + 1 + i);
        }
        int post = 1;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
        //When
        int quantityOfPosts = forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        //Then
        Assert.assertEquals(1,quantityOfPosts);
    }

    @Test
    public void testCalculateForumWithMoreCommentsThenPostsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        int numberOfUsers =1;
        for(int i = 0; i < numberOfUsers; i++){
            userNames.add("User" + 1 + i);
        }
        int post = 1;
        int comment =2;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
        //When
        int quantityOfPosts = forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        //Then
        Assert.assertEquals(1,quantityOfPosts);
    }

    @Test
    public void testCalculateForumWithNoneUsersWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        int numberOfUsers =0;
        for(int i = 0; i < numberOfUsers; i++){
            userNames.add("User" + 1 + i);
        }
        int post = 0;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
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
            userNames.add("User" + 1 + i);
        }
        int post = 0;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
        //When
        int quantityOfUsers = forumStat.calculateAdvStatistics(statisticsMock).getUserCount();
        //Then
        Assert.assertEquals(1000,quantityOfUsers);
    }
}
