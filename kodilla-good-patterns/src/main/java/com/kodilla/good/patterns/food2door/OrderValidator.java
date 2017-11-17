package com.kodilla.good.patterns.food2door;

import java.util.Map;

public interface OrderValidator {

    default boolean orderValidate(Map<Product, Integer> products,Product product, int quantity) {
        if(products.containsKey(product)) {
           int quantityInShop = products.get(product);
            if (quantityInShop >= quantity) {
                System.out.println("Ordered " + quantity);
                return true;
            } else {
                System.out.println("We can't realize order ,In depot we stored only " + quantityInShop);
                return false;
            }
        }else {
            return false;
        }
    }
}
