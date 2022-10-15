package models;

import java.util.List;

public record Ticket(int ID, List<Flight> flights, List<Passenger> passengers) {

}

//    Ticket (R)
//    Ticket ID
//    Flights<List>
//    Passengers<List>