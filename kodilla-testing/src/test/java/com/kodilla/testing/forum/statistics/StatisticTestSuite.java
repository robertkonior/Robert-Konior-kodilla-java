package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticTestSuite {
    Statistics statisticsMock;
    List<String> testingList;
    ForumStatistics forumStatistics;

    @Before
    public void before() {
        statisticsMock = mock(Statistics.class);
        testingList = new ArrayList<>();
        forumStatistics = new ForumStatistics(statisticsMock);
    }

    @Test
    public void testAverageWith0Post() {
        //Given
        testingList.add("sa");
        testingList.add("sss");
        when(statisticsMock.usersNames()).thenReturn(testingList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(1);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double result = forumStatistics.averagePostPerUser;
        double result1 = forumStatistics.averageCommentPerPost;
        //Then
        Assert.assertEquals(0.0, result, 0);
        Assert.assertEquals(0.0, result1, 0);
    }

    @Test
    public void testAverageWith1000Post() {
        //Given
        testingList.add("sa");
        testingList.add("sss");
        when(statisticsMock.usersNames()).thenReturn(testingList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(250);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double result = forumStatistics.averagePostPerUser;
        double result1 = forumStatistics.averageCommentPerPost;
        //Then
        Assert.assertEquals(500.0, result, 0);
        Assert.assertEquals(0.25, result1, 0);
    }

    @Test
    public void testAverageWith0Comment() {
        //Given
        testingList.add("sa");
        testingList.add("sss");
        when(statisticsMock.usersNames()).thenReturn(testingList);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double result = forumStatistics.averageCommentPerPost;
        double result1 = forumStatistics.averageCommentPerUser;
        //Then
        Assert.assertEquals(0, result, 0);
        Assert.assertEquals(0, result1, 0);
    }

    @Test
    public void testWhenIsLessCommentsAsPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(4);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double result = forumStatistics.averageCommentPerPost;
        //Then
        Assert.assertEquals(0.5, result, 0);
    }

    @Test
    public void testWhenIsLessPostAsComments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(4);
        when(statisticsMock.postsCount()).thenReturn(2);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double result = forumStatistics.averageCommentPerPost;
        //Then
        Assert.assertEquals(2, result, 0);
    }

    @Test
    public void testAverageWith0Users() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(testingList);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(2);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double result = forumStatistics.averagePostPerUser;
        double result1 = forumStatistics.averageCommentPerUser;
        //Then
        Assert.assertEquals(0, result, 0);
        Assert.assertEquals(0, result1, 0);

    }

    private List<String> generateListOfUsers(int usersQuantity) {

        for (int n = 1; n <= usersQuantity; n++) {
            testingList.add("sa" + n);
        }
        return testingList;
    }

    @Test
    public void testAverageWith100Users() {
        //Given
        List<String> ListOf100Users = generateListOfUsers(100);
        when(statisticsMock.usersNames()).thenReturn(ListOf100Users);
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(400);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double result = forumStatistics.averagePostPerUser;
        double result1 = forumStatistics.averageCommentPerUser;
        //Then
        Assert.assertEquals(2, result, 0);
        Assert.assertEquals(4, result1, 0);

    }


}

