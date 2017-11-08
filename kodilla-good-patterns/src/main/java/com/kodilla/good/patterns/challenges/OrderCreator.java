package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.Month;

public class OrderCreator {

  public Order creator(){

      User buyer = new User("xps","jon lemon");
      User seller = new User("wwx","hevo redo");
      Product product = new Product("boombox", 22.5 , "megabass");
      LocalDate deliveryDay = LocalDate.of(2017 , Month.NOVEMBER , 15);

      return new Order(001,product,buyer,seller,2,deliveryDay);

  }

}
