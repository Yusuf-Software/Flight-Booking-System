package models.dataStructure;

import models.data.Airport;
import models.data.City;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Airports implements Serializable {
    List<Airport> airports = new ArrayList<>();

    void addAirport(int ID, City city, String name, String code) {
        Airport a = new Airport(ID, city, name, code);
        airports.add(a);
    }

    void deleteAirportByID(int airportID) {
        airports.removeIf(airport -> airport.ID() == airportID);
    }

    void updateAirportByID(int airportID, Airport airport) {
        airports.removeIf(airPort -> airPort.ID() == airportID);
        airports.add(airport);
    }

    List<Airport> getAirports() {
        return airports;
    }

    int getAirportCount() {
        return airports.size();
    }

    List<String> getAirportNames() {
        List<String> airportNames = new ArrayList<>();
        airports.forEach(airport -> airportNames.add(airport.name()));
        return airportNames;
    }

    List<Airport> getAirportsByCity(String city) {
        List<Airport> airportsByCity = new ArrayList<>();
        airports.forEach(airport -> {
            if (airport.city().name().equals(city)) {
                airportsByCity.add(airport);
            }
        });
        return airportsByCity;
    }
}
