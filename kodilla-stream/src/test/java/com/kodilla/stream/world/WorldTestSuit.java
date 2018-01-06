package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuit {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent continentAsia = new Continent();
        continentAsia.addCountryToList(new Country(new BigDecimal("100000000001")));
        continentAsia.addCountryToList(new Country(new BigDecimal("100000000002")));
        continentAsia.addCountryToList(new Country(new BigDecimal("100000000003")));
        continentAsia.addCountryToList(new Country(new BigDecimal("100000000004")));
        Continent continentEurope = new Continent();
        continentEurope.addCountryToList(new Country(new BigDecimal("100000000005")));
        continentEurope.addCountryToList(new Country(new BigDecimal("100000000006")));
        continentEurope.addCountryToList(new Country(new BigDecimal("100000000007")));
        continentEurope.addCountryToList(new Country(new BigDecimal("100000000008")));
        Continent continentAfrica = new Continent();
        continentAfrica.addCountryToList(new Country(new BigDecimal("100000000009")));
        continentAfrica.addCountryToList(new Country(new BigDecimal("100000000001")));
        continentAfrica.addCountryToList(new Country(new BigDecimal("100000000002")));
        continentAfrica.addCountryToList(new Country(new BigDecimal("100000000003")));
        continentAfrica.addCountryToList(new Country(new BigDecimal("100000000004")));
        World world = new World();
        world.addContinentToList(continentAfrica);
        world.addContinentToList(continentAsia);
        world.addContinentToList(continentEurope);
        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeople = new BigDecimal("1300000000055");
        Assert.assertEquals(expectedPeople,result);
    }
}
