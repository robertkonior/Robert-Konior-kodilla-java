package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class OrderProcessor {

    DepotStatusInterface depotStatusInterface;
    OrderingProcessInterface orderingProcessInterface;
    InformationInterface informationInterface;


    public void executeTheOrderProcess(Product product,Integer quantity){

        if(depotStatusInterface.getMapProductsInDepot().containsKey(product)){
            orderingProcessInterface.process(product,quantity);
            informationInterface.sendOrder(product,quantity);
        }else {
            System.out.println("We don't have this product");
        }
    }

}
