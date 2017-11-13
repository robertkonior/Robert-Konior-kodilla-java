package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class OrderProcessor {

    DepotStatusInterface depotStatusInterface;
    OrderingProcessInterface orderingProcessInterface;


    public void executeTheOrderProcess(Product product,Integer quantity){

        if(depotStatusInterface.getMapProductsInDepot().containsKey(product)){
            if(orderingProcessInterface.process(product,quantity)){

                System.out.println("Order created " );

            }

        }
    }

}
