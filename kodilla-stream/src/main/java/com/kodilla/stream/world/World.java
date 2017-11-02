package com.kodilla.stream.world;

import java.math.BigDecimal;

import java.util.List;
import java.util.stream.Collector;

public final class World {

    private final List<Continent> continentList;

    public World(List<Continent> continentList) {

        this.continentList = continentList;
    }


    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .distinct()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
