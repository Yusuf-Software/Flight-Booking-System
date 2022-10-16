package models;

import java.time.LocalDateTime;
import java.util.List;

public record Schedule(Flight flight, Airport departureAirport, Airport arrivalAirport, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, Status status, List<FlightSeat> fare) {

}


//    Schedule (R)
//    Flight
//    Departure Airport ID
//    Arrival Airport ID
//    Departure DateTime
//    Arrival DateTime
//    Status
//    List<FlightSeat> fare

enum Status{
    DELAY, ONTIME, CANCELLED
}

//    DELAY
//    ONTIME
//    CANCELLED