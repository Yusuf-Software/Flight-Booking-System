package models.dataStructure;

import models.data.ClassName;
import models.data.FlightSeat;

import java.util.List;

public class FlightSeats {
    List<FlightSeat> flightSeats;
    int seatCapacity;
    int availableSeats;

    void addFlightSeat(String Id, String seatNo, ClassName className, double price, FlightSeat.Status status, int luggaeWeight) {
        FlightSeat fs = new FlightSeat(Id, seatNo, className, price, status, luggaeWeight);
        flightSeats.add(fs);
    }
}
