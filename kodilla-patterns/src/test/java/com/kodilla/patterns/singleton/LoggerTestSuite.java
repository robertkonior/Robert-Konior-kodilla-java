package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void  testGetLastLog(){
        //Given
        Logger.getInstance().log("Log.no:3");
        //When
        String testedLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Log.no:3",testedLog);

    }
}
