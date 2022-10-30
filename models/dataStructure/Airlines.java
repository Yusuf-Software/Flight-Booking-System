package models.dataStructure;

import models.data.Airline;
import models.data.Flight;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Airlines  implements Serializable {
    List<Airline> airlines = new ArrayList<>();

    void addAirline(int ID, String name) {
        Airline a = new Airline(ID, name);
        airlines.add(a);
    }

    void deleteAirlineByCode(int airlineID) {
        airlines.removeIf(airline -> airline.ID() == airlineID);
    }

    void updateAirlineByCode(int airlineID, Airline airline) {
        airlines.removeIf(airLine -> airLine.ID() == airlineID);
        airlines.add(airline);
    }

    List<Airline> getAirlines() {
        return airlines;
    }

    int getAirlineCount() {
        return airlines.size();
    }

    List<String> getAirlineNames() {
        List<String> airlineNames = new ArrayList<>();
        airlines.forEach(airline -> airlineNames.add(airline.name()));
        return airlineNames;
    }
}
