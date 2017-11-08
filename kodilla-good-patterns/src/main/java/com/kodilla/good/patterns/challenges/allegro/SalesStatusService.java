package com.kodilla.good.patterns.challenges.allegro;

import com.kodilla.good.patterns.challenges.allegro.OrderService;

import java.time.LocalDate;

public class SalesStatusService implements OrderService {

    public boolean status (int noOrder , LocalDate deliveryDate , LocalDate now ){
        if(deliveryDate.isAfter(now)){
            System.out.println("Client should expect delivery:  " + deliveryDate);
            return true;
        }else {
            System.out.println("Package arrived to client");
            return false;
        }
    }
}
