package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sumValue = calculator.add(2,3);
        double subValue = calculator.sub(7,2);
        double mulValue = calculator.mul(2,3);
        double divValue = calculator.div(6,3);
        //Then
        Assert.assertTrue(sumValue == 5);
        Assert.assertTrue(subValue == 5);
        Assert.assertTrue(mulValue == 6);
        Assert.assertTrue(divValue == 2);

    }

}
