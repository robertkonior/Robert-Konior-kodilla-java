package com.kodilla.good.patterns.food2door;

public class OrderRequest {

    private Shop deliverer ;
    private Product product;
    private int quantity ;

    public OrderRequest(Shop deliverer, Product product, int quantity) {
        this.deliverer = deliverer;
        this.product = product;
        this.quantity = quantity;
    }

    public Shop getDeliverer() {
        return deliverer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
