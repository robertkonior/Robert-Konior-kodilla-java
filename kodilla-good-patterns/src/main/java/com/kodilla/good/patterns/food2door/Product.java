package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;

public class Product {

    private String productName;
    private BigDecimal productPrice;
//    private boolean glutenFree ;
//    private char ecoClassOfProduct;

    public Product(String productName, BigDecimal productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

//    public Product(String productName, BigDecimal productPrice, boolean glutenFree) {
//        this.productName = productName;
//        this.productPrice = productPrice;
//        this.glutenFree = glutenFree;
//    }
//
//    public Product(String productName, BigDecimal productPrice, char ecoClassOfProduct) {
//        this.productName = productName;
//        this.productPrice = productPrice;
//        this.ecoClassOfProduct = ecoClassOfProduct;
//    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

//    public boolean isGlutenFree() {
//        return glutenFree;
//    }
//
//    public char getEcoClassOfProduct() {
//        return ecoClassOfProduct;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        return productPrice != null ? productPrice.equals(product.productPrice) : product.productPrice == null;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
