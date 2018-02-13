package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class KebabMeatPizzaDecorator extends AbstractPizzaOrderDecorator {

    public KebabMeatPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getIngredientsList() {
        return super.getIngredientsList() + " Kebab Meat,";
    }
}
