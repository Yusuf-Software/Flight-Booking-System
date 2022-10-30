package models.dataStructure;

import models.data.Country;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Countries implements Serializable {
    List<Country> countries = new ArrayList<>();

    public void addCountry(Country country) {
        countries.add(country);
    }

    void deleteCountryByName(String countryName) {
        countries.removeIf(country -> country.name().equals(countryName));
    }

    void updateCountryByName(String countryName, Country country) {
        countries.removeIf(c -> c.name().equals(countryName));
        countries.add(country);
    }

    public Country getCountryByIndex(int index)
    {
        return countries.get(index);
    }

    int getCountryCount() {
        return countries.size();
    }

    List<String> getCountryNames() {
        List<String> countryNames = new ArrayList<>();
        countries.forEach(country -> countryNames.add(country.name()));
        return countryNames;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "countries=" + countries +
                '}';
    }
}
