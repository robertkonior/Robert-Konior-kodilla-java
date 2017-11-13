package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class DepotStatusGlutenFree implements DepotStatusInterface {

    private Map<Product,Integer> glutenFreeProducts = new HashMap<>();

    public void addGlutenFreeProducts(String name , BigDecimal price ,boolean containsGluten ,Integer quantity ) {
        glutenFreeProducts.put(new Product(name,price,containsGluten),quantity);
    }


    public void setMapGlutenFreeProducts(Map<Product, Integer> glutenFreeProducts) {
        this.glutenFreeProducts = glutenFreeProducts;
    }

    @Override
    public Map<Product, Integer> getMapProductsInDepot() {
        return glutenFreeProducts;
    }
}
