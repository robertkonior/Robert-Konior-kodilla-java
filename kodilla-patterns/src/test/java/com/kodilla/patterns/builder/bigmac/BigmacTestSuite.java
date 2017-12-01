package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BigmacTestSuite {

    @Test
    public void testCreatingNewBigmac(){

        //Given
        Sauce barbecueSauce = new Sauce("BARBECUE");

        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .roll(Roll.NORMAL)
                .burgersQuantity(2)
                .sauce(barbecueSauce)
                .ingradients("LETTUCE")
                .ingradients("ONION")
                .build();
        System.out.println(bigmac);

        List<String> expectedListIngradients = new ArrayList<>();
        expectedListIngradients.add("LETTUCE");
        expectedListIngradients.add("ONION");

        //When
        List<String> testedList = bigmac.getIngredients();
        //Then
        Assert.assertEquals(expectedListIngradients,testedList);

    }
}
