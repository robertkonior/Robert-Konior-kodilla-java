package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class Sauce {

    private  static final List<String> AVAILABLE_SAUCE = Arrays.asList("STANDARD","ISLANDS","BARBECUE");
    private final String taste ;

    public Sauce (String taste){
        if (AVAILABLE_SAUCE.contains(taste)){
            this.taste = taste;
        } else {
            throw new IllegalStateException("We don't have this sauce ! ");
        }
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "taste='" + taste + '\'' +
                '}';
    }
}
