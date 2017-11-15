package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;

public class ApplicationFood2Door {

    public static void main(String[] args){

    OrderProcessor orderProcessor = new OrderProcessor(new ExtraFoodShop(),new ExtraFoodShop(),new ExtraFoodShop());

    orderProcessor.executeTheOrderProcess(new Product("goi",BigDecimal.valueOf(10.0)),1);

}
}
