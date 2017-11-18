package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Shop, OrderValidator {

    private Map<Product, Integer> products = new HashMap<>();
    InformationService informationService = new EmailService();

    public HealthyShop() {
        products.put(new Product("apple", BigDecimal.ONE), 5);
        products.put(new Product("garlic", BigDecimal.TEN), 7);
        products.put(new Product("fish", BigDecimal.TEN), 3);
    }

    @Override
    public boolean process(Product product, int quantity) {
        boolean result = orderValidate(products, product, quantity);
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
