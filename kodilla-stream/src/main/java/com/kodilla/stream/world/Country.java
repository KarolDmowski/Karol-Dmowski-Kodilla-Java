package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal quantityOfCitizens;

    public Country(final BigDecimal quantityOfCitizens) {
        this.quantityOfCitizens = quantityOfCitizens;
    }

    public BigDecimal getQuantityOfCitizens() {
        return quantityOfCitizens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return quantityOfCitizens.equals(country.quantityOfCitizens);
    }

    @Override
    public int hashCode() {
        return quantityOfCitizens.hashCode();
    }
}
