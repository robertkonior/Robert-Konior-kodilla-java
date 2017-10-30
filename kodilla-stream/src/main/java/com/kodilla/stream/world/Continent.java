package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countries;

    public Continent(final String continentName, final List<Country> countries) {
        this.continentName = continentName;
        this.countries = countries;

    }


    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }
}
