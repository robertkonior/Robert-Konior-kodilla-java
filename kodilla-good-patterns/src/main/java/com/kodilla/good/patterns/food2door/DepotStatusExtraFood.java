package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class DepotStatusExtraFood implements DepotStatusInterface {

    private Map<Product,Integer> extraFoodProducts = new HashMap<>();

    public void addExtraProductToDepot(String name , BigDecimal price , Integer quantity) {
        extraFoodProducts.put(new Product(name,price),quantity);
    }

    public void setMapExtraFoodProducts(Map<Product, Integer> extraFoodProducts) {
        this.extraFoodProducts = extraFoodProducts;
    }

    @Override
    public Map<Product, Integer> getMapProductsInDepot() {
        return extraFoodProducts;
    }
}
