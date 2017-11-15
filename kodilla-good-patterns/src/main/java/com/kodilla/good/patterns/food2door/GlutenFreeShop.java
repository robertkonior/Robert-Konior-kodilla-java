package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements OrderingProcessInterface,DepotStatusInterface,InformationInterface {



    private Map<Product, Integer> createProductMap(){
        Map<Product, Integer> glutenFreeProducts = new HashMap<>();
        glutenFreeProducts.put(new Product("chemical-bread",BigDecimal.valueOf(10.0),true),5);
        glutenFreeProducts.put(new Product("crossaint",BigDecimal.valueOf(15.0),false),5);
        glutenFreeProducts.put(new Product("tost",BigDecimal.valueOf(10.0),true),5);

        return glutenFreeProducts;

    }

    private Map<Product, Integer> glutenFreeProducts = createProductMap();
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
