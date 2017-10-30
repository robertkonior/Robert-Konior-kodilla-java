package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", BigDecimal.valueOf(38476269));
        Country germany = new Country("Germany", BigDecimal.valueOf(80594017));
        Country czech = new Country("Czech", BigDecimal.valueOf(10674723));
        List<Country> europeCountrys = new ArrayList<>();
        europeCountrys.add(poland);
        europeCountrys.add(germany);
        europeCountrys.add(czech);
        Continent europa = new Continent("Europe", europeCountrys);

        Country usa = new Country("USA", BigDecimal.valueOf(326625791));
        Country canada = new Country("Canada", BigDecimal.valueOf(35623680));
        List<Country> americaCountrys = new ArrayList<>();
        americaCountrys.add(usa);
        americaCountrys.add(canada);
        Continent america = new Continent("America", americaCountrys);

        List<Continent> continentList = new ArrayList<>();
        continentList.add(europa);
        continentList.add(america);

        World world = new World(continentList);

        //When
        BigDecimal poepleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectationalQuantity = BigDecimal.valueOf(38476269 + 80594017 + 10674723 + 326625791 + 35623680);
        Assert.assertEquals(expectationalQuantity, poepleQuantity);


    }
}
