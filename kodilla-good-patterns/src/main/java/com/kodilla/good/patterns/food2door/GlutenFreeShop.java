package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class GlutenFreeShop implements OrderingProcessInterface {

    DepotStatusGlutenFree depotStatusGlutenFree ;
    @Override
    public boolean process(Product product, Integer quantity) {
        Map<Product ,Integer  > storedProducts =  depotStatusGlutenFree.getMapProductsInDepot();
        if( quantity <= storedProducts.get(product)){
            storedProducts.put(product, storedProducts.get(product) - quantity);
            depotStatusGlutenFree.setMapGlutenFreeProducts(storedProducts);
            return true;
        }else {
            System.out.println("We don't have that quantity of this product ");
            return false;
        }
    }
}
