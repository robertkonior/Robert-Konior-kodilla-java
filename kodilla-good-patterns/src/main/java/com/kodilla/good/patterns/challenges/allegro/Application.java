package com.kodilla.good.patterns.challenges.allegro;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        OrderCreator orderCreator = new OrderCreator();
        List<Order> orders = orderCreator.creator();

        ProductOrderService productOrderService = new ProductOrderService(new EmailService(),new SalesStatusService() , new ListRepository() );
        while(orders.size() >= 1 ){
            Order executingOrder = orders.get(0);
            productOrderService.process(executingOrder);
            orders.remove(0);
        }

    }
}
