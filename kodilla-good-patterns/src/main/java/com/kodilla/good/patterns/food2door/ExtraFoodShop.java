package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class ExtraFoodShop implements OrderingProcessInterface {

    DepotStatusExtraFood depotStatusExtraFood;


    @Override
    public boolean process(Product product, Integer quantity) {
        Map<Product ,Integer  > storedProducts =  depotStatusExtraFood.getMapProductsInDepot();
        if( quantity <= storedProducts.get(product)){
            storedProducts.put(product, storedProducts.get(product) - quantity);
            depotStatusExtraFood.setMapExtraFoodProducts(storedProducts);
            return true;
        }else {
            System.out.println("We don't have quantity of this product ");
            return false;
        }
    }
}
