package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class OrderDto {
    private String productName;
    private String deliver;
    private LocalDate createdOrder;
    private boolean isOrdered;

    public OrderDto(String productName, String deliver, LocalDate createdOrder,boolean isOrdered) {
        this.productName = productName;
        this.deliver = deliver;
        this.createdOrder = createdOrder;
        this.isOrdered =  isOrdered;
    }
}
