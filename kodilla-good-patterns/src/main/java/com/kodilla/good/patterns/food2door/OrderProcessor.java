package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class OrderProcessor {

    DepotStatusInterface depotStatusInterface;
    OrderingProcessInterface orderingProcessInterface;
    InformationInterface informationInterface;

    public OrderProcessor(final DepotStatusInterface depotStatusInterface, final OrderingProcessInterface orderingProcessInterface,final InformationInterface informationInterface) {
        this.depotStatusInterface = depotStatusInterface;
        this.orderingProcessInterface = orderingProcessInterface;
        this.informationInterface = informationInterface;
    }

    public void executeTheOrderProcess(Product product, Integer quantity){

        if(depotStatusInterface.getMapProductsInDepot().containsKey(product)){
           if( orderingProcessInterface.process(product,quantity)){
            informationInterface.sendOrder(product,quantity);}
        }else {
            System.out.println("We don't have this product");
        }
    }

}
