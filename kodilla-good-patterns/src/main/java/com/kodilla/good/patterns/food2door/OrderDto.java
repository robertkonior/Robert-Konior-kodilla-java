package com.kodilla.good.patterns.food2door;

public class OrderDto {
    private String productName ;
    private String productDeliver;
    private Integer quantity ;
    private boolean glutenFree ;
    private char ecoClassOfProduct;

    public OrderDto(String productName, String productDeliver, Integer quantity) {
        this.productName = productName;
        this.productDeliver = productDeliver;
        this.quantity = quantity;
    }

}
