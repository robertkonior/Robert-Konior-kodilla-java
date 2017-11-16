package com.kodilla.good.patterns.food2door;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Healthy implements Shop{

    private Map<Product, Integer> products = new HashMap<>();

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    @Override
    public void process(OrderRequest orderRequest, Map<Product, Integer> products) {
        int orderedQuantity = orderRequest.getQuantity();
        Product product = orderRequest.getProduct();

        this.products.put(product,products.get(product)-orderedQuantity);
        setProducts(products);


    }

    @Override
    public Map<Product, Integer> getMapProduct() {

        products.put(new Product("OMEGA3", BigDecimal.ONE),5);
        products.put(new Product("BBB", BigDecimal.TEN),5);
        return products;
    }
}
