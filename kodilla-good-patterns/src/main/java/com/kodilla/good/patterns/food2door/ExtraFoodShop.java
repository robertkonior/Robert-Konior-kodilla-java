package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements OrderingProcessInterface {



    private Map<Product,Integer> extraFoodProducts = new HashMap<>();

    public void addExtraProductToDepot(String name , BigDecimal price , Integer quantity) {
        extraFoodProducts.put(new Product(name,price),quantity);
    }


    @Override
    public boolean process(Product product, Integer quantity) {

        if( quantity <= extraFoodProducts.get(product)){
            extraFoodProducts.put(product, extraFoodProducts.get(product) - quantity);
            return true;
        }else {
            System.out.println("We don't have quantity of this product ");
            return false;
        }
    }
}
