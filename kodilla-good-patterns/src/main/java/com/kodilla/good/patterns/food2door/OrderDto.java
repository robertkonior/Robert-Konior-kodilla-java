package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class OrderDto {
    String productName;
    String deliver;
    LocalDate createdOrder;

    public OrderDto(String productName, String deliver, LocalDate createdOrder) {
        this.productName = productName;
        this.deliver = deliver;
        this.createdOrder = createdOrder;
    }
}
