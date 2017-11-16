package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Shop {

    private Map<Product, Integer> products = new HashMap<>();

    public ExtraFoodShop() {
        products.put(new Product("miso", BigDecimal.ONE), 5);
        products.put(new Product("tempah", BigDecimal.TEN), 5);
        products.put(new Product("wakame", BigDecimal.TEN), 5);
    }

    @Override
    public boolean process(Product product, int quantity) {
        boolean result = orderValidate(product, quantity);
        if (result) {
            updateStore(product, quantity);
            System.out.println("Now left : "  + products.get(product)+ " " + product.getName() + " in shop");
        }
        return result;

    }

    private boolean orderValidate(Product product, int quantity) {
        int quantityInShop =  products.get(product);

        if (quantityInShop>=  quantity){
            System.out.println("Ordered " +quantity +"  "+ product.getName());
            return true;
        } else {
            System.out.println("We can't realize order ,In depot we stored only " + quantityInShop);
            return false;
        }

    }

    private void updateStore(Product product, int quantity) {
        this.products.put(product, products.get(product) - quantity);
    }

}
