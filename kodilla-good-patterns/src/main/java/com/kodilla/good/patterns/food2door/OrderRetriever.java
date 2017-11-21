package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class OrderRetriever {
    public List<OrderRequest> retrieve() {
        List<OrderRequest> requests = new LinkedList<>();
        HealthyShop healthy = new HealthyShop();
        GlutenFreeShop glutenFree = new GlutenFreeShop();

        requests.add(new OrderRequest(healthy, new  Product("apple", BigDecimal.ONE), 1));
        requests.add(new OrderRequest(healthy, new Product("garlic", BigDecimal.TEN), 1));
        requests.add(new OrderRequest(glutenFree, new Product("Bread", BigDecimal.ONE), 1));
        return requests;
    }
}
