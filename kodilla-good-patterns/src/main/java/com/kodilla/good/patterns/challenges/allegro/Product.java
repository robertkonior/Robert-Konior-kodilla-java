package com.kodilla.good.patterns.challenges.allegro;

public class Product {

    private String productName ;
    private double productPrince;
    private String productDescription;

    public Product(String productName, double productPrince, String productDescription) {
        this.productName = productName;
        this.productPrince = productPrince;
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrince() {
        return productPrince;
    }
}
