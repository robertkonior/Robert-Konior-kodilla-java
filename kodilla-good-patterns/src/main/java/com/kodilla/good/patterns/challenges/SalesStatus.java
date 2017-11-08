package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class SalesStatus implements OrderService {

    public boolean status (int noOrder , LocalDate deliveryDate , LocalDate now ){
        if(deliveryDate.isAfter(now)){
            System.out.println("You expect delivery:  " + deliveryDate);
            return true;
        }else {
            System.out.println("Package arrived");
            return false;
        }
    }
}
