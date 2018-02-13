package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FourCheesePizzaOrderDecorator extends AbstractPizzaOrderDecorator {

    public FourCheesePizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getIngredientsList() {
        return super.getIngredientsList() +" Four Cheese,";
    }
}
