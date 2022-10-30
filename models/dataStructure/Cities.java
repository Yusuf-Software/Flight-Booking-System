package models.dataStructure;

import models.data.City;
import models.data.Country;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cities implements Serializable {

    private List<City> cities = new ArrayList<>();

    public String toString() {
        return cities.toString();
    }

    public void addCity(int ID, String name, Country country)
    {
        City c = new City(ID, name, country);
        cities.add(c);
    }

    City getCityByName(String name)
    {
        for (City city : cities) {
            if (city.name().equals(name)) {
                return city;
            }
        }
        return null;
    }

    public City getCityByIndex(int index)
    {
        return cities.get(index);
    }

    void deleteCityByName(String cityName) {
        cities.removeIf(city -> city.name().equals(cityName));
    }

    void updateCityByID(int cityID, City city) {
        cities.removeIf(c -> c.ID() == cityID);
        cities.add(city);
    }


    int getCityCount() {
        return cities.size();
    }

    List<String> getCityNames() {
        List<String> cityNames = new ArrayList<>();
        cities.forEach(city -> cityNames.add(city.name()));
        return cityNames;
    }

    List<String> getCityNamesByCountry(String countryName) {
        List<String> cityNames = new ArrayList<>();
        cities.forEach(city -> {
            if (city.country().name().equals(countryName)) {
                cityNames.add(city.name());
            }
        });
        return cityNames;
    }


}
