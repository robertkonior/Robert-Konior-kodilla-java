package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    public static String STANDARD = "STANDARD";
    public static String ISLANDS = "ISLANDS";
    public static String BARBECUE = "BARBECUE";
    private final String taste ;

    public Sauce (String taste){
        if (taste.equals(STANDARD) || taste.equals(ISLANDS) || taste.equals(BARBECUE)){
            this.taste = taste;
        } else {
            throw new IllegalStateException("We don't have this sauce ! ");
        }
    }

    public String getTaste() {
        return taste;
    }
}
