package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements OrderingProcessInterface {

    private Map<Product,Integer> glutenFreeProducts = new HashMap<>();

    public void addGlutenFreeProducts(String name , BigDecimal price , boolean containsGluten , Integer quantity ) {
        glutenFreeProducts.put(new Product(name,price,containsGluten),quantity);
    }

    @Override
    public boolean process(Product product, Integer quantity) {

        if( quantity <= glutenFreeProducts.get(product)){
            glutenFreeProducts.put(product, glutenFreeProducts.get(product) - quantity);

            return true;
        }else {
            System.out.println("We don't have that quantity of product ");
            return false;
        }
    }
}
