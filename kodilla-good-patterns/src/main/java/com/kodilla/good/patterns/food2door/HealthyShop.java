package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class HealthyShop implements OrderingProcessInterface{
    DepotStatusHealtyShop depotStatusHealtyShop;


    @Override
    public boolean process(Product product, Integer quantity) {
        Map<Product ,Integer  > storedProducts =  depotStatusHealtyShop.getMapProductsInDepot();
        if( quantity <= storedProducts.get(product)){
            storedProducts.put(product, storedProducts.get(product) - quantity);
            depotStatusHealtyShop.setMapHealthFoodProducts(storedProducts);
            return true;
        }else {
            System.out.println("We don't have that quantity of this product ");
            return false;
        }
    }
}
