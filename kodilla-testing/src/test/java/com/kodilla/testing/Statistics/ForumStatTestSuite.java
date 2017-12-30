package com.kodilla.testing.Statistics;

import com.kodilla.testing.forum.statistics.ForumStat;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatTestSuite {
    private static int testCounter = 0;

    public List<String> generateListOfUsers(int numberOfUsers){
        List<String> userNames = new ArrayList<String>();
        for(int i = 0; i < numberOfUsers; i++){
            userNames.add("User" + 1 + i);
        }
        return userNames;
    }
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
        List<String> userNames = generateListOfUsers(1);
        int post = 0;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
        //When
        int quantityOfUsers = forumStat.calculateAdvStatistics(statisticsMock).getUserCount();
        int quantityOfPosts = forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        int quantityOfComments = forumStat.calculateAdvStatistics(statisticsMock).getCommentCount();
        double ratioPostToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getPostToUserAvg();
        double ratioCommentToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToUserAvg();
        double ratioCommentToPostAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToPostAvg();

        //Then
        Assert.assertEquals(1,quantityOfUsers);
        Assert.assertEquals(0,quantityOfPosts);
        Assert.assertEquals(0,quantityOfComments);
        Assert.assertEquals(0,ratioPostToUserAvg,0);
        Assert.assertEquals(0,ratioCommentToUserAvg,0);
        Assert.assertEquals(0,ratioCommentToPostAvg,0);
    }

    @Test
    public void testCalculateForumWith1000PostsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = generateListOfUsers(1);
        int post = 1000;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
        //When
        int quantityOfUsers = forumStat.calculateAdvStatistics(statisticsMock).getUserCount();
        int quantityOfPosts = forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        int quantityOfComments = forumStat.calculateAdvStatistics(statisticsMock).getCommentCount();
        double ratioPostToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getPostToUserAvg();
        double ratioCommentToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToUserAvg();
        double ratioCommentToPostAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToPostAvg();

        //Then
        Assert.assertEquals(1,quantityOfUsers);
        Assert.assertEquals(1000,quantityOfPosts);
        Assert.assertEquals(0,quantityOfComments);
        Assert.assertEquals(1000,ratioPostToUserAvg,0);
        Assert.assertEquals(0,ratioCommentToUserAvg,0);
        Assert.assertEquals(0,ratioCommentToPostAvg,0);
    }
    @Test
    public void testCalculateForumWithNoneCommentsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = generateListOfUsers(1);
        int post = 1;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
        //When
        int quantityOfUsers = forumStat.calculateAdvStatistics(statisticsMock).getUserCount();
        int quantityOfPosts = forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        int quantityOfComments = forumStat.calculateAdvStatistics(statisticsMock).getCommentCount();
        double ratioPostToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getPostToUserAvg();
        double ratioCommentToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToUserAvg();
        double ratioCommentToPostAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToPostAvg();

        //Then
        Assert.assertEquals(1,quantityOfUsers);
        Assert.assertEquals(1,quantityOfPosts);
        Assert.assertEquals(0,quantityOfComments);
        Assert.assertEquals(1,ratioPostToUserAvg,0);
        Assert.assertEquals(0,ratioCommentToUserAvg,0);
        Assert.assertEquals(0,ratioCommentToPostAvg,0);
    }

    @Test
    public void testCalculateForumWithLessCommentsThenPostsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = generateListOfUsers(1);
        int post = 2;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
        //When
        int quantityOfUsers = forumStat.calculateAdvStatistics(statisticsMock).getUserCount();
        int quantityOfPosts = forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        int quantityOfComments = forumStat.calculateAdvStatistics(statisticsMock).getCommentCount();
        double ratioPostToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getPostToUserAvg();
        double ratioCommentToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToUserAvg();
        double ratioCommentToPostAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToPostAvg();

        //Then
        Assert.assertEquals(1,quantityOfUsers);
        Assert.assertEquals(2,quantityOfPosts);
        Assert.assertEquals(0,quantityOfComments);
        Assert.assertEquals(2,ratioPostToUserAvg,0);
        Assert.assertEquals(0,ratioCommentToUserAvg,0);
        Assert.assertEquals(0,ratioCommentToPostAvg,0);
    }

    @Test
    public void testCalculateForumWithMoreCommentsThenPostsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = generateListOfUsers(1);
        int post = 1;
        int comment =2;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
        //When
        int quantityOfUsers = forumStat.calculateAdvStatistics(statisticsMock).getUserCount();
        int quantityOfPosts = forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        int quantityOfComments = forumStat.calculateAdvStatistics(statisticsMock).getCommentCount();
        double ratioPostToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getPostToUserAvg();
        double ratioCommentToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToUserAvg();
        double ratioCommentToPostAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToPostAvg();

        //Then
        Assert.assertEquals(1,quantityOfUsers);
        Assert.assertEquals(1,quantityOfPosts);
        Assert.assertEquals(2,quantityOfComments);
        Assert.assertEquals(1,ratioPostToUserAvg,0);
        Assert.assertEquals(2,ratioCommentToUserAvg,0);
        Assert.assertEquals(2,ratioCommentToPostAvg,0);
    }

    @Test
    public void testCalculateForumWithNoneUsersWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = generateListOfUsers(0);
        int post = 0;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
        //When
        int quantityOfUsers = forumStat.calculateAdvStatistics(statisticsMock).getUserCount();
        int quantityOfPosts = forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        int quantityOfComments = forumStat.calculateAdvStatistics(statisticsMock).getCommentCount();
        double ratioPostToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getPostToUserAvg();
        double ratioCommentToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToUserAvg();
        double ratioCommentToPostAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToPostAvg();

        //Then
        Assert.assertEquals(0,quantityOfUsers);
        Assert.assertEquals(0,quantityOfPosts);
        Assert.assertEquals(0,quantityOfComments);
        Assert.assertEquals(0,ratioPostToUserAvg,0);
        Assert.assertEquals(0,ratioCommentToUserAvg,0);
        Assert.assertEquals(0,ratioCommentToPostAvg,0);
    }

    @Test
    public void testCalculateForumWith100UsersWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = generateListOfUsers(1000);
        int post = 0;
        int comment =0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        ForumStat forumStat = new ForumStat(statisticsMock);
        forumStat.showStatistics();
        //When
        int quantityOfUsers = forumStat.calculateAdvStatistics(statisticsMock).getUserCount();
        int quantityOfPosts = forumStat.calculateAdvStatistics(statisticsMock).getPostCount();
        int quantityOfComments = forumStat.calculateAdvStatistics(statisticsMock).getCommentCount();
        double ratioPostToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getPostToUserAvg();
        double ratioCommentToUserAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToUserAvg();
        double ratioCommentToPostAvg = forumStat.calculateAdvStatistics(statisticsMock).getCommentToPostAvg();

        //Then
        Assert.assertEquals(1000,quantityOfUsers);
        Assert.assertEquals(0,quantityOfPosts);
        Assert.assertEquals(0,quantityOfComments);
        Assert.assertEquals(0,ratioPostToUserAvg,0);
        Assert.assertEquals(0,ratioCommentToUserAvg,0);
        Assert.assertEquals(0,ratioCommentToPostAvg,0);
    }
}
