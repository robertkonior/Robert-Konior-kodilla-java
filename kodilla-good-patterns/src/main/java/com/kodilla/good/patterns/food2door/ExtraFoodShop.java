package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Shop, OrderValidator {

    private Map<Product, Integer> products = new HashMap<>();
    InformationService informationService = new EmailService();

    public ExtraFoodShop() {
        products.put(new Product("miso", BigDecimal.ONE), 5);
        products.put(new Product("tempah", BigDecimal.TEN), 5);
        products.put(new Product("wakame", BigDecimal.TEN), 5);
    }

    @Override
    public boolean process(Product product, int quantity) {

        boolean result = orderValidate(products,product, quantity);
        if (result) {
            updateStore(product, quantity);
            System.out.println("Now left : " + products.get(product) + " " + product.getName() + " in shop");
            informationService.sendMessageToBuyer(product.getName());
        }
        return result;

    }

    private void updateStore(Product product, int quantity) {
        this.products.put(product, products.get(product) - quantity);
    }

}
