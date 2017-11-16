package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class ProductQuantityValidator implements OrderValidator {
    @Override
    public boolean getValidOrder(OrderRequest orderRequest) {
        int quantityInShop = orderRequest.getDeliverer().getMapProduct().get(orderRequest.getProduct());
        int orderedQuantity = orderRequest.getQuantity();

        if (quantityInShop>= orderedQuantity){
            System.out.println("Ordered " + orderedQuantity +"  "+ orderRequest.getProduct().getName());
            return true;
        } else {
            System.out.println("We can't realize order , In depot we stored only " + quantityInShop);
            return false;
        }

    }
}
