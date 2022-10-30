package models.dataStructure;

import models.data.Country;

import java.util.ArrayList;
import java.util.List;

public class Countries {
    List<Country> countries;

    void addCountry(Country country) {
        countries.add(country);
    }

    void deleteCountryByName(String countryName) {
        countries.removeIf(country -> country.name().equals(countryName));
    }

    void updateCountryByName(String countryName, Country country) {
        countries.removeIf(c -> c.name().equals(countryName));
        countries.add(country);
    }

    int getCountryCount() {
        return countries.size();
    }

    List<String> getCountryNames() {
        List<String> countryNames = new ArrayList<>();
        countries.forEach(country -> countryNames.add(country.name()));
        return countryNames;
    }
}
