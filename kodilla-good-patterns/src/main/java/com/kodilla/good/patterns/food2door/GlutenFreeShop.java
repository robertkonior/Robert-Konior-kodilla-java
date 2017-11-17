package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Shop, OrderValidator {
    private Map<Product, Integer> products = new HashMap<>();

    public GlutenFreeShop() {
        products.put(new Product("Bread", BigDecimal.ONE), 5);
        products.put(new Product("Cake", BigDecimal.TEN), 5);
        products.put(new Product("Toast", BigDecimal.TEN), 5);

    }

    @Override
    public boolean process(Product product, int quantity) {
        int quantityInShop = products.get(product);
        boolean result = orderValidate(products,product, quantity);
        if (result) {
            updateStore(product, quantity);
            System.out.println("Now left : " + products.get(product) + " " + product.getName() + " in shop");
        }
        return result;

    }

    private void updateStore(Product product, int quantity) {
        this.products.put(product, products.get(product) - quantity);
    }

}
