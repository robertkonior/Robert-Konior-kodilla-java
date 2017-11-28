package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User jon = new Millenials("Jon Berg");
        User bart = new YGeneration("Bart Simpson");
        User homer = new ZGeneration("Homer Simpson");

        //When
        String jonPublish = jon.getWherePublish();
        System.out.println("Jon: " + jonPublish);
        String bartPublish = bart.getWherePublish();
        System.out.println("Bart: "+ bartPublish);
        String homerPublish =homer.getWherePublish();
        System.out.println("Homer: " + homerPublish);

        //Then
        Assert.assertEquals("-Sharing posts on snapChat",jonPublish);
        Assert.assertEquals("-Sharing posts on facebook",bartPublish);
        Assert.assertEquals("-Sharing posts on twitter",homerPublish);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User jon = new Millenials("Jon Berg");

        //When
        String jonPublish = jon.getWherePublish();
        System.out.println("Jon: " + jonPublish);
        jon.setWherPublish(new FacebookPublisher());
        jonPublish = jon.getWherePublish();
        System.out.println("but now jon: " + jonPublish);

        //Then
        Assert.assertEquals("-Sharing posts on facebook",jonPublish);
    }
}
