package com.kodilla.testing.forum.statistics;
import com.kodilla.testing.forum.statistics.ForumStatistics;
import java.util.List;

import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticTestSuite {


    @Test
    public void testCountingAveragePostForUser(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);


        //When
        double result = forumStatistics.averagePostForUser;
        Assert.assertEquals(0,result,0);


    }
@Ignore
    @Test
    public void testAverageCommentForUser(){}
    @Ignore
    @Test
    public void testAverageCommentForPost(){}
}
