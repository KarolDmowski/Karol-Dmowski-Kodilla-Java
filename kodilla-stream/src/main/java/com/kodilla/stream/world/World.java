package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continentList = new ArrayList<>();

    public List<Continent> getContinentList() {
        return continentList;
    }

    public BigDecimal getPeopleQuantity(){
        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getQuantityOfCitizens)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
    public void addContinentToList(Continent continent){
        getContinentList().add(continent);
    }
}
