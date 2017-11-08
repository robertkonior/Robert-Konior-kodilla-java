package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class OrderCreator {

  public List<Order> creator(){
      List<Order> orderList = new ArrayList<>();

      User buyer = new User("xps","jon lemon");
      User seller = new User("wwx","hevo redo");
      Product product = new Product("boombox", 22.5 , "megabass");
      LocalDate deliveryDay = LocalDate.of(2017 , Month.NOVEMBER , 15);
      orderList.add(new Order(1,product,buyer,seller,2,deliveryDay));

      return orderList;

  }

}
