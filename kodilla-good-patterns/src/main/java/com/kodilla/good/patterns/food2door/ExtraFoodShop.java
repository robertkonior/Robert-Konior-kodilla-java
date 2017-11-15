package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements OrderingProcessInterface,DepotStatusInterface,InformationInterface {




    private Map<Product, Integer> createProductMap(){
         Map<Product, Integer> extraFoodProducts = new HashMap<>();
        extraFoodProducts.put(new Product("goi",BigDecimal.valueOf(10.0)),5);
        extraFoodProducts.put(new Product("acai",BigDecimal.valueOf(15.0)),5);
        extraFoodProducts.put(new Product("chia",BigDecimal.valueOf(5.0)),5);

        return extraFoodProducts;

    }

    private Map<Product, Integer> extraFoodProducts = createProductMap();

    @Override
    public Map<Product, Integer> getMapProductsInDepot() {
        return createProductMap();
    }

    @Override
    public boolean process(Product product, Integer quantity) {

        if (quantity <= extraFoodProducts.get(product)) {
            extraFoodProducts.put(product, extraFoodProducts.get(product) - quantity);
            return true;
        } else {
            System.out.println("We don't have quantity of this product , we have only"+extraFoodProducts.get(product));
            return false;
        }
    }
    @Override
    public  String sendOrder(Product product , Integer quantity){
        return "buy : "  + getClass().getName() + product.toString()+ quantity;
    }

}
