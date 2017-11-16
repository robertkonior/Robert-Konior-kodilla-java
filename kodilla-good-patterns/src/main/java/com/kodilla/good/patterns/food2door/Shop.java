package com.kodilla.good.patterns.food2door;

import java.util.Map;

public interface Shop {
    void process(OrderRequest orderRequest, Map<Product, Integer> products );
    Map<Product,Integer> getMapProduct();
}
