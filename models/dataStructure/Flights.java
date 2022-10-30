package models.dataStructure;

import models.data.Airline;
import models.data.Flight;
import models.data.Schedule;
import models.data.Seat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Flights implements Serializable {
    List<Flight> flights = new ArrayList<>();

    void addFlight(int ID, String flightNo, Airline airline, int seatCapacity, List<Seat> seats, List<Schedule> schedule) {
        Flight f = new Flight(ID, flightNo, airline, seatCapacity, seats, schedule);
        flights.add(f);
    }

    void deleteFlightByID(int ID) {
        flights.removeIf(flight -> flight.ID() == ID);
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public Flight getFlightByID(int ID) {
        return flights.stream().filter(flight -> flight.ID() == ID).findFirst().orElse(null);
    }

    public Flight getFlightByFlightNo(String flightNo) {
        return flights.stream().filter(flight -> flight.flightNo().equals(flightNo)).findFirst().orElse(null);
    }
}
