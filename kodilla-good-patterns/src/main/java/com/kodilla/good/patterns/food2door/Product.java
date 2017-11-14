package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;

public class Product {

    private String productName;
    private BigDecimal productPrice;
    private boolean glutenFree ;
    private char ecoClassOfProduct;

    public Product(String productName, BigDecimal productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product(String productName, BigDecimal productPrice, boolean glutenFree) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.glutenFree = glutenFree;
    }

    public Product(String productName, BigDecimal productPrice, char ecoClassOfProduct) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.ecoClassOfProduct = ecoClassOfProduct;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public char getEcoClassOfProduct() {
        return ecoClassOfProduct;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (glutenFree != product.glutenFree) return false;
        if (ecoClassOfProduct != product.ecoClassOfProduct) return false;
        if (!productName.equals(product.productName)) return false;
        return productPrice.equals(product.productPrice);
    }

    @Override
    public int hashCode() {
        int result = productName.hashCode();
        result = 31 * result + productPrice.hashCode();
        result = 31 * result + (glutenFree ? 1 : 0);
        result = 31 * result + (int) ecoClassOfProduct;
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", glutenFree=" + glutenFree +
                ", ecoClassOfProduct=" + ecoClassOfProduct +
                '}';
    }
}
