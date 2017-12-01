package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class Ingredients {
    private  static final List<String> INGREDIENTS = Arrays.asList("LETTUCE","ONION","BECKON","CUCUMBER","CHILI","MUSHROOMS", "SHEEPERS","CHEESE");

    public static boolean checkIngredient(String ingredient){
        if (INGREDIENTS.contains(ingredient)) {
            return true;
        } else  {
            throw new IllegalStateException("We don't have this ingredient ! ");
        }
    }
}
