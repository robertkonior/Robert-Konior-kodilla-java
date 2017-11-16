package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;

public class F2DApplication {

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new Healthy(), new ProductQuantityValidator());
        Product aaa = new Product("OMEGA3", BigDecimal.ONE);
        OrderRequest orderRequest = new OrderRequest(new Healthy(),aaa,1 );
        orderProcessor.orderExecutor(orderRequest);
    }

}
