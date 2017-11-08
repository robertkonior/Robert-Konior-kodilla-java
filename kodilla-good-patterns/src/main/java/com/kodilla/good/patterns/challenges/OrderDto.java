package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private int noOrder ;
    private boolean status ;

    public OrderDto(int noOrder, boolean status) {
        this.noOrder = noOrder;
        this.status = status;
    }

    public int getNoOrder() {
        return noOrder;
    }

    public boolean getStatus() {
        return status;
    }
}
