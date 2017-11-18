package com.kodilla.good.patterns.food2door;

import java.util.List;

public class F2DApplication {

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new EmailService());
        OrderRetriever orderRetriever = new OrderRetriever();
        List<OrderRequest> orderRequests = orderRetriever.retrieve();
        for (OrderRequest orderRequest: orderRequests) {
            orderProcessor.orderExecutor(orderRequest);
        }
    }

}
