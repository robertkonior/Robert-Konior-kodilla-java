package com.kodilla.good.patterns.food2door;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class OrderProcessorTestSuite {


    @Test
            public void testOrdering() {

        OrderProcessor orderProcessor = new OrderProcessor();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.addExtraProductToDepot("auto", BigDecimal.valueOf(22.5), 10);
        extraFoodShop.addExtraProductToDepot("rower", BigDecimal.valueOf(15.5), 2);

        Product auto = new Product("rower", BigDecimal.valueOf(15.5));

        orderProcessor.executeTheOrderProcess(auto, 1);


    }
}
