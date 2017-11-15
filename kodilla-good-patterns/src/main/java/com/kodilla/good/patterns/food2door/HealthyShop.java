package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements OrderingProcessInterface,DepotStatusInterface,InformationInterface {


    private Map<Product, Integer> createProductMap(){
        Map<Product, Integer> healthFoodProducts = new HashMap<>();
        healthFoodProducts.put(new Product("cafe",BigDecimal.valueOf(10.0),'A'),5);
        healthFoodProducts.put(new Product("tea",BigDecimal.valueOf(15.0),'A'),5);
        healthFoodProducts.put(new Product("yogurt",BigDecimal.valueOf(10.0),'B'),5);

        return healthFoodProducts;

    }

    private Map<Product, Integer> healthFoodProducts  = createProductMap();



    @Override
    public Map<Product, Integer> getMapProductsInDepot() {
        return healthFoodProducts;
    }

    @Override
    public boolean process(Product product, Integer quantity) {

        if (quantity <= healthFoodProducts.get(product)) {
            healthFoodProducts.put(product, healthFoodProducts.get(product) - quantity);
            return true;
        } else {
            System.out.println("We don't have that quantity of this product "+ healthFoodProducts.get(product));
            return false;
        }
    }

    @Override
    public  String sendOrder(Product product , Integer quantity){
        return getClass().getName() + product.toString()+ quantity;
    }
}
