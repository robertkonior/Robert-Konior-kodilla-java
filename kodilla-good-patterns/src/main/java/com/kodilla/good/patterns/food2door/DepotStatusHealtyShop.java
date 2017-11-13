package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class DepotStatusHealtyShop implements DepotStatusInterface {

    private Map<Product,Integer> healthFoodProducts = new HashMap<>();

    public void addHealtyroductToDepot(String name , BigDecimal price ,char ecoClassOfProduct ,  Integer quantity ) {
        healthFoodProducts.put(new Product(name,price,ecoClassOfProduct),quantity);
    }


    public void setMapHealthFoodProducts(Map<Product, Integer> healthFoodProducts) {
        this.healthFoodProducts = healthFoodProducts;
    }

    @Override
    public Map<Product, Integer> getMapProductsInDepot() {
        return healthFoodProducts;
    }
}
