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
        when(statisticsMock.usersNames()).thenReturn(testingList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);
    }

    @Test
    public void testAddPost() {
        //Given - From @before
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, forumStatistics.quantityOfPost);
    }

    @Test
    public void testAddComment() {
        //Given - From @before
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(20, forumStatistics.quantityOfComment);

    }

    @Test
    public void testAddUser() {
        //Given
        testingList = generateListOfUsers(2);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, forumStatistics.quantityOfUsers);

    }

    @Test
    public void testAverageWith0Post() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, forumStatistics.averagePostPerUser, 0);
        Assert.assertEquals(0.0, forumStatistics.averageCommentPerPost, 0);
    }

    @Test
    public void testAverageWith1000Post() {
        //Given
        testingList = generateListOfUsers(2);
        when(statisticsMock.usersNames()).thenReturn(testingList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(500.0, forumStatistics.averagePostPerUser, 0);
        Assert.assertEquals(0.02, forumStatistics.averageCommentPerPost, 0);
    }

    @Test
    public void testAverageWith0Comment() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.averageCommentPerPost, 0);
        Assert.assertEquals(0, forumStatistics.averageCommentPerUser, 0);
    }

    @Test
    public void testWhenIsLessCommentsAsPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(4);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.5, forumStatistics.averageCommentPerPost, 0);
    }

    @Test
    public void testWhenIsLessPostAsComments() {
        //Given - from @before
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, forumStatistics.averageCommentPerPost, 0);
    }

    @Test
    public void testAverageWith0Users() {
        //Given from @before
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.averagePostPerUser, 0);
        Assert.assertEquals(0, forumStatistics.averageCommentPerUser, 0);

    }

    @Test
    public void testAverageWith100Users() {
        //Given
        List<String> ListOf100Users = generateListOfUsers(100);
        when(statisticsMock.usersNames()).thenReturn(ListOf100Users);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.1, forumStatistics.averagePostPerUser, 0);
        Assert.assertEquals(0.2, forumStatistics.averageCommentPerUser, 0);

    }

    private List<String> generateListOfUsers(int usersQuantity) {

        for (int n = 1; n <= usersQuantity; n++) {
            testingList.add("sa" + n);
        }
        return testingList;
    }

}

