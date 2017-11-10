package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class SalesStatusService implements OrderService {

    public boolean status (int noOrder , LocalDate deliveryDate , double orderPrice ){
        LocalDate now =LocalDate.now();
        if(deliveryDate.isAfter(now)){
            System.out.println("Client should expect delivery:  " + deliveryDate + "and should have " + orderPrice +"$");
            return true;
        }else {
            System.out.println("Package arrived to client");
            return false;
        }
    }
}
