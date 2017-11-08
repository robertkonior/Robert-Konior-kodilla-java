package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        OrderCreator orderCreator = new OrderCreator();
        Order order = orderCreator.creator();

        ProductOrderService productOrderService = new ProductOrderService(new EmailService(),new SalesStatus() , new TransactionLists() );
        productOrderService.process(order);

    }
}
