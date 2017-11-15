package com.kodilla.good.patterns.food2door;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class OrderProcessorTestSuite {


    @Test
    public void testOrdering() {

        OrderProcessor orderProcessor = new OrderProcessor(new ExtraFoodShop(), new ExtraFoodShop(), new ExtraFoodShop());
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        Product auto = new Product("rower", BigDecimal.valueOf(15.5));
        Product auto2 = new Product("auto", BigDecimal.valueOf(15.5));
        extraFoodShop.addExtraProductToDepot(auto, 10);
        extraFoodShop.addExtraProductToDepot(auto2, 2);

        extraFoodShop.getMapProductsInDepot().entrySet().stream().forEach(System.out::print);

        orderProcessor.executeTheOrderProcess(new Product("rower", BigDecimal.valueOf(15.5)), 1);


    }
}
