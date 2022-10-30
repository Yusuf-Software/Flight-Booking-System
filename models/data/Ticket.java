package models.data;

import java.io.Serializable;
import java.util.List;

public record Ticket(int ID, List<Flight> flights, List<Passenger> passengers) implements Serializable {

}

//    Ticket (R)
//    Ticket ID
//    Flights<List>
//    Passengers<List>