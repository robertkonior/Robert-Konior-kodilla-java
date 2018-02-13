package com.kodilla.patterns2.decorator.pizza;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    PizzaOrder pizzaOrder;

    @Before
    public void before() {
        pizzaOrder = new BasicPizzaOrder();
    }

    @Test
    public void testOrderPizzaWithKebabMeatPrice() {
        //Given
        pizzaOrder = new KebabMeatPizzaDecorator(pizzaOrder);
        //When
        BigDecimal price = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(18), price);
    }

    @Test
    public void testOrderPizzaWithKebabMeatDescription() {
        //Given
        pizzaOrder = new KebabMeatPizzaDecorator(pizzaOrder);
        //When
        String decription = pizzaOrder.getIngredientsList();
        //Then
        assertEquals("Cake, Tomato Sauce, Kebab Meat,", decription);
    }

    @Test
    public void testOrderPizzaWithFourCheeseAndMushroomsPrice() {
        //Given
        pizzaOrder = new FourCheesePizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new MushroomsPizzaOrderDecorator(pizzaOrder);
        //When
        BigDecimal price = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(22), price);
    }

    @Test
    public void testOrderPizzaWithFourCheeseAndMushroomsDescription() {
        //Given
        pizzaOrder = new FourCheesePizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new MushroomsPizzaOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getIngredientsList();
        //Then
        assertEquals("Cake, Tomato Sauce, Four Cheese, Mushrooms", description);
    }

}
