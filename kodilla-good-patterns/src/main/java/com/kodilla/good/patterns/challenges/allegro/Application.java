package com.kodilla.good.patterns.challenges.allegro;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        OrderCreator orderCreator = new OrderCreator();
        List<Order> order = orderCreator.creator();

        ProductOrderService productOrderService = new ProductOrderService(new EmailService(),new SalesStatusService() , new ListRepository() );
        productOrderService.process(order);

    }
}
