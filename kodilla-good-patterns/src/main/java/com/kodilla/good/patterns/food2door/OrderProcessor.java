package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class OrderProcessor {

    Shop shop ;
    OrderValidator orderValidator;

    public OrderProcessor(Shop shop, OrderValidator orderValidator) {
        this.shop = shop;
        this.orderValidator = orderValidator;
    }

    public void orderExecutor(OrderRequest orderRequest){

        if(orderValidator.getValidOrder(orderRequest)){
            Map<Product, Integer> products =  shop.getMapProduct() ;
            shop.process(orderRequest, products);
            System.out.println("Now shop stored" + products);
        }
    }

}
