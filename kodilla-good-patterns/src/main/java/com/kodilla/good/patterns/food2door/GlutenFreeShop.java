package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements OrderingProcessInterface,DepotStatusInterface,InformationInterface {

    private Map<Product, Integer> glutenFreeProducts = new HashMap<>();

    public void addGlutenFreeProducts(String name, BigDecimal price, Integer quantity) {
        glutenFreeProducts.put(new Product(name, price), quantity);
    }
    @Override
    public Map<Product, Integer> getMapProductsInDepot() {
        return glutenFreeProducts;

    }

    @Override
    public boolean process(Product product, Integer quantity) {

        if (quantity <= glutenFreeProducts.get(product)) {
            glutenFreeProducts.put(product, glutenFreeProducts.get(product) - quantity);

            return true;
        } else {
            System.out.println("We don't have that quantity of product " + glutenFreeProducts.get(product));
            return false;
        }
    }

    @Override
    public  String sendOrder(Product product , Integer quantity){
        return getClass().getName() + product.toString()+ quantity;
    }
}
