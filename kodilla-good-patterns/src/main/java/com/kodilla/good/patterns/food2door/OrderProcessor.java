package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class OrderProcessor {

    public void orderExecutor(OrderRequest orderRequest){

        orderRequest.getDeliverer().process(orderRequest.getProduct(), orderRequest.getQuantity());
    }

}
