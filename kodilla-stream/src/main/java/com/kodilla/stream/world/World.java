package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continentList ;

    public World( List<Continent> continentList) {

        this.continentList = continentList;
    }

    public void addContinentToWorld(Continent continent ){
        continentList.add(continent);
    }


    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(quantity -> quantity.getCountries().stream())
                .reduce(BigDecimal.ZERO, (a ,sumPeople) -> a.add(sumPeople.getPeopleQuantity()), BigDecimal::add);
    }
}
