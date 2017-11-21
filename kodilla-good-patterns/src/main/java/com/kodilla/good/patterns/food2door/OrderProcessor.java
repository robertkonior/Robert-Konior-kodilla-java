package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class OrderProcessor {

    private InformationService informationService;

    public OrderProcessor(InformationService informationService) {
        this.informationService = informationService;
    }

    public OrderDto orderExecutor(OrderRequest orderRequest){

       if( orderRequest.getDeliverer().process(orderRequest.getProduct(), orderRequest.getQuantity())){
           informationService.sendMessageToBuyer(orderRequest.getProduct().getName());
           return new OrderDto(orderRequest.getProduct().getName(),orderRequest.getDeliverer().getName(), LocalDate.now(),true);
       }else {
           return new OrderDto(orderRequest.getProduct().getName(),orderRequest.getDeliverer().getName(), LocalDate.now(),false);
       }
    }

}
