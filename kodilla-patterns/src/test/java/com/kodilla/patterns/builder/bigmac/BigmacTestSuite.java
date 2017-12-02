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
        Roll sezam = new Roll("SEZAM");

        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .roll(sezam)
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
        Assert.assertEquals("SEZAM",bigmac.getRoll().getKind());
        Assert.assertEquals("BARBECUE",bigmac.getSauce().getTaste());

    }

    @Test(expected = IllegalStateException.class)
    public void testCreatingBadBurger() throws Exception {
        //Given
        Sauce badSauce = new Sauce("garlic");
        Roll sezam = new Roll("SEZAM");

        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .roll(sezam)
                .burgersQuantity(2)
                .sauce(badSauce)
                .ingradients("LETTUCE")
                .build();
        //When
        //Then
    }



}
